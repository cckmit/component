package com.x.common.api.sysconfig.param;

import com.x.base.vo.BaseResponse;

/**
 * @Description: 赠送积分配置
 * @author auth
 * @date 2016年11月1日 下午4:30:49 
 * @version V1.0
 */
public class DonateIntegralConfig extends BaseResponse {
	
	private static final long serialVersionUID = 6536880943622318299L;

	/**
	 * 连续登陆1天
	 */
	private String oneday;

	/**
	 * 连续登陆2天
	 */
    private String twoday;

    /**
	 * 连续登陆3天
	 */
    private String threeday;

    /**
	 * 连续登陆4天
	 */
    private String fourday;

    /**
	 * 连续登陆5天
	 */
    private String fiveday;

    /**
	 * 连续登陆6天
	 */
    private String sixday;

    /**
	 * 连续登陆7天
	 */
    private String sevenday;

    /**
	 * 连续登陆8天
	 */
    private String eightday;
    /**
	 * 登录送积分状态
	 */
    private String lstate;

    /**
	 * 注册活动
	 */
    private String regOnoff;

    /**
     * 注册送积分
     */
    private String regIntegration;

    /**
     * 注册送成长值
     */
    private String regGrowth;

    /**
     * 邀请注册送积分
     */
    private String inviteIntegrati;
    /**
     * 注册送积分状态
     */
    private String rstate;

    /**
     * 注册送成长值
     */
    private String gstate;

    /**
     * 邀请注册送积分
     */
    private String istate;

	public String getOneday() {
		return oneday;
	}

	public void setOneday(String oneday) {
		this.oneday = oneday;
	}

	public String getTwoday() {
		return twoday;
	}

	public void setTwoday(String twoday) {
		this.twoday = twoday;
	}

	public String getThreeday() {
		return threeday;
	}

	public void setThreeday(String threeday) {
		this.threeday = threeday;
	}

	public String getFourday() {
		return fourday;
	}

	public void setFourday(String fourday) {
		this.fourday = fourday;
	}

	public String getFiveday() {
		return fiveday;
	}

	public void setFiveday(String fiveday) {
		this.fiveday = fiveday;
	}

	public String getSixday() {
		return sixday;
	}

	public void setSixday(String sixday) {
		this.sixday = sixday;
	}

	public String getSevenday() {
		return sevenday;
	}

	public void setSevenday(String sevenday) {
		this.sevenday = sevenday;
	}

	public String getEightday() {
		return eightday;
	}

	public void setEightday(String eightday) {
		this.eightday = eightday;
	}

	public String getRegOnoff() {
		return regOnoff;
	}

	public void setRegOnoff(String regOnoff) {
		this.regOnoff = regOnoff;
	}

	public String getRegIntegration() {
		return regIntegration;
	}

	public void setRegIntegration(String regIntegration) {
		this.regIntegration = regIntegration;
	}

	public String getRegGrowth() {
		return regGrowth;
	}

	public void setRegGrowth(String regGrowth) {
		this.regGrowth = regGrowth;
	}

	public String getInviteIntegrati() {
		return inviteIntegrati;
	}

	public void setInviteIntegrati(String inviteIntegrati) {
		this.inviteIntegrati = inviteIntegrati;
	}

	public String getLstate() {
		return lstate;
	}

	public void setLstate(String lstate) {
		this.lstate = lstate;
	}

	public String getRstate() {
		return rstate;
	}

	public void setRstate(String rstate) {
		this.rstate = rstate;
	}

	public String getGstate() {
		return gstate;
	}

	public void setGstate(String gstate) {
		this.gstate = gstate;
	}

	public String getIstate() {
		return istate;
	}

	public void setIstate(String istate) {
		this.istate = istate;
	}
}
