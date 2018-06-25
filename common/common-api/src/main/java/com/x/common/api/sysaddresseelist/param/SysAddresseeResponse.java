package com.x.common.api.sysaddresseelist.param;

import java.io.Serializable;
import java.sql.Timestamp;
/**
 * 根据列表ID查询管理列表
 */
public class SysAddresseeResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    private String id;
    /**
     * 列表ID
     */
    private String listId;
    /**
     * 手机号
     */
    private String phoneNum;
    /**
     * code
     */
    private String code;
    /**
     * 创建人
     */
    private Timestamp creatTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId == null ? null : listId.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Timestamp getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Timestamp creatTime) {
        this.creatTime = creatTime;
    }
}