package com.x.common.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SysFeedbakeCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysFeedbakeCriteria() {
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

        public Criteria andFeedbakeSoureIsNull() {
            addCriterion("FEEDBAKE_SOURE is null");
            return (Criteria) this;
        }

        public Criteria andFeedbakeSoureIsNotNull() {
            addCriterion("FEEDBAKE_SOURE is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbakeSoureEqualTo(String value) {
            addCriterion("FEEDBAKE_SOURE =", value, "feedbakeSoure");
            return (Criteria) this;
        }

        public Criteria andFeedbakeSoureNotEqualTo(String value) {
            addCriterion("FEEDBAKE_SOURE <>", value, "feedbakeSoure");
            return (Criteria) this;
        }

        public Criteria andFeedbakeSoureGreaterThan(String value) {
            addCriterion("FEEDBAKE_SOURE >", value, "feedbakeSoure");
            return (Criteria) this;
        }

        public Criteria andFeedbakeSoureGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBAKE_SOURE >=", value, "feedbakeSoure");
            return (Criteria) this;
        }

        public Criteria andFeedbakeSoureLessThan(String value) {
            addCriterion("FEEDBAKE_SOURE <", value, "feedbakeSoure");
            return (Criteria) this;
        }

        public Criteria andFeedbakeSoureLessThanOrEqualTo(String value) {
            addCriterion("FEEDBAKE_SOURE <=", value, "feedbakeSoure");
            return (Criteria) this;
        }

        public Criteria andFeedbakeSoureLike(String value) {
            addCriterion("FEEDBAKE_SOURE like", value, "feedbakeSoure");
            return (Criteria) this;
        }

        public Criteria andFeedbakeSoureNotLike(String value) {
            addCriterion("FEEDBAKE_SOURE not like", value, "feedbakeSoure");
            return (Criteria) this;
        }

        public Criteria andFeedbakeSoureIn(List<String> values) {
            addCriterion("FEEDBAKE_SOURE in", values, "feedbakeSoure");
            return (Criteria) this;
        }

        public Criteria andFeedbakeSoureNotIn(List<String> values) {
            addCriterion("FEEDBAKE_SOURE not in", values, "feedbakeSoure");
            return (Criteria) this;
        }

        public Criteria andFeedbakeSoureBetween(String value1, String value2) {
            addCriterion("FEEDBAKE_SOURE between", value1, value2, "feedbakeSoure");
            return (Criteria) this;
        }

        public Criteria andFeedbakeSoureNotBetween(String value1, String value2) {
            addCriterion("FEEDBAKE_SOURE not between", value1, value2, "feedbakeSoure");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProblemTypeIsNull() {
            addCriterion("PROBLEM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProblemTypeIsNotNull() {
            addCriterion("PROBLEM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProblemTypeEqualTo(String value) {
            addCriterion("PROBLEM_TYPE =", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeNotEqualTo(String value) {
            addCriterion("PROBLEM_TYPE <>", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeGreaterThan(String value) {
            addCriterion("PROBLEM_TYPE >", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROBLEM_TYPE >=", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeLessThan(String value) {
            addCriterion("PROBLEM_TYPE <", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeLessThanOrEqualTo(String value) {
            addCriterion("PROBLEM_TYPE <=", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeLike(String value) {
            addCriterion("PROBLEM_TYPE like", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeNotLike(String value) {
            addCriterion("PROBLEM_TYPE not like", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeIn(List<String> values) {
            addCriterion("PROBLEM_TYPE in", values, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeNotIn(List<String> values) {
            addCriterion("PROBLEM_TYPE not in", values, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeBetween(String value1, String value2) {
            addCriterion("PROBLEM_TYPE between", value1, value2, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeNotBetween(String value1, String value2) {
            addCriterion("PROBLEM_TYPE not between", value1, value2, "problemType");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNull() {
            addCriterion("PHONE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNotNull() {
            addCriterion("PHONE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumEqualTo(String value) {
            addCriterion("PHONE_NUM =", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotEqualTo(String value) {
            addCriterion("PHONE_NUM <>", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThan(String value) {
            addCriterion("PHONE_NUM >", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NUM >=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThan(String value) {
            addCriterion("PHONE_NUM <", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NUM <=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLike(String value) {
            addCriterion("PHONE_NUM like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotLike(String value) {
            addCriterion("PHONE_NUM not like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIn(List<String> values) {
            addCriterion("PHONE_NUM in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotIn(List<String> values) {
            addCriterion("PHONE_NUM not in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumBetween(String value1, String value2) {
            addCriterion("PHONE_NUM between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotBetween(String value1, String value2) {
            addCriterion("PHONE_NUM not between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("MAIL is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("MAIL =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("MAIL <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("MAIL >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("MAIL <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("MAIL <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("MAIL like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("MAIL not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("MAIL in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("MAIL not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("MAIL between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("MAIL not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andFeedbakeContenIsNull() {
            addCriterion("FEEDBAKE_CONTEN is null");
            return (Criteria) this;
        }

        public Criteria andFeedbakeContenIsNotNull() {
            addCriterion("FEEDBAKE_CONTEN is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbakeContenEqualTo(String value) {
            addCriterion("FEEDBAKE_CONTEN =", value, "feedbakeConten");
            return (Criteria) this;
        }

        public Criteria andFeedbakeContenNotEqualTo(String value) {
            addCriterion("FEEDBAKE_CONTEN <>", value, "feedbakeConten");
            return (Criteria) this;
        }

        public Criteria andFeedbakeContenGreaterThan(String value) {
            addCriterion("FEEDBAKE_CONTEN >", value, "feedbakeConten");
            return (Criteria) this;
        }

        public Criteria andFeedbakeContenGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBAKE_CONTEN >=", value, "feedbakeConten");
            return (Criteria) this;
        }

        public Criteria andFeedbakeContenLessThan(String value) {
            addCriterion("FEEDBAKE_CONTEN <", value, "feedbakeConten");
            return (Criteria) this;
        }

        public Criteria andFeedbakeContenLessThanOrEqualTo(String value) {
            addCriterion("FEEDBAKE_CONTEN <=", value, "feedbakeConten");
            return (Criteria) this;
        }

        public Criteria andFeedbakeContenLike(String value) {
            addCriterion("FEEDBAKE_CONTEN like", value, "feedbakeConten");
            return (Criteria) this;
        }

        public Criteria andFeedbakeContenNotLike(String value) {
            addCriterion("FEEDBAKE_CONTEN not like", value, "feedbakeConten");
            return (Criteria) this;
        }

        public Criteria andFeedbakeContenIn(List<String> values) {
            addCriterion("FEEDBAKE_CONTEN in", values, "feedbakeConten");
            return (Criteria) this;
        }

        public Criteria andFeedbakeContenNotIn(List<String> values) {
            addCriterion("FEEDBAKE_CONTEN not in", values, "feedbakeConten");
            return (Criteria) this;
        }

        public Criteria andFeedbakeContenBetween(String value1, String value2) {
            addCriterion("FEEDBAKE_CONTEN between", value1, value2, "feedbakeConten");
            return (Criteria) this;
        }

        public Criteria andFeedbakeContenNotBetween(String value1, String value2) {
            addCriterion("FEEDBAKE_CONTEN not between", value1, value2, "feedbakeConten");
            return (Criteria) this;
        }

        public Criteria andFeedbakeTimeIsNull() {
            addCriterion("FEEDBAKE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFeedbakeTimeIsNotNull() {
            addCriterion("FEEDBAKE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbakeTimeEqualTo(Timestamp value) {
            addCriterion("FEEDBAKE_TIME =", value, "feedbakeTime");
            return (Criteria) this;
        }

        public Criteria andFeedbakeTimeNotEqualTo(Timestamp value) {
            addCriterion("FEEDBAKE_TIME <>", value, "feedbakeTime");
            return (Criteria) this;
        }

        public Criteria andFeedbakeTimeGreaterThan(Timestamp value) {
            addCriterion("FEEDBAKE_TIME >", value, "feedbakeTime");
            return (Criteria) this;
        }

        public Criteria andFeedbakeTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("FEEDBAKE_TIME >=", value, "feedbakeTime");
            return (Criteria) this;
        }

        public Criteria andFeedbakeTimeLessThan(Timestamp value) {
            addCriterion("FEEDBAKE_TIME <", value, "feedbakeTime");
            return (Criteria) this;
        }

        public Criteria andFeedbakeTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("FEEDBAKE_TIME <=", value, "feedbakeTime");
            return (Criteria) this;
        }

        public Criteria andFeedbakeTimeIn(List<Timestamp> values) {
            addCriterion("FEEDBAKE_TIME in", values, "feedbakeTime");
            return (Criteria) this;
        }

        public Criteria andFeedbakeTimeNotIn(List<Timestamp> values) {
            addCriterion("FEEDBAKE_TIME not in", values, "feedbakeTime");
            return (Criteria) this;
        }

        public Criteria andFeedbakeTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("FEEDBAKE_TIME between", value1, value2, "feedbakeTime");
            return (Criteria) this;
        }

        public Criteria andFeedbakeTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("FEEDBAKE_TIME not between", value1, value2, "feedbakeTime");
            return (Criteria) this;
        }

        public Criteria andRepleIsNull() {
            addCriterion("REPLE is null");
            return (Criteria) this;
        }

        public Criteria andRepleIsNotNull() {
            addCriterion("REPLE is not null");
            return (Criteria) this;
        }

        public Criteria andRepleEqualTo(String value) {
            addCriterion("REPLE =", value, "reple");
            return (Criteria) this;
        }

        public Criteria andRepleNotEqualTo(String value) {
            addCriterion("REPLE <>", value, "reple");
            return (Criteria) this;
        }

        public Criteria andRepleGreaterThan(String value) {
            addCriterion("REPLE >", value, "reple");
            return (Criteria) this;
        }

        public Criteria andRepleGreaterThanOrEqualTo(String value) {
            addCriterion("REPLE >=", value, "reple");
            return (Criteria) this;
        }

        public Criteria andRepleLessThan(String value) {
            addCriterion("REPLE <", value, "reple");
            return (Criteria) this;
        }

        public Criteria andRepleLessThanOrEqualTo(String value) {
            addCriterion("REPLE <=", value, "reple");
            return (Criteria) this;
        }

        public Criteria andRepleLike(String value) {
            addCriterion("REPLE like", value, "reple");
            return (Criteria) this;
        }

        public Criteria andRepleNotLike(String value) {
            addCriterion("REPLE not like", value, "reple");
            return (Criteria) this;
        }

        public Criteria andRepleIn(List<String> values) {
            addCriterion("REPLE in", values, "reple");
            return (Criteria) this;
        }

        public Criteria andRepleNotIn(List<String> values) {
            addCriterion("REPLE not in", values, "reple");
            return (Criteria) this;
        }

        public Criteria andRepleBetween(String value1, String value2) {
            addCriterion("REPLE between", value1, value2, "reple");
            return (Criteria) this;
        }

        public Criteria andRepleNotBetween(String value1, String value2) {
            addCriterion("REPLE not between", value1, value2, "reple");
            return (Criteria) this;
        }

        public Criteria andHandlePeopleIsNull() {
            addCriterion("HANDLE_PEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andHandlePeopleIsNotNull() {
            addCriterion("HANDLE_PEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andHandlePeopleEqualTo(String value) {
            addCriterion("HANDLE_PEOPLE =", value, "handlePeople");
            return (Criteria) this;
        }

        public Criteria andHandlePeopleNotEqualTo(String value) {
            addCriterion("HANDLE_PEOPLE <>", value, "handlePeople");
            return (Criteria) this;
        }

        public Criteria andHandlePeopleGreaterThan(String value) {
            addCriterion("HANDLE_PEOPLE >", value, "handlePeople");
            return (Criteria) this;
        }

        public Criteria andHandlePeopleGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLE_PEOPLE >=", value, "handlePeople");
            return (Criteria) this;
        }

        public Criteria andHandlePeopleLessThan(String value) {
            addCriterion("HANDLE_PEOPLE <", value, "handlePeople");
            return (Criteria) this;
        }

        public Criteria andHandlePeopleLessThanOrEqualTo(String value) {
            addCriterion("HANDLE_PEOPLE <=", value, "handlePeople");
            return (Criteria) this;
        }

        public Criteria andHandlePeopleLike(String value) {
            addCriterion("HANDLE_PEOPLE like", value, "handlePeople");
            return (Criteria) this;
        }

        public Criteria andHandlePeopleNotLike(String value) {
            addCriterion("HANDLE_PEOPLE not like", value, "handlePeople");
            return (Criteria) this;
        }

        public Criteria andHandlePeopleIn(List<String> values) {
            addCriterion("HANDLE_PEOPLE in", values, "handlePeople");
            return (Criteria) this;
        }

        public Criteria andHandlePeopleNotIn(List<String> values) {
            addCriterion("HANDLE_PEOPLE not in", values, "handlePeople");
            return (Criteria) this;
        }

        public Criteria andHandlePeopleBetween(String value1, String value2) {
            addCriterion("HANDLE_PEOPLE between", value1, value2, "handlePeople");
            return (Criteria) this;
        }

        public Criteria andHandlePeopleNotBetween(String value1, String value2) {
            addCriterion("HANDLE_PEOPLE not between", value1, value2, "handlePeople");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNull() {
            addCriterion("HANDLE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNotNull() {
            addCriterion("HANDLE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeEqualTo(Timestamp value) {
            addCriterion("HANDLE_TIME =", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotEqualTo(Timestamp value) {
            addCriterion("HANDLE_TIME <>", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThan(Timestamp value) {
            addCriterion("HANDLE_TIME >", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("HANDLE_TIME >=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThan(Timestamp value) {
            addCriterion("HANDLE_TIME <", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("HANDLE_TIME <=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIn(List<Timestamp> values) {
            addCriterion("HANDLE_TIME in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotIn(List<Timestamp> values) {
            addCriterion("HANDLE_TIME not in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("HANDLE_TIME between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("HANDLE_TIME not between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTypeIsNull() {
            addCriterion("HANDLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andHandleTypeIsNotNull() {
            addCriterion("HANDLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andHandleTypeEqualTo(String value) {
            addCriterion("HANDLE_TYPE =", value, "handleType");
            return (Criteria) this;
        }

        public Criteria andHandleTypeNotEqualTo(String value) {
            addCriterion("HANDLE_TYPE <>", value, "handleType");
            return (Criteria) this;
        }

        public Criteria andHandleTypeGreaterThan(String value) {
            addCriterion("HANDLE_TYPE >", value, "handleType");
            return (Criteria) this;
        }

        public Criteria andHandleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLE_TYPE >=", value, "handleType");
            return (Criteria) this;
        }

        public Criteria andHandleTypeLessThan(String value) {
            addCriterion("HANDLE_TYPE <", value, "handleType");
            return (Criteria) this;
        }

        public Criteria andHandleTypeLessThanOrEqualTo(String value) {
            addCriterion("HANDLE_TYPE <=", value, "handleType");
            return (Criteria) this;
        }

        public Criteria andHandleTypeLike(String value) {
            addCriterion("HANDLE_TYPE like", value, "handleType");
            return (Criteria) this;
        }

        public Criteria andHandleTypeNotLike(String value) {
            addCriterion("HANDLE_TYPE not like", value, "handleType");
            return (Criteria) this;
        }

        public Criteria andHandleTypeIn(List<String> values) {
            addCriterion("HANDLE_TYPE in", values, "handleType");
            return (Criteria) this;
        }

        public Criteria andHandleTypeNotIn(List<String> values) {
            addCriterion("HANDLE_TYPE not in", values, "handleType");
            return (Criteria) this;
        }

        public Criteria andHandleTypeBetween(String value1, String value2) {
            addCriterion("HANDLE_TYPE between", value1, value2, "handleType");
            return (Criteria) this;
        }

        public Criteria andHandleTypeNotBetween(String value1, String value2) {
            addCriterion("HANDLE_TYPE not between", value1, value2, "handleType");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
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