package com.x.common.service.atom.sysorderinvoice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.common.api.sysorderinvoice.param.OrderInvoiceQueryRequest;
import com.x.common.dao.mapper.bo.SysOrderInvoice;
import com.x.common.dao.mapper.bo.SysOrderInvoiceCriteria;
import com.x.common.dao.mapper.bo.SysOrderInvoiceCriteria.Criteria;
import com.x.common.dao.mapper.interfaces.SysOrderInvoiceMapper;
import com.x.common.service.atom.sysorderinvoice.ISysOrderInvoiceAtomSV;
import com.x.sdk.util.StringUtil;

@Service
public class SysOrderInvoiceAtomSVImpl implements ISysOrderInvoiceAtomSV {
	
	@Autowired
	private SysOrderInvoiceMapper sysOrderInvoiceMapper;

	@Override
	public int count(OrderInvoiceQueryRequest request) {
		SysOrderInvoiceCriteria example =this.packAgeCondition(request);
		return sysOrderInvoiceMapper.countByExample(example);
	}

	@Override
	public List<SysOrderInvoice> queryList(OrderInvoiceQueryRequest request) {
		SysOrderInvoiceCriteria example =this.packAgeCondition(request);
		example.setOrderByClause("create_time desc");
		example.setLimitStart((request.getPageNo() - 1) * request.getPageSize());
		example.setLimitEnd(request.getPageSize());
		return sysOrderInvoiceMapper.selectByExample(example);
	}
	
	
	/**
	 * 封装条件
	 * @param request
	 * @return
	 */
	private SysOrderInvoiceCriteria packAgeCondition(OrderInvoiceQueryRequest request) {
		SysOrderInvoiceCriteria example=new SysOrderInvoiceCriteria();
		Criteria criteria = example.createCriteria();
		if(!StringUtil.isBlank(request.getOrderNumber())) {
			criteria.andOrderNumberLike("%" + request.getOrderNumber().trim() + "%");
		}
		if(!StringUtil.isBlank(request.getUsername())) {
			criteria.andUsernameLike("%" + request.getUsername().trim() + "%");
		}
		if(!StringUtil.isBlank(request.getInvoiceType())) {
			criteria.andInvoiceTypeEqualTo(request.getInvoiceType());
		}
		if(!StringUtil.isBlank(request.getState())) {
			criteria.andStateEqualTo(request.getState());
		}
		if(!StringUtil.isBlank(request.getAditor())) {
			criteria.andAditorLike("%" + request.getAditor().trim() + "%");
		}
		if(!StringUtil.isBlank(request.getDrawer())) {
			criteria.andDrawerLike("%" + request.getDrawer().trim() + "%");
		}
		if(!StringUtil.isBlank(request.getProposer())) {
			criteria.andProposerLike("%" + request.getProposer().trim() + "%");
		}
		return example;
	}

	@Override
	public void insert(SysOrderInvoice orderInvoice) {
		sysOrderInvoiceMapper.insertSelective(orderInvoice);
	}

	@Override
	public SysOrderInvoice selectById(String invoiceId) {
		return sysOrderInvoiceMapper.selectByPrimaryKey(invoiceId);
	}
	
	@Override
	public int update(SysOrderInvoice orderInvoice) {
		return sysOrderInvoiceMapper.updateByPrimaryKeySelective(orderInvoice);
	}

}
