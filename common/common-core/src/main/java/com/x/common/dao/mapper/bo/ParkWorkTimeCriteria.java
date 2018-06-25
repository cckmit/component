package com.x.common.dao.mapper.bo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ParkWorkTimeCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ParkWorkTimeCriteria() {
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

        public Criteria andWorkIdIsNull() {
            addCriterion("WORK_ID is null");
            return (Criteria) this;
        }

        public Criteria andWorkIdIsNotNull() {
            addCriterion("WORK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkIdEqualTo(String value) {
            addCriterion("WORK_ID =", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotEqualTo(String value) {
            addCriterion("WORK_ID <>", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThan(String value) {
            addCriterion("WORK_ID >", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_ID >=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThan(String value) {
            addCriterion("WORK_ID <", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThanOrEqualTo(String value) {
            addCriterion("WORK_ID <=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLike(String value) {
            addCriterion("WORK_ID like", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotLike(String value) {
            addCriterion("WORK_ID not like", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdIn(List<String> values) {
            addCriterion("WORK_ID in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotIn(List<String> values) {
            addCriterion("WORK_ID not in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdBetween(String value1, String value2) {
            addCriterion("WORK_ID between", value1, value2, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotBetween(String value1, String value2) {
            addCriterion("WORK_ID not between", value1, value2, "workId");
            return (Criteria) this;
        }

        public Criteria andParkIdInnerIsNull() {
            addCriterion("PARK_ID_INNER is null");
            return (Criteria) this;
        }

        public Criteria andParkIdInnerIsNotNull() {
            addCriterion("PARK_ID_INNER is not null");
            return (Criteria) this;
        }

        public Criteria andParkIdInnerEqualTo(String value) {
            addCriterion("PARK_ID_INNER =", value, "parkIdInner");
            return (Criteria) this;
        }

        public Criteria andParkIdInnerNotEqualTo(String value) {
            addCriterion("PARK_ID_INNER <>", value, "parkIdInner");
            return (Criteria) this;
        }

        public Criteria andParkIdInnerGreaterThan(String value) {
            addCriterion("PARK_ID_INNER >", value, "parkIdInner");
            return (Criteria) this;
        }

        public Criteria andParkIdInnerGreaterThanOrEqualTo(String value) {
            addCriterion("PARK_ID_INNER >=", value, "parkIdInner");
            return (Criteria) this;
        }

        public Criteria andParkIdInnerLessThan(String value) {
            addCriterion("PARK_ID_INNER <", value, "parkIdInner");
            return (Criteria) this;
        }

        public Criteria andParkIdInnerLessThanOrEqualTo(String value) {
            addCriterion("PARK_ID_INNER <=", value, "parkIdInner");
            return (Criteria) this;
        }

        public Criteria andParkIdInnerLike(String value) {
            addCriterion("PARK_ID_INNER like", value, "parkIdInner");
            return (Criteria) this;
        }

        public Criteria andParkIdInnerNotLike(String value) {
            addCriterion("PARK_ID_INNER not like", value, "parkIdInner");
            return (Criteria) this;
        }

        public Criteria andParkIdInnerIn(List<String> values) {
            addCriterion("PARK_ID_INNER in", values, "parkIdInner");
            return (Criteria) this;
        }

        public Criteria andParkIdInnerNotIn(List<String> values) {
            addCriterion("PARK_ID_INNER not in", values, "parkIdInner");
            return (Criteria) this;
        }

        public Criteria andParkIdInnerBetween(String value1, String value2) {
            addCriterion("PARK_ID_INNER between", value1, value2, "parkIdInner");
            return (Criteria) this;
        }

        public Criteria andParkIdInnerNotBetween(String value1, String value2) {
            addCriterion("PARK_ID_INNER not between", value1, value2, "parkIdInner");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andWorkFlagIsNull() {
            addCriterion("WORK_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andWorkFlagIsNotNull() {
            addCriterion("WORK_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andWorkFlagEqualTo(String value) {
            addCriterion("WORK_FLAG =", value, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagNotEqualTo(String value) {
            addCriterion("WORK_FLAG <>", value, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagGreaterThan(String value) {
            addCriterion("WORK_FLAG >", value, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_FLAG >=", value, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagLessThan(String value) {
            addCriterion("WORK_FLAG <", value, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagLessThanOrEqualTo(String value) {
            addCriterion("WORK_FLAG <=", value, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagLike(String value) {
            addCriterion("WORK_FLAG like", value, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagNotLike(String value) {
            addCriterion("WORK_FLAG not like", value, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagIn(List<String> values) {
            addCriterion("WORK_FLAG in", values, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagNotIn(List<String> values) {
            addCriterion("WORK_FLAG not in", values, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagBetween(String value1, String value2) {
            addCriterion("WORK_FLAG between", value1, value2, "workFlag");
            return (Criteria) this;
        }

        public Criteria andWorkFlagNotBetween(String value1, String value2) {
            addCriterion("WORK_FLAG not between", value1, value2, "workFlag");
            return (Criteria) this;
        }

        public Criteria andBusyLevelIsNull() {
            addCriterion("BUSY_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andBusyLevelIsNotNull() {
            addCriterion("BUSY_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andBusyLevelEqualTo(String value) {
            addCriterion("BUSY_LEVEL =", value, "busyLevel");
            return (Criteria) this;
        }

        public Criteria andBusyLevelNotEqualTo(String value) {
            addCriterion("BUSY_LEVEL <>", value, "busyLevel");
            return (Criteria) this;
        }

        public Criteria andBusyLevelGreaterThan(String value) {
            addCriterion("BUSY_LEVEL >", value, "busyLevel");
            return (Criteria) this;
        }

        public Criteria andBusyLevelGreaterThanOrEqualTo(String value) {
            addCriterion("BUSY_LEVEL >=", value, "busyLevel");
            return (Criteria) this;
        }

        public Criteria andBusyLevelLessThan(String value) {
            addCriterion("BUSY_LEVEL <", value, "busyLevel");
            return (Criteria) this;
        }

        public Criteria andBusyLevelLessThanOrEqualTo(String value) {
            addCriterion("BUSY_LEVEL <=", value, "busyLevel");
            return (Criteria) this;
        }

        public Criteria andBusyLevelLike(String value) {
            addCriterion("BUSY_LEVEL like", value, "busyLevel");
            return (Criteria) this;
        }

        public Criteria andBusyLevelNotLike(String value) {
            addCriterion("BUSY_LEVEL not like", value, "busyLevel");
            return (Criteria) this;
        }

        public Criteria andBusyLevelIn(List<String> values) {
            addCriterion("BUSY_LEVEL in", values, "busyLevel");
            return (Criteria) this;
        }

        public Criteria andBusyLevelNotIn(List<String> values) {
            addCriterion("BUSY_LEVEL not in", values, "busyLevel");
            return (Criteria) this;
        }

        public Criteria andBusyLevelBetween(String value1, String value2) {
            addCriterion("BUSY_LEVEL between", value1, value2, "busyLevel");
            return (Criteria) this;
        }

        public Criteria andBusyLevelNotBetween(String value1, String value2) {
            addCriterion("BUSY_LEVEL not between", value1, value2, "busyLevel");
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

        public Criteria andLimitStopTimeIsNull() {
            addCriterion("LIMIT_STOP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLimitStopTimeIsNotNull() {
            addCriterion("LIMIT_STOP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLimitStopTimeEqualTo(Integer value) {
            addCriterion("LIMIT_STOP_TIME =", value, "limitStopTime");
            return (Criteria) this;
        }

        public Criteria andLimitStopTimeNotEqualTo(Integer value) {
            addCriterion("LIMIT_STOP_TIME <>", value, "limitStopTime");
            return (Criteria) this;
        }

        public Criteria andLimitStopTimeGreaterThan(Integer value) {
            addCriterion("LIMIT_STOP_TIME >", value, "limitStopTime");
            return (Criteria) this;
        }

        public Criteria andLimitStopTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIMIT_STOP_TIME >=", value, "limitStopTime");
            return (Criteria) this;
        }

        public Criteria andLimitStopTimeLessThan(Integer value) {
            addCriterion("LIMIT_STOP_TIME <", value, "limitStopTime");
            return (Criteria) this;
        }

        public Criteria andLimitStopTimeLessThanOrEqualTo(Integer value) {
            addCriterion("LIMIT_STOP_TIME <=", value, "limitStopTime");
            return (Criteria) this;
        }

        public Criteria andLimitStopTimeIn(List<Integer> values) {
            addCriterion("LIMIT_STOP_TIME in", values, "limitStopTime");
            return (Criteria) this;
        }

        public Criteria andLimitStopTimeNotIn(List<Integer> values) {
            addCriterion("LIMIT_STOP_TIME not in", values, "limitStopTime");
            return (Criteria) this;
        }

        public Criteria andLimitStopTimeBetween(Integer value1, Integer value2) {
            addCriterion("LIMIT_STOP_TIME between", value1, value2, "limitStopTime");
            return (Criteria) this;
        }

        public Criteria andLimitStopTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("LIMIT_STOP_TIME not between", value1, value2, "limitStopTime");
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