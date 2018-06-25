package com.x.common.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class ParkFeeRuleCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ParkFeeRuleCriteria() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdIsNull() {
            addCriterion("FEE_STANDARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdIsNotNull() {
            addCriterion("FEE_STANDARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdEqualTo(Integer value) {
            addCriterion("FEE_STANDARD_ID =", value, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdNotEqualTo(Integer value) {
            addCriterion("FEE_STANDARD_ID <>", value, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdGreaterThan(Integer value) {
            addCriterion("FEE_STANDARD_ID >", value, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FEE_STANDARD_ID >=", value, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdLessThan(Integer value) {
            addCriterion("FEE_STANDARD_ID <", value, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdLessThanOrEqualTo(Integer value) {
            addCriterion("FEE_STANDARD_ID <=", value, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdIn(List<Integer> values) {
            addCriterion("FEE_STANDARD_ID in", values, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdNotIn(List<Integer> values) {
            addCriterion("FEE_STANDARD_ID not in", values, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdBetween(Integer value1, Integer value2) {
            addCriterion("FEE_STANDARD_ID between", value1, value2, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FEE_STANDARD_ID not between", value1, value2, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardDescIsNull() {
            addCriterion("FEE_STANDARD_desc is null");
            return (Criteria) this;
        }

        public Criteria andFeeStandardDescIsNotNull() {
            addCriterion("FEE_STANDARD_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFeeStandardDescEqualTo(String value) {
            addCriterion("FEE_STANDARD_desc =", value, "feeStandardDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardDescNotEqualTo(String value) {
            addCriterion("FEE_STANDARD_desc <>", value, "feeStandardDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardDescGreaterThan(String value) {
            addCriterion("FEE_STANDARD_desc >", value, "feeStandardDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardDescGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_STANDARD_desc >=", value, "feeStandardDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardDescLessThan(String value) {
            addCriterion("FEE_STANDARD_desc <", value, "feeStandardDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardDescLessThanOrEqualTo(String value) {
            addCriterion("FEE_STANDARD_desc <=", value, "feeStandardDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardDescLike(String value) {
            addCriterion("FEE_STANDARD_desc like", value, "feeStandardDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardDescNotLike(String value) {
            addCriterion("FEE_STANDARD_desc not like", value, "feeStandardDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardDescIn(List<String> values) {
            addCriterion("FEE_STANDARD_desc in", values, "feeStandardDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardDescNotIn(List<String> values) {
            addCriterion("FEE_STANDARD_desc not in", values, "feeStandardDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardDescBetween(String value1, String value2) {
            addCriterion("FEE_STANDARD_desc between", value1, value2, "feeStandardDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardDescNotBetween(String value1, String value2) {
            addCriterion("FEE_STANDARD_desc not between", value1, value2, "feeStandardDesc");
            return (Criteria) this;
        }

        public Criteria andCarTypeDescIsNull() {
            addCriterion("CAR_TYPE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeDescIsNotNull() {
            addCriterion("CAR_TYPE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeDescEqualTo(String value) {
            addCriterion("CAR_TYPE_DESC =", value, "carTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCarTypeDescNotEqualTo(String value) {
            addCriterion("CAR_TYPE_DESC <>", value, "carTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCarTypeDescGreaterThan(String value) {
            addCriterion("CAR_TYPE_DESC >", value, "carTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCarTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_TYPE_DESC >=", value, "carTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCarTypeDescLessThan(String value) {
            addCriterion("CAR_TYPE_DESC <", value, "carTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCarTypeDescLessThanOrEqualTo(String value) {
            addCriterion("CAR_TYPE_DESC <=", value, "carTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCarTypeDescLike(String value) {
            addCriterion("CAR_TYPE_DESC like", value, "carTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCarTypeDescNotLike(String value) {
            addCriterion("CAR_TYPE_DESC not like", value, "carTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCarTypeDescIn(List<String> values) {
            addCriterion("CAR_TYPE_DESC in", values, "carTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCarTypeDescNotIn(List<String> values) {
            addCriterion("CAR_TYPE_DESC not in", values, "carTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCarTypeDescBetween(String value1, String value2) {
            addCriterion("CAR_TYPE_DESC between", value1, value2, "carTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCarTypeDescNotBetween(String value1, String value2) {
            addCriterion("CAR_TYPE_DESC not between", value1, value2, "carTypeDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelDescIsNull() {
            addCriterion("FEE_STANDARD_LEVEL_DESC is null");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelDescIsNotNull() {
            addCriterion("FEE_STANDARD_LEVEL_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelDescEqualTo(String value) {
            addCriterion("FEE_STANDARD_LEVEL_DESC =", value, "feeStandardLevelDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelDescNotEqualTo(String value) {
            addCriterion("FEE_STANDARD_LEVEL_DESC <>", value, "feeStandardLevelDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelDescGreaterThan(String value) {
            addCriterion("FEE_STANDARD_LEVEL_DESC >", value, "feeStandardLevelDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelDescGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_STANDARD_LEVEL_DESC >=", value, "feeStandardLevelDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelDescLessThan(String value) {
            addCriterion("FEE_STANDARD_LEVEL_DESC <", value, "feeStandardLevelDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelDescLessThanOrEqualTo(String value) {
            addCriterion("FEE_STANDARD_LEVEL_DESC <=", value, "feeStandardLevelDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelDescLike(String value) {
            addCriterion("FEE_STANDARD_LEVEL_DESC like", value, "feeStandardLevelDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelDescNotLike(String value) {
            addCriterion("FEE_STANDARD_LEVEL_DESC not like", value, "feeStandardLevelDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelDescIn(List<String> values) {
            addCriterion("FEE_STANDARD_LEVEL_DESC in", values, "feeStandardLevelDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelDescNotIn(List<String> values) {
            addCriterion("FEE_STANDARD_LEVEL_DESC not in", values, "feeStandardLevelDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelDescBetween(String value1, String value2) {
            addCriterion("FEE_STANDARD_LEVEL_DESC between", value1, value2, "feeStandardLevelDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelDescNotBetween(String value1, String value2) {
            addCriterion("FEE_STANDARD_LEVEL_DESC not between", value1, value2, "feeStandardLevelDesc");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelTypeIsNull() {
            addCriterion("FEE_STANDARD_LEVEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelTypeIsNotNull() {
            addCriterion("FEE_STANDARD_LEVEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelTypeEqualTo(String value) {
            addCriterion("FEE_STANDARD_LEVEL_TYPE =", value, "feeStandardLevelType");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelTypeNotEqualTo(String value) {
            addCriterion("FEE_STANDARD_LEVEL_TYPE <>", value, "feeStandardLevelType");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelTypeGreaterThan(String value) {
            addCriterion("FEE_STANDARD_LEVEL_TYPE >", value, "feeStandardLevelType");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_STANDARD_LEVEL_TYPE >=", value, "feeStandardLevelType");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelTypeLessThan(String value) {
            addCriterion("FEE_STANDARD_LEVEL_TYPE <", value, "feeStandardLevelType");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelTypeLessThanOrEqualTo(String value) {
            addCriterion("FEE_STANDARD_LEVEL_TYPE <=", value, "feeStandardLevelType");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelTypeLike(String value) {
            addCriterion("FEE_STANDARD_LEVEL_TYPE like", value, "feeStandardLevelType");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelTypeNotLike(String value) {
            addCriterion("FEE_STANDARD_LEVEL_TYPE not like", value, "feeStandardLevelType");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelTypeIn(List<String> values) {
            addCriterion("FEE_STANDARD_LEVEL_TYPE in", values, "feeStandardLevelType");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelTypeNotIn(List<String> values) {
            addCriterion("FEE_STANDARD_LEVEL_TYPE not in", values, "feeStandardLevelType");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelTypeBetween(String value1, String value2) {
            addCriterion("FEE_STANDARD_LEVEL_TYPE between", value1, value2, "feeStandardLevelType");
            return (Criteria) this;
        }

        public Criteria andFeeStandardLevelTypeNotBetween(String value1, String value2) {
            addCriterion("FEE_STANDARD_LEVEL_TYPE not between", value1, value2, "feeStandardLevelType");
            return (Criteria) this;
        }

        public Criteria andStandardStatuesIsNull() {
            addCriterion("STANDARD_STATUES is null");
            return (Criteria) this;
        }

        public Criteria andStandardStatuesIsNotNull() {
            addCriterion("STANDARD_STATUES is not null");
            return (Criteria) this;
        }

        public Criteria andStandardStatuesEqualTo(String value) {
            addCriterion("STANDARD_STATUES =", value, "standardStatues");
            return (Criteria) this;
        }

        public Criteria andStandardStatuesNotEqualTo(String value) {
            addCriterion("STANDARD_STATUES <>", value, "standardStatues");
            return (Criteria) this;
        }

        public Criteria andStandardStatuesGreaterThan(String value) {
            addCriterion("STANDARD_STATUES >", value, "standardStatues");
            return (Criteria) this;
        }

        public Criteria andStandardStatuesGreaterThanOrEqualTo(String value) {
            addCriterion("STANDARD_STATUES >=", value, "standardStatues");
            return (Criteria) this;
        }

        public Criteria andStandardStatuesLessThan(String value) {
            addCriterion("STANDARD_STATUES <", value, "standardStatues");
            return (Criteria) this;
        }

        public Criteria andStandardStatuesLessThanOrEqualTo(String value) {
            addCriterion("STANDARD_STATUES <=", value, "standardStatues");
            return (Criteria) this;
        }

        public Criteria andStandardStatuesLike(String value) {
            addCriterion("STANDARD_STATUES like", value, "standardStatues");
            return (Criteria) this;
        }

        public Criteria andStandardStatuesNotLike(String value) {
            addCriterion("STANDARD_STATUES not like", value, "standardStatues");
            return (Criteria) this;
        }

        public Criteria andStandardStatuesIn(List<String> values) {
            addCriterion("STANDARD_STATUES in", values, "standardStatues");
            return (Criteria) this;
        }

        public Criteria andStandardStatuesNotIn(List<String> values) {
            addCriterion("STANDARD_STATUES not in", values, "standardStatues");
            return (Criteria) this;
        }

        public Criteria andStandardStatuesBetween(String value1, String value2) {
            addCriterion("STANDARD_STATUES between", value1, value2, "standardStatues");
            return (Criteria) this;
        }

        public Criteria andStandardStatuesNotBetween(String value1, String value2) {
            addCriterion("STANDARD_STATUES not between", value1, value2, "standardStatues");
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