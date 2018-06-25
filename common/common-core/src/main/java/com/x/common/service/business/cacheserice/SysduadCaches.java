package com.x.common.service.business.cacheserice;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysDuad;
import com.x.common.service.atom.sysduad.ISysDuadAtomSV;
import com.x.sdk.cache.base.AbstractCache;

/**
 * @Description: 写语言对到缓存
 * @author auth
 * @date 2016年11月21日 下午3:31:21 
 * @version V1.0
 */
@Component
public class SysduadCaches extends AbstractCache{
	
   private static final Logger logger = LoggerFactory.getLogger(SysduadCaches.class);
	
   @Autowired
   private ISysDuadAtomSV  iSysDuadAtomSV;

	@Override
	public void write() throws Exception {
		ExecutorService pool = Executors.newFixedThreadPool(3);
		List<SysDuad> txtDuads = iSysDuadAtomSV.querySysDuadList(Constants.ZH_CN, Constants.SysDuad.ORDER_TYPE_FAST);	
		List<SysDuad> docDuads = iSysDuadAtomSV.querySysDuadList(Constants.ZH_CN, Constants.SysDuad.ORDER_TYPE_DOC);	
		List<SysDuad> oralDuads = iSysDuadAtomSV.querySysDuadList(Constants.ZH_CN, Constants.SysDuad.ORDER_TYPE_ORAL);
		
		try {
			pool.execute(new SysduadCacheThreads(txtDuads,Constants.SysDuad.ORDER_TYPE_FAST));
			pool.execute(new SysduadCacheThreads(docDuads,Constants.SysDuad.ORDER_TYPE_DOC));
			pool.execute(new SysduadCacheThreads(oralDuads,Constants.SysDuad.ORDER_TYPE_ORAL));
		} catch (Exception e) {
			 logger.info(e.getMessage(),e); 
		}finally{
			if(pool!=null){
	            pool.shutdown(); 
	        }
		}
	}

}
