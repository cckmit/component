package com.x.common.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class GnRegionCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public GnRegionCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRegionCodeIsNull() {
            addCriterion("region_code is null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNotNull() {
            addCriterion("region_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeEqualTo(String value) {
            addCriterion("region_code =", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotEqualTo(String value) {
            addCriterion("region_code <>", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThan(String value) {
            addCriterion("region_code >", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("region_code >=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThan(String value) {
            addCriterion("region_code <", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("region_code <=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLike(String value) {
            addCriterion("region_code like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotLike(String value) {
            addCriterion("region_code not like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIn(List<String> values) {
            addCriterion("region_code in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotIn(List<String> values) {
            addCriterion("region_code not in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeBetween(String value1, String value2) {
            addCriterion("region_code between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotBetween(String value1, String value2) {
            addCriterion("region_code not between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionNameEnIsNull() {
            addCriterion("region_name_en is null");
            return (Criteria) this;
        }

        public Criteria andRegionNameEnIsNotNull() {
            addCriterion("region_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andRegionNameEnEqualTo(String value) {
            addCriterion("region_name_en =", value, "regionNameEn");
            return (Criteria) this;
        }

        public Criteria andRegionNameEnNotEqualTo(String value) {
            addCriterion("region_name_en <>", value, "regionNameEn");
            return (Criteria) this;
        }

        public Criteria andRegionNameEnGreaterThan(String value) {
            addCriterion("region_name_en >", value, "regionNameEn");
            return (Criteria) this;
        }

        public Criteria andRegionNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("region_name_en >=", value, "regionNameEn");
            return (Criteria) this;
        }

        public Criteria andRegionNameEnLessThan(String value) {
            addCriterion("region_name_en <", value, "regionNameEn");
            return (Criteria) this;
        }

        public Criteria andRegionNameEnLessThanOrEqualTo(String value) {
            addCriterion("region_name_en <=", value, "regionNameEn");
            return (Criteria) this;
        }

        public Criteria andRegionNameEnLike(String value) {
            addCriterion("region_name_en like", value, "regionNameEn");
            return (Criteria) this;
        }

        public Criteria andRegionNameEnNotLike(String value) {
            addCriterion("region_name_en not like", value, "regionNameEn");
            return (Criteria) this;
        }

        public Criteria andRegionNameEnIn(List<String> values) {
            addCriterion("region_name_en in", values, "regionNameEn");
            return (Criteria) this;
        }

        public Criteria andRegionNameEnNotIn(List<String> values) {
            addCriterion("region_name_en not in", values, "regionNameEn");
            return (Criteria) this;
        }

        public Criteria andRegionNameEnBetween(String value1, String value2) {
            addCriterion("region_name_en between", value1, value2, "regionNameEn");
            return (Criteria) this;
        }

        public Criteria andRegionNameEnNotBetween(String value1, String value2) {
            addCriterion("region_name_en not between", value1, value2, "regionNameEn");
            return (Criteria) this;
        }

        public Criteria andRegionNameCnIsNull() {
            addCriterion("region_name_cn is null");
            return (Criteria) this;
        }

        public Criteria andRegionNameCnIsNotNull() {
            addCriterion("region_name_cn is not null");
            return (Criteria) this;
        }

        public Criteria andRegionNameCnEqualTo(String value) {
            addCriterion("region_name_cn =", value, "regionNameCn");
            return (Criteria) this;
        }

        public Criteria andRegionNameCnNotEqualTo(String value) {
            addCriterion("region_name_cn <>", value, "regionNameCn");
            return (Criteria) this;
        }

        public Criteria andRegionNameCnGreaterThan(String value) {
            addCriterion("region_name_cn >", value, "regionNameCn");
            return (Criteria) this;
        }

        public Criteria andRegionNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("region_name_cn >=", value, "regionNameCn");
            return (Criteria) this;
        }

        public Criteria andRegionNameCnLessThan(String value) {
            addCriterion("region_name_cn <", value, "regionNameCn");
            return (Criteria) this;
        }

        public Criteria andRegionNameCnLessThanOrEqualTo(String value) {
            addCriterion("region_name_cn <=", value, "regionNameCn");
            return (Criteria) this;
        }

        public Criteria andRegionNameCnLike(String value) {
            addCriterion("region_name_cn like", value, "regionNameCn");
            return (Criteria) this;
        }

        public Criteria andRegionNameCnNotLike(String value) {
            addCriterion("region_name_cn not like", value, "regionNameCn");
            return (Criteria) this;
        }

        public Criteria andRegionNameCnIn(List<String> values) {
            addCriterion("region_name_cn in", values, "regionNameCn");
            return (Criteria) this;
        }

        public Criteria andRegionNameCnNotIn(List<String> values) {
            addCriterion("region_name_cn not in", values, "regionNameCn");
            return (Criteria) this;
        }

        public Criteria andRegionNameCnBetween(String value1, String value2) {
            addCriterion("region_name_cn between", value1, value2, "regionNameCn");
            return (Criteria) this;
        }

        public Criteria andRegionNameCnNotBetween(String value1, String value2) {
            addCriterion("region_name_cn not between", value1, value2, "regionNameCn");
            return (Criteria) this;
        }

        public Criteria andRegionLevelIsNull() {
            addCriterion("region_level is null");
            return (Criteria) this;
        }

        public Criteria andRegionLevelIsNotNull() {
            addCriterion("region_level is not null");
            return (Criteria) this;
        }

        public Criteria andRegionLevelEqualTo(Integer value) {
            addCriterion("region_level =", value, "regionLevel");
            return (Criteria) this;
        }

        public Criteria andRegionLevelNotEqualTo(Integer value) {
            addCriterion("region_level <>", value, "regionLevel");
            return (Criteria) this;
        }

        public Criteria andRegionLevelGreaterThan(Integer value) {
            addCriterion("region_level >", value, "regionLevel");
            return (Criteria) this;
        }

        public Criteria andRegionLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("region_level >=", value, "regionLevel");
            return (Criteria) this;
        }

        public Criteria andRegionLevelLessThan(Integer value) {
            addCriterion("region_level <", value, "regionLevel");
            return (Criteria) this;
        }

        public Criteria andRegionLevelLessThanOrEqualTo(Integer value) {
            addCriterion("region_level <=", value, "regionLevel");
            return (Criteria) this;
        }

        public Criteria andRegionLevelIn(List<Integer> values) {
            addCriterion("region_level in", values, "regionLevel");
            return (Criteria) this;
        }

        public Criteria andRegionLevelNotIn(List<Integer> values) {
            addCriterion("region_level not in", values, "regionLevel");
            return (Criteria) this;
        }

        public Criteria andRegionLevelBetween(Integer value1, Integer value2) {
            addCriterion("region_level between", value1, value2, "regionLevel");
            return (Criteria) this;
        }

        public Criteria andRegionLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("region_level not between", value1, value2, "regionLevel");
            return (Criteria) this;
        }

        public Criteria andParentRegionCodeIsNull() {
            addCriterion("parent_region_code is null");
            return (Criteria) this;
        }

        public Criteria andParentRegionCodeIsNotNull() {
            addCriterion("parent_region_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentRegionCodeEqualTo(String value) {
            addCriterion("parent_region_code =", value, "parentRegionCode");
            return (Criteria) this;
        }

        public Criteria andParentRegionCodeNotEqualTo(String value) {
            addCriterion("parent_region_code <>", value, "parentRegionCode");
            return (Criteria) this;
        }

        public Criteria andParentRegionCodeGreaterThan(String value) {
            addCriterion("parent_region_code >", value, "parentRegionCode");
            return (Criteria) this;
        }

        public Criteria andParentRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_region_code >=", value, "parentRegionCode");
            return (Criteria) this;
        }

        public Criteria andParentRegionCodeLessThan(String value) {
            addCriterion("parent_region_code <", value, "parentRegionCode");
            return (Criteria) this;
        }

        public Criteria andParentRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("parent_region_code <=", value, "parentRegionCode");
            return (Criteria) this;
        }

        public Criteria andParentRegionCodeLike(String value) {
            addCriterion("parent_region_code like", value, "parentRegionCode");
            return (Criteria) this;
        }

        public Criteria andParentRegionCodeNotLike(String value) {
            addCriterion("parent_region_code not like", value, "parentRegionCode");
            return (Criteria) this;
        }

        public Criteria andParentRegionCodeIn(List<String> values) {
            addCriterion("parent_region_code in", values, "parentRegionCode");
            return (Criteria) this;
        }

        public Criteria andParentRegionCodeNotIn(List<String> values) {
            addCriterion("parent_region_code not in", values, "parentRegionCode");
            return (Criteria) this;
        }

        public Criteria andParentRegionCodeBetween(String value1, String value2) {
            addCriterion("parent_region_code between", value1, value2, "parentRegionCode");
            return (Criteria) this;
        }

        public Criteria andParentRegionCodeNotBetween(String value1, String value2) {
            addCriterion("parent_region_code not between", value1, value2, "parentRegionCode");
            return (Criteria) this;
        }

        public Criteria andParentRegionEnIsNull() {
            addCriterion("parent_region_en is null");
            return (Criteria) this;
        }

        public Criteria andParentRegionEnIsNotNull() {
            addCriterion("parent_region_en is not null");
            return (Criteria) this;
        }

        public Criteria andParentRegionEnEqualTo(String value) {
            addCriterion("parent_region_en =", value, "parentRegionEn");
            return (Criteria) this;
        }

        public Criteria andParentRegionEnNotEqualTo(String value) {
            addCriterion("parent_region_en <>", value, "parentRegionEn");
            return (Criteria) this;
        }

        public Criteria andParentRegionEnGreaterThan(String value) {
            addCriterion("parent_region_en >", value, "parentRegionEn");
            return (Criteria) this;
        }

        public Criteria andParentRegionEnGreaterThanOrEqualTo(String value) {
            addCriterion("parent_region_en >=", value, "parentRegionEn");
            return (Criteria) this;
        }

        public Criteria andParentRegionEnLessThan(String value) {
            addCriterion("parent_region_en <", value, "parentRegionEn");
            return (Criteria) this;
        }

        public Criteria andParentRegionEnLessThanOrEqualTo(String value) {
            addCriterion("parent_region_en <=", value, "parentRegionEn");
            return (Criteria) this;
        }

        public Criteria andParentRegionEnLike(String value) {
            addCriterion("parent_region_en like", value, "parentRegionEn");
            return (Criteria) this;
        }

        public Criteria andParentRegionEnNotLike(String value) {
            addCriterion("parent_region_en not like", value, "parentRegionEn");
            return (Criteria) this;
        }

        public Criteria andParentRegionEnIn(List<String> values) {
            addCriterion("parent_region_en in", values, "parentRegionEn");
            return (Criteria) this;
        }

        public Criteria andParentRegionEnNotIn(List<String> values) {
            addCriterion("parent_region_en not in", values, "parentRegionEn");
            return (Criteria) this;
        }

        public Criteria andParentRegionEnBetween(String value1, String value2) {
            addCriterion("parent_region_en between", value1, value2, "parentRegionEn");
            return (Criteria) this;
        }

        public Criteria andParentRegionEnNotBetween(String value1, String value2) {
            addCriterion("parent_region_en not between", value1, value2, "parentRegionEn");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}