package com.x.common.api.sysconfig.param;

import com.x.base.vo.BaseResponse;

/**
 * @Description: 会员配置
 * @author auth
 * @date 2016年11月1日 下午4:13:41 
 * @version V1.0
 */
public class MemberConfig extends BaseResponse {
	
	private static final long serialVersionUID = -7909193094634505463L;

	private String configId;
	/**
	 * 普通会员
	 */
	private String ordinaryMember;

	  /**
	 * 黄金会员
	 */
	private String goldMember;

	  /**
	 * 白金会员
	 */
	private String platinumMember;

	  /**
	 * 钻石会员
	 */
	private String masonryMember;

	public String getConfigId() {
		return configId;
	}

	public void setConfigId(String configId) {
		this.configId = configId;
	}

	public String getOrdinaryMember() {
		return ordinaryMember;
	}

	public void setOrdinaryMember(String ordinaryMember) {
		this.ordinaryMember = ordinaryMember;
	}

	public String getGoldMember() {
		return goldMember;
	}

	public void setGoldMember(String goldMember) {
		this.goldMember = goldMember;
	}

	public String getPlatinumMember() {
		return platinumMember;
	}

	public void setPlatinumMember(String platinumMember) {
		this.platinumMember = platinumMember;
	}

	public String getMasonryMember() {
		return masonryMember;
	}

	public void setMasonryMember(String masonryMember) {
		this.masonryMember = masonryMember;
	}


}
