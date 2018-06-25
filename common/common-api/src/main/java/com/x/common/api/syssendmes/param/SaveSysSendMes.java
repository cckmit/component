package com.x.common.api.syssendmes.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class SaveSysSendMes implements Serializable {
	private static final long serialVersionUID = 1L;
	private String mesId;

    private String mesName;

    private String modelName;

    private String listName;

    private String creatPeople;

    private Timestamp creatTime;

    private String modelConten;

    public String getMesId() {
        return mesId;
    }

    public void setMesId(String mesId) {
        this.mesId = mesId == null ? null : mesId.trim();
    }

    public String getMesName() {
        return mesName;
    }

    public void setMesName(String mesName) {
        this.mesName = mesName == null ? null : mesName.trim();
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName == null ? null : listName.trim();
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
