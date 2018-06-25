package com.x.common.service.atom.sysadresseelist.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysaddresseelist.param.AddresseeListPageQueryRequest;
import com.x.common.api.sysaddresseelist.param.AddresseeListPageVo;
import com.x.common.api.sysaddresseelist.param.DeleteSysAddresseeList;
import com.x.common.api.sysaddresseelist.param.QueryAllSysAddresseeReq;
import com.x.common.api.sysaddresseelist.param.SaveSysAddresseeList;
import com.x.common.api.sysaddresseelist.param.SysAddresseeAllResponseInfo;
import com.x.common.api.sysaddresseelist.param.SysAddresseeQueryRequest;
import com.x.common.dao.mapper.attach.AddresseeInfoServiceAttachMapper;
import com.x.common.dao.mapper.bo.SysAddressee;
import com.x.common.dao.mapper.bo.SysAddresseeCriteria;
import com.x.common.dao.mapper.bo.SysAddresseeList;
import com.x.common.dao.mapper.bo.SysAddresseeListCriteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.dao.mapper.interfaces.SysAddresseeListMapper;
import com.x.common.dao.mapper.interfaces.SysAddresseeMapper;
import com.x.common.service.atom.sysadresseelist.ISysAddresseeListAtomSV;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;

/**
 * @author auth
 * @date 2017年6月2日 
 * @version V1.0
 */
@Service
public class SysAddresseeListAtomSVImpl implements ISysAddresseeListAtomSV{
	
	@Autowired
	private  transient AddresseeInfoServiceAttachMapper addresseeInfoServiceAttachMapper;

	@Override
	public PageInfo<AddresseeListPageVo> queryAddresseeListPage(AddresseeListPageQueryRequest param) {
		List<AddresseeListPageVo> addresseeListPageVos = new ArrayList<AddresseeListPageVo>();
		SysAddresseeListCriteria sysAddresseeListCriteria = new SysAddresseeListCriteria();
		String orderByClause = "CREAT_TIME desc";
		sysAddresseeListCriteria.setOrderByClause(orderByClause);
		PageInfo<AddresseeListPageVo> pageInfo = new PageInfo<AddresseeListPageVo>();
		SysAddresseeListMapper mapper = MapperFactory.getSysAddresseeListMapper();
		pageInfo.setCount(mapper.countByExample(sysAddresseeListCriteria));
		if (param.getPageInfo() == null) {
			pageInfo.setPageNo(1);
			pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		} else {
			pageInfo.setPageNo(param.getPageInfo().getPageNo());
			pageInfo.setPageSize(param.getPageInfo().getPageSize() == null ? 20
					: param.getPageInfo().getPageSize());
			sysAddresseeListCriteria.setLimitStart(param.getPageInfo().getStartRowIndex());
			sysAddresseeListCriteria.setLimitEnd(param.getPageInfo().getPageSize());
		}
		List<SysAddresseeList> selectByExample = mapper.selectByExample(sysAddresseeListCriteria);
		if (!CollectionUtil.isEmpty(selectByExample)) {
			for (int i = 0; i < selectByExample.size(); i++) {
				AddresseeListPageVo addresseeListPageVo = new AddresseeListPageVo();
				BeanUtils.copyProperties(addresseeListPageVo, selectByExample.get(i));
				addresseeListPageVos.add(addresseeListPageVo);
			}
		}
		pageInfo.setPageNo(pageInfo.getPageNo() == null ? 1 : pageInfo.getPageNo());
		pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		pageInfo.setPageCount((pageInfo.getCount() + pageInfo.getPageSize() - 1) / pageInfo.getPageSize());
		pageInfo.setResult(addresseeListPageVos);
		return pageInfo;
	}

	@Override
	public Integer saveSysAddresseeList(SysAddresseeList sysAddresseeList) {
		SysAddresseeListMapper mapper = MapperFactory.getSysAddresseeListMapper();
		return mapper.insert(sysAddresseeList);
	}

	@Override
	public Integer deleteSysAddresseeList(String listId) {
		SysAddresseeListMapper mapper = MapperFactory.getSysAddresseeListMapper();
		return mapper.deleteByPrimaryKey(listId);
	}

	@Override
	public Integer queryCounyByListId(String listId) {
		SysAddresseeMapper mapper = MapperFactory.getSysAddresseeMapper();
		SysAddresseeCriteria sysAddresseeCriteria = new SysAddresseeCriteria();
		SysAddresseeCriteria.Criteria criteria = sysAddresseeCriteria.createCriteria();
		criteria.andListIdEqualTo(listId);
		int countByExample = mapper.countByExample(sysAddresseeCriteria);
		return countByExample;
	}

	@Override
	public int getSysAddresseeCount(SysAddresseeQueryRequest param) {
		return addresseeInfoServiceAttachMapper.getSysAddresseeCount(param);
	}

	@Override
	public List<SysAddresseeAllResponseInfo> queryManByListId(SysAddresseeQueryRequest param) {
		return addresseeInfoServiceAttachMapper.queryManByListId(param);

	}

	@Override
	public Integer saveSysAddressee(SysAddressee sysAddressee) {
		SysAddresseeMapper mapper = MapperFactory.getSysAddresseeMapper();
		return mapper.insert(sysAddressee);
	}

	@Override
	public Integer deleteSysAddressee(String id) {
		SysAddresseeMapper mapper = MapperFactory.getSysAddresseeMapper();
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public Integer updateSysAddressee(SysAddressee sysAddressee) {
		SysAddresseeCriteria sysAddresseeCriteria = new SysAddresseeCriteria();
		SysAddresseeCriteria.Criteria criteria = sysAddresseeCriteria.createCriteria();
		criteria.andIdEqualTo(sysAddressee.getId());
		SysAddresseeMapper mapper = MapperFactory.getSysAddresseeMapper();
		int updateByPrimaryKey = mapper.updateByExampleSelective(sysAddressee, sysAddresseeCriteria);
		return updateByPrimaryKey;
	}

	@Override
	public List<SysAddresseeList> queryAddresseeList() {
		SysAddresseeListCriteria sysAddresseeListCriteria = new SysAddresseeListCriteria();
		SysAddresseeListMapper mapper = MapperFactory.getSysAddresseeListMapper();
		List<SysAddresseeList> selectByExample = mapper.selectByExample(sysAddresseeListCriteria);
		return selectByExample;
	}

	@Override
	public SaveSysAddresseeList queryNameById(DeleteSysAddresseeList param) {
		SaveSysAddresseeList saveSysAddresseeList = new SaveSysAddresseeList();
		SysAddresseeListMapper mapper = MapperFactory.getSysAddresseeListMapper();
		SysAddresseeList selectByPrimaryKey = mapper.selectByPrimaryKey(param.getListId());
		BeanUtils.copyProperties(saveSysAddresseeList, selectByPrimaryKey);
		return saveSysAddresseeList;
	}

	@Override
	public List<SysAddressee> queryAllByListId(QueryAllSysAddresseeReq param) {
		SysAddresseeCriteria sysAddresseeCriteria = new SysAddresseeCriteria();
		SysAddresseeCriteria.Criteria criteria = sysAddresseeCriteria.createCriteria();
		criteria.andListIdEqualTo(param.getListId());
		SysAddresseeMapper mapper = MapperFactory.getSysAddresseeMapper();
		List<SysAddressee> selectByExample = mapper.selectByExample(sysAddresseeCriteria);
		return selectByExample;
	}

}
