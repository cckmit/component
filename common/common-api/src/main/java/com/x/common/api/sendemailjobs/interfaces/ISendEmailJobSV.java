package com.x.common.api.sendemailjobs.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.common.api.sendemailjobs.param.SendEmailRequest;
/**
 * @Description: 群发邮件
 * @author auth
 * @date 2017年6月20日 
 * @version V1.0.1
 */
@Path("/sendEmailJobSV")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ISendEmailJobSV {
	/**
     * 发送邮件
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode SDEM_0001
     * @RestRelativeURL sendEmailJobSV/sendEmailJob
	 */
	@POST
	@Path("/sendEmailJob")
	public BaseResponse sendEmailJob(SendEmailRequest request) throws BusinessException,SystemException;
	
}
