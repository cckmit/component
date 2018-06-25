package com.x.common.service.business.sysaddresseelist;


import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysaddresseelist.param.AddresseeListPageQueryRequest;
import com.x.common.api.sysaddresseelist.param.AddresseeListPageVo;
import com.x.common.api.sysaddresseelist.param.DeleteSysAddresseeList;
import com.x.common.api.sysaddresseelist.param.QueryAllSysAddresseeReq;
import com.x.common.api.sysaddresseelist.param.SaveSysAddressee;
import com.x.common.api.sysaddresseelist.param.SaveSysAddresseeList;
import com.x.common.api.sysaddresseelist.param.SysAddresseePageResponse;
import com.x.common.api.sysaddresseelist.param.SysAddresseeQueryRequest;
import com.x.common.api.sysaddresseelist.param.SysAddresseeResp;

/**
 * @author auth
 * @date 2017年6月2日
 * @version V1.0
 */
public interface IQuerySysAddresseeListBusiSV {

	PageInfo<AddresseeListPageVo> queryAddresseeListPage(AddresseeListPageQueryRequest param);

	Integer saveSysAddresseeList(SaveSysAddresseeList req);

	Integer deleteSysAddresseeList(String listId);

	Integer queryCounyByListId(String listId);

	SysAddresseePageResponse queryManByListId(SysAddresseeQueryRequest param);

	Integer saveSysAddressee(SaveSysAddressee req);

	Integer deleteSysAddressee(String id);

	Integer updateSysAddressee(SaveSysAddressee req);

	List<AddresseeListPageVo> queryAddresseeList();

	SaveSysAddresseeList queryNameById(DeleteSysAddresseeList param);

	SysAddresseeResp queryAllByListId(QueryAllSysAddresseeReq param);


}
