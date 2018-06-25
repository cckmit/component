package com.x.centra.dst.service.business.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.x.base.exception.BusinessException;
import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
import com.x.base.vo.ResponseHeader;
import com.x.centra.dst.api.discount.param.BaseParamQueryVo;
import com.x.centra.dst.api.discount.param.BaseParamResponse;
import com.x.centra.dst.api.discount.param.BaseParamVo;
import com.x.centra.dst.api.discount.param.DiscountClassQueryParam;
import com.x.centra.dst.api.discount.param.DiscountClassQueryResponse;
import com.x.centra.dst.api.discount.param.DiscountClassResponseVo;
import com.x.centra.dst.api.discount.param.DiscountClassVo;
import com.x.centra.dst.api.discount.param.DiscountDeleteParam;
import com.x.centra.dst.api.discount.param.DiscountInfoQueryParam;
import com.x.centra.dst.api.discount.param.DiscountInfoQueryResponse;
import com.x.centra.dst.api.discount.param.DiscountInfoResponseVo;
import com.x.centra.dst.api.discount.param.DiscountInfoVo;
import com.x.centra.dst.api.discount.param.DiscountLevelResponseVo;
import com.x.centra.dst.api.discount.param.DiscountOwnerLimitResponseVo;
import com.x.centra.dst.api.discount.param.DiscountOwnerLimitVo;
import com.x.centra.dst.api.discount.param.DiscountVerifyVo;
import com.x.centra.dst.api.discount.param.ExistParamRequest;
import com.x.centra.dst.api.discount.param.ExistParamResponse;
import com.x.centra.dst.constants.DiscountConstants;
import com.x.centra.dst.constants.ExceptCodeConstants;
import com.x.centra.dst.dao.mapper.bo.DstBaseParam;
import com.x.centra.dst.dao.mapper.bo.DstDiscountClass;
import com.x.centra.dst.dao.mapper.bo.DstDiscountClassCriteria;
import com.x.centra.dst.dao.mapper.bo.DstDiscountInfo;
import com.x.centra.dst.dao.mapper.bo.DstDiscountInfoCriteria;
import com.x.centra.dst.dao.mapper.bo.DstDiscountLevel;
import com.x.centra.dst.dao.mapper.bo.DstDiscountLevelRelation;
import com.x.centra.dst.dao.mapper.bo.DstDiscountLevelRelationCriteria;
import com.x.centra.dst.dao.mapper.bo.DstDiscountOwnerLimit;
import com.x.centra.dst.dao.mapper.bo.DstDiscountInfoCriteria.Criteria;
import com.x.centra.dst.service.atom.interfaces.IDstBaseParamAtomSV;
import com.x.centra.dst.service.atom.interfaces.IDstDiscountClassAtomSV;
import com.x.centra.dst.service.atom.interfaces.IDstDiscountInfoAtomSV;
import com.x.centra.dst.service.atom.interfaces.IDstDiscountLevelAtomSV;
import com.x.centra.dst.service.atom.interfaces.IDstDiscountLevelRelationAtomSV;
import com.x.centra.dst.service.atom.interfaces.IDstDiscountOwnerLimitAtomSV;
import com.x.centra.dst.service.business.interfaces.IDiscountManagementBusiSV;
import com.x.centra.dst.util.DstBeanUtils;
import com.x.centra.dst.util.DstSeqUtil;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;

@Component
@Transactional
public class DiscountManagementBusiSVImpl implements IDiscountManagementBusiSV{

	@Autowired
	private IDstDiscountInfoAtomSV discountInfoAtomSV;
	
	@Autowired
	private IDstDiscountClassAtomSV discountClassAtomSV;
	
	@Autowired
	private IDstDiscountLevelAtomSV discountLevelAtomSV;
	
	@Autowired
	private IDstDiscountLevelRelationAtomSV discountLevelRelationAtomSV;
	
	@Autowired
	private IDstDiscountOwnerLimitAtomSV discountOwnerLimitAtomSV;
	
	@Autowired
	private IDstBaseParamAtomSV iDstBaseParamAtomSV;
	
	@Override
	public int saveDiscountInfo(DiscountInfoVo param) {
		// TODO Auto-generated method stub
		//新增
		if(StringUtil.isBlank(param.getDiscountId())){
			if(discountInfoAtomSV.countByDiscountCode(param.getTenantId(), param.getDiscountCode())>0) {
				throw new BusinessException(ExceptCodeConstants.RESULT_COUNT_WRONG, "权益编码不能重复");
			}
			String discountId = DstSeqUtil.getDiscountInfoId();
//			String discountCode = discountId;
			DstDiscountInfo discountInfo = new DstDiscountInfo();
			DstBeanUtils.copyVO(discountInfo, param);
			discountInfo.setTenantId(param.getTenantId());
			discountInfo.setDiscountId(discountId);
			discountInfo.setDiscountCode(param.getDiscountCode());
			discountInfo.setStatus(DiscountConstants.Status.EFFECTIVE);
//			discountInfo.setRemindTime("1");
//			discountInfo.setRemindTimeUnit(DiscountConstants.TimeUnit.DAY);
			discountInfoAtomSV.insert(discountInfo);
			
			if(param.getLevelVo()!=null) {
				if(discountLevelAtomSV.countByLevelCode(param.getTenantId(), param.getLevelVo().getLevelCode())==0) {
					throw new BusinessException(ExceptCodeConstants.RESULT_COUNT_WRONG, "未查询到权益级别");
				}
//				DstDiscountLevel discountLevel = discountLevelAtomSV.getByLevelCode(param.getTenantId(), param.getLevelVo().getLevelCode());
//				DstDiscountLevel discountLevel = new DstDiscountLevel();
//				String levelId = DstSeqUtil.getDiscountLevelId();
//				discountLevel.setTenantId(param.getTenantId());
//				if(param.getCreateDate()!=null) {
//					discountLevel.setCreateDate(new Timestamp(param.getCreateDate()));
//				}
//				discountLevel.setCreateUserId(param.getCreateUserId());
//				discountLevel.setInstructions(param.getLevelVo().getInstructions());
//				discountLevel.setLevelCode(param.getLevelVo().getLevelCode());
//				discountLevel.setLevelId(levelId);
//				discountLevel.setLevelName(param.getLevelVo().getLevelName());
//				discountLevel.setRemark(param.getLevelVo().getRemark());
//				discountLevel.setStatus(DiscountConstants.Status.EFFECTIVE);
//				discountLevelAtomSV.insert(discountLevel);
				
				DstDiscountLevelRelation discountLevelRelation = new DstDiscountLevelRelation();
				if(param.getCreateDate()!=null) {
					discountLevelRelation.setCreateDate(new Timestamp(param.getCreateDate()));
				}
				discountLevelRelation.setCreateUserId(param.getCreateUserId());
				discountLevelRelation.setDiscountCode(param.getDiscountCode());
				discountLevelRelation.setLevelCode(param.getLevelVo().getLevelCode());
				discountLevelRelation.setRelStatus(param.getLevelVo().getRelStatus());
				discountLevelRelation.setTenantId(param.getTenantId());
				discountLevelRelationAtomSV.insert(discountLevelRelation);
			}
			
			if(!CollectionUtil.isEmpty(param.getLimitVos())) {
				for(DiscountOwnerLimitVo limitVo : param.getLimitVos()) {
					
					DstDiscountOwnerLimit discountOwnerLimit = new DstDiscountOwnerLimit();
					if(param.getCreateDate()!=null) {
						discountOwnerLimit.setCreateDate(new Timestamp(param.getCreateDate()));
					}
					discountOwnerLimit.setCreateUserId(param.getCreateUserId());
					discountOwnerLimit.setDiscountCode(param.getDiscountCode());
					discountOwnerLimit.setLimitStatus(limitVo.getLimitStatus());
					discountOwnerLimit.setOwnerCode(limitVo.getOwnerCode());
					discountOwnerLimit.setTenantId(param.getTenantId());
					discountOwnerLimitAtomSV.insert(discountOwnerLimit);
				}
			}
		}else{
			//修改
			
			DstDiscountInfo oldDiscountInfo = discountInfoAtomSV.getByDiscountId(param.getTenantId(), param.getDiscountId());
			if(oldDiscountInfo==null) {
				throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "未查询到以前的权益信息");
			}
			if(!StringUtils.equals(param.getDiscountCode(), oldDiscountInfo.getDiscountCode()) &&
					discountInfoAtomSV.countByDiscountCode(param.getTenantId(), param.getDiscountCode())>0) {
				throw new BusinessException(ExceptCodeConstants.RESULT_COUNT_WRONG, "权益编码不能重复");
			}
			
			DstDiscountInfo discountInfo = new DstDiscountInfo();
			DstBeanUtils.copyVO(discountInfo, param);
			discountInfo.setTenantId(param.getTenantId());
			discountInfo.setStatus(DiscountConstants.Status.EFFECTIVE);
			discountInfo.setDiscountCode(param.getDiscountCode());
//			discountInfo.setRemindTime("1");
//			discountInfo.setRemindTimeUnit(DiscountConstants.TimeUnit.DAY);
			discountInfoAtomSV.updateByPrimaryKey(discountInfo);
			
			if(param.getLevelVo()!=null) {
				 
//				String discountCode = discountInfo.getDiscountId();
				if(discountLevelAtomSV.countByLevelCode(param.getTenantId(), param.getLevelVo().getLevelCode())==0) {
					throw new BusinessException(ExceptCodeConstants.RESULT_COUNT_WRONG, "未查询到权益级别");
				}
				DstDiscountLevelRelationCriteria example = new DstDiscountLevelRelationCriteria();
				com.x.centra.dst.dao.mapper.bo.DstDiscountLevelRelationCriteria.Criteria criteria = example.createCriteria();
				criteria.andDiscountCodeEqualTo(param.getDiscountCode());
				criteria.andTenantIdEqualTo(param.getTenantId());
				discountLevelRelationAtomSV.deleteByExample(example);
				
//				DstDiscountLevelRelation levelRelation = discountLevelRelationAtomSV.getByDiscountCode(param.getTenantId(), oldDiscountInfo.getDiscountCode());
//				if(levelRelation!=null) {
//					String levelCode = levelRelation.getLevelCode();
//					if(!StringUtils.equals(param.getLevelVo().getLevelCode(), levelCode) &&
//							discountLevelAtomSV.countByLevelCode(param.getTenantId(), param.getLevelVo().getLevelCode())>0) {
//						throw new BusinessException(ExceptCodeConstants.RESULT_COUNT_WRONG, "级别编码不能重复");
//					}
//					discountLevelAtomSV.getByLevelCode(param.getTenantId(), levelCode);
//				}
//				String levelId = DstSeqUtil.getDiscountLevelId();
//				DstDiscountLevel discountLevel = new DstDiscountLevel();
//				discountLevel.setTenantId(param.getTenantId());
//				if(param.getCreateDate()!=null) {
//					discountLevel.setCreateDate(new Timestamp(param.getCreateDate()));
//				}
//				discountLevel.setCreateUserId(param.getCreateUserId());
//				discountLevel.setInstructions(param.getLevelVo().getInstructions());
//				discountLevel.setLevelCode(param.getLevelVo().getLevelCode());
//				discountLevel.setLevelId(levelId);
//				discountLevel.setLevelName(param.getLevelVo().getLevelName());
//				discountLevel.setRemark(param.getLevelVo().getRemark());
//				discountLevel.setStatus(DiscountConstants.Status.EFFECTIVE);
//				discountLevelAtomSV.insert(discountLevel);
				
				DstDiscountLevelRelation discountLevelRelation = new DstDiscountLevelRelation();
				if(param.getCreateDate()!=null) {
					discountLevelRelation.setCreateDate(new Timestamp(param.getCreateDate()));
				}
				discountLevelRelation.setCreateUserId(param.getCreateUserId());
				discountLevelRelation.setDiscountCode(param.getDiscountCode());
				discountLevelRelation.setLevelCode(param.getLevelVo().getLevelCode());
				discountLevelRelation.setRelStatus(param.getLevelVo().getRelStatus());
				discountLevelRelation.setTenantId(param.getTenantId());
				discountLevelRelationAtomSV.insert(discountLevelRelation);
			}
			
			if(!CollectionUtil.isEmpty(param.getLimitVos())) {
				discountOwnerLimitAtomSV.deleteByDiscountCode(param.getTenantId(), param.getDiscountCode());
				for(DiscountOwnerLimitVo limitVo : param.getLimitVos()) {
					DstDiscountOwnerLimit discountOwnerLimit = new DstDiscountOwnerLimit();
					if(param.getCreateDate()!=null) {
						discountOwnerLimit.setCreateDate(new Timestamp(param.getCreateDate()));
					}
					discountOwnerLimit.setCreateUserId(param.getCreateUserId());
					discountOwnerLimit.setDiscountCode(param.getDiscountCode());
					discountOwnerLimit.setLimitStatus(limitVo.getLimitStatus());
					discountOwnerLimit.setOwnerCode(limitVo.getOwnerCode());
					discountOwnerLimit.setTenantId(param.getTenantId());
					discountOwnerLimitAtomSV.insert(discountOwnerLimit);
				}
			}
		}
		return 1;
	}

	@Override
	public BaseResponse verifyDiscountInfo(DiscountVerifyVo param) {
		// TODO Auto-generated method stub
		
		DstDiscountInfoCriteria example = new DstDiscountInfoCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(param.getTenantId())
				.andDiscountIdEqualTo(param.getDiscountId())
				.andStatusEqualTo(DiscountConstants.Status.EFFECTIVE);
		List<DstDiscountInfo> infos = discountInfoAtomSV.selectByExample(example);
		if(CollectionUtil.isEmpty(infos)){
			throw new BusinessException(ExceptCodeConstants.RESULT_COUNT_WRONG, "未查询到权益数据");
		}
		if(!StringUtils.equals(DiscountConstants.VerifyStatus.NON_VERIFY, infos.get(0).getVerifyState())){
			throw new BusinessException(ExceptCodeConstants.RESULT_COUNT_WRONG, "权益信息数据已认证");
		}
		
		DstDiscountInfo record = new DstDiscountInfo();
		record.setTenantId(param.getTenantId());
		record.setDiscountId(param.getDiscountId());
		record.setVerifyState(param.getVerifyState());
		discountInfoAtomSV.updateByExampleSelective(record, example);
		
		return new BaseResponse();
	}

	@Override
	public DiscountInfoQueryResponse queryDiscountInfo(DiscountInfoQueryParam infoQueryParam) {
		// TODO Auto-generated method stub
		
		DiscountInfoQueryResponse response = new DiscountInfoQueryResponse();
		PageInfo<DiscountInfoResponseVo> pageInfo = new PageInfo<DiscountInfoResponseVo>();
		List<DiscountInfoResponseVo> infoVos = new ArrayList<>();
		
		DstDiscountInfoCriteria sql = new DstDiscountInfoCriteria();
		Criteria criteria = sql.createCriteria();
		criteria.andTenantIdEqualTo(infoQueryParam.getTenantId());
		criteria.andStatusEqualTo(DiscountConstants.Status.EFFECTIVE);
		if(!StringUtils.isBlank(infoQueryParam.getDiscountId())){
			criteria.andDiscountIdEqualTo(infoQueryParam.getDiscountId());
		}
		if(!StringUtils.isBlank(infoQueryParam.getDiscountCode())){
			criteria.andDiscountCodeEqualTo(infoQueryParam.getDiscountCode());
		}
		if(!StringUtils.isBlank(infoQueryParam.getDiscountName())){
			criteria.andDiscountNameLike("%"+infoQueryParam.getDiscountName()+"%");
		}
		if(!StringUtils.isBlank(infoQueryParam.getClassCode())){
			criteria.andClassCodeEqualTo(infoQueryParam.getClassCode());
		}
		if(!StringUtils.isBlank(infoQueryParam.getDiscountType())){
			criteria.andDiscountTypeEqualTo(infoQueryParam.getDiscountType());
		}
		if(!StringUtils.isBlank(infoQueryParam.getVerifyState())){
			criteria.andVerifyStateEqualTo(infoQueryParam.getVerifyState());
		}
		if(!StringUtils.isBlank(infoQueryParam.getStatus())){
			criteria.andStatusEqualTo(infoQueryParam.getStatus());
		}
		
		pageInfo.setCount(discountInfoAtomSV.countByExample(sql));
		int startRowIndex = (infoQueryParam.getPageNo()-1)*infoQueryParam.getPageSize();
		int pageSize = infoQueryParam.getPageSize();
		sql.setLimitStart(startRowIndex);
		sql.setLimitEnd(pageSize);
		sql.setOrderByClause("CREATE_DATE desc");
		List<DstDiscountInfo> discountInfos = discountInfoAtomSV.selectByExample(sql);
		if(!CollectionUtil.isEmpty(discountInfos)){
			for(DstDiscountInfo info:discountInfos){
				DiscountInfoResponseVo infoVo = new DiscountInfoResponseVo();
				DstBeanUtils.copyVO(infoVo, info);
				
				List<DiscountOwnerLimitResponseVo> ownerLimitResponseVos = new ArrayList<>();
				List<DstDiscountOwnerLimit> ownerLimits = discountOwnerLimitAtomSV.selectByDiscountCode(info.getTenantId(), info.getDiscountCode());
				if(!CollectionUtil.isEmpty(ownerLimits)) {
					for(DstDiscountOwnerLimit ownerLimit:ownerLimits) {
						DiscountOwnerLimitResponseVo limitResponseVo = new DiscountOwnerLimitResponseVo();
						DstBeanUtils.copyVO(limitResponseVo, ownerLimit);
						ownerLimitResponseVos.add(limitResponseVo);
					}
				}
				infoVo.setOwnerLimitResponseVos(ownerLimitResponseVos);
				
				DstDiscountLevelRelation discountLevelRelation = discountLevelRelationAtomSV.getByDiscountCode(infoQueryParam.getTenantId(), info.getDiscountCode());
				if(discountLevelRelation!=null) {
					DiscountLevelResponseVo discountLevelResponseVo = new DiscountLevelResponseVo();
					DstDiscountLevel discountLevel = discountLevelAtomSV.getByLevelCode(infoQueryParam.getTenantId(), discountLevelRelation.getLevelCode());
					DstBeanUtils.copyVO(discountLevelResponseVo, discountLevel);
					infoVo.setDiscountLevelResponseVo(discountLevelResponseVo);
				}
				
				infoVos.add(infoVo);
			}
		}
		pageInfo.setPageNo(infoQueryParam.getPageNo());
		pageInfo.setPageSize(infoQueryParam.getPageSize());
		pageInfo.setResult(infoVos);
		response.setTenantId(infoQueryParam.getTenantId());
		response.setInfo(pageInfo);
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public BaseResponse deleteDiscountInfo(DiscountDeleteParam param) {
		// TODO Auto-generated method stub
		
		DstDiscountInfoCriteria sql = new DstDiscountInfoCriteria();
		Criteria criteria = sql.createCriteria();
		criteria.andTenantIdEqualTo(param.getTenantId())
				.andDiscountCodeEqualTo(param.getDiscountCode());
		DstDiscountInfo record = new DstDiscountInfo();
		record.setTenantId(param.getTenantId());
		record.setDiscountCode(param.getDiscountCode());
		record.setStatus(DiscountConstants.DeleteStatus.DELETED);
		record.setRemark(param.getRemark());
		discountInfoAtomSV.updateByExampleSelective(record, sql);
		
//		DstDiscountLevelRelationCriteria example = new DstDiscountLevelRelationCriteria();
//		com.x.centra.dst.dao.mapper.bo.DstDiscountLevelRelationCriteria.Criteria relationcriteria = example.createCriteria();
//		relationcriteria.andTenantIdEqualTo(param.getTenantId());
//		relationcriteria.andDiscountCodeEqualTo(param.getDiscountCode());
//		discountLevelRelationAtomSV.deleteByExample(example);
		return new BaseResponse();
	}

	@Override
	public BaseResponse saveDiscountClass(DiscountClassVo record) {
		// TODO Auto-generated method stub
		
		if(StringUtils.isBlank(record.getClassId())) {
			//新增
			DstDiscountClass discountClass = new DstDiscountClass();
			DstBeanUtils.copyVO(discountClass, record);
			String classId = DstSeqUtil.getDiscountClassId();
			discountClass.setClassId(classId);
			discountClass.setStatus(DiscountConstants.Status.EFFECTIVE);
			discountClassAtomSV.insert(discountClass);
		}else {
			//修改
			DstDiscountClassCriteria example = new DstDiscountClassCriteria();
			com.x.centra.dst.dao.mapper.bo.DstDiscountClassCriteria.Criteria criteria = example.createCriteria();
			criteria.andTenantIdEqualTo(record.getTenantId())
					.andClassIdEqualTo(record.getClassId());
			DstDiscountClass discountClass = new DstDiscountClass();
			DstBeanUtils.copyVO(discountClass, record);
			discountClass.setStatus(DiscountConstants.Status.EFFECTIVE);
			discountClassAtomSV.updateByExample(discountClass, example);
		}
		return new BaseResponse();
	}

	@Override
	public DiscountClassQueryResponse queryDiscountClass(DiscountClassQueryParam infoQueryParam) {
		// TODO Auto-generated method stub
		DiscountClassQueryResponse response = new DiscountClassQueryResponse();
		List<DiscountClassResponseVo> responseVos = new ArrayList<>();
		DstDiscountClassCriteria example = new DstDiscountClassCriteria();
		com.x.centra.dst.dao.mapper.bo.DstDiscountClassCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(infoQueryParam.getTenantId());
		if(!StringUtils.isBlank(infoQueryParam.getClassId())) {
			criteria.andClassIdEqualTo(infoQueryParam.getClassId());
		}
		if(!StringUtils.isBlank(infoQueryParam.getClassCode())) {
			criteria.andClassCodeEqualTo(infoQueryParam.getClassCode());
		}
		List<DstDiscountClass> discountClasses = discountClassAtomSV.selectByExample(example);
		if(!CollectionUtil.isEmpty(discountClasses)) {
			for(DstDiscountClass discountClass : discountClasses) {
				DiscountClassResponseVo vo = new DiscountClassResponseVo();
				DstBeanUtils.copyVO(vo, discountClass);
				responseVos.add(vo);
			}
		}
		
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
		response.setResponseVos(responseVos);
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public ExistParamResponse existClassCode(ExistParamRequest param) {
		// TODO Auto-generated method stub
		ExistParamResponse response = new ExistParamResponse();
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
		response.setResponseHeader(responseHeader);
		response.setExist(false);
		if(discountClassAtomSV.countByClassCode(param.getTenantId(), param.getParamCode())>0) {
			response.setExist(true);
		}
		return response;
	}

	@Override
	public ExistParamResponse existDiscountCode(ExistParamRequest param) {
		// TODO Auto-generated method stub
		ExistParamResponse response = new ExistParamResponse();
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
		response.setResponseHeader(responseHeader);
		response.setExist(false);
		if(discountInfoAtomSV.countByDiscountCode(param.getTenantId(), param.getParamCode())>0) {
			response.setExist(true);
		}
		return response;
	}

	@Override
	public ExistParamResponse existLevelCode(ExistParamRequest param) {
		// TODO Auto-generated method stub
		ExistParamResponse response = new ExistParamResponse();
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
		response.setResponseHeader(responseHeader);
		response.setExist(false);
		if(discountLevelAtomSV.countByLevelCode(param.getTenantId(), param.getParamCode())>0) {
			response.setExist(true);
		}
		return response;
	}

	@Override
	public BaseParamResponse queryBaseParam(BaseParamQueryVo param) {
		// TODO Auto-generated method stub
		BaseParamResponse response = new BaseParamResponse();
		List<BaseParamVo> paramVos = new ArrayList<>();
		List<DstBaseParam> baseParams = iDstBaseParamAtomSV.selectByParamType(param.getTenantId(), param.getParamType());
		if(!CollectionUtil.isEmpty(baseParams)) {
			for(DstBaseParam baseParam:baseParams) {
				BaseParamVo paramVo = new BaseParamVo();
				BeanUtils.copyVO(paramVo, baseParam);
				paramVos.add(paramVo);
			}
		}
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
		response.setResponseHeader(responseHeader);
		response.setParamVos(paramVos);
		return response;
	}
	

}
