package com.x.common.api.sysconfig.param;

import com.x.base.vo.BaseResponse;

/**
 * @Description: 平台佣金比例配置
 * @author auth
 * @date 2016年11月1日 下午4:20:46 
 * @version V1.0
 */
public class CommissionConfig extends BaseResponse {

	private static final long serialVersionUID = -7175526791472021939L;
	
	/**
	 * 封顶值
	 */
	private String capValue;

    /**
     * v1译员
     */
    private String v1Points;
    /**
     * v2译员
     */
    private String v2Points;
    /**
     * v3译员
     */
    private String v3Points;
    /**
     * lsp团队
     */
    private String lspPoints;
	public String getCapValue() {
		return capValue;
	}
	public void setCapValue(String capValue) {
		this.capValue = capValue;
	}
	public String getV1Points() {
		return v1Points;
	}
	public void setV1Points(String v1Points) {
		this.v1Points = v1Points;
	}
	public String getV2Points() {
		return v2Points;
	}
	public void setV2Points(String v2Points) {
		this.v2Points = v2Points;
	}
	public String getV3Points() {
		return v3Points;
	}
	public void setV3Points(String v3Points) {
		this.v3Points = v3Points;
	}
	public String getLspPoints() {
		return lspPoints;
	}
	public void setLspPoints(String lspPoints) {
		this.lspPoints = lspPoints;
	}
    
    

}
