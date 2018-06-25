package com.x.common.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class GnCountryCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public GnCountryCriteria() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCountryNameCnIsNull() {
            addCriterion("COUNTRY_NAME_CN is null");
            return (Criteria) this;
        }

        public Criteria andCountryNameCnIsNotNull() {
            addCriterion("COUNTRY_NAME_CN is not null");
            return (Criteria) this;
        }

        public Criteria andCountryNameCnEqualTo(String value) {
            addCriterion("COUNTRY_NAME_CN =", value, "countryNameCn");
            return (Criteria) this;
        }

        public Criteria andCountryNameCnNotEqualTo(String value) {
            addCriterion("COUNTRY_NAME_CN <>", value, "countryNameCn");
            return (Criteria) this;
        }

        public Criteria andCountryNameCnGreaterThan(String value) {
            addCriterion("COUNTRY_NAME_CN >", value, "countryNameCn");
            return (Criteria) this;
        }

        public Criteria andCountryNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY_NAME_CN >=", value, "countryNameCn");
            return (Criteria) this;
        }

        public Criteria andCountryNameCnLessThan(String value) {
            addCriterion("COUNTRY_NAME_CN <", value, "countryNameCn");
            return (Criteria) this;
        }

        public Criteria andCountryNameCnLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY_NAME_CN <=", value, "countryNameCn");
            return (Criteria) this;
        }

        public Criteria andCountryNameCnLike(String value) {
            addCriterion("COUNTRY_NAME_CN like", value, "countryNameCn");
            return (Criteria) this;
        }

        public Criteria andCountryNameCnNotLike(String value) {
            addCriterion("COUNTRY_NAME_CN not like", value, "countryNameCn");
            return (Criteria) this;
        }

        public Criteria andCountryNameCnIn(List<String> values) {
            addCriterion("COUNTRY_NAME_CN in", values, "countryNameCn");
            return (Criteria) this;
        }

        public Criteria andCountryNameCnNotIn(List<String> values) {
            addCriterion("COUNTRY_NAME_CN not in", values, "countryNameCn");
            return (Criteria) this;
        }

        public Criteria andCountryNameCnBetween(String value1, String value2) {
            addCriterion("COUNTRY_NAME_CN between", value1, value2, "countryNameCn");
            return (Criteria) this;
        }

        public Criteria andCountryNameCnNotBetween(String value1, String value2) {
            addCriterion("COUNTRY_NAME_CN not between", value1, value2, "countryNameCn");
            return (Criteria) this;
        }

        public Criteria andCountryNameEnIsNull() {
            addCriterion("COUNTRY_NAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andCountryNameEnIsNotNull() {
            addCriterion("COUNTRY_NAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andCountryNameEnEqualTo(String value) {
            addCriterion("COUNTRY_NAME_EN =", value, "countryNameEn");
            return (Criteria) this;
        }

        public Criteria andCountryNameEnNotEqualTo(String value) {
            addCriterion("COUNTRY_NAME_EN <>", value, "countryNameEn");
            return (Criteria) this;
        }

        public Criteria andCountryNameEnGreaterThan(String value) {
            addCriterion("COUNTRY_NAME_EN >", value, "countryNameEn");
            return (Criteria) this;
        }

        public Criteria andCountryNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY_NAME_EN >=", value, "countryNameEn");
            return (Criteria) this;
        }

        public Criteria andCountryNameEnLessThan(String value) {
            addCriterion("COUNTRY_NAME_EN <", value, "countryNameEn");
            return (Criteria) this;
        }

        public Criteria andCountryNameEnLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY_NAME_EN <=", value, "countryNameEn");
            return (Criteria) this;
        }

        public Criteria andCountryNameEnLike(String value) {
            addCriterion("COUNTRY_NAME_EN like", value, "countryNameEn");
            return (Criteria) this;
        }

        public Criteria andCountryNameEnNotLike(String value) {
            addCriterion("COUNTRY_NAME_EN not like", value, "countryNameEn");
            return (Criteria) this;
        }

        public Criteria andCountryNameEnIn(List<String> values) {
            addCriterion("COUNTRY_NAME_EN in", values, "countryNameEn");
            return (Criteria) this;
        }

        public Criteria andCountryNameEnNotIn(List<String> values) {
            addCriterion("COUNTRY_NAME_EN not in", values, "countryNameEn");
            return (Criteria) this;
        }

        public Criteria andCountryNameEnBetween(String value1, String value2) {
            addCriterion("COUNTRY_NAME_EN between", value1, value2, "countryNameEn");
            return (Criteria) this;
        }

        public Criteria andCountryNameEnNotBetween(String value1, String value2) {
            addCriterion("COUNTRY_NAME_EN not between", value1, value2, "countryNameEn");
            return (Criteria) this;
        }

        public Criteria andCountryValueIsNull() {
            addCriterion("COUNTRY_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andCountryValueIsNotNull() {
            addCriterion("COUNTRY_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andCountryValueEqualTo(String value) {
            addCriterion("COUNTRY_VALUE =", value, "countryValue");
            return (Criteria) this;
        }

        public Criteria andCountryValueNotEqualTo(String value) {
            addCriterion("COUNTRY_VALUE <>", value, "countryValue");
            return (Criteria) this;
        }

        public Criteria andCountryValueGreaterThan(String value) {
            addCriterion("COUNTRY_VALUE >", value, "countryValue");
            return (Criteria) this;
        }

        public Criteria andCountryValueGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY_VALUE >=", value, "countryValue");
            return (Criteria) this;
        }

        public Criteria andCountryValueLessThan(String value) {
            addCriterion("COUNTRY_VALUE <", value, "countryValue");
            return (Criteria) this;
        }

        public Criteria andCountryValueLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY_VALUE <=", value, "countryValue");
            return (Criteria) this;
        }

        public Criteria andCountryValueLike(String value) {
            addCriterion("COUNTRY_VALUE like", value, "countryValue");
            return (Criteria) this;
        }

        public Criteria andCountryValueNotLike(String value) {
            addCriterion("COUNTRY_VALUE not like", value, "countryValue");
            return (Criteria) this;
        }

        public Criteria andCountryValueIn(List<String> values) {
            addCriterion("COUNTRY_VALUE in", values, "countryValue");
            return (Criteria) this;
        }

        public Criteria andCountryValueNotIn(List<String> values) {
            addCriterion("COUNTRY_VALUE not in", values, "countryValue");
            return (Criteria) this;
        }

        public Criteria andCountryValueBetween(String value1, String value2) {
            addCriterion("COUNTRY_VALUE between", value1, value2, "countryValue");
            return (Criteria) this;
        }

        public Criteria andCountryValueNotBetween(String value1, String value2) {
            addCriterion("COUNTRY_VALUE not between", value1, value2, "countryValue");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("COUNTRY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("COUNTRY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("COUNTRY_CODE =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("COUNTRY_CODE <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("COUNTRY_CODE >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY_CODE >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("COUNTRY_CODE <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY_CODE <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("COUNTRY_CODE like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("COUNTRY_CODE not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("COUNTRY_CODE in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("COUNTRY_CODE not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("COUNTRY_CODE between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("COUNTRY_CODE not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andRegularExpressionIsNull() {
            addCriterion("REGULAR_EXPRESSION is null");
            return (Criteria) this;
        }

        public Criteria andRegularExpressionIsNotNull() {
            addCriterion("REGULAR_EXPRESSION is not null");
            return (Criteria) this;
        }

        public Criteria andRegularExpressionEqualTo(String value) {
            addCriterion("REGULAR_EXPRESSION =", value, "regularExpression");
            return (Criteria) this;
        }

        public Criteria andRegularExpressionNotEqualTo(String value) {
            addCriterion("REGULAR_EXPRESSION <>", value, "regularExpression");
            return (Criteria) this;
        }

        public Criteria andRegularExpressionGreaterThan(String value) {
            addCriterion("REGULAR_EXPRESSION >", value, "regularExpression");
            return (Criteria) this;
        }

        public Criteria andRegularExpressionGreaterThanOrEqualTo(String value) {
            addCriterion("REGULAR_EXPRESSION >=", value, "regularExpression");
            return (Criteria) this;
        }

        public Criteria andRegularExpressionLessThan(String value) {
            addCriterion("REGULAR_EXPRESSION <", value, "regularExpression");
            return (Criteria) this;
        }

        public Criteria andRegularExpressionLessThanOrEqualTo(String value) {
            addCriterion("REGULAR_EXPRESSION <=", value, "regularExpression");
            return (Criteria) this;
        }

        public Criteria andRegularExpressionLike(String value) {
            addCriterion("REGULAR_EXPRESSION like", value, "regularExpression");
            return (Criteria) this;
        }

        public Criteria andRegularExpressionNotLike(String value) {
            addCriterion("REGULAR_EXPRESSION not like", value, "regularExpression");
            return (Criteria) this;
        }

        public Criteria andRegularExpressionIn(List<String> values) {
            addCriterion("REGULAR_EXPRESSION in", values, "regularExpression");
            return (Criteria) this;
        }

        public Criteria andRegularExpressionNotIn(List<String> values) {
            addCriterion("REGULAR_EXPRESSION not in", values, "regularExpression");
            return (Criteria) this;
        }

        public Criteria andRegularExpressionBetween(String value1, String value2) {
            addCriterion("REGULAR_EXPRESSION between", value1, value2, "regularExpression");
            return (Criteria) this;
        }

        public Criteria andRegularExpressionNotBetween(String value1, String value2) {
            addCriterion("REGULAR_EXPRESSION not between", value1, value2, "regularExpression");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNull() {
            addCriterion("OPERATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNotNull() {
            addCriterion("OPERATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeEqualTo(Long value) {
            addCriterion("OPERATION_TIME =", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotEqualTo(Long value) {
            addCriterion("OPERATION_TIME <>", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThan(Long value) {
            addCriterion("OPERATION_TIME >", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("OPERATION_TIME >=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThan(Long value) {
            addCriterion("OPERATION_TIME <", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThanOrEqualTo(Long value) {
            addCriterion("OPERATION_TIME <=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIn(List<Long> values) {
            addCriterion("OPERATION_TIME in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotIn(List<Long> values) {
            addCriterion("OPERATION_TIME not in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeBetween(Long value1, Long value2) {
            addCriterion("OPERATION_TIME between", value1, value2, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotBetween(Long value1, Long value2) {
            addCriterion("OPERATION_TIME not between", value1, value2, "operationTime");
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