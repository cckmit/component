package com.x.centra.dst.api.discount.param;

import com.x.base.vo.BaseInfo;

/**
 * 权益激活vo
 * @author wangluyang
 *
 */
public class DiscountActiveVo extends BaseInfo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 客户id（必填）
	 */
	private String custId;
	
	/**
	 * instanceId(必填)
	 */
	private String instanceId;
	
	/**
	 * 权益激活日期(必填)
	 */
	private Long activeDate;
	
	/**
	 * 权益开始生效日期(必填)
	 */
	private Long effectiveDate;
	
	/**
	 * 车辆id(必填)
	 */
	private String carId;
	
	/**
	 * 车牌号(必填)
	 */
	private String carNum;
	
//	/**
//     * 状态 0:未激活， 1:激活（必填）
//     */
//    private String status;

    /**
     * 备注
     */
    private String remark;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public Long getEffectiveDate() {
		return effectiveDate;
	}

	public Long getActiveDate() {
		return activeDate;
	}

	public void setActiveDate(Long activeDate) {
		this.activeDate = activeDate;
	}

	public void setEffectiveDate(Long effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(String status) {
//		this.status = status;
//	}
	
	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
