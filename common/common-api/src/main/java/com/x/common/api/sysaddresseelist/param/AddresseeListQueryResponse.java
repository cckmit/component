package com.x.common.api.sysaddresseelist.param;

import java.util.List;

import com.x.base.vo.BaseResponse;
/**
 *	查询返回结果分页 
 * @author auth
 */
public class AddresseeListQueryResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;
	
    List<AddresseeListPageVo> addresseeListPageVo;

	public List<AddresseeListPageVo> getAddresseeListPageVo() {
		return addresseeListPageVo;
	}

	public void setAddresseeListPageVo(List<AddresseeListPageVo> addresseeListPageVo) {
		this.addresseeListPageVo = addresseeListPageVo;
	}

}
