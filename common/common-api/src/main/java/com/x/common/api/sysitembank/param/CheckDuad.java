package com.x.common.api.sysitembank.param;

import java.io.Serializable;


public class CheckDuad implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 语言方向
	 */
	private String langDir;
	public String getLangDir() {
		return langDir;
	}
	public void setLangDir(String langDir) {
		this.langDir = langDir;
	}
}
