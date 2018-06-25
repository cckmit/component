package com.x.centra.dst.service.business.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.centra.dst.api.discount.param.*;
import com.x.centra.dst.dao.mapper.bo.*;
import com.x.centra.dst.service.atom.interfaces.IDstDiscountInfoAtomSV;
import com.x.centra.dst.service.atom.interfaces.IDstDiscountLevelAtomSV;
import com.x.sdk.util.BeanUtils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.x.base.vo.ResponseHeader;
import com.x.centra.dst.constants.DiscountConstants;
import com.x.centra.dst.constants.ExceptCodeConstants;
import com.x.centra.dst.dao.mapper.bo.DstCustDiscountInstanceCriteria.Criteria;
import com.x.centra.dst.service.atom.interfaces.IDstCustDiscountInstanceAtomSV;
import com.x.centra.dst.service.atom.interfaces.IDstCustLevelInstanceAtomSV;
import com.x.centra.dst.service.atom.interfaces.IDstDiscountClassAtomSV;
import com.x.centra.dst.service.business.interfaces.ICustDiscountSVBusiSV;
import com.x.centra.dst.util.DstBeanUtils;
import com.x.centra.dst.util.DstSeqUtil;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;

@Component
@Transactional
public class CustDiscountSVBusiSVImpl implements ICustDiscountSVBusiSV {

	@Autowired
	private IDstCustDiscountInstanceAtomSV custDiscountInstanceAtomSV;
	
	@Autowired
	private IDstCustLevelInstanceAtomSV custLevelInstanceAtomSV;

	@Autowired
	private IDstDiscountLevelAtomSV discountLevelAtomSV;

	@Autowired
	private IDstDiscountInfoAtomSV discountInfoAtomSV;
	
	@Autowired
	private IDstDiscountClassAtomSV discountClassAtomSV;
	
//	@Override
//	public BaseResponse saveCustDiscountInfo(CustDiscountVo param) {
//		// TODO Auto-generated method stub
//		String tenantId = param.getTenantId();
//		String discountId = param.getDiscountId();
//		DstDiscountInfo discountInfo = discountInfoAtomSV.getByDiscountId(tenantId, discountId);
//		if(discountInfo==null){
//			throw new GenericException(ExceptCodeConstants.RESULT_COUNT_WRONG, "未查询到权益数据");
//		}
//		DstDiscountRule discountRule = discountRuleAtomSV.queryByDiscountId(tenantId, discountId);
//		
//		DstCustDiscount custDiscount = new DstCustDiscount();
//		String instanceId = DstSeqUtil.getDiscountInstanceId();
//		custDiscount.setInstanceId(instanceId);
//		custDiscount.setTenantId(param.getTenantId());
//		custDiscount.setCustId(param.getCustId());
//		custDiscount.setCustLevel(param.getCustLevel());
//		custDiscount.setDiscountId(param.getDiscountId());
//		custDiscount.setDiscountPayDate(new Timestamp(param.getDiscountPayDate()));
//		custDiscount.setDiscountPayFee(param.getDiscountPayFee());
//		custDiscount.setEffectiveDate(null);
//		custDiscount.setExpirationDate(null);
//		custDiscount.setActiveStatus(DiscountConstants.Status.NON_VERIFY);
//		custDiscount.setStatus(DiscountConstants.Status.EFFECTIVE);
//		custDiscountAtomSV.insert(custDiscount);
//		
//		DstDiscountInfoInstance discountInfoInstance = new DstDiscountInfoInstance();
//		DstBeanUtils.copyVO(discountInfoInstance, discountInfo);
//		discountInfoInstance.setInstanceId(instanceId);
//		discountInfoInstanceAtomSV.insert(discountInfoInstance);
//		
//		DstDiscountRuleInstance discountRuleInstance = new DstDiscountRuleInstance();
//		DstBeanUtils.copyVO(discountRuleInstance, discountRule);
//		discountRuleInstance.setInstanceId(instanceId);
//		discountRuleInstanceAtomSV.insert(discountRuleInstance);
//		return new BaseResponse();
//	}
//
//	@Override
//	public BaseResponse activeCustDiscount(DiscountActiveVo param) {
//		// TODO Auto-generated method stub
//		
//		DstCustDiscount record = new DstCustDiscount();
//		DstCustDiscountCriteria example = new DstCustDiscountCriteria();
//		Criteria criteria = example.createCriteria();
//		criteria.andTenantIdEqualTo(param.getTenantId())
//				.andInstanceIdEqualTo(param.getInstanceId());
//		
//		List<DstCustDiscount> custDiscounts = custDiscountAtomSV.selectByExample(example);
//		DstCustDiscount custDiscount = CollectionUtil.isEmpty(custDiscounts)?null:custDiscounts.get(0);
//		if(custDiscount == null){
//			throw new GenericException(ExceptCodeConstants.RESULT_COUNT_WRONG, "未查询到客户权益数据");
//		}
//		DstDiscountInfoInstance discountInfoInstance = discountInfoInstanceAtomSV.selectByPrimaryKey(param.getInstanceId());
//		if(discountInfoInstance==null){
//			throw new GenericException(ExceptCodeConstants.RESULT_COUNT_WRONG, "未查询到客户购买的权益数据");
//		}
//		if(StringUtils.equals(DiscountConstants.Status.EFFECTIVE, custDiscount.getActiveStatus())){
//			throw new GenericException(ExceptCodeConstants.RESULT_COUNT_WRONG, "权益已激活，不能重复激活");
//		}
//		if(discountInfoInstance.getEndDate().getTime()<param.getEffectiveDate()){
//			//将失效的权益存入历史表并从当前表删除
//			
//			throw new GenericException(ExceptCodeConstants.RESULT_COUNT_WRONG, "当前权益已失效");
//		}
//		
//		record.setDiscountId(custDiscount.getDiscountId());
//		record.setActiveStatus(DiscountConstants.Status.EFFECTIVE);
//		record.setActiveDate(new Timestamp(param.getActiveDate()));
//		record.setEffectiveDate(new Timestamp(param.getEffectiveDate()));
//		record.setCarId(param.getCarId());
//		record.setCarNum(param.getCarNum());
//		record.setExpirationDate(DateUtils.getTimeByUnit(new Timestamp(param.getEffectiveDate()),
//				discountInfoInstance.getEffectiveUnit(), Integer.valueOf(discountInfoInstance.getEffectiveTime())));
//		custDiscountAtomSV.updateByExampleSelective(record, example);
//		
//		return new BaseResponse();
//	}

	@Override
	public CustDiscountQueryResponse queryCustDiscountInfo(CustDiscountQueryParam custDiscountQueryParam) {
		// TODO Auto-generated method stub
		CustDiscountQueryResponse queryResponse = new CustDiscountQueryResponse();
		PageInfo<CustDiscountResponseVo> pageInfo = new PageInfo<>();
		List<CustDiscountResponseVo> discountVos = new ArrayList<>();
		DstCustDiscountInstanceCriteria example = new DstCustDiscountInstanceCriteria();
		Criteria criteria = example.createCriteria();
        if(!StringUtil.isBlank(custDiscountQueryParam.getInstanceId())) {
            criteria.andInstanceIdEqualTo(custDiscountQueryParam.getInstanceId());
        }
		if(!StringUtil.isBlank(custDiscountQueryParam.getCustId())) {
			criteria.andCustIdEqualTo(custDiscountQueryParam.getCustId());
		}
		if(!StringUtil.isBlank(custDiscountQueryParam.getCustName())) {
			criteria.andCustNameLike("%"+custDiscountQueryParam.getCustName()+"%");
		}
		if(!StringUtil.isBlank(custDiscountQueryParam.getEffectiveStatus())) {
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			if(StringUtils.equals(DiscountConstants.Status.EFFECTIVE, custDiscountQueryParam.getEffectiveStatus())) {
				criteria.andExpirationDateGreaterThanOrEqualTo(timestamp);
			}else if(StringUtils.equals(DiscountConstants.Status.INVALID, custDiscountQueryParam.getEffectiveStatus())) {
				criteria.andExpirationDateLessThan(timestamp);
			}
		}
		if(!StringUtil.isBlank(custDiscountQueryParam.getOwnerCode())) {
			criteria.andOwnerCodeEqualTo(custDiscountQueryParam.getOwnerCode());
		}
		if(!StringUtil.isBlank(custDiscountQueryParam.getOwnerInstanceCode())) {
			criteria.andOwnerInstanceCodeEqualTo(custDiscountQueryParam.getOwnerInstanceCode());
		}
		if(!StringUtil.isBlank(custDiscountQueryParam.getDiscountCode())) {
			List<String> discountCodes = Arrays.asList(
					custDiscountQueryParam.getDiscountCode().split(DiscountConstants.DISCOUNT_CODE_SPLIT));
			criteria.andDiscountCodeIn(discountCodes);
		}

		if(!StringUtil.isBlank(custDiscountQueryParam.getDiscountName())) {
			criteria.andDiscountNameLike("%"+custDiscountQueryParam.getDiscountName()+"%");
		}
		
		String tenantId = custDiscountQueryParam.getTenantId();
		criteria.andTenantIdEqualTo(custDiscountQueryParam.getTenantId());
		example.setOrderByClause("CREATE_DATE desc");
		pageInfo.setCount(custDiscountInstanceAtomSV.countByExample(example));
		Integer pageNo = (null == custDiscountQueryParam.getPageNo()) ? 1 : custDiscountQueryParam.getPageNo();
		Integer pageSize = (null == custDiscountQueryParam.getPageSize()) ? 1000 : custDiscountQueryParam.getPageSize();
		int startRowIndex = (pageNo-1)*pageSize;
		example.setLimitStart(startRowIndex);
		example.setLimitEnd(pageSize);
		String resultCode = ExceptCodeConstants.SUCCESS;
		List<DstCustDiscountInstance> custDiscounts = custDiscountInstanceAtomSV.selectByExample(example);
		if(!CollectionUtil.isEmpty(custDiscounts)){
			for(DstCustDiscountInstance discount : custDiscounts){
				CustDiscountResponseVo vo = new CustDiscountResponseVo();
				DstBeanUtils.copyVO(vo, discount);
				
				String instanceId = discount.getInstanceId();
				//查询客户等级实例
				DstCustLevelInstance custLevelInstance = custLevelInstanceAtomSV.getByInstanceId(custDiscountQueryParam.getTenantId(), instanceId);
				if(custLevelInstance!=null) {
					CustLevelInstanceResponseVo custLevelInstanceResponseVo = new CustLevelInstanceResponseVo();
					DstBeanUtils.copyVO(custLevelInstanceResponseVo, custLevelInstance);

					//查询等级信息
					DstDiscountLevel discountLevel = discountLevelAtomSV.getByLevelCode(tenantId,custLevelInstance.getLevelCode());
					if (null != discountLevel){
						DiscountLevelResponseVo discountLevelResponseVo = new DiscountLevelResponseVo();
						DstBeanUtils.copyVO(discountLevelResponseVo,discountLevel);
						custLevelInstanceResponseVo.setDiscountLevelResponseVo(discountLevelResponseVo);
					}
					vo.setCustLevelInstanceResponseVo(custLevelInstanceResponseVo);

				}
				//查询权益信息
				DstDiscountInfo dstDiscountInfo = discountInfoAtomSV.getByDiscountId(tenantId,discount.getDiscountId());
				if (null != dstDiscountInfo){
					DiscountInfoResponseVo discountInfoResponseVo = new DiscountInfoResponseVo();
					DstBeanUtils.copyVO(discountInfoResponseVo,dstDiscountInfo);
					vo.setDiscountInfoResponseVo(discountInfoResponseVo);
				}

				discountVos.add(vo);
			}
		}else {
			resultCode = ExceptCodeConstants.RESULT_IS_NULL;
		}
		pageInfo.setPageNo(pageNo);
		pageInfo.setPageSize(pageSize);
		pageInfo.setResult(discountVos);
		queryResponse.setTenantId(custDiscountQueryParam.getTenantId());
		queryResponse.setInfo(pageInfo);
		ResponseHeader responseHeader = new ResponseHeader(true, resultCode, "查询成功");
		queryResponse.setResponseHeader(responseHeader);
		/*queryResponse.setTenantId(discountQueryParam.getTenantId());
		queryResponse.setInfo(discountVos);*/
		return queryResponse;
	}

    @Override
    public CustLevelInstanceResponseVo queryCustLevelInstance(CustLevelInstanceQueryParam queryParam) {
		CustLevelInstanceResponseVo responseVo = new CustLevelInstanceResponseVo();
		String instanceId = queryParam.getInstanceId();
		String tenantId = queryParam.getTenantId();
		DstCustLevelInstance dstCustLevelInstance = custLevelInstanceAtomSV.getByInstanceId(tenantId,instanceId);
		BeanUtils.copyVO(responseVo,dstCustLevelInstance);
		return responseVo;
    }

	@Override
	public DiscountClassQueryResponse queryCustDiscountClass(CustDiscountClassQueryParam queryParam) {
		// TODO Auto-generated method stub
		DiscountClassQueryResponse queryResponse = new DiscountClassQueryResponse();
		List<DiscountClassResponseVo> responseVos = new ArrayList<>();
		DstCustDiscountInstanceCriteria example = new DstCustDiscountInstanceCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(queryParam.getTenantId());
		criteria.andCustIdEqualTo(queryParam.getCustId());
		List<DstCustDiscountInstance> discountInstances = custDiscountInstanceAtomSV.selectByExample(example);
		if(!CollectionUtil.isEmpty(discountInstances)) {
			List<String> discountCodes = new ArrayList<>();
			for(DstCustDiscountInstance vo : discountInstances) {
				discountCodes.add(vo.getDiscountCode());
			}
			List<DstDiscountInfo> discountInfos = discountInfoAtomSV.getByDiscountCodes(queryParam.getTenantId(), discountCodes);
			List<String> classCodes = new ArrayList<>();
			if(!CollectionUtil.isEmpty(discountInfos)) {
				for(DstDiscountInfo info : discountInfos) {
					classCodes.add(info.getClassCode());
				}
				List<DstDiscountClass> discountClasses = discountClassAtomSV.selectByClassCodes(queryParam.getTenantId(), classCodes);
				if(!CollectionUtil.isEmpty(discountClasses)) {
					for(DstDiscountClass discountClass : discountClasses) {
						DiscountClassResponseVo classVo = new DiscountClassResponseVo();
						DstBeanUtils.copyVO(classVo, discountClass);
						responseVos.add(classVo);
					}
				}
			}
		}
		queryResponse.setResponseVos(responseVos);
		String resultCode = ExceptCodeConstants.SUCCESS;
		if(CollectionUtil.isEmpty(responseVos)) {
			resultCode = ExceptCodeConstants.RESULT_IS_NULL;
		}
		ResponseHeader responseHeader = new ResponseHeader(true, resultCode, "查询成功");
		queryResponse.setResponseHeader(responseHeader);
		return queryResponse;
	}

	@Override
	public CustDiscountResponse queryCustDiscountInfoList(CustDiscountParam discountQueryParam) {
		// TODO Auto-generated method stub
		CustDiscountResponse discountResponse = new CustDiscountResponse();
		List<CustDiscountInfoVo> infoVos = new ArrayList<>();
		DstCustDiscountInstanceCriteria example = new DstCustDiscountInstanceCriteria();
		Criteria criteria = example.createCriteria();
        if(!StringUtil.isBlank(discountQueryParam.getInstanceId())) {
            criteria.andInstanceIdEqualTo(discountQueryParam.getInstanceId());
        }
		if(!StringUtil.isBlank(discountQueryParam.getCustId())) {
			criteria.andCustIdEqualTo(discountQueryParam.getCustId());
		}
		if(!StringUtil.isBlank(discountQueryParam.getEffectiveStatus())) {
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			if(StringUtils.equals(DiscountConstants.Status.EFFECTIVE, discountQueryParam.getEffectiveStatus())) {
				criteria.andExpirationDateGreaterThanOrEqualTo(timestamp);
			}else if(StringUtils.equals(DiscountConstants.Status.INVALID, discountQueryParam.getEffectiveStatus())) {
				criteria.andExpirationDateLessThan(timestamp);
			}
		}
		if(!StringUtil.isBlank(discountQueryParam.getOwnerCode())) {
			criteria.andOwnerCodeEqualTo(discountQueryParam.getOwnerCode());
		}
		if(!StringUtil.isBlank(discountQueryParam.getOwnerInstanceCode())) {
			criteria.andOwnerInstanceCodeEqualTo(discountQueryParam.getOwnerInstanceCode());
		}
		if(!StringUtil.isBlank(discountQueryParam.getDiscountCode())) {
			List<String> discountCodes = Arrays.asList(
					discountQueryParam.getDiscountCode().split(DiscountConstants.DISCOUNT_CODE_SPLIT));
			criteria.andDiscountCodeIn(discountCodes);
		}
		
		String tenantId = discountQueryParam.getTenantId();
		criteria.andTenantIdEqualTo(tenantId);
		
		String resultCode = ExceptCodeConstants.SUCCESS;
		List<DstCustDiscountInstance> custDiscounts = custDiscountInstanceAtomSV.selectByExample(example);
		if(!CollectionUtil.isEmpty(custDiscounts)){
			for(DstCustDiscountInstance discount : custDiscounts){
				//查询权益信息
				DstDiscountInfo dstDiscountInfo = discountInfoAtomSV.getByDiscountId(tenantId,discount.getDiscountId());
				if (null != dstDiscountInfo){
					if(!StringUtil.isBlank(discountQueryParam.getClassCode()) && 
							StringUtils.equals(discountQueryParam.getClassCode(), dstDiscountInfo.getClassCode())) {
						CustDiscountInfoVo vo = new CustDiscountInfoVo();
						DstBeanUtils.copyVO(vo, discount);
						vo.setClassCode(dstDiscountInfo.getClassCode());
						infoVos.add(vo);
					}else if(StringUtil.isBlank(discountQueryParam.getClassCode())){
						CustDiscountInfoVo vo = new CustDiscountInfoVo();
						DstBeanUtils.copyVO(vo, discount);
						vo.setClassCode(dstDiscountInfo.getClassCode());
						infoVos.add(vo);
					}
				}
			}
		}else {
			resultCode = ExceptCodeConstants.RESULT_IS_NULL;
		}
		ResponseHeader responseHeader = new ResponseHeader(true, resultCode, "查询成功");
		discountResponse.setResponseHeader(responseHeader);
		discountResponse.setInfoVos(infoVos);
		return discountResponse;
	}
}
