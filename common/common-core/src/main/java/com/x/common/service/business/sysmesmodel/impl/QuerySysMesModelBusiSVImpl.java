package com.x.common.service.business.sysmesmodel.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysmesmodel.param.DeleteSysMesModel;
import com.x.common.api.sysmesmodel.param.MesModelPageQueryRequest;
import com.x.common.api.sysmesmodel.param.MesModelPageVo;
import com.x.common.api.sysmesmodel.param.SaveSysMesModel;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysMesModel;
import com.x.common.service.atom.sysmesmodel.ISysMesModelAtomSV;
import com.x.common.service.business.sysmesmodel.IQuerySysMesModelBusiSV;
import com.x.sdk.component.sequence.util.SeqUtil;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;

/**
 * @author auth
 * @date 2017年6月16日 
 * @version V1.0
 */
@Service
public class QuerySysMesModelBusiSVImpl implements IQuerySysMesModelBusiSV {
	@Autowired 
	private transient ISysMesModelAtomSV  iSysMesModelAtomSV;
	
	@Override
	public PageInfo<MesModelPageVo> queryMesModelPage(MesModelPageQueryRequest param) {
		PageInfo<MesModelPageVo> mesModelPageInfo = iSysMesModelAtomSV.queryMesModelPage(param);
		return mesModelPageInfo;
	}

	@Override
	public Integer saveSysMesModel(SaveSysMesModel req) {
		SysMesModel sysMesModel = new SysMesModel();
		BeanUtils.copyProperties(sysMesModel,req);
		Long id = SeqUtil.getNewId(Constants.SEQ.MESMODEL_MODELID_SEQ);
		sysMesModel.setModelId(id.toString());
		Integer saveSysSeoManager = iSysMesModelAtomSV.saveSysMesModel(sysMesModel);
		return saveSysSeoManager;
	}

	@Override
	public Integer deleteSysMesModel(String modelId) {
		return iSysMesModelAtomSV.deleteSysMesModel(modelId);
	}

	@Override
	public Integer updateSysMesModel(SaveSysMesModel req) {
		SysMesModel sysMesModel = new SysMesModel();
		BeanUtils.copyProperties(sysMesModel,req);
		return iSysMesModelAtomSV.updateSysMesModel(sysMesModel);
	}

	@Override
	public List<MesModelPageVo> queryMesModel() {
		List<MesModelPageVo> seoMesModePapersVos = new ArrayList<MesModelPageVo>();
		 List<SysMesModel> queryMesModel = iSysMesModelAtomSV.queryMesModel();
		if (!CollectionUtil.isEmpty(queryMesModel)) {
			seoMesModePapersVos = new ArrayList<MesModelPageVo>();
			for (int i = 0; i < queryMesModel.size(); i++) {
				if(queryMesModel.get(i) != null){
					MesModelPageVo seoMesModePapersVoResponse = new MesModelPageVo();
					BeanUtils.copyProperties(seoMesModePapersVoResponse, queryMesModel.get(i));
					seoMesModePapersVos.add(seoMesModePapersVoResponse);
				}
			}
		}
		return seoMesModePapersVos;
	}

	@Override
	public SaveSysMesModel queryNameById(DeleteSysMesModel param) {
		return iSysMesModelAtomSV.queryNameById(param);
	}

	
	
}
