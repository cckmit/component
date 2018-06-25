package com.x.centra.dst.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

import com.x.base.exception.SystemException;

public class DstDiscountRemindCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public DstDiscountRemindCriteria() {
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
        if (oredCriteria.isEmpty()) {
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
            return !criteria.isEmpty();
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new SystemException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new SystemException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new SystemException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("TENANT_ID =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("TENANT_ID <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("TENANT_ID >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("TENANT_ID >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("TENANT_ID <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("TENANT_ID <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("TENANT_ID like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("TENANT_ID not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("TENANT_ID in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("TENANT_ID not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("TENANT_ID between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("TENANT_ID not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeIsNull() {
            addCriterion("DISCOUNT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeIsNotNull() {
            addCriterion("DISCOUNT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeEqualTo(String value) {
            addCriterion("DISCOUNT_CODE =", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotEqualTo(String value) {
            addCriterion("DISCOUNT_CODE <>", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeGreaterThan(String value) {
            addCriterion("DISCOUNT_CODE >", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_CODE >=", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeLessThan(String value) {
            addCriterion("DISCOUNT_CODE <", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeLessThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_CODE <=", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeLike(String value) {
            addCriterion("DISCOUNT_CODE like", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotLike(String value) {
            addCriterion("DISCOUNT_CODE not like", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeIn(List<String> values) {
            addCriterion("DISCOUNT_CODE in", values, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotIn(List<String> values) {
            addCriterion("DISCOUNT_CODE not in", values, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeBetween(String value1, String value2) {
            addCriterion("DISCOUNT_CODE between", value1, value2, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotBetween(String value1, String value2) {
            addCriterion("DISCOUNT_CODE not between", value1, value2, "discountCode");
            return (Criteria) this;
        }

        public Criteria andRemindTimeIsNull() {
            addCriterion("REMIND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRemindTimeIsNotNull() {
            addCriterion("REMIND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRemindTimeEqualTo(String value) {
            addCriterion("REMIND_TIME =", value, "remindTime");
            return (Criteria) this;
        }

        public Criteria andRemindTimeNotEqualTo(String value) {
            addCriterion("REMIND_TIME <>", value, "remindTime");
            return (Criteria) this;
        }

        public Criteria andRemindTimeGreaterThan(String value) {
            addCriterion("REMIND_TIME >", value, "remindTime");
            return (Criteria) this;
        }

        public Criteria andRemindTimeGreaterThanOrEqualTo(String value) {
            addCriterion("REMIND_TIME >=", value, "remindTime");
            return (Criteria) this;
        }

        public Criteria andRemindTimeLessThan(String value) {
            addCriterion("REMIND_TIME <", value, "remindTime");
            return (Criteria) this;
        }

        public Criteria andRemindTimeLessThanOrEqualTo(String value) {
            addCriterion("REMIND_TIME <=", value, "remindTime");
            return (Criteria) this;
        }

        public Criteria andRemindTimeLike(String value) {
            addCriterion("REMIND_TIME like", value, "remindTime");
            return (Criteria) this;
        }

        public Criteria andRemindTimeNotLike(String value) {
            addCriterion("REMIND_TIME not like", value, "remindTime");
            return (Criteria) this;
        }

        public Criteria andRemindTimeIn(List<String> values) {
            addCriterion("REMIND_TIME in", values, "remindTime");
            return (Criteria) this;
        }

        public Criteria andRemindTimeNotIn(List<String> values) {
            addCriterion("REMIND_TIME not in", values, "remindTime");
            return (Criteria) this;
        }

        public Criteria andRemindTimeBetween(String value1, String value2) {
            addCriterion("REMIND_TIME between", value1, value2, "remindTime");
            return (Criteria) this;
        }

        public Criteria andRemindTimeNotBetween(String value1, String value2) {
            addCriterion("REMIND_TIME not between", value1, value2, "remindTime");
            return (Criteria) this;
        }

        public Criteria andRemindTimeUnitIsNull() {
            addCriterion("REMIND_TIME_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andRemindTimeUnitIsNotNull() {
            addCriterion("REMIND_TIME_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andRemindTimeUnitEqualTo(String value) {
            addCriterion("REMIND_TIME_UNIT =", value, "remindTimeUnit");
            return (Criteria) this;
        }

        public Criteria andRemindTimeUnitNotEqualTo(String value) {
            addCriterion("REMIND_TIME_UNIT <>", value, "remindTimeUnit");
            return (Criteria) this;
        }

        public Criteria andRemindTimeUnitGreaterThan(String value) {
            addCriterion("REMIND_TIME_UNIT >", value, "remindTimeUnit");
            return (Criteria) this;
        }

        public Criteria andRemindTimeUnitGreaterThanOrEqualTo(String value) {
            addCriterion("REMIND_TIME_UNIT >=", value, "remindTimeUnit");
            return (Criteria) this;
        }

        public Criteria andRemindTimeUnitLessThan(String value) {
            addCriterion("REMIND_TIME_UNIT <", value, "remindTimeUnit");
            return (Criteria) this;
        }

        public Criteria andRemindTimeUnitLessThanOrEqualTo(String value) {
            addCriterion("REMIND_TIME_UNIT <=", value, "remindTimeUnit");
            return (Criteria) this;
        }

        public Criteria andRemindTimeUnitLike(String value) {
            addCriterion("REMIND_TIME_UNIT like", value, "remindTimeUnit");
            return (Criteria) this;
        }

        public Criteria andRemindTimeUnitNotLike(String value) {
            addCriterion("REMIND_TIME_UNIT not like", value, "remindTimeUnit");
            return (Criteria) this;
        }

        public Criteria andRemindTimeUnitIn(List<String> values) {
            addCriterion("REMIND_TIME_UNIT in", values, "remindTimeUnit");
            return (Criteria) this;
        }

        public Criteria andRemindTimeUnitNotIn(List<String> values) {
            addCriterion("REMIND_TIME_UNIT not in", values, "remindTimeUnit");
            return (Criteria) this;
        }

        public Criteria andRemindTimeUnitBetween(String value1, String value2) {
            addCriterion("REMIND_TIME_UNIT between", value1, value2, "remindTimeUnit");
            return (Criteria) this;
        }

        public Criteria andRemindTimeUnitNotBetween(String value1, String value2) {
            addCriterion("REMIND_TIME_UNIT not between", value1, value2, "remindTimeUnit");
            return (Criteria) this;
        }

        public Criteria andRemindInfoIsNull() {
            addCriterion("REMIND_INFO is null");
            return (Criteria) this;
        }

        public Criteria andRemindInfoIsNotNull() {
            addCriterion("REMIND_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andRemindInfoEqualTo(String value) {
            addCriterion("REMIND_INFO =", value, "remindInfo");
            return (Criteria) this;
        }

        public Criteria andRemindInfoNotEqualTo(String value) {
            addCriterion("REMIND_INFO <>", value, "remindInfo");
            return (Criteria) this;
        }

        public Criteria andRemindInfoGreaterThan(String value) {
            addCriterion("REMIND_INFO >", value, "remindInfo");
            return (Criteria) this;
        }

        public Criteria andRemindInfoGreaterThanOrEqualTo(String value) {
            addCriterion("REMIND_INFO >=", value, "remindInfo");
            return (Criteria) this;
        }

        public Criteria andRemindInfoLessThan(String value) {
            addCriterion("REMIND_INFO <", value, "remindInfo");
            return (Criteria) this;
        }

        public Criteria andRemindInfoLessThanOrEqualTo(String value) {
            addCriterion("REMIND_INFO <=", value, "remindInfo");
            return (Criteria) this;
        }

        public Criteria andRemindInfoLike(String value) {
            addCriterion("REMIND_INFO like", value, "remindInfo");
            return (Criteria) this;
        }

        public Criteria andRemindInfoNotLike(String value) {
            addCriterion("REMIND_INFO not like", value, "remindInfo");
            return (Criteria) this;
        }

        public Criteria andRemindInfoIn(List<String> values) {
            addCriterion("REMIND_INFO in", values, "remindInfo");
            return (Criteria) this;
        }

        public Criteria andRemindInfoNotIn(List<String> values) {
            addCriterion("REMIND_INFO not in", values, "remindInfo");
            return (Criteria) this;
        }

        public Criteria andRemindInfoBetween(String value1, String value2) {
            addCriterion("REMIND_INFO between", value1, value2, "remindInfo");
            return (Criteria) this;
        }

        public Criteria andRemindInfoNotBetween(String value1, String value2) {
            addCriterion("REMIND_INFO not between", value1, value2, "remindInfo");
            return (Criteria) this;
        }

        public Criteria andRemindStateIsNull() {
            addCriterion("REMIND_STATE is null");
            return (Criteria) this;
        }

        public Criteria andRemindStateIsNotNull() {
            addCriterion("REMIND_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andRemindStateEqualTo(String value) {
            addCriterion("REMIND_STATE =", value, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateNotEqualTo(String value) {
            addCriterion("REMIND_STATE <>", value, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateGreaterThan(String value) {
            addCriterion("REMIND_STATE >", value, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateGreaterThanOrEqualTo(String value) {
            addCriterion("REMIND_STATE >=", value, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateLessThan(String value) {
            addCriterion("REMIND_STATE <", value, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateLessThanOrEqualTo(String value) {
            addCriterion("REMIND_STATE <=", value, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateLike(String value) {
            addCriterion("REMIND_STATE like", value, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateNotLike(String value) {
            addCriterion("REMIND_STATE not like", value, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateIn(List<String> values) {
            addCriterion("REMIND_STATE in", values, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateNotIn(List<String> values) {
            addCriterion("REMIND_STATE not in", values, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateBetween(String value1, String value2) {
            addCriterion("REMIND_STATE between", value1, value2, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateNotBetween(String value1, String value2) {
            addCriterion("REMIND_STATE not between", value1, value2, "remindState");
            return (Criteria) this;
        }

        public Criteria andSortIndexIsNull() {
            addCriterion("SORT_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andSortIndexIsNotNull() {
            addCriterion("SORT_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andSortIndexEqualTo(String value) {
            addCriterion("SORT_INDEX =", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexNotEqualTo(String value) {
            addCriterion("SORT_INDEX <>", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexGreaterThan(String value) {
            addCriterion("SORT_INDEX >", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexGreaterThanOrEqualTo(String value) {
            addCriterion("SORT_INDEX >=", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexLessThan(String value) {
            addCriterion("SORT_INDEX <", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexLessThanOrEqualTo(String value) {
            addCriterion("SORT_INDEX <=", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexLike(String value) {
            addCriterion("SORT_INDEX like", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexNotLike(String value) {
            addCriterion("SORT_INDEX not like", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexIn(List<String> values) {
            addCriterion("SORT_INDEX in", values, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexNotIn(List<String> values) {
            addCriterion("SORT_INDEX not in", values, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexBetween(String value1, String value2) {
            addCriterion("SORT_INDEX between", value1, value2, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexNotBetween(String value1, String value2) {
            addCriterion("SORT_INDEX not between", value1, value2, "sortIndex");
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