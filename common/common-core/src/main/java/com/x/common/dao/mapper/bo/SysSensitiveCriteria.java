package com.x.common.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SysSensitiveCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysSensitiveCriteria() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordsIsNull() {
            addCriterion("SENSITIVE_WORDS is null");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordsIsNotNull() {
            addCriterion("SENSITIVE_WORDS is not null");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordsEqualTo(String value) {
            addCriterion("SENSITIVE_WORDS =", value, "sensitiveWords");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordsNotEqualTo(String value) {
            addCriterion("SENSITIVE_WORDS <>", value, "sensitiveWords");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordsGreaterThan(String value) {
            addCriterion("SENSITIVE_WORDS >", value, "sensitiveWords");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordsGreaterThanOrEqualTo(String value) {
            addCriterion("SENSITIVE_WORDS >=", value, "sensitiveWords");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordsLessThan(String value) {
            addCriterion("SENSITIVE_WORDS <", value, "sensitiveWords");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordsLessThanOrEqualTo(String value) {
            addCriterion("SENSITIVE_WORDS <=", value, "sensitiveWords");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordsLike(String value) {
            addCriterion("SENSITIVE_WORDS like", value, "sensitiveWords");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordsNotLike(String value) {
            addCriterion("SENSITIVE_WORDS not like", value, "sensitiveWords");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordsIn(List<String> values) {
            addCriterion("SENSITIVE_WORDS in", values, "sensitiveWords");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordsNotIn(List<String> values) {
            addCriterion("SENSITIVE_WORDS not in", values, "sensitiveWords");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordsBetween(String value1, String value2) {
            addCriterion("SENSITIVE_WORDS between", value1, value2, "sensitiveWords");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordsNotBetween(String value1, String value2) {
            addCriterion("SENSITIVE_WORDS not between", value1, value2, "sensitiveWords");
            return (Criteria) this;
        }

        public Criteria andReplaceWordsIsNull() {
            addCriterion("REPLACE_WORDS is null");
            return (Criteria) this;
        }

        public Criteria andReplaceWordsIsNotNull() {
            addCriterion("REPLACE_WORDS is not null");
            return (Criteria) this;
        }

        public Criteria andReplaceWordsEqualTo(String value) {
            addCriterion("REPLACE_WORDS =", value, "replaceWords");
            return (Criteria) this;
        }

        public Criteria andReplaceWordsNotEqualTo(String value) {
            addCriterion("REPLACE_WORDS <>", value, "replaceWords");
            return (Criteria) this;
        }

        public Criteria andReplaceWordsGreaterThan(String value) {
            addCriterion("REPLACE_WORDS >", value, "replaceWords");
            return (Criteria) this;
        }

        public Criteria andReplaceWordsGreaterThanOrEqualTo(String value) {
            addCriterion("REPLACE_WORDS >=", value, "replaceWords");
            return (Criteria) this;
        }

        public Criteria andReplaceWordsLessThan(String value) {
            addCriterion("REPLACE_WORDS <", value, "replaceWords");
            return (Criteria) this;
        }

        public Criteria andReplaceWordsLessThanOrEqualTo(String value) {
            addCriterion("REPLACE_WORDS <=", value, "replaceWords");
            return (Criteria) this;
        }

        public Criteria andReplaceWordsLike(String value) {
            addCriterion("REPLACE_WORDS like", value, "replaceWords");
            return (Criteria) this;
        }

        public Criteria andReplaceWordsNotLike(String value) {
            addCriterion("REPLACE_WORDS not like", value, "replaceWords");
            return (Criteria) this;
        }

        public Criteria andReplaceWordsIn(List<String> values) {
            addCriterion("REPLACE_WORDS in", values, "replaceWords");
            return (Criteria) this;
        }

        public Criteria andReplaceWordsNotIn(List<String> values) {
            addCriterion("REPLACE_WORDS not in", values, "replaceWords");
            return (Criteria) this;
        }

        public Criteria andReplaceWordsBetween(String value1, String value2) {
            addCriterion("REPLACE_WORDS between", value1, value2, "replaceWords");
            return (Criteria) this;
        }

        public Criteria andReplaceWordsNotBetween(String value1, String value2) {
            addCriterion("REPLACE_WORDS not between", value1, value2, "replaceWords");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
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

        public Criteria andCreatPeopleIdIsNull() {
            addCriterion("CREAT_PEOPLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleIdIsNotNull() {
            addCriterion("CREAT_PEOPLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleIdEqualTo(String value) {
            addCriterion("CREAT_PEOPLE_ID =", value, "creatPeopleId");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleIdNotEqualTo(String value) {
            addCriterion("CREAT_PEOPLE_ID <>", value, "creatPeopleId");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleIdGreaterThan(String value) {
            addCriterion("CREAT_PEOPLE_ID >", value, "creatPeopleId");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREAT_PEOPLE_ID >=", value, "creatPeopleId");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleIdLessThan(String value) {
            addCriterion("CREAT_PEOPLE_ID <", value, "creatPeopleId");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleIdLessThanOrEqualTo(String value) {
            addCriterion("CREAT_PEOPLE_ID <=", value, "creatPeopleId");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleIdLike(String value) {
            addCriterion("CREAT_PEOPLE_ID like", value, "creatPeopleId");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleIdNotLike(String value) {
            addCriterion("CREAT_PEOPLE_ID not like", value, "creatPeopleId");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleIdIn(List<String> values) {
            addCriterion("CREAT_PEOPLE_ID in", values, "creatPeopleId");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleIdNotIn(List<String> values) {
            addCriterion("CREAT_PEOPLE_ID not in", values, "creatPeopleId");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleIdBetween(String value1, String value2) {
            addCriterion("CREAT_PEOPLE_ID between", value1, value2, "creatPeopleId");
            return (Criteria) this;
        }

        public Criteria andCreatPeopleIdNotBetween(String value1, String value2) {
            addCriterion("CREAT_PEOPLE_ID not between", value1, value2, "creatPeopleId");
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