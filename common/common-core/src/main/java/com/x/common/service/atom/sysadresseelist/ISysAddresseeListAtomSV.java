package com.x.common.service.atom.sysadresseelist;


import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysaddresseelist.param.AddresseeListPageQueryRequest;
import com.x.common.api.sysaddresseelist.param.AddresseeListPageVo;
import com.x.common.api.sysaddresseelist.param.DeleteSysAddresseeList;
import com.x.common.api.sysaddresseelist.param.QueryAllSysAddresseeReq;
import com.x.common.api.sysaddresseelist.param.SaveSysAddresseeList;
import com.x.common.api.sysaddresseelist.param.SysAddresseeAllResponseInfo;
import com.x.common.api.sysaddresseelist.param.SysAddresseeQueryRequest;
import com.x.common.dao.mapper.bo.SysAddressee;
import com.x.common.dao.mapper.bo.SysAddresseeList;

/**
 * @author auth
 * @date 2017年6月16日 
 * @version V1.0
 */
public interface ISysAddresseeListAtomSV {


	PageInfo<AddresseeListPageVo> queryAddresseeListPage(AddresseeListPageQueryRequest param);

	Integer saveSysAddresseeList(SysAddresseeList sysAddresseeList);

	Integer deleteSysAddresseeList(String listId);

	Integer queryCounyByListId(String listId);

	int getSysAddresseeCount(SysAddresseeQueryRequest param);

	List<SysAddresseeAllResponseInfo> queryManByListId(SysAddresseeQueryRequest param);

	Integer saveSysAddressee(SysAddressee sysAddressee);

	Integer deleteSysAddressee(String id);

	Integer updateSysAddressee(SysAddressee sysAddressee);

	List<SysAddresseeList> queryAddresseeList();

	SaveSysAddresseeList queryNameById(DeleteSysAddresseeList param);

	List<SysAddressee> queryAllByListId(QueryAllSysAddresseeReq param);

	

}
