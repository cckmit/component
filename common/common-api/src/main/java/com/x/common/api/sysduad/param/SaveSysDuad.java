package com.x.common.api.sysduad.param;

import java.io.Serializable;

public class SaveSysDuad implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 编号
	 */
	private String duadId;
	/**
	 * 语言
	 */
    private String language;
    /**
	 * 站点：译云、译见
	 */
    private String site;
    /**
	 * 订单类型，文档翻译：1；口译：2；快速翻译：0；
	 */
    private String orderType;
    /**
	 * 源语言编码
	 */
    private String sourceCode;
    /**
	 * 源语言(中文)
	 */
    private String sourceCn;
    /**
	 * 源语言(英文)
	 */
    private String sourceEn;
    /**
	 * 目标语言编码
	 */
    private String targetCode;
    /**
	 * 目标语言(中文)
	 */
    private String targetCn;
    /**
	 * 目标语言(英文)
	 */
    private String targetEn;
    /**
	 * 普通翻译价格
	 */
    private String ordinary;
    /**
	 * 普通加急翻译价格
	 */
    private String ordinaryUrgent;
    /**
	 * 专业翻译价格
	 */
    private String professional;
    /**
	 * 专业加急翻译价格
	 */
    private String professionalUrgent;
    /**
	 * 出版翻译价格
	 */
    private String publish;
    /**
	 *出版加急翻译价格 
	 */
    private String publishUrgent;
    /**
	 * 普通翻译价格美元
	 */
    private String ordinaryDollar;
    /**
	 * 普通加急翻译价格美元
	 */
    private String ourgentDollar;
    /**
	 * 专业翻译价格美元
	 */
    private String professionalDollar;
    /**
	 * 专业加急翻译价格美元
	 */
    private String purgentDollar;
    /**
	 * 出版翻译价格美元
	 */
    private String publishDollar;
    /**
	 * 出版加急翻译价格美元
	 */
    private String puburgentDollar;
    /**
	 * 排序
	 */
    private String sort;
    /**
	 * 状态
	 */
    private String state;
    /**
	 * 修改时间
	 */
    private Long updatetime;
   /**
    * 创建人
    */
    private String createOperator;
    /**
	 * 创建人ID
	 */
	private String createOperatorId;
    public String getDuadId() {
        return duadId;
    }

    public void setDuadId(String duadId) {
        this.duadId = duadId == null ? null : duadId.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode == null ? null : sourceCode.trim();
    }

    public String getSourceCn() {
        return sourceCn;
    }

    public void setSourceCn(String sourceCn) {
        this.sourceCn = sourceCn == null ? null : sourceCn.trim();
    }

    public String getSourceEn() {
        return sourceEn;
    }

    public void setSourceEn(String sourceEn) {
        this.sourceEn = sourceEn == null ? null : sourceEn.trim();
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode == null ? null : targetCode.trim();
    }

    public String getTargetCn() {
        return targetCn;
    }

    public void setTargetCn(String targetCn) {
        this.targetCn = targetCn == null ? null : targetCn.trim();
    }

    public String getTargetEn() {
        return targetEn;
    }

    public void setTargetEn(String targetEn) {
        this.targetEn = targetEn == null ? null : targetEn.trim();
    }

    public String getOrdinary() {
        return ordinary;
    }

    public void setOrdinary(String ordinary) {
        this.ordinary = ordinary == null ? null : ordinary.trim();
    }

    public String getOrdinaryUrgent() {
        return ordinaryUrgent;
    }

    public void setOrdinaryUrgent(String ordinaryUrgent) {
        this.ordinaryUrgent = ordinaryUrgent == null ? null : ordinaryUrgent.trim();
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional == null ? null : professional.trim();
    }

    public String getProfessionalUrgent() {
        return professionalUrgent;
    }

    public void setProfessionalUrgent(String professionalUrgent) {
        this.professionalUrgent = professionalUrgent == null ? null : professionalUrgent.trim();
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish == null ? null : publish.trim();
    }

    public String getPublishUrgent() {
        return publishUrgent;
    }

    public void setPublishUrgent(String publishUrgent) {
        this.publishUrgent = publishUrgent == null ? null : publishUrgent.trim();
    }

    public String getOrdinaryDollar() {
        return ordinaryDollar;
    }

    public void setOrdinaryDollar(String ordinaryDollar) {
        this.ordinaryDollar = ordinaryDollar == null ? null : ordinaryDollar.trim();
    }

    public String getOurgentDollar() {
        return ourgentDollar;
    }

    public void setOurgentDollar(String ourgentDollar) {
        this.ourgentDollar = ourgentDollar == null ? null : ourgentDollar.trim();
    }

    public String getProfessionalDollar() {
        return professionalDollar;
    }

    public void setProfessionalDollar(String professionalDollar) {
        this.professionalDollar = professionalDollar == null ? null : professionalDollar.trim();
    }

    public String getPurgentDollar() {
        return purgentDollar;
    }

    public void setPurgentDollar(String purgentDollar) {
        this.purgentDollar = purgentDollar == null ? null : purgentDollar.trim();
    }

    public String getPublishDollar() {
        return publishDollar;
    }

    public void setPublishDollar(String publishDollar) {
        this.publishDollar = publishDollar == null ? null : publishDollar.trim();
    }

    public String getPuburgentDollar() {
        return puburgentDollar;
    }

    public void setPuburgentDollar(String puburgentDollar) {
        this.puburgentDollar = puburgentDollar == null ? null : puburgentDollar.trim();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Long getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Long updatetime) {
        this.updatetime = updatetime;
    }

	public String getCreateOperator() {
		return createOperator;
	}

	public void setCreateOperator(String createOperator) {
		this.createOperator = createOperator;
	}

	public String getCreateOperatorId() {
		return createOperatorId;
	}

	public void setCreateOperatorId(String createOperatorId) {
		this.createOperatorId = createOperatorId;
	}
}
