package com.x.centra.dst.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

import com.x.base.exception.SystemException;

public class DstDiscountClassCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public DstDiscountClassCriteria() {
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

        public Criteria andClassIdIsNull() {
            addCriterion("CLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("CLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(String value) {
            addCriterion("CLASS_ID =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(String value) {
            addCriterion("CLASS_ID <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(String value) {
            addCriterion("CLASS_ID >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_ID >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(String value) {
            addCriterion("CLASS_ID <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(String value) {
            addCriterion("CLASS_ID <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLike(String value) {
            addCriterion("CLASS_ID like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotLike(String value) {
            addCriterion("CLASS_ID not like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<String> values) {
            addCriterion("CLASS_ID in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<String> values) {
            addCriterion("CLASS_ID not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(String value1, String value2) {
            addCriterion("CLASS_ID between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(String value1, String value2) {
            addCriterion("CLASS_ID not between", value1, value2, "classId");
            return (Criteria) this;
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

        public Criteria andClassNameIsNull() {
            addCriterion("CLASS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("CLASS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("CLASS_NAME =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("CLASS_NAME <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("CLASS_NAME >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_NAME >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("CLASS_NAME <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("CLASS_NAME <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("CLASS_NAME like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("CLASS_NAME not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("CLASS_NAME in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("CLASS_NAME not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("CLASS_NAME between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("CLASS_NAME not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassCodeIsNull() {
            addCriterion("CLASS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andClassCodeIsNotNull() {
            addCriterion("CLASS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andClassCodeEqualTo(String value) {
            addCriterion("CLASS_CODE =", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeNotEqualTo(String value) {
            addCriterion("CLASS_CODE <>", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeGreaterThan(String value) {
            addCriterion("CLASS_CODE >", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_CODE >=", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeLessThan(String value) {
            addCriterion("CLASS_CODE <", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeLessThanOrEqualTo(String value) {
            addCriterion("CLASS_CODE <=", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeLike(String value) {
            addCriterion("CLASS_CODE like", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeNotLike(String value) {
            addCriterion("CLASS_CODE not like", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeIn(List<String> values) {
            addCriterion("CLASS_CODE in", values, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeNotIn(List<String> values) {
            addCriterion("CLASS_CODE not in", values, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeBetween(String value1, String value2) {
            addCriterion("CLASS_CODE between", value1, value2, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeNotBetween(String value1, String value2) {
            addCriterion("CLASS_CODE not between", value1, value2, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassInstructionsIsNull() {
            addCriterion("CLASS_INSTRUCTIONS is null");
            return (Criteria) this;
        }

        public Criteria andClassInstructionsIsNotNull() {
            addCriterion("CLASS_INSTRUCTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andClassInstructionsEqualTo(String value) {
            addCriterion("CLASS_INSTRUCTIONS =", value, "classInstructions");
            return (Criteria) this;
        }

        public Criteria andClassInstructionsNotEqualTo(String value) {
            addCriterion("CLASS_INSTRUCTIONS <>", value, "classInstructions");
            return (Criteria) this;
        }

        public Criteria andClassInstructionsGreaterThan(String value) {
            addCriterion("CLASS_INSTRUCTIONS >", value, "classInstructions");
            return (Criteria) this;
        }

        public Criteria andClassInstructionsGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_INSTRUCTIONS >=", value, "classInstructions");
            return (Criteria) this;
        }

        public Criteria andClassInstructionsLessThan(String value) {
            addCriterion("CLASS_INSTRUCTIONS <", value, "classInstructions");
            return (Criteria) this;
        }

        public Criteria andClassInstructionsLessThanOrEqualTo(String value) {
            addCriterion("CLASS_INSTRUCTIONS <=", value, "classInstructions");
            return (Criteria) this;
        }

        public Criteria andClassInstructionsLike(String value) {
            addCriterion("CLASS_INSTRUCTIONS like", value, "classInstructions");
            return (Criteria) this;
        }

        public Criteria andClassInstructionsNotLike(String value) {
            addCriterion("CLASS_INSTRUCTIONS not like", value, "classInstructions");
            return (Criteria) this;
        }

        public Criteria andClassInstructionsIn(List<String> values) {
            addCriterion("CLASS_INSTRUCTIONS in", values, "classInstructions");
            return (Criteria) this;
        }

        public Criteria andClassInstructionsNotIn(List<String> values) {
            addCriterion("CLASS_INSTRUCTIONS not in", values, "classInstructions");
            return (Criteria) this;
        }

        public Criteria andClassInstructionsBetween(String value1, String value2) {
            addCriterion("CLASS_INSTRUCTIONS between", value1, value2, "classInstructions");
            return (Criteria) this;
        }

        public Criteria andClassInstructionsNotBetween(String value1, String value2) {
            addCriterion("CLASS_INSTRUCTIONS not between", value1, value2, "classInstructions");
            return (Criteria) this;
        }

        public Criteria andClassAreaInstructionsIsNull() {
            addCriterion("CLASS_AREA_INSTRUCTIONS is null");
            return (Criteria) this;
        }

        public Criteria andClassAreaInstructionsIsNotNull() {
            addCriterion("CLASS_AREA_INSTRUCTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andClassAreaInstructionsEqualTo(String value) {
            addCriterion("CLASS_AREA_INSTRUCTIONS =", value, "classAreaInstructions");
            return (Criteria) this;
        }

        public Criteria andClassAreaInstructionsNotEqualTo(String value) {
            addCriterion("CLASS_AREA_INSTRUCTIONS <>", value, "classAreaInstructions");
            return (Criteria) this;
        }

        public Criteria andClassAreaInstructionsGreaterThan(String value) {
            addCriterion("CLASS_AREA_INSTRUCTIONS >", value, "classAreaInstructions");
            return (Criteria) this;
        }

        public Criteria andClassAreaInstructionsGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_AREA_INSTRUCTIONS >=", value, "classAreaInstructions");
            return (Criteria) this;
        }

        public Criteria andClassAreaInstructionsLessThan(String value) {
            addCriterion("CLASS_AREA_INSTRUCTIONS <", value, "classAreaInstructions");
            return (Criteria) this;
        }

        public Criteria andClassAreaInstructionsLessThanOrEqualTo(String value) {
            addCriterion("CLASS_AREA_INSTRUCTIONS <=", value, "classAreaInstructions");
            return (Criteria) this;
        }

        public Criteria andClassAreaInstructionsLike(String value) {
            addCriterion("CLASS_AREA_INSTRUCTIONS like", value, "classAreaInstructions");
            return (Criteria) this;
        }

        public Criteria andClassAreaInstructionsNotLike(String value) {
            addCriterion("CLASS_AREA_INSTRUCTIONS not like", value, "classAreaInstructions");
            return (Criteria) this;
        }

        public Criteria andClassAreaInstructionsIn(List<String> values) {
            addCriterion("CLASS_AREA_INSTRUCTIONS in", values, "classAreaInstructions");
            return (Criteria) this;
        }

        public Criteria andClassAreaInstructionsNotIn(List<String> values) {
            addCriterion("CLASS_AREA_INSTRUCTIONS not in", values, "classAreaInstructions");
            return (Criteria) this;
        }

        public Criteria andClassAreaInstructionsBetween(String value1, String value2) {
            addCriterion("CLASS_AREA_INSTRUCTIONS between", value1, value2, "classAreaInstructions");
            return (Criteria) this;
        }

        public Criteria andClassAreaInstructionsNotBetween(String value1, String value2) {
            addCriterion("CLASS_AREA_INSTRUCTIONS not between", value1, value2, "classAreaInstructions");
            return (Criteria) this;
        }

        public Criteria andClassUseInstructionsIsNull() {
            addCriterion("CLASS_USE_INSTRUCTIONS is null");
            return (Criteria) this;
        }

        public Criteria andClassUseInstructionsIsNotNull() {
            addCriterion("CLASS_USE_INSTRUCTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andClassUseInstructionsEqualTo(String value) {
            addCriterion("CLASS_USE_INSTRUCTIONS =", value, "classUseInstructions");
            return (Criteria) this;
        }

        public Criteria andClassUseInstructionsNotEqualTo(String value) {
            addCriterion("CLASS_USE_INSTRUCTIONS <>", value, "classUseInstructions");
            return (Criteria) this;
        }

        public Criteria andClassUseInstructionsGreaterThan(String value) {
            addCriterion("CLASS_USE_INSTRUCTIONS >", value, "classUseInstructions");
            return (Criteria) this;
        }

        public Criteria andClassUseInstructionsGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_USE_INSTRUCTIONS >=", value, "classUseInstructions");
            return (Criteria) this;
        }

        public Criteria andClassUseInstructionsLessThan(String value) {
            addCriterion("CLASS_USE_INSTRUCTIONS <", value, "classUseInstructions");
            return (Criteria) this;
        }

        public Criteria andClassUseInstructionsLessThanOrEqualTo(String value) {
            addCriterion("CLASS_USE_INSTRUCTIONS <=", value, "classUseInstructions");
            return (Criteria) this;
        }

        public Criteria andClassUseInstructionsLike(String value) {
            addCriterion("CLASS_USE_INSTRUCTIONS like", value, "classUseInstructions");
            return (Criteria) this;
        }

        public Criteria andClassUseInstructionsNotLike(String value) {
            addCriterion("CLASS_USE_INSTRUCTIONS not like", value, "classUseInstructions");
            return (Criteria) this;
        }

        public Criteria andClassUseInstructionsIn(List<String> values) {
            addCriterion("CLASS_USE_INSTRUCTIONS in", values, "classUseInstructions");
            return (Criteria) this;
        }

        public Criteria andClassUseInstructionsNotIn(List<String> values) {
            addCriterion("CLASS_USE_INSTRUCTIONS not in", values, "classUseInstructions");
            return (Criteria) this;
        }

        public Criteria andClassUseInstructionsBetween(String value1, String value2) {
            addCriterion("CLASS_USE_INSTRUCTIONS between", value1, value2, "classUseInstructions");
            return (Criteria) this;
        }

        public Criteria andClassUseInstructionsNotBetween(String value1, String value2) {
            addCriterion("CLASS_USE_INSTRUCTIONS not between", value1, value2, "classUseInstructions");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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