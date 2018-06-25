package com.x.common.api.sysmesmodel.param;

import java.util.List;

import com.x.base.vo.BaseResponse;
/**
 *	查询返回结果分页 
 * @author auth
 */
public class MesModelQueryResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;
	
    List<MesModelPageVo> MesModelVo;

	public List<MesModelPageVo> getMesModelVo() {
		return MesModelVo;
	}

	public void setMesModelVo(List<MesModelPageVo> mesModelVo) {
		MesModelVo = mesModelVo;
	}
}
