package com.x.common.api.country.param;

import java.io.Serializable;

/**
 * 国家相关接口返回通用数据格式<br>
 * Date: 2017年6月3日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 *
 * @author auth
 */
public class CountryComResponse<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String message;

	private String code;
	
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	

}
