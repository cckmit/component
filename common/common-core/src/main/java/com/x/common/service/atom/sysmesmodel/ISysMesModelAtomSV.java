package com.x.common.service.atom.sysmesmodel;


import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysmesmodel.param.DeleteSysMesModel;
import com.x.common.api.sysmesmodel.param.MesModelPageQueryRequest;
import com.x.common.api.sysmesmodel.param.MesModelPageVo;
import com.x.common.api.sysmesmodel.param.SaveSysMesModel;
import com.x.common.dao.mapper.bo.SysMesModel;

/**
 * @author auth
 * @date 2017年6月2日 
 * @version V1.0
 */
public interface ISysMesModelAtomSV {

	PageInfo<MesModelPageVo> queryMesModelPage(MesModelPageQueryRequest param);

	Integer deleteSysMesModel(String modelId);

	List<SysMesModel> queryMesModel();

	Integer saveSysMesModel(SysMesModel sysMesModel);

	Integer updateSysMesModel(SysMesModel sysMesModel);

	SaveSysMesModel queryNameById(DeleteSysMesModel param);


}
