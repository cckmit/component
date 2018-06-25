package com.x.base.vo;

/**
 * 通用返回类型
 * 
 * @author mayt
 *
 * @param <T>
 */
@Deprecated
public class GeneralResponse<T> extends BaseResponse {

	private static final long serialVersionUID = 1L;

	private T body;

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}
}
