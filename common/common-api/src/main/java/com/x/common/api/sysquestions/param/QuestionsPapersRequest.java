package com.x.common.api.sysquestions.param;

import java.io.Serializable;

/**
 * 生成试卷入参
 * @author auth
 *
 */
public class QuestionsPapersRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 语言方向
	 */
	private String langDir;
	
	/**
	 * 站点
	 */
	private String site;

	public String getLangDir() {
		return langDir;
	}

	public void setLangDir(String langDir) {
		this.langDir = langDir;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}
}
