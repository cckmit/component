package com.x.common.api.systitle.param;

import java.io.Serializable;

public class QueryTitleRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 //地区语言   zh、中文 ; en、英文
    private String regionalLanguage;

	public String getRegionalLanguage() {
		return regionalLanguage;
	}

	public void setRegionalLanguage(String regionalLanguage) {
		this.regionalLanguage = regionalLanguage;
	}
}
