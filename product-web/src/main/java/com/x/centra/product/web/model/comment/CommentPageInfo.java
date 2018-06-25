package com.x.centra.product.web.model.comment;

import com.x.centra.product.api.productcomment.param.CommentPageResponse;

public class CommentPageInfo extends CommentPageResponse {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 评价人姓名
	 */
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
