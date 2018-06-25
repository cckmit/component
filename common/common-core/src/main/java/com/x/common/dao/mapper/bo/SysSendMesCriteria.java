package com.x.common.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SysSendMesCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysSendMesCriteria() {
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

        public Criteria andMesIdIsNull() {
            addCriterion("MES_ID is null");
            return (Criteria) this;
        }

        public Criteria andMesIdIsNotNull() {
            addCriterion("MES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMesIdEqualTo(String value) {
            addCriterion("MES_ID =", value, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdNotEqualTo(String value) {
            addCriterion("MES_ID <>", value, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdGreaterThan(String value) {
            addCriterion("MES_ID >", value, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdGreaterThanOrEqualTo(String value) {
            addCriterion("MES_ID >=", value, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdLessThan(String value) {
            addCriterion("MES_ID <", value, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdLessThanOrEqualTo(String value) {
            addCriterion("MES_ID <=", value, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdLike(String value) {
            addCriterion("MES_ID like", value, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdNotLike(String value) {
            addCriterion("MES_ID not like", value, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdIn(List<String> values) {
            addCriterion("MES_ID in", values, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdNotIn(List<String> values) {
            addCriterion("MES_ID not in", values, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdBetween(String value1, String value2) {
            addCriterion("MES_ID between", value1, value2, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdNotBetween(String value1, String value2) {
            addCriterion("MES_ID not between", value1, value2, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesNameIsNull() {
            addCriterion("MES_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMesNameIsNotNull() {
            addCriterion("MES_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMesNameEqualTo(String value) {
            addCriterion("MES_NAME =", value, "mesName");
            return (Criteria) this;
        }

        public Criteria andMesNameNotEqualTo(String value) {
            addCriterion("MES_NAME <>", value, "mesName");
            return (Criteria) this;
        }

        public Criteria andMesNameGreaterThan(String value) {
            addCriterion("MES_NAME >", value, "mesName");
            return (Criteria) this;
        }

        public Criteria andMesNameGreaterThanOrEqualTo(String value) {
            addCriterion("MES_NAME >=", value, "mesName");
            return (Criteria) this;
        }

        public Criteria andMesNameLessThan(String value) {
            addCriterion("MES_NAME <", value, "mesName");
            return (Criteria) this;
        }

        public Criteria andMesNameLessThanOrEqualTo(String value) {
            addCriterion("MES_NAME <=", value, "mesName");
            return (Criteria) this;
        }

        public Criteria andMesNameLike(String value) {
            addCriterion("MES_NAME like", value, "mesName");
            return (Criteria) this;
        }

        public Criteria andMesNameNotLike(String value) {
            addCriterion("MES_NAME not like", value, "mesName");
            return (Criteria) this;
        }

        public Criteria andMesNameIn(List<String> values) {
            addCriterion("MES_NAME in", values, "mesName");
            return (Criteria) this;
        }

        public Criteria andMesNameNotIn(List<String> values) {
            addCriterion("MES_NAME not in", values, "mesName");
            return (Criteria) this;
        }

        public Criteria andMesNameBetween(String value1, String value2) {
            addCriterion("MES_NAME between", value1, value2, "mesName");
            return (Criteria) this;
        }

        public Criteria andMesNameNotBetween(String value1, String value2) {
            addCriterion("MES_NAME not between", value1, value2, "mesName");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNull() {
            addCriterion("MODEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNotNull() {
            addCriterion("MODEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andModelNameEqualTo(String value) {
            addCriterion("MODEL_NAME =", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotEqualTo(String value) {
            addCriterion("MODEL_NAME <>", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThan(String value) {
            addCriterion("MODEL_NAME >", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_NAME >=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThan(String value) {
            addCriterion("MODEL_NAME <", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThanOrEqualTo(String value) {
            addCriterion("MODEL_NAME <=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLike(String value) {
            addCriterion("MODEL_NAME like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotLike(String value) {
            addCriterion("MODEL_NAME not like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameIn(List<String> values) {
            addCriterion("MODEL_NAME in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotIn(List<String> values) {
            addCriterion("MODEL_NAME not in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameBetween(String value1, String value2) {
            addCriterion("MODEL_NAME between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotBetween(String value1, String value2) {
            addCriterion("MODEL_NAME not between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andListNameIsNull() {
            addCriterion("LIST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andListNameIsNotNull() {
            addCriterion("LIST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andListNameEqualTo(String value) {
            addCriterion("LIST_NAME =", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameNotEqualTo(String value) {
            addCriterion("LIST_NAME <>", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameGreaterThan(String value) {
            addCriterion("LIST_NAME >", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameGreaterThanOrEqualTo(String value) {
            addCriterion("LIST_NAME >=", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameLessThan(String value) {
            addCriterion("LIST_NAME <", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameLessThanOrEqualTo(String value) {
            addCriterion("LIST_NAME <=", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameLike(String value) {
            addCriterion("LIST_NAME like", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameNotLike(String value) {
            addCriterion("LIST_NAME not like", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameIn(List<String> values) {
            addCriterion("LIST_NAME in", values, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameNotIn(List<String> values) {
            addCriterion("LIST_NAME not in", values, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameBetween(String value1, String value2) {
            addCriterion("LIST_NAME between", value1, value2, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameNotBetween(String value1, String value2) {
            addCriterion("LIST_NAME not between", value1, value2, "listName");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleIsNull() {
            addCriterion("CREAT_PEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleIsNotNull() {
            addCriterion("CREAT_PEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleEqualTo(String value) {
            addCriterion("CREAT_PEOPLE =", value, "creatPeople");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleNotEqualTo(String value) {
            addCriterion("CREAT_PEOPLE <>", value, "creatPeople");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleGreaterThan(String value) {
            addCriterion("CREAT_PEOPLE >", value, "creatPeople");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("CREAT_PEOPLE >=", value, "creatPeople");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleLessThan(String value) {
            addCriterion("CREAT_PEOPLE <", value, "creatPeople");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleLessThanOrEqualTo(String value) {
            addCriterion("CREAT_PEOPLE <=", value, "creatPeople");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleLike(String value) {
            addCriterion("CREAT_PEOPLE like", value, "creatPeople");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleNotLike(String value) {
            addCriterion("CREAT_PEOPLE not like", value, "creatPeople");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleIn(List<String> values) {
            addCriterion("CREAT_PEOPLE in", values, "creatPeople");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleNotIn(List<String> values) {
            addCriterion("CREAT_PEOPLE not in", values, "creatPeople");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleBetween(String value1, String value2) {
            addCriterion("CREAT_PEOPLE between", value1, value2, "creatPeople");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleNotBetween(String value1, String value2) {
            addCriterion("CREAT_PEOPLE not between", value1, value2, "creatPeople");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("CREAT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("CREAT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Timestamp value) {
            addCriterion("CREAT_TIME =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Timestamp value) {
            addCriterion("CREAT_TIME <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Timestamp value) {
            addCriterion("CREAT_TIME >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREAT_TIME >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Timestamp value) {
            addCriterion("CREAT_TIME <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREAT_TIME <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Timestamp> values) {
            addCriterion("CREAT_TIME in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Timestamp> values) {
            addCriterion("CREAT_TIME not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREAT_TIME between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREAT_TIME not between", value1, value2, "creatTime");
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