package com.x.common.api.servicenum.param;

import java.io.Serializable;

/**
 * ServiceNum
 *
 * Date: 2016年6月1日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * @author auth
 */
public class ServicePhoneCond implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    /**
     * 手机号码
     */
    private String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
  


   
}