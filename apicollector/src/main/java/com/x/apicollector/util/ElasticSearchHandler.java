package com.x.apicollector.util;

import com.x.apicollector.vo.ESConfig;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsRequest;
import org.elasticsearch.action.admin.indices.exists.types.TypesExistsRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.text.Text;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.search.highlight.HighlightField;

import java.util.Map;

public final class ElasticSearchHandler {

    private TransportClient client;

    public ElasticSearchHandler(ESConfig esconfig) {
        Settings settings = ImmutableSettings.settingsBuilder()
                .put("client.transport.ping_timeout", 30000)
                .put("client.transport.nodes_sampler_interval", 30000)
                .put("cluster.name", esconfig.getClusterName()).build();

        client = new TransportClient(settings);
//        try {
			client.addTransportAddress(new InetSocketTransportAddress((esconfig.getIp()), esconfig
			        .getPort()));
//		} catch (UnknownHostException e) {
//			throw new SystemException(e);
//		}
    }

    public TransportClient getClient() {
        return client;
    }

    public boolean addIndex(String index, String type, String id, String source) {
        IndexResponse response = client.prepareIndex(index.toLowerCase(), type.toLowerCase(), id)
                .setRefresh(true).setSource(source).execute().actionGet();
//        		.setSource(source).execute().actionGet();
        boolean result = response.isCreated();
        return result;
    }

    public void close() {
        client.close();
    }

    /**
     * 检查索引是否存在
     * 
     * @param indexName
     * @return
     */
    public boolean doesIndexExist(String indexName) {
        IndicesExistsRequest ier = new IndicesExistsRequest();
        ier.indices(new String[] { indexName.toLowerCase() });
        return client.admin().indices().exists(ier).actionGet().isExists();
    }

    /**
     * 检查Mapping是否存在
     * 
     * @param indexName
     * @param indexType
     * @return true:存在 false:不存在
     */
    public boolean doesMappingExist(String indexName, String indexType) {
        TypesExistsRequest ter = new TypesExistsRequest(new String[] { indexName.toLowerCase() },
                indexType);
        return client.admin().indices().typesExists(ter).actionGet().isExists();
    }

    public String getHightLightFieldValue(Map<String, HighlightField> m, String fieldName) {
        if (m == null || fieldName == null || !m.containsKey(fieldName)) {
            return null;
        }
        HighlightField f = m.get(fieldName);
        Text[] titleTexts = f.fragments();
        String name = "";
        for (Text text : titleTexts) {
            name += text;
        }
        return name;
    }

}
