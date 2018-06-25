package com.x.common.api.country.param;

import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * 国家信息变更请求信息<br>
 * Date: 2017年6月3日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 *
 * @author auth
 */
public class CountryUpdateRequest implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1l;
    /**
     * ID(添加时为空 修改时不为空)
     */
    private Integer cid;
    /**
     * 国家域名缩写
     */
    @NotBlank(message = "国家域名缩写不能为空")
    private String domain;
    /**
     * 国家地域中文名称
     */
    @NotBlank(message = "国家地域中文名称")
    private String country_cn;
    /**
     * 国家地域英文名称
     */
    private String country_en;
    /**
     * 国家区号
     */
    private String code;
    /**
     * 规则
     */
    private String regular;
    /**
     * 排序
     */
    private Integer sortid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getCountry_cn() {
        return country_cn;
    }

    public void setCountry_cn(String country_cn) {
        this.country_cn = country_cn;
    }

    public String getCountry_en() {
        return country_en;
    }

    public void setCountry_en(String country_en) {
        this.country_en = country_en;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }

    public Integer getSortid() {
        return sortid;
    }

    public void setSortid(Integer sortid) {
        this.sortid = sortid;
    }
}
