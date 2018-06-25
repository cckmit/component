package com.x.common.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class SysDuadCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysDuadCriteria() {
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

        public Criteria andDuadIdIsNull() {
            addCriterion("duad_id is null");
            return (Criteria) this;
        }

        public Criteria andDuadIdIsNotNull() {
            addCriterion("duad_id is not null");
            return (Criteria) this;
        }

        public Criteria andDuadIdEqualTo(String value) {
            addCriterion("duad_id =", value, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdNotEqualTo(String value) {
            addCriterion("duad_id <>", value, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdGreaterThan(String value) {
            addCriterion("duad_id >", value, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdGreaterThanOrEqualTo(String value) {
            addCriterion("duad_id >=", value, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdLessThan(String value) {
            addCriterion("duad_id <", value, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdLessThanOrEqualTo(String value) {
            addCriterion("duad_id <=", value, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdLike(String value) {
            addCriterion("duad_id like", value, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdNotLike(String value) {
            addCriterion("duad_id not like", value, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdIn(List<String> values) {
            addCriterion("duad_id in", values, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdNotIn(List<String> values) {
            addCriterion("duad_id not in", values, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdBetween(String value1, String value2) {
            addCriterion("duad_id between", value1, value2, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdNotBetween(String value1, String value2) {
            addCriterion("duad_id not between", value1, value2, "duadId");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLike(String value) {
            addCriterion("site like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("site not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("site not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andSourceCodeIsNull() {
            addCriterion("source_code is null");
            return (Criteria) this;
        }

        public Criteria andSourceCodeIsNotNull() {
            addCriterion("source_code is not null");
            return (Criteria) this;
        }

        public Criteria andSourceCodeEqualTo(String value) {
            addCriterion("source_code =", value, "sourceCode");
            return (Criteria) this;
        }

        public Criteria andSourceCodeNotEqualTo(String value) {
            addCriterion("source_code <>", value, "sourceCode");
            return (Criteria) this;
        }

        public Criteria andSourceCodeGreaterThan(String value) {
            addCriterion("source_code >", value, "sourceCode");
            return (Criteria) this;
        }

        public Criteria andSourceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("source_code >=", value, "sourceCode");
            return (Criteria) this;
        }

        public Criteria andSourceCodeLessThan(String value) {
            addCriterion("source_code <", value, "sourceCode");
            return (Criteria) this;
        }

        public Criteria andSourceCodeLessThanOrEqualTo(String value) {
            addCriterion("source_code <=", value, "sourceCode");
            return (Criteria) this;
        }

        public Criteria andSourceCodeLike(String value) {
            addCriterion("source_code like", value, "sourceCode");
            return (Criteria) this;
        }

        public Criteria andSourceCodeNotLike(String value) {
            addCriterion("source_code not like", value, "sourceCode");
            return (Criteria) this;
        }

        public Criteria andSourceCodeIn(List<String> values) {
            addCriterion("source_code in", values, "sourceCode");
            return (Criteria) this;
        }

        public Criteria andSourceCodeNotIn(List<String> values) {
            addCriterion("source_code not in", values, "sourceCode");
            return (Criteria) this;
        }

        public Criteria andSourceCodeBetween(String value1, String value2) {
            addCriterion("source_code between", value1, value2, "sourceCode");
            return (Criteria) this;
        }

        public Criteria andSourceCodeNotBetween(String value1, String value2) {
            addCriterion("source_code not between", value1, value2, "sourceCode");
            return (Criteria) this;
        }

        public Criteria andSourceCnIsNull() {
            addCriterion("source_cn is null");
            return (Criteria) this;
        }

        public Criteria andSourceCnIsNotNull() {
            addCriterion("source_cn is not null");
            return (Criteria) this;
        }

        public Criteria andSourceCnEqualTo(String value) {
            addCriterion("source_cn =", value, "sourceCn");
            return (Criteria) this;
        }

        public Criteria andSourceCnNotEqualTo(String value) {
            addCriterion("source_cn <>", value, "sourceCn");
            return (Criteria) this;
        }

        public Criteria andSourceCnGreaterThan(String value) {
            addCriterion("source_cn >", value, "sourceCn");
            return (Criteria) this;
        }

        public Criteria andSourceCnGreaterThanOrEqualTo(String value) {
            addCriterion("source_cn >=", value, "sourceCn");
            return (Criteria) this;
        }

        public Criteria andSourceCnLessThan(String value) {
            addCriterion("source_cn <", value, "sourceCn");
            return (Criteria) this;
        }

        public Criteria andSourceCnLessThanOrEqualTo(String value) {
            addCriterion("source_cn <=", value, "sourceCn");
            return (Criteria) this;
        }

        public Criteria andSourceCnLike(String value) {
            addCriterion("source_cn like", value, "sourceCn");
            return (Criteria) this;
        }

        public Criteria andSourceCnNotLike(String value) {
            addCriterion("source_cn not like", value, "sourceCn");
            return (Criteria) this;
        }

        public Criteria andSourceCnIn(List<String> values) {
            addCriterion("source_cn in", values, "sourceCn");
            return (Criteria) this;
        }

        public Criteria andSourceCnNotIn(List<String> values) {
            addCriterion("source_cn not in", values, "sourceCn");
            return (Criteria) this;
        }

        public Criteria andSourceCnBetween(String value1, String value2) {
            addCriterion("source_cn between", value1, value2, "sourceCn");
            return (Criteria) this;
        }

        public Criteria andSourceCnNotBetween(String value1, String value2) {
            addCriterion("source_cn not between", value1, value2, "sourceCn");
            return (Criteria) this;
        }

        public Criteria andSourceEnIsNull() {
            addCriterion("source_en is null");
            return (Criteria) this;
        }

        public Criteria andSourceEnIsNotNull() {
            addCriterion("source_en is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEnEqualTo(String value) {
            addCriterion("source_en =", value, "sourceEn");
            return (Criteria) this;
        }

        public Criteria andSourceEnNotEqualTo(String value) {
            addCriterion("source_en <>", value, "sourceEn");
            return (Criteria) this;
        }

        public Criteria andSourceEnGreaterThan(String value) {
            addCriterion("source_en >", value, "sourceEn");
            return (Criteria) this;
        }

        public Criteria andSourceEnGreaterThanOrEqualTo(String value) {
            addCriterion("source_en >=", value, "sourceEn");
            return (Criteria) this;
        }

        public Criteria andSourceEnLessThan(String value) {
            addCriterion("source_en <", value, "sourceEn");
            return (Criteria) this;
        }

        public Criteria andSourceEnLessThanOrEqualTo(String value) {
            addCriterion("source_en <=", value, "sourceEn");
            return (Criteria) this;
        }

        public Criteria andSourceEnLike(String value) {
            addCriterion("source_en like", value, "sourceEn");
            return (Criteria) this;
        }

        public Criteria andSourceEnNotLike(String value) {
            addCriterion("source_en not like", value, "sourceEn");
            return (Criteria) this;
        }

        public Criteria andSourceEnIn(List<String> values) {
            addCriterion("source_en in", values, "sourceEn");
            return (Criteria) this;
        }

        public Criteria andSourceEnNotIn(List<String> values) {
            addCriterion("source_en not in", values, "sourceEn");
            return (Criteria) this;
        }

        public Criteria andSourceEnBetween(String value1, String value2) {
            addCriterion("source_en between", value1, value2, "sourceEn");
            return (Criteria) this;
        }

        public Criteria andSourceEnNotBetween(String value1, String value2) {
            addCriterion("source_en not between", value1, value2, "sourceEn");
            return (Criteria) this;
        }

        public Criteria andTargetCodeIsNull() {
            addCriterion("target_code is null");
            return (Criteria) this;
        }

        public Criteria andTargetCodeIsNotNull() {
            addCriterion("target_code is not null");
            return (Criteria) this;
        }

        public Criteria andTargetCodeEqualTo(String value) {
            addCriterion("target_code =", value, "targetCode");
            return (Criteria) this;
        }

        public Criteria andTargetCodeNotEqualTo(String value) {
            addCriterion("target_code <>", value, "targetCode");
            return (Criteria) this;
        }

        public Criteria andTargetCodeGreaterThan(String value) {
            addCriterion("target_code >", value, "targetCode");
            return (Criteria) this;
        }

        public Criteria andTargetCodeGreaterThanOrEqualTo(String value) {
            addCriterion("target_code >=", value, "targetCode");
            return (Criteria) this;
        }

        public Criteria andTargetCodeLessThan(String value) {
            addCriterion("target_code <", value, "targetCode");
            return (Criteria) this;
        }

        public Criteria andTargetCodeLessThanOrEqualTo(String value) {
            addCriterion("target_code <=", value, "targetCode");
            return (Criteria) this;
        }

        public Criteria andTargetCodeLike(String value) {
            addCriterion("target_code like", value, "targetCode");
            return (Criteria) this;
        }

        public Criteria andTargetCodeNotLike(String value) {
            addCriterion("target_code not like", value, "targetCode");
            return (Criteria) this;
        }

        public Criteria andTargetCodeIn(List<String> values) {
            addCriterion("target_code in", values, "targetCode");
            return (Criteria) this;
        }

        public Criteria andTargetCodeNotIn(List<String> values) {
            addCriterion("target_code not in", values, "targetCode");
            return (Criteria) this;
        }

        public Criteria andTargetCodeBetween(String value1, String value2) {
            addCriterion("target_code between", value1, value2, "targetCode");
            return (Criteria) this;
        }

        public Criteria andTargetCodeNotBetween(String value1, String value2) {
            addCriterion("target_code not between", value1, value2, "targetCode");
            return (Criteria) this;
        }

        public Criteria andTargetCnIsNull() {
            addCriterion("target_cn is null");
            return (Criteria) this;
        }

        public Criteria andTargetCnIsNotNull() {
            addCriterion("target_cn is not null");
            return (Criteria) this;
        }

        public Criteria andTargetCnEqualTo(String value) {
            addCriterion("target_cn =", value, "targetCn");
            return (Criteria) this;
        }

        public Criteria andTargetCnNotEqualTo(String value) {
            addCriterion("target_cn <>", value, "targetCn");
            return (Criteria) this;
        }

        public Criteria andTargetCnGreaterThan(String value) {
            addCriterion("target_cn >", value, "targetCn");
            return (Criteria) this;
        }

        public Criteria andTargetCnGreaterThanOrEqualTo(String value) {
            addCriterion("target_cn >=", value, "targetCn");
            return (Criteria) this;
        }

        public Criteria andTargetCnLessThan(String value) {
            addCriterion("target_cn <", value, "targetCn");
            return (Criteria) this;
        }

        public Criteria andTargetCnLessThanOrEqualTo(String value) {
            addCriterion("target_cn <=", value, "targetCn");
            return (Criteria) this;
        }

        public Criteria andTargetCnLike(String value) {
            addCriterion("target_cn like", value, "targetCn");
            return (Criteria) this;
        }

        public Criteria andTargetCnNotLike(String value) {
            addCriterion("target_cn not like", value, "targetCn");
            return (Criteria) this;
        }

        public Criteria andTargetCnIn(List<String> values) {
            addCriterion("target_cn in", values, "targetCn");
            return (Criteria) this;
        }

        public Criteria andTargetCnNotIn(List<String> values) {
            addCriterion("target_cn not in", values, "targetCn");
            return (Criteria) this;
        }

        public Criteria andTargetCnBetween(String value1, String value2) {
            addCriterion("target_cn between", value1, value2, "targetCn");
            return (Criteria) this;
        }

        public Criteria andTargetCnNotBetween(String value1, String value2) {
            addCriterion("target_cn not between", value1, value2, "targetCn");
            return (Criteria) this;
        }

        public Criteria andTargetEnIsNull() {
            addCriterion("target_en is null");
            return (Criteria) this;
        }

        public Criteria andTargetEnIsNotNull() {
            addCriterion("target_en is not null");
            return (Criteria) this;
        }

        public Criteria andTargetEnEqualTo(String value) {
            addCriterion("target_en =", value, "targetEn");
            return (Criteria) this;
        }

        public Criteria andTargetEnNotEqualTo(String value) {
            addCriterion("target_en <>", value, "targetEn");
            return (Criteria) this;
        }

        public Criteria andTargetEnGreaterThan(String value) {
            addCriterion("target_en >", value, "targetEn");
            return (Criteria) this;
        }

        public Criteria andTargetEnGreaterThanOrEqualTo(String value) {
            addCriterion("target_en >=", value, "targetEn");
            return (Criteria) this;
        }

        public Criteria andTargetEnLessThan(String value) {
            addCriterion("target_en <", value, "targetEn");
            return (Criteria) this;
        }

        public Criteria andTargetEnLessThanOrEqualTo(String value) {
            addCriterion("target_en <=", value, "targetEn");
            return (Criteria) this;
        }

        public Criteria andTargetEnLike(String value) {
            addCriterion("target_en like", value, "targetEn");
            return (Criteria) this;
        }

        public Criteria andTargetEnNotLike(String value) {
            addCriterion("target_en not like", value, "targetEn");
            return (Criteria) this;
        }

        public Criteria andTargetEnIn(List<String> values) {
            addCriterion("target_en in", values, "targetEn");
            return (Criteria) this;
        }

        public Criteria andTargetEnNotIn(List<String> values) {
            addCriterion("target_en not in", values, "targetEn");
            return (Criteria) this;
        }

        public Criteria andTargetEnBetween(String value1, String value2) {
            addCriterion("target_en between", value1, value2, "targetEn");
            return (Criteria) this;
        }

        public Criteria andTargetEnNotBetween(String value1, String value2) {
            addCriterion("target_en not between", value1, value2, "targetEn");
            return (Criteria) this;
        }

        public Criteria andOrdinaryIsNull() {
            addCriterion("ordinary is null");
            return (Criteria) this;
        }

        public Criteria andOrdinaryIsNotNull() {
            addCriterion("ordinary is not null");
            return (Criteria) this;
        }

        public Criteria andOrdinaryEqualTo(String value) {
            addCriterion("ordinary =", value, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNotEqualTo(String value) {
            addCriterion("ordinary <>", value, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryGreaterThan(String value) {
            addCriterion("ordinary >", value, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryGreaterThanOrEqualTo(String value) {
            addCriterion("ordinary >=", value, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryLessThan(String value) {
            addCriterion("ordinary <", value, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryLessThanOrEqualTo(String value) {
            addCriterion("ordinary <=", value, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryLike(String value) {
            addCriterion("ordinary like", value, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNotLike(String value) {
            addCriterion("ordinary not like", value, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryIn(List<String> values) {
            addCriterion("ordinary in", values, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNotIn(List<String> values) {
            addCriterion("ordinary not in", values, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryBetween(String value1, String value2) {
            addCriterion("ordinary between", value1, value2, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNotBetween(String value1, String value2) {
            addCriterion("ordinary not between", value1, value2, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentIsNull() {
            addCriterion("ordinary_urgent is null");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentIsNotNull() {
            addCriterion("ordinary_urgent is not null");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentEqualTo(String value) {
            addCriterion("ordinary_urgent =", value, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentNotEqualTo(String value) {
            addCriterion("ordinary_urgent <>", value, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentGreaterThan(String value) {
            addCriterion("ordinary_urgent >", value, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentGreaterThanOrEqualTo(String value) {
            addCriterion("ordinary_urgent >=", value, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentLessThan(String value) {
            addCriterion("ordinary_urgent <", value, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentLessThanOrEqualTo(String value) {
            addCriterion("ordinary_urgent <=", value, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentLike(String value) {
            addCriterion("ordinary_urgent like", value, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentNotLike(String value) {
            addCriterion("ordinary_urgent not like", value, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentIn(List<String> values) {
            addCriterion("ordinary_urgent in", values, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentNotIn(List<String> values) {
            addCriterion("ordinary_urgent not in", values, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentBetween(String value1, String value2) {
            addCriterion("ordinary_urgent between", value1, value2, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentNotBetween(String value1, String value2) {
            addCriterion("ordinary_urgent not between", value1, value2, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalIsNull() {
            addCriterion("professional is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalIsNotNull() {
            addCriterion("professional is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalEqualTo(String value) {
            addCriterion("professional =", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotEqualTo(String value) {
            addCriterion("professional <>", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalGreaterThan(String value) {
            addCriterion("professional >", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalGreaterThanOrEqualTo(String value) {
            addCriterion("professional >=", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLessThan(String value) {
            addCriterion("professional <", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLessThanOrEqualTo(String value) {
            addCriterion("professional <=", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLike(String value) {
            addCriterion("professional like", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotLike(String value) {
            addCriterion("professional not like", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalIn(List<String> values) {
            addCriterion("professional in", values, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotIn(List<String> values) {
            addCriterion("professional not in", values, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalBetween(String value1, String value2) {
            addCriterion("professional between", value1, value2, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotBetween(String value1, String value2) {
            addCriterion("professional not between", value1, value2, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentIsNull() {
            addCriterion("professional_urgent is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentIsNotNull() {
            addCriterion("professional_urgent is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentEqualTo(String value) {
            addCriterion("professional_urgent =", value, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentNotEqualTo(String value) {
            addCriterion("professional_urgent <>", value, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentGreaterThan(String value) {
            addCriterion("professional_urgent >", value, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentGreaterThanOrEqualTo(String value) {
            addCriterion("professional_urgent >=", value, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentLessThan(String value) {
            addCriterion("professional_urgent <", value, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentLessThanOrEqualTo(String value) {
            addCriterion("professional_urgent <=", value, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentLike(String value) {
            addCriterion("professional_urgent like", value, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentNotLike(String value) {
            addCriterion("professional_urgent not like", value, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentIn(List<String> values) {
            addCriterion("professional_urgent in", values, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentNotIn(List<String> values) {
            addCriterion("professional_urgent not in", values, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentBetween(String value1, String value2) {
            addCriterion("professional_urgent between", value1, value2, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentNotBetween(String value1, String value2) {
            addCriterion("professional_urgent not between", value1, value2, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishIsNull() {
            addCriterion("publish is null");
            return (Criteria) this;
        }

        public Criteria andPublishIsNotNull() {
            addCriterion("publish is not null");
            return (Criteria) this;
        }

        public Criteria andPublishEqualTo(String value) {
            addCriterion("publish =", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotEqualTo(String value) {
            addCriterion("publish <>", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThan(String value) {
            addCriterion("publish >", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThanOrEqualTo(String value) {
            addCriterion("publish >=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThan(String value) {
            addCriterion("publish <", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThanOrEqualTo(String value) {
            addCriterion("publish <=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLike(String value) {
            addCriterion("publish like", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotLike(String value) {
            addCriterion("publish not like", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishIn(List<String> values) {
            addCriterion("publish in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotIn(List<String> values) {
            addCriterion("publish not in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishBetween(String value1, String value2) {
            addCriterion("publish between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotBetween(String value1, String value2) {
            addCriterion("publish not between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentIsNull() {
            addCriterion("publish_urgent is null");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentIsNotNull() {
            addCriterion("publish_urgent is not null");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentEqualTo(String value) {
            addCriterion("publish_urgent =", value, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentNotEqualTo(String value) {
            addCriterion("publish_urgent <>", value, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentGreaterThan(String value) {
            addCriterion("publish_urgent >", value, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentGreaterThanOrEqualTo(String value) {
            addCriterion("publish_urgent >=", value, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentLessThan(String value) {
            addCriterion("publish_urgent <", value, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentLessThanOrEqualTo(String value) {
            addCriterion("publish_urgent <=", value, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentLike(String value) {
            addCriterion("publish_urgent like", value, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentNotLike(String value) {
            addCriterion("publish_urgent not like", value, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentIn(List<String> values) {
            addCriterion("publish_urgent in", values, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentNotIn(List<String> values) {
            addCriterion("publish_urgent not in", values, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentBetween(String value1, String value2) {
            addCriterion("publish_urgent between", value1, value2, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentNotBetween(String value1, String value2) {
            addCriterion("publish_urgent not between", value1, value2, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryDollarIsNull() {
            addCriterion("ordinary_dollar is null");
            return (Criteria) this;
        }

        public Criteria andOrdinaryDollarIsNotNull() {
            addCriterion("ordinary_dollar is not null");
            return (Criteria) this;
        }

        public Criteria andOrdinaryDollarEqualTo(String value) {
            addCriterion("ordinary_dollar =", value, "ordinaryDollar");
            return (Criteria) this;
        }

        public Criteria andOrdinaryDollarNotEqualTo(String value) {
            addCriterion("ordinary_dollar <>", value, "ordinaryDollar");
            return (Criteria) this;
        }

        public Criteria andOrdinaryDollarGreaterThan(String value) {
            addCriterion("ordinary_dollar >", value, "ordinaryDollar");
            return (Criteria) this;
        }

        public Criteria andOrdinaryDollarGreaterThanOrEqualTo(String value) {
            addCriterion("ordinary_dollar >=", value, "ordinaryDollar");
            return (Criteria) this;
        }

        public Criteria andOrdinaryDollarLessThan(String value) {
            addCriterion("ordinary_dollar <", value, "ordinaryDollar");
            return (Criteria) this;
        }

        public Criteria andOrdinaryDollarLessThanOrEqualTo(String value) {
            addCriterion("ordinary_dollar <=", value, "ordinaryDollar");
            return (Criteria) this;
        }

        public Criteria andOrdinaryDollarLike(String value) {
            addCriterion("ordinary_dollar like", value, "ordinaryDollar");
            return (Criteria) this;
        }

        public Criteria andOrdinaryDollarNotLike(String value) {
            addCriterion("ordinary_dollar not like", value, "ordinaryDollar");
            return (Criteria) this;
        }

        public Criteria andOrdinaryDollarIn(List<String> values) {
            addCriterion("ordinary_dollar in", values, "ordinaryDollar");
            return (Criteria) this;
        }

        public Criteria andOrdinaryDollarNotIn(List<String> values) {
            addCriterion("ordinary_dollar not in", values, "ordinaryDollar");
            return (Criteria) this;
        }

        public Criteria andOrdinaryDollarBetween(String value1, String value2) {
            addCriterion("ordinary_dollar between", value1, value2, "ordinaryDollar");
            return (Criteria) this;
        }

        public Criteria andOrdinaryDollarNotBetween(String value1, String value2) {
            addCriterion("ordinary_dollar not between", value1, value2, "ordinaryDollar");
            return (Criteria) this;
        }

        public Criteria andOurgentDollarIsNull() {
            addCriterion("ourgent_dollar is null");
            return (Criteria) this;
        }

        public Criteria andOurgentDollarIsNotNull() {
            addCriterion("ourgent_dollar is not null");
            return (Criteria) this;
        }

        public Criteria andOurgentDollarEqualTo(String value) {
            addCriterion("ourgent_dollar =", value, "ourgentDollar");
            return (Criteria) this;
        }

        public Criteria andOurgentDollarNotEqualTo(String value) {
            addCriterion("ourgent_dollar <>", value, "ourgentDollar");
            return (Criteria) this;
        }

        public Criteria andOurgentDollarGreaterThan(String value) {
            addCriterion("ourgent_dollar >", value, "ourgentDollar");
            return (Criteria) this;
        }

        public Criteria andOurgentDollarGreaterThanOrEqualTo(String value) {
            addCriterion("ourgent_dollar >=", value, "ourgentDollar");
            return (Criteria) this;
        }

        public Criteria andOurgentDollarLessThan(String value) {
            addCriterion("ourgent_dollar <", value, "ourgentDollar");
            return (Criteria) this;
        }

        public Criteria andOurgentDollarLessThanOrEqualTo(String value) {
            addCriterion("ourgent_dollar <=", value, "ourgentDollar");
            return (Criteria) this;
        }

        public Criteria andOurgentDollarLike(String value) {
            addCriterion("ourgent_dollar like", value, "ourgentDollar");
            return (Criteria) this;
        }

        public Criteria andOurgentDollarNotLike(String value) {
            addCriterion("ourgent_dollar not like", value, "ourgentDollar");
            return (Criteria) this;
        }

        public Criteria andOurgentDollarIn(List<String> values) {
            addCriterion("ourgent_dollar in", values, "ourgentDollar");
            return (Criteria) this;
        }

        public Criteria andOurgentDollarNotIn(List<String> values) {
            addCriterion("ourgent_dollar not in", values, "ourgentDollar");
            return (Criteria) this;
        }

        public Criteria andOurgentDollarBetween(String value1, String value2) {
            addCriterion("ourgent_dollar between", value1, value2, "ourgentDollar");
            return (Criteria) this;
        }

        public Criteria andOurgentDollarNotBetween(String value1, String value2) {
            addCriterion("ourgent_dollar not between", value1, value2, "ourgentDollar");
            return (Criteria) this;
        }

        public Criteria andProfessionalDollarIsNull() {
            addCriterion("professional_dollar is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalDollarIsNotNull() {
            addCriterion("professional_dollar is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalDollarEqualTo(String value) {
            addCriterion("professional_dollar =", value, "professionalDollar");
            return (Criteria) this;
        }

        public Criteria andProfessionalDollarNotEqualTo(String value) {
            addCriterion("professional_dollar <>", value, "professionalDollar");
            return (Criteria) this;
        }

        public Criteria andProfessionalDollarGreaterThan(String value) {
            addCriterion("professional_dollar >", value, "professionalDollar");
            return (Criteria) this;
        }

        public Criteria andProfessionalDollarGreaterThanOrEqualTo(String value) {
            addCriterion("professional_dollar >=", value, "professionalDollar");
            return (Criteria) this;
        }

        public Criteria andProfessionalDollarLessThan(String value) {
            addCriterion("professional_dollar <", value, "professionalDollar");
            return (Criteria) this;
        }

        public Criteria andProfessionalDollarLessThanOrEqualTo(String value) {
            addCriterion("professional_dollar <=", value, "professionalDollar");
            return (Criteria) this;
        }

        public Criteria andProfessionalDollarLike(String value) {
            addCriterion("professional_dollar like", value, "professionalDollar");
            return (Criteria) this;
        }

        public Criteria andProfessionalDollarNotLike(String value) {
            addCriterion("professional_dollar not like", value, "professionalDollar");
            return (Criteria) this;
        }

        public Criteria andProfessionalDollarIn(List<String> values) {
            addCriterion("professional_dollar in", values, "professionalDollar");
            return (Criteria) this;
        }

        public Criteria andProfessionalDollarNotIn(List<String> values) {
            addCriterion("professional_dollar not in", values, "professionalDollar");
            return (Criteria) this;
        }

        public Criteria andProfessionalDollarBetween(String value1, String value2) {
            addCriterion("professional_dollar between", value1, value2, "professionalDollar");
            return (Criteria) this;
        }

        public Criteria andProfessionalDollarNotBetween(String value1, String value2) {
            addCriterion("professional_dollar not between", value1, value2, "professionalDollar");
            return (Criteria) this;
        }

        public Criteria andPurgentDollarIsNull() {
            addCriterion("purgent_dollar is null");
            return (Criteria) this;
        }

        public Criteria andPurgentDollarIsNotNull() {
            addCriterion("purgent_dollar is not null");
            return (Criteria) this;
        }

        public Criteria andPurgentDollarEqualTo(String value) {
            addCriterion("purgent_dollar =", value, "purgentDollar");
            return (Criteria) this;
        }

        public Criteria andPurgentDollarNotEqualTo(String value) {
            addCriterion("purgent_dollar <>", value, "purgentDollar");
            return (Criteria) this;
        }

        public Criteria andPurgentDollarGreaterThan(String value) {
            addCriterion("purgent_dollar >", value, "purgentDollar");
            return (Criteria) this;
        }

        public Criteria andPurgentDollarGreaterThanOrEqualTo(String value) {
            addCriterion("purgent_dollar >=", value, "purgentDollar");
            return (Criteria) this;
        }

        public Criteria andPurgentDollarLessThan(String value) {
            addCriterion("purgent_dollar <", value, "purgentDollar");
            return (Criteria) this;
        }

        public Criteria andPurgentDollarLessThanOrEqualTo(String value) {
            addCriterion("purgent_dollar <=", value, "purgentDollar");
            return (Criteria) this;
        }

        public Criteria andPurgentDollarLike(String value) {
            addCriterion("purgent_dollar like", value, "purgentDollar");
            return (Criteria) this;
        }

        public Criteria andPurgentDollarNotLike(String value) {
            addCriterion("purgent_dollar not like", value, "purgentDollar");
            return (Criteria) this;
        }

        public Criteria andPurgentDollarIn(List<String> values) {
            addCriterion("purgent_dollar in", values, "purgentDollar");
            return (Criteria) this;
        }

        public Criteria andPurgentDollarNotIn(List<String> values) {
            addCriterion("purgent_dollar not in", values, "purgentDollar");
            return (Criteria) this;
        }

        public Criteria andPurgentDollarBetween(String value1, String value2) {
            addCriterion("purgent_dollar between", value1, value2, "purgentDollar");
            return (Criteria) this;
        }

        public Criteria andPurgentDollarNotBetween(String value1, String value2) {
            addCriterion("purgent_dollar not between", value1, value2, "purgentDollar");
            return (Criteria) this;
        }

        public Criteria andPublishDollarIsNull() {
            addCriterion("publish_dollar is null");
            return (Criteria) this;
        }

        public Criteria andPublishDollarIsNotNull() {
            addCriterion("publish_dollar is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDollarEqualTo(String value) {
            addCriterion("publish_dollar =", value, "publishDollar");
            return (Criteria) this;
        }

        public Criteria andPublishDollarNotEqualTo(String value) {
            addCriterion("publish_dollar <>", value, "publishDollar");
            return (Criteria) this;
        }

        public Criteria andPublishDollarGreaterThan(String value) {
            addCriterion("publish_dollar >", value, "publishDollar");
            return (Criteria) this;
        }

        public Criteria andPublishDollarGreaterThanOrEqualTo(String value) {
            addCriterion("publish_dollar >=", value, "publishDollar");
            return (Criteria) this;
        }

        public Criteria andPublishDollarLessThan(String value) {
            addCriterion("publish_dollar <", value, "publishDollar");
            return (Criteria) this;
        }

        public Criteria andPublishDollarLessThanOrEqualTo(String value) {
            addCriterion("publish_dollar <=", value, "publishDollar");
            return (Criteria) this;
        }

        public Criteria andPublishDollarLike(String value) {
            addCriterion("publish_dollar like", value, "publishDollar");
            return (Criteria) this;
        }

        public Criteria andPublishDollarNotLike(String value) {
            addCriterion("publish_dollar not like", value, "publishDollar");
            return (Criteria) this;
        }

        public Criteria andPublishDollarIn(List<String> values) {
            addCriterion("publish_dollar in", values, "publishDollar");
            return (Criteria) this;
        }

        public Criteria andPublishDollarNotIn(List<String> values) {
            addCriterion("publish_dollar not in", values, "publishDollar");
            return (Criteria) this;
        }

        public Criteria andPublishDollarBetween(String value1, String value2) {
            addCriterion("publish_dollar between", value1, value2, "publishDollar");
            return (Criteria) this;
        }

        public Criteria andPublishDollarNotBetween(String value1, String value2) {
            addCriterion("publish_dollar not between", value1, value2, "publishDollar");
            return (Criteria) this;
        }

        public Criteria andPuburgentDollarIsNull() {
            addCriterion("puburgent_dollar is null");
            return (Criteria) this;
        }

        public Criteria andPuburgentDollarIsNotNull() {
            addCriterion("puburgent_dollar is not null");
            return (Criteria) this;
        }

        public Criteria andPuburgentDollarEqualTo(String value) {
            addCriterion("puburgent_dollar =", value, "puburgentDollar");
            return (Criteria) this;
        }

        public Criteria andPuburgentDollarNotEqualTo(String value) {
            addCriterion("puburgent_dollar <>", value, "puburgentDollar");
            return (Criteria) this;
        }

        public Criteria andPuburgentDollarGreaterThan(String value) {
            addCriterion("puburgent_dollar >", value, "puburgentDollar");
            return (Criteria) this;
        }

        public Criteria andPuburgentDollarGreaterThanOrEqualTo(String value) {
            addCriterion("puburgent_dollar >=", value, "puburgentDollar");
            return (Criteria) this;
        }

        public Criteria andPuburgentDollarLessThan(String value) {
            addCriterion("puburgent_dollar <", value, "puburgentDollar");
            return (Criteria) this;
        }

        public Criteria andPuburgentDollarLessThanOrEqualTo(String value) {
            addCriterion("puburgent_dollar <=", value, "puburgentDollar");
            return (Criteria) this;
        }

        public Criteria andPuburgentDollarLike(String value) {
            addCriterion("puburgent_dollar like", value, "puburgentDollar");
            return (Criteria) this;
        }

        public Criteria andPuburgentDollarNotLike(String value) {
            addCriterion("puburgent_dollar not like", value, "puburgentDollar");
            return (Criteria) this;
        }

        public Criteria andPuburgentDollarIn(List<String> values) {
            addCriterion("puburgent_dollar in", values, "puburgentDollar");
            return (Criteria) this;
        }

        public Criteria andPuburgentDollarNotIn(List<String> values) {
            addCriterion("puburgent_dollar not in", values, "puburgentDollar");
            return (Criteria) this;
        }

        public Criteria andPuburgentDollarBetween(String value1, String value2) {
            addCriterion("puburgent_dollar between", value1, value2, "puburgentDollar");
            return (Criteria) this;
        }

        public Criteria andPuburgentDollarNotBetween(String value1, String value2) {
            addCriterion("puburgent_dollar not between", value1, value2, "puburgentDollar");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(String value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(String value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(String value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(String value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(String value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(String value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLike(String value) {
            addCriterion("sort like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotLike(String value) {
            addCriterion("sort not like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<String> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<String> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(String value1, String value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(String value1, String value2) {
            addCriterion("sort not between", value1, value2, "sort");
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

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Long value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Long value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Long value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Long value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Long value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Long> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Long> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Long value1, Long value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Long value1, Long value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIsNull() {
            addCriterion("create_operator is null");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIsNotNull() {
            addCriterion("create_operator is not null");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorEqualTo(String value) {
            addCriterion("create_operator =", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorNotEqualTo(String value) {
            addCriterion("create_operator <>", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorGreaterThan(String value) {
            addCriterion("create_operator >", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("create_operator >=", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorLessThan(String value) {
            addCriterion("create_operator <", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorLessThanOrEqualTo(String value) {
            addCriterion("create_operator <=", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorLike(String value) {
            addCriterion("create_operator like", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorNotLike(String value) {
            addCriterion("create_operator not like", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIn(List<String> values) {
            addCriterion("create_operator in", values, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorNotIn(List<String> values) {
            addCriterion("create_operator not in", values, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorBetween(String value1, String value2) {
            addCriterion("create_operator between", value1, value2, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorNotBetween(String value1, String value2) {
            addCriterion("create_operator not between", value1, value2, "createOperator");
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