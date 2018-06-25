package com.x.common.service.business.sysmailinformation.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.x.base.exception.BusinessException;
import com.x.common.api.sysmailinformation.param.InvoiceMailQueryResponse;
import com.x.common.api.sysmailinformation.param.MailInfo;
import com.x.common.api.sysmailinformation.param.MailInfoResponse;
import com.x.common.api.sysmailinformation.param.MailInformationDeleteRequest;
import com.x.common.api.sysmailinformation.param.MailInformationRequest;
import com.x.common.dao.mapper.bo.SysMailInformation;
import com.x.common.service.atom.sysmailinformation.ISysMailInformationAtomSV;
import com.x.common.service.business.sysmailinformation.ISysMailInformationBusiSV;
import com.x.common.util.SequenceUtil;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
@Service
@Transactional
public class SysMailInformationImplBusiSVImpl implements ISysMailInformationBusiSV {
	
	private static final Logger logger=LoggerFactory.getLogger(SysMailInformationImplBusiSVImpl.class);
	
	@Autowired
	private ISysMailInformationAtomSV sysMailInformationAtomSV;
	
	
	@Override
	public void save(MailInformationRequest request) {
		//一个用户下最多保存五条邮寄信息
		List<SysMailInformation> infos = sysMailInformationAtomSV.queryByUid(request.getUid());
		if(!CollectionUtil.isEmpty(infos) && infos.size()>=5 ) {
			throw new BusinessException("最多可保存5条发票邮寄信息");
		}else {
			SysMailInformation information=new SysMailInformation();
			BeanUtils.copyProperties(information, request);
			//生产主键id
			String mailInformationId = SequenceUtil.createSysMailInformationId();
			information.setId(mailInformationId);
			sysMailInformationAtomSV.save(information);
		}
	}
	
	@Override
	public void modify(SysMailInformation mailInformation) {
		sysMailInformationAtomSV.modify(mailInformation);
	}
	
	@Override
	public void delete(MailInformationDeleteRequest request) {
		sysMailInformationAtomSV.delete(request.getId());
	}

	@Override
	public InvoiceMailQueryResponse queryList(String userId) {
		//
		InvoiceMailQueryResponse response=new InvoiceMailQueryResponse();
		List<MailInfo> mailInfos=new ArrayList<MailInfo>();
		List<SysMailInformation> infos = sysMailInformationAtomSV.queryByUid(userId);
		if(!CollectionUtil.isEmpty(infos)) {
			for (SysMailInformation sysMailInformation : infos) {
				MailInfo mailInfo=new MailInfo();
				BeanUtils.copyProperties(mailInfo, sysMailInformation);
				mailInfo.setMailInformationId(sysMailInformation.getId());
				mailInfos.add(mailInfo);
			}
		}
		return response;
	}

	@Override
	public MailInfoResponse query(String id) {
		//
		MailInfoResponse infoResponse=new MailInfoResponse();
		SysMailInformation information = sysMailInformationAtomSV.query(id);
		if(information==null) {
			logger.error("邮寄信息为空,邮寄信息id:"+id);
			throw new BusinessException("邮寄信息为空");
		}
		BeanUtils.copyProperties(infoResponse, information);
		return infoResponse;
	}

}
