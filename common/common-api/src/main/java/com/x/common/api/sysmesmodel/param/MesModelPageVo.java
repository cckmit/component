package com.x.common.api.sysmesmodel.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class MesModelPageVo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String modelId;

    private String modelName;

    private String creatPeople;

    private Timestamp creatTime;

    private String modelConten;

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId == null ? null : modelId.trim();
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    public String getCreatPeople() {
        return creatPeople;
    }

    public void setCreatPeople(String creatPeople) {
        this.creatPeople = creatPeople == null ? null : creatPeople.trim();
    }

    public Timestamp getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Timestamp creatTime) {
        this.creatTime = creatTime;
    }

    public String getModelConten() {
        return modelConten;
    }

    public void setModelConten(String modelConten) {
        this.modelConten = modelConten == null ? null : modelConten.trim();
    }
}
