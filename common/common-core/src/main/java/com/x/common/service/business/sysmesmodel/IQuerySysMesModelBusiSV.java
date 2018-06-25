package com.x.common.service.business.sysmesmodel;


import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysmesmodel.param.DeleteSysMesModel;
import com.x.common.api.sysmesmodel.param.MesModelPageQueryRequest;
import com.x.common.api.sysmesmodel.param.MesModelPageVo;
import com.x.common.api.sysmesmodel.param.SaveSysMesModel;

/**
 * @author auth
 * @date 2017年6月2日
 * @version V1.0
 */
public interface IQuerySysMesModelBusiSV {

	PageInfo<MesModelPageVo> queryMesModelPage(MesModelPageQueryRequest param);

	Integer saveSysMesModel(SaveSysMesModel req);

	Integer deleteSysMesModel(String modelId);

	Integer updateSysMesModel(SaveSysMesModel req);

	List<MesModelPageVo> queryMesModel();

	SaveSysMesModel queryNameById(DeleteSysMesModel param);


}
