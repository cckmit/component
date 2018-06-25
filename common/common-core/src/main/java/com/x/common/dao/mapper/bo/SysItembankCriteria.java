package com.x.common.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SysItembankCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysItembankCriteria() {
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(String value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(String value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(String value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(String value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(String value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(String value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLike(String value) {
            addCriterion("bid like", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotLike(String value) {
            addCriterion("bid not like", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<String> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<String> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(String value1, String value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(String value1, String value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andQnameIsNull() {
            addCriterion("qname is null");
            return (Criteria) this;
        }

        public Criteria andQnameIsNotNull() {
            addCriterion("qname is not null");
            return (Criteria) this;
        }

        public Criteria andQnameEqualTo(String value) {
            addCriterion("qname =", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameNotEqualTo(String value) {
            addCriterion("qname <>", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameGreaterThan(String value) {
            addCriterion("qname >", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameGreaterThanOrEqualTo(String value) {
            addCriterion("qname >=", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameLessThan(String value) {
            addCriterion("qname <", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameLessThanOrEqualTo(String value) {
            addCriterion("qname <=", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameLike(String value) {
            addCriterion("qname like", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameNotLike(String value) {
            addCriterion("qname not like", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameIn(List<String> values) {
            addCriterion("qname in", values, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameNotIn(List<String> values) {
            addCriterion("qname not in", values, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameBetween(String value1, String value2) {
            addCriterion("qname between", value1, value2, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameNotBetween(String value1, String value2) {
            addCriterion("qname not between", value1, value2, "qname");
            return (Criteria) this;
        }

        public Criteria andLangDirIsNull() {
            addCriterion("lang_dir is null");
            return (Criteria) this;
        }

        public Criteria andLangDirIsNotNull() {
            addCriterion("lang_dir is not null");
            return (Criteria) this;
        }

        public Criteria andLangDirEqualTo(String value) {
            addCriterion("lang_dir =", value, "langDir");
            return (Criteria) this;
        }

        public Criteria andLangDirNotEqualTo(String value) {
            addCriterion("lang_dir <>", value, "langDir");
            return (Criteria) this;
        }

        public Criteria andLangDirGreaterThan(String value) {
            addCriterion("lang_dir >", value, "langDir");
            return (Criteria) this;
        }

        public Criteria andLangDirGreaterThanOrEqualTo(String value) {
            addCriterion("lang_dir >=", value, "langDir");
            return (Criteria) this;
        }

        public Criteria andLangDirLessThan(String value) {
            addCriterion("lang_dir <", value, "langDir");
            return (Criteria) this;
        }

        public Criteria andLangDirLessThanOrEqualTo(String value) {
            addCriterion("lang_dir <=", value, "langDir");
            return (Criteria) this;
        }

        public Criteria andLangDirLike(String value) {
            addCriterion("lang_dir like", value, "langDir");
            return (Criteria) this;
        }

        public Criteria andLangDirNotLike(String value) {
            addCriterion("lang_dir not like", value, "langDir");
            return (Criteria) this;
        }

        public Criteria andLangDirIn(List<String> values) {
            addCriterion("lang_dir in", values, "langDir");
            return (Criteria) this;
        }

        public Criteria andLangDirNotIn(List<String> values) {
            addCriterion("lang_dir not in", values, "langDir");
            return (Criteria) this;
        }

        public Criteria andLangDirBetween(String value1, String value2) {
            addCriterion("lang_dir between", value1, value2, "langDir");
            return (Criteria) this;
        }

        public Criteria andLangDirNotBetween(String value1, String value2) {
            addCriterion("lang_dir not between", value1, value2, "langDir");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIsNull() {
            addCriterion("question_type is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIsNotNull() {
            addCriterion("question_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeEqualTo(String value) {
            addCriterion("question_type =", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotEqualTo(String value) {
            addCriterion("question_type <>", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThan(String value) {
            addCriterion("question_type >", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("question_type >=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThan(String value) {
            addCriterion("question_type <", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThanOrEqualTo(String value) {
            addCriterion("question_type <=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLike(String value) {
            addCriterion("question_type like", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotLike(String value) {
            addCriterion("question_type not like", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIn(List<String> values) {
            addCriterion("question_type in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotIn(List<String> values) {
            addCriterion("question_type not in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeBetween(String value1, String value2) {
            addCriterion("question_type between", value1, value2, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotBetween(String value1, String value2) {
            addCriterion("question_type not between", value1, value2, "questionType");
            return (Criteria) this;
        }

        public Criteria andAditorIsNull() {
            addCriterion("aditor is null");
            return (Criteria) this;
        }

        public Criteria andAditorIsNotNull() {
            addCriterion("aditor is not null");
            return (Criteria) this;
        }

        public Criteria andAditorEqualTo(String value) {
            addCriterion("aditor =", value, "aditor");
            return (Criteria) this;
        }

        public Criteria andAditorNotEqualTo(String value) {
            addCriterion("aditor <>", value, "aditor");
            return (Criteria) this;
        }

        public Criteria andAditorGreaterThan(String value) {
            addCriterion("aditor >", value, "aditor");
            return (Criteria) this;
        }

        public Criteria andAditorGreaterThanOrEqualTo(String value) {
            addCriterion("aditor >=", value, "aditor");
            return (Criteria) this;
        }

        public Criteria andAditorLessThan(String value) {
            addCriterion("aditor <", value, "aditor");
            return (Criteria) this;
        }

        public Criteria andAditorLessThanOrEqualTo(String value) {
            addCriterion("aditor <=", value, "aditor");
            return (Criteria) this;
        }

        public Criteria andAditorLike(String value) {
            addCriterion("aditor like", value, "aditor");
            return (Criteria) this;
        }

        public Criteria andAditorNotLike(String value) {
            addCriterion("aditor not like", value, "aditor");
            return (Criteria) this;
        }

        public Criteria andAditorIn(List<String> values) {
            addCriterion("aditor in", values, "aditor");
            return (Criteria) this;
        }

        public Criteria andAditorNotIn(List<String> values) {
            addCriterion("aditor not in", values, "aditor");
            return (Criteria) this;
        }

        public Criteria andAditorBetween(String value1, String value2) {
            addCriterion("aditor between", value1, value2, "aditor");
            return (Criteria) this;
        }

        public Criteria andAditorNotBetween(String value1, String value2) {
            addCriterion("aditor not between", value1, value2, "aditor");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Timestamp value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Timestamp value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Timestamp value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Timestamp value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Timestamp> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Timestamp> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIdIsNull() {
            addCriterion("create_operator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIdIsNotNull() {
            addCriterion("create_operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIdEqualTo(String value) {
            addCriterion("create_operator_id =", value, "createOperatorId");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIdNotEqualTo(String value) {
            addCriterion("create_operator_id <>", value, "createOperatorId");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIdGreaterThan(String value) {
            addCriterion("create_operator_id >", value, "createOperatorId");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("create_operator_id >=", value, "createOperatorId");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIdLessThan(String value) {
            addCriterion("create_operator_id <", value, "createOperatorId");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIdLessThanOrEqualTo(String value) {
            addCriterion("create_operator_id <=", value, "createOperatorId");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIdLike(String value) {
            addCriterion("create_operator_id like", value, "createOperatorId");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIdNotLike(String value) {
            addCriterion("create_operator_id not like", value, "createOperatorId");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIdIn(List<String> values) {
            addCriterion("create_operator_id in", values, "createOperatorId");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIdNotIn(List<String> values) {
            addCriterion("create_operator_id not in", values, "createOperatorId");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIdBetween(String value1, String value2) {
            addCriterion("create_operator_id between", value1, value2, "createOperatorId");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIdNotBetween(String value1, String value2) {
            addCriterion("create_operator_id not between", value1, value2, "createOperatorId");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andQnumberIsNull() {
            addCriterion("qnumber is null");
            return (Criteria) this;
        }

        public Criteria andQnumberIsNotNull() {
            addCriterion("qnumber is not null");
            return (Criteria) this;
        }

        public Criteria andQnumberEqualTo(String value) {
            addCriterion("qnumber =", value, "qnumber");
            return (Criteria) this;
        }

        public Criteria andQnumberNotEqualTo(String value) {
            addCriterion("qnumber <>", value, "qnumber");
            return (Criteria) this;
        }

        public Criteria andQnumberGreaterThan(String value) {
            addCriterion("qnumber >", value, "qnumber");
            return (Criteria) this;
        }

        public Criteria andQnumberGreaterThanOrEqualTo(String value) {
            addCriterion("qnumber >=", value, "qnumber");
            return (Criteria) this;
        }

        public Criteria andQnumberLessThan(String value) {
            addCriterion("qnumber <", value, "qnumber");
            return (Criteria) this;
        }

        public Criteria andQnumberLessThanOrEqualTo(String value) {
            addCriterion("qnumber <=", value, "qnumber");
            return (Criteria) this;
        }

        public Criteria andQnumberLike(String value) {
            addCriterion("qnumber like", value, "qnumber");
            return (Criteria) this;
        }

        public Criteria andQnumberNotLike(String value) {
            addCriterion("qnumber not like", value, "qnumber");
            return (Criteria) this;
        }

        public Criteria andQnumberIn(List<String> values) {
            addCriterion("qnumber in", values, "qnumber");
            return (Criteria) this;
        }

        public Criteria andQnumberNotIn(List<String> values) {
            addCriterion("qnumber not in", values, "qnumber");
            return (Criteria) this;
        }

        public Criteria andQnumberBetween(String value1, String value2) {
            addCriterion("qnumber between", value1, value2, "qnumber");
            return (Criteria) this;
        }

        public Criteria andQnumberNotBetween(String value1, String value2) {
            addCriterion("qnumber not between", value1, value2, "qnumber");
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