package com.x.common.dao.mapper.bo;

public class ParkFeeRule {
    private Integer id;

    private Integer feeStandardId;

    private String feeStandardDesc;

    private String carTypeDesc;

    private String feeStandardLevelDesc;

    private String feeStandardLevelType;

    private String standardStatues;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFeeStandardId() {
        return feeStandardId;
    }

    public void setFeeStandardId(Integer feeStandardId) {
        this.feeStandardId = feeStandardId;
    }

    public String getFeeStandardDesc() {
        return feeStandardDesc;
    }

    public void setFeeStandardDesc(String feeStandardDesc) {
        this.feeStandardDesc = feeStandardDesc == null ? null : feeStandardDesc.trim();
    }

    public String getCarTypeDesc() {
        return carTypeDesc;
    }

    public void setCarTypeDesc(String carTypeDesc) {
        this.carTypeDesc = carTypeDesc == null ? null : carTypeDesc.trim();
    }

    public String getFeeStandardLevelDesc() {
        return feeStandardLevelDesc;
    }

    public void setFeeStandardLevelDesc(String feeStandardLevelDesc) {
        this.feeStandardLevelDesc = feeStandardLevelDesc == null ? null : feeStandardLevelDesc.trim();
    }

    public String getFeeStandardLevelType() {
        return feeStandardLevelType;
    }

    public void setFeeStandardLevelType(String feeStandardLevelType) {
        this.feeStandardLevelType = feeStandardLevelType == null ? null : feeStandardLevelType.trim();
    }

    public String getStandardStatues() {
        return standardStatues;
    }

    public void setStandardStatues(String standardStatues) {
        this.standardStatues = standardStatues == null ? null : standardStatues.trim();
    }
}