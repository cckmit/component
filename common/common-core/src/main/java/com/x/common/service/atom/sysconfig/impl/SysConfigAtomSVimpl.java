package com.x.common.service.atom.sysconfig.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.x.common.dao.mapper.bo.SysConfig;
import com.x.common.dao.mapper.bo.SysConfigCriteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.dao.mapper.interfaces.SysConfigMapper;
import com.x.common.service.atom.sysconfig.ISysConfigAtomSV;
import com.x.sdk.util.CollectionUtil;

/**
 * @author auth
 * @date 2016年11月1日 下午5:19:10 
 * @version V1.0
 */
@Service
public class SysConfigAtomSVimpl implements ISysConfigAtomSV{
	private static final Logger logger = Logger.getLogger(SysConfigAtomSVimpl.class);
	@Override
	public SysConfig selectOne() {
		SysConfigCriteria example = new SysConfigCriteria();
		List<SysConfig> confs = MapperFactory.getSysConfigMapper().selectByExample(example);
		if(CollectionUtil.isEmpty(confs)){
			return null;
		}
		return confs.get(0);
	}

	@Override
	public SysConfig changeOne() {
		SysConfig sysOri = selectOne();
		//000001
//		SysConfig sysConfig = new SysConfig();
		sysOri.setCustomNum((Integer.valueOf(sysOri.getCustomNum())+1) + "");
		sysOri.setInterpreterNum((Integer.valueOf(sysOri.getInterpreterNum())+1) + "");
		sysOri.setOrderNum((Integer.valueOf(sysOri.getOrderNum())+1) + "");
		MapperFactory.getSysConfigMapper().updateByPrimaryKey(sysOri);
		return sysOri;
	}

	@Override
	public Integer saveSysConfig(SysConfig sysConfig) {
		SysConfigCriteria sysConfigCriteria = new SysConfigCriteria();
		SysConfigCriteria.Criteria criteria = sysConfigCriteria.createCriteria();
		if(sysConfig.getConfigId() != null){
			logger.info("Atom保存基本设置ID不为空》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》");
			criteria.andConfigIdEqualTo(sysConfig.getConfigId());
			SysConfigMapper mapper = MapperFactory.getSysConfigMapper();
			int updateByPrimaryKey = mapper.updateByExampleSelective(sysConfig, sysConfigCriteria);
			return updateByPrimaryKey;
		}else{
			logger.info("Atom保存基本设置ID为空》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》");
			SysConfigMapper mapper = MapperFactory.getSysConfigMapper();
			sysConfig.setConfigId("1");
			int insertSelective = mapper.insertSelective(sysConfig);
			return insertSelective;
		}
	}
	
}
