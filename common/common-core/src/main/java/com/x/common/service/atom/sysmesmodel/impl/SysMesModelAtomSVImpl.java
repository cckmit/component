package com.x.common.service.atom.sysmesmodel.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysmesmodel.param.DeleteSysMesModel;
import com.x.common.api.sysmesmodel.param.MesModelPageQueryRequest;
import com.x.common.api.sysmesmodel.param.MesModelPageVo;
import com.x.common.api.sysmesmodel.param.SaveSysMesModel;
import com.x.common.dao.mapper.bo.SysMesModel;
import com.x.common.dao.mapper.bo.SysMesModelCriteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.dao.mapper.interfaces.SysMesModelMapper;
import com.x.common.service.atom.sysmesmodel.ISysMesModelAtomSV;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;

/**
 * @author auth
 * @date 2017年6月16日 
 * @version V1.0
 */
@Service
public class SysMesModelAtomSVImpl implements ISysMesModelAtomSV{

	@Override
	public PageInfo<MesModelPageVo> queryMesModelPage(MesModelPageQueryRequest param) {
		List<MesModelPageVo> mesModelPageVos = new ArrayList<MesModelPageVo>();
		SysMesModelCriteria sysMesModelCriteria = new SysMesModelCriteria();
		String orderByClause = "CREAT_TIME desc";
		sysMesModelCriteria.setOrderByClause(orderByClause);
		PageInfo<MesModelPageVo> pageInfo = new PageInfo<MesModelPageVo>();
		SysMesModelMapper mapper = MapperFactory.getSysMesModelMapper();
		pageInfo.setCount(mapper.countByExample(sysMesModelCriteria));
		if (param.getPageInfo() == null) {
			pageInfo.setPageNo(1);
			pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		} else {
			pageInfo.setPageNo(param.getPageInfo().getPageNo());
			pageInfo.setPageSize(param.getPageInfo().getPageSize() == null ? 20
					: param.getPageInfo().getPageSize());
			sysMesModelCriteria.setLimitStart(param.getPageInfo().getStartRowIndex());
			sysMesModelCriteria.setLimitEnd(param.getPageInfo().getPageSize());
		}
		List<SysMesModel> selectByExample = mapper.selectByExampleWithBLOBs(sysMesModelCriteria);
		if (!CollectionUtil.isEmpty(selectByExample)) {
			for (int i = 0; i < selectByExample.size(); i++) {
				MesModelPageVo mesModelPageVo = new MesModelPageVo();
				BeanUtils.copyProperties(mesModelPageVo, selectByExample.get(i));
				mesModelPageVos.add(mesModelPageVo);
			}
		}
		pageInfo.setPageNo(pageInfo.getPageNo() == null ? 1 : pageInfo.getPageNo());
		pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		pageInfo.setPageCount((pageInfo.getCount() + pageInfo.getPageSize() - 1) / pageInfo.getPageSize());
		pageInfo.setResult(mesModelPageVos);
		return pageInfo;
	}

	@Override
	public Integer saveSysMesModel(SysMesModel sysMesModel) {
		SysMesModelMapper mapper = MapperFactory.getSysMesModelMapper();
		return mapper.insert(sysMesModel);
	}

	@Override
	public Integer deleteSysMesModel(String modelId) {
		SysMesModelMapper mapper = MapperFactory.getSysMesModelMapper();
		return mapper.deleteByPrimaryKey(modelId);
	}

	@Override
	public Integer updateSysMesModel(SysMesModel sysMesModel) {
		SysMesModelCriteria sysMesModelCriteria = new SysMesModelCriteria();
		SysMesModelCriteria.Criteria criteria = sysMesModelCriteria.createCriteria();
		criteria.andModelIdEqualTo(sysMesModel.getModelId());
		SysMesModelMapper mapper = MapperFactory.getSysMesModelMapper();
		int updateByPrimaryKey = mapper.updateByExampleSelective(sysMesModel, sysMesModelCriteria);
		return updateByPrimaryKey;
	}

	@Override
	public List<SysMesModel> queryMesModel() {
		SysMesModelCriteria sysMesModelCriteria = new SysMesModelCriteria();
		SysMesModelMapper mapper = MapperFactory.getSysMesModelMapper();
		List<SysMesModel> selectByExample = mapper.selectByExampleWithBLOBs(sysMesModelCriteria);
		return selectByExample;
	}

	@Override
	public SaveSysMesModel queryNameById(DeleteSysMesModel param) {
		SaveSysMesModel saveSysMesModel = new SaveSysMesModel();
		SysMesModelMapper mapper = MapperFactory.getSysMesModelMapper();
		SysMesModel selectByPrimaryKey = mapper.selectByPrimaryKey(param.getModelId());
		BeanUtils.copyProperties(saveSysMesModel, selectByPrimaryKey);
		return saveSysMesModel;
	}

}
