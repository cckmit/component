package com.x.common.service.business.sysmailinformation;

import com.x.common.api.sysmailinformation.param.InvoiceMailQueryResponse;
import com.x.common.api.sysmailinformation.param.MailInfoResponse;
import com.x.common.api.sysmailinformation.param.MailInformationDeleteRequest;
import com.x.common.api.sysmailinformation.param.MailInformationRequest;
import com.x.common.dao.mapper.bo.SysMailInformation;

public interface ISysMailInformationBusiSV {
	
	public void save(MailInformationRequest request);

	public void modify(SysMailInformation mailInformation);

	public void delete(MailInformationDeleteRequest request);

	public InvoiceMailQueryResponse queryList(String userId);

	public MailInfoResponse query(String id);

}
