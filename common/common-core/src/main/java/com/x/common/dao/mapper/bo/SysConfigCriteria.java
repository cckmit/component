package com.x.common.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class SysConfigCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysConfigCriteria() {
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

        public Criteria andConfigIdIsNull() {
            addCriterion("config_id is null");
            return (Criteria) this;
        }

        public Criteria andConfigIdIsNotNull() {
            addCriterion("config_id is not null");
            return (Criteria) this;
        }

        public Criteria andConfigIdEqualTo(String value) {
            addCriterion("config_id =", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotEqualTo(String value) {
            addCriterion("config_id <>", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThan(String value) {
            addCriterion("config_id >", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThanOrEqualTo(String value) {
            addCriterion("config_id >=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThan(String value) {
            addCriterion("config_id <", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThanOrEqualTo(String value) {
            addCriterion("config_id <=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLike(String value) {
            addCriterion("config_id like", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotLike(String value) {
            addCriterion("config_id not like", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdIn(List<String> values) {
            addCriterion("config_id in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotIn(List<String> values) {
            addCriterion("config_id not in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdBetween(String value1, String value2) {
            addCriterion("config_id between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotBetween(String value1, String value2) {
            addCriterion("config_id not between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andOrdinaryMemberIsNull() {
            addCriterion("ordinary_member is null");
            return (Criteria) this;
        }

        public Criteria andOrdinaryMemberIsNotNull() {
            addCriterion("ordinary_member is not null");
            return (Criteria) this;
        }

        public Criteria andOrdinaryMemberEqualTo(String value) {
            addCriterion("ordinary_member =", value, "ordinaryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinaryMemberNotEqualTo(String value) {
            addCriterion("ordinary_member <>", value, "ordinaryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinaryMemberGreaterThan(String value) {
            addCriterion("ordinary_member >", value, "ordinaryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinaryMemberGreaterThanOrEqualTo(String value) {
            addCriterion("ordinary_member >=", value, "ordinaryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinaryMemberLessThan(String value) {
            addCriterion("ordinary_member <", value, "ordinaryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinaryMemberLessThanOrEqualTo(String value) {
            addCriterion("ordinary_member <=", value, "ordinaryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinaryMemberLike(String value) {
            addCriterion("ordinary_member like", value, "ordinaryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinaryMemberNotLike(String value) {
            addCriterion("ordinary_member not like", value, "ordinaryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinaryMemberIn(List<String> values) {
            addCriterion("ordinary_member in", values, "ordinaryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinaryMemberNotIn(List<String> values) {
            addCriterion("ordinary_member not in", values, "ordinaryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinaryMemberBetween(String value1, String value2) {
            addCriterion("ordinary_member between", value1, value2, "ordinaryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinaryMemberNotBetween(String value1, String value2) {
            addCriterion("ordinary_member not between", value1, value2, "ordinaryMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberIsNull() {
            addCriterion("gold_member is null");
            return (Criteria) this;
        }

        public Criteria andGoldMemberIsNotNull() {
            addCriterion("gold_member is not null");
            return (Criteria) this;
        }

        public Criteria andGoldMemberEqualTo(String value) {
            addCriterion("gold_member =", value, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberNotEqualTo(String value) {
            addCriterion("gold_member <>", value, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberGreaterThan(String value) {
            addCriterion("gold_member >", value, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberGreaterThanOrEqualTo(String value) {
            addCriterion("gold_member >=", value, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberLessThan(String value) {
            addCriterion("gold_member <", value, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberLessThanOrEqualTo(String value) {
            addCriterion("gold_member <=", value, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberLike(String value) {
            addCriterion("gold_member like", value, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberNotLike(String value) {
            addCriterion("gold_member not like", value, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberIn(List<String> values) {
            addCriterion("gold_member in", values, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberNotIn(List<String> values) {
            addCriterion("gold_member not in", values, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberBetween(String value1, String value2) {
            addCriterion("gold_member between", value1, value2, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberNotBetween(String value1, String value2) {
            addCriterion("gold_member not between", value1, value2, "goldMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberIsNull() {
            addCriterion("platinum_member is null");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberIsNotNull() {
            addCriterion("platinum_member is not null");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberEqualTo(String value) {
            addCriterion("platinum_member =", value, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberNotEqualTo(String value) {
            addCriterion("platinum_member <>", value, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberGreaterThan(String value) {
            addCriterion("platinum_member >", value, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberGreaterThanOrEqualTo(String value) {
            addCriterion("platinum_member >=", value, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberLessThan(String value) {
            addCriterion("platinum_member <", value, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberLessThanOrEqualTo(String value) {
            addCriterion("platinum_member <=", value, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberLike(String value) {
            addCriterion("platinum_member like", value, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberNotLike(String value) {
            addCriterion("platinum_member not like", value, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberIn(List<String> values) {
            addCriterion("platinum_member in", values, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberNotIn(List<String> values) {
            addCriterion("platinum_member not in", values, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberBetween(String value1, String value2) {
            addCriterion("platinum_member between", value1, value2, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberNotBetween(String value1, String value2) {
            addCriterion("platinum_member not between", value1, value2, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andMasonryMemberIsNull() {
            addCriterion("masonry_member is null");
            return (Criteria) this;
        }

        public Criteria andMasonryMemberIsNotNull() {
            addCriterion("masonry_member is not null");
            return (Criteria) this;
        }

        public Criteria andMasonryMemberEqualTo(String value) {
            addCriterion("masonry_member =", value, "masonryMember");
            return (Criteria) this;
        }

        public Criteria andMasonryMemberNotEqualTo(String value) {
            addCriterion("masonry_member <>", value, "masonryMember");
            return (Criteria) this;
        }

        public Criteria andMasonryMemberGreaterThan(String value) {
            addCriterion("masonry_member >", value, "masonryMember");
            return (Criteria) this;
        }

        public Criteria andMasonryMemberGreaterThanOrEqualTo(String value) {
            addCriterion("masonry_member >=", value, "masonryMember");
            return (Criteria) this;
        }

        public Criteria andMasonryMemberLessThan(String value) {
            addCriterion("masonry_member <", value, "masonryMember");
            return (Criteria) this;
        }

        public Criteria andMasonryMemberLessThanOrEqualTo(String value) {
            addCriterion("masonry_member <=", value, "masonryMember");
            return (Criteria) this;
        }

        public Criteria andMasonryMemberLike(String value) {
            addCriterion("masonry_member like", value, "masonryMember");
            return (Criteria) this;
        }

        public Criteria andMasonryMemberNotLike(String value) {
            addCriterion("masonry_member not like", value, "masonryMember");
            return (Criteria) this;
        }

        public Criteria andMasonryMemberIn(List<String> values) {
            addCriterion("masonry_member in", values, "masonryMember");
            return (Criteria) this;
        }

        public Criteria andMasonryMemberNotIn(List<String> values) {
            addCriterion("masonry_member not in", values, "masonryMember");
            return (Criteria) this;
        }

        public Criteria andMasonryMemberBetween(String value1, String value2) {
            addCriterion("masonry_member between", value1, value2, "masonryMember");
            return (Criteria) this;
        }

        public Criteria andMasonryMemberNotBetween(String value1, String value2) {
            addCriterion("masonry_member not between", value1, value2, "masonryMember");
            return (Criteria) this;
        }

        public Criteria andCapValueIsNull() {
            addCriterion("cap_value is null");
            return (Criteria) this;
        }

        public Criteria andCapValueIsNotNull() {
            addCriterion("cap_value is not null");
            return (Criteria) this;
        }

        public Criteria andCapValueEqualTo(String value) {
            addCriterion("cap_value =", value, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueNotEqualTo(String value) {
            addCriterion("cap_value <>", value, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueGreaterThan(String value) {
            addCriterion("cap_value >", value, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueGreaterThanOrEqualTo(String value) {
            addCriterion("cap_value >=", value, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueLessThan(String value) {
            addCriterion("cap_value <", value, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueLessThanOrEqualTo(String value) {
            addCriterion("cap_value <=", value, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueLike(String value) {
            addCriterion("cap_value like", value, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueNotLike(String value) {
            addCriterion("cap_value not like", value, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueIn(List<String> values) {
            addCriterion("cap_value in", values, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueNotIn(List<String> values) {
            addCriterion("cap_value not in", values, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueBetween(String value1, String value2) {
            addCriterion("cap_value between", value1, value2, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueNotBetween(String value1, String value2) {
            addCriterion("cap_value not between", value1, value2, "capValue");
            return (Criteria) this;
        }

        public Criteria andV1PointsIsNull() {
            addCriterion("v1_points is null");
            return (Criteria) this;
        }

        public Criteria andV1PointsIsNotNull() {
            addCriterion("v1_points is not null");
            return (Criteria) this;
        }

        public Criteria andV1PointsEqualTo(String value) {
            addCriterion("v1_points =", value, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsNotEqualTo(String value) {
            addCriterion("v1_points <>", value, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsGreaterThan(String value) {
            addCriterion("v1_points >", value, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsGreaterThanOrEqualTo(String value) {
            addCriterion("v1_points >=", value, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsLessThan(String value) {
            addCriterion("v1_points <", value, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsLessThanOrEqualTo(String value) {
            addCriterion("v1_points <=", value, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsLike(String value) {
            addCriterion("v1_points like", value, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsNotLike(String value) {
            addCriterion("v1_points not like", value, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsIn(List<String> values) {
            addCriterion("v1_points in", values, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsNotIn(List<String> values) {
            addCriterion("v1_points not in", values, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsBetween(String value1, String value2) {
            addCriterion("v1_points between", value1, value2, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsNotBetween(String value1, String value2) {
            addCriterion("v1_points not between", value1, value2, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsIsNull() {
            addCriterion("v2_points is null");
            return (Criteria) this;
        }

        public Criteria andV2PointsIsNotNull() {
            addCriterion("v2_points is not null");
            return (Criteria) this;
        }

        public Criteria andV2PointsEqualTo(String value) {
            addCriterion("v2_points =", value, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsNotEqualTo(String value) {
            addCriterion("v2_points <>", value, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsGreaterThan(String value) {
            addCriterion("v2_points >", value, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsGreaterThanOrEqualTo(String value) {
            addCriterion("v2_points >=", value, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsLessThan(String value) {
            addCriterion("v2_points <", value, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsLessThanOrEqualTo(String value) {
            addCriterion("v2_points <=", value, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsLike(String value) {
            addCriterion("v2_points like", value, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsNotLike(String value) {
            addCriterion("v2_points not like", value, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsIn(List<String> values) {
            addCriterion("v2_points in", values, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsNotIn(List<String> values) {
            addCriterion("v2_points not in", values, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsBetween(String value1, String value2) {
            addCriterion("v2_points between", value1, value2, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsNotBetween(String value1, String value2) {
            addCriterion("v2_points not between", value1, value2, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsIsNull() {
            addCriterion("v3_points is null");
            return (Criteria) this;
        }

        public Criteria andV3PointsIsNotNull() {
            addCriterion("v3_points is not null");
            return (Criteria) this;
        }

        public Criteria andV3PointsEqualTo(String value) {
            addCriterion("v3_points =", value, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsNotEqualTo(String value) {
            addCriterion("v3_points <>", value, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsGreaterThan(String value) {
            addCriterion("v3_points >", value, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsGreaterThanOrEqualTo(String value) {
            addCriterion("v3_points >=", value, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsLessThan(String value) {
            addCriterion("v3_points <", value, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsLessThanOrEqualTo(String value) {
            addCriterion("v3_points <=", value, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsLike(String value) {
            addCriterion("v3_points like", value, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsNotLike(String value) {
            addCriterion("v3_points not like", value, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsIn(List<String> values) {
            addCriterion("v3_points in", values, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsNotIn(List<String> values) {
            addCriterion("v3_points not in", values, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsBetween(String value1, String value2) {
            addCriterion("v3_points between", value1, value2, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsNotBetween(String value1, String value2) {
            addCriterion("v3_points not between", value1, value2, "v3Points");
            return (Criteria) this;
        }

        public Criteria andLspPointsIsNull() {
            addCriterion("lsp_points is null");
            return (Criteria) this;
        }

        public Criteria andLspPointsIsNotNull() {
            addCriterion("lsp_points is not null");
            return (Criteria) this;
        }

        public Criteria andLspPointsEqualTo(String value) {
            addCriterion("lsp_points =", value, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsNotEqualTo(String value) {
            addCriterion("lsp_points <>", value, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsGreaterThan(String value) {
            addCriterion("lsp_points >", value, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsGreaterThanOrEqualTo(String value) {
            addCriterion("lsp_points >=", value, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsLessThan(String value) {
            addCriterion("lsp_points <", value, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsLessThanOrEqualTo(String value) {
            addCriterion("lsp_points <=", value, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsLike(String value) {
            addCriterion("lsp_points like", value, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsNotLike(String value) {
            addCriterion("lsp_points not like", value, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsIn(List<String> values) {
            addCriterion("lsp_points in", values, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsNotIn(List<String> values) {
            addCriterion("lsp_points not in", values, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsBetween(String value1, String value2) {
            addCriterion("lsp_points between", value1, value2, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsNotBetween(String value1, String value2) {
            addCriterion("lsp_points not between", value1, value2, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLgdataNumIsNull() {
            addCriterion("lgdata_num is null");
            return (Criteria) this;
        }

        public Criteria andLgdataNumIsNotNull() {
            addCriterion("lgdata_num is not null");
            return (Criteria) this;
        }

        public Criteria andLgdataNumEqualTo(String value) {
            addCriterion("lgdata_num =", value, "lgdataNum");
            return (Criteria) this;
        }

        public Criteria andLgdataNumNotEqualTo(String value) {
            addCriterion("lgdata_num <>", value, "lgdataNum");
            return (Criteria) this;
        }

        public Criteria andLgdataNumGreaterThan(String value) {
            addCriterion("lgdata_num >", value, "lgdataNum");
            return (Criteria) this;
        }

        public Criteria andLgdataNumGreaterThanOrEqualTo(String value) {
            addCriterion("lgdata_num >=", value, "lgdataNum");
            return (Criteria) this;
        }

        public Criteria andLgdataNumLessThan(String value) {
            addCriterion("lgdata_num <", value, "lgdataNum");
            return (Criteria) this;
        }

        public Criteria andLgdataNumLessThanOrEqualTo(String value) {
            addCriterion("lgdata_num <=", value, "lgdataNum");
            return (Criteria) this;
        }

        public Criteria andLgdataNumLike(String value) {
            addCriterion("lgdata_num like", value, "lgdataNum");
            return (Criteria) this;
        }

        public Criteria andLgdataNumNotLike(String value) {
            addCriterion("lgdata_num not like", value, "lgdataNum");
            return (Criteria) this;
        }

        public Criteria andLgdataNumIn(List<String> values) {
            addCriterion("lgdata_num in", values, "lgdataNum");
            return (Criteria) this;
        }

        public Criteria andLgdataNumNotIn(List<String> values) {
            addCriterion("lgdata_num not in", values, "lgdataNum");
            return (Criteria) this;
        }

        public Criteria andLgdataNumBetween(String value1, String value2) {
            addCriterion("lgdata_num between", value1, value2, "lgdataNum");
            return (Criteria) this;
        }

        public Criteria andLgdataNumNotBetween(String value1, String value2) {
            addCriterion("lgdata_num not between", value1, value2, "lgdataNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumIsNull() {
            addCriterion("custom_num is null");
            return (Criteria) this;
        }

        public Criteria andCustomNumIsNotNull() {
            addCriterion("custom_num is not null");
            return (Criteria) this;
        }

        public Criteria andCustomNumEqualTo(String value) {
            addCriterion("custom_num =", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumNotEqualTo(String value) {
            addCriterion("custom_num <>", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumGreaterThan(String value) {
            addCriterion("custom_num >", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumGreaterThanOrEqualTo(String value) {
            addCriterion("custom_num >=", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumLessThan(String value) {
            addCriterion("custom_num <", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumLessThanOrEqualTo(String value) {
            addCriterion("custom_num <=", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumLike(String value) {
            addCriterion("custom_num like", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumNotLike(String value) {
            addCriterion("custom_num not like", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumIn(List<String> values) {
            addCriterion("custom_num in", values, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumNotIn(List<String> values) {
            addCriterion("custom_num not in", values, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumBetween(String value1, String value2) {
            addCriterion("custom_num between", value1, value2, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumNotBetween(String value1, String value2) {
            addCriterion("custom_num not between", value1, value2, "customNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumIsNull() {
            addCriterion("Interpreter_num is null");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumIsNotNull() {
            addCriterion("Interpreter_num is not null");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumEqualTo(String value) {
            addCriterion("Interpreter_num =", value, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumNotEqualTo(String value) {
            addCriterion("Interpreter_num <>", value, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumGreaterThan(String value) {
            addCriterion("Interpreter_num >", value, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumGreaterThanOrEqualTo(String value) {
            addCriterion("Interpreter_num >=", value, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumLessThan(String value) {
            addCriterion("Interpreter_num <", value, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumLessThanOrEqualTo(String value) {
            addCriterion("Interpreter_num <=", value, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumLike(String value) {
            addCriterion("Interpreter_num like", value, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumNotLike(String value) {
            addCriterion("Interpreter_num not like", value, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumIn(List<String> values) {
            addCriterion("Interpreter_num in", values, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumNotIn(List<String> values) {
            addCriterion("Interpreter_num not in", values, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumBetween(String value1, String value2) {
            addCriterion("Interpreter_num between", value1, value2, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumNotBetween(String value1, String value2) {
            addCriterion("Interpreter_num not between", value1, value2, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(String value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(String value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(String value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(String value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(String value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLike(String value) {
            addCriterion("order_num like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotLike(String value) {
            addCriterion("order_num not like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<String> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<String> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(String value1, String value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(String value1, String value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumIsNull() {
            addCriterion("language_num is null");
            return (Criteria) this;
        }

        public Criteria andLanguageNumIsNotNull() {
            addCriterion("language_num is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageNumEqualTo(String value) {
            addCriterion("language_num =", value, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumNotEqualTo(String value) {
            addCriterion("language_num <>", value, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumGreaterThan(String value) {
            addCriterion("language_num >", value, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumGreaterThanOrEqualTo(String value) {
            addCriterion("language_num >=", value, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumLessThan(String value) {
            addCriterion("language_num <", value, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumLessThanOrEqualTo(String value) {
            addCriterion("language_num <=", value, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumLike(String value) {
            addCriterion("language_num like", value, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumNotLike(String value) {
            addCriterion("language_num not like", value, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumIn(List<String> values) {
            addCriterion("language_num in", values, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumNotIn(List<String> values) {
            addCriterion("language_num not in", values, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumBetween(String value1, String value2) {
            addCriterion("language_num between", value1, value2, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumNotBetween(String value1, String value2) {
            addCriterion("language_num not between", value1, value2, "languageNum");
            return (Criteria) this;
        }

        public Criteria andOnedayIsNull() {
            addCriterion("oneday is null");
            return (Criteria) this;
        }

        public Criteria andOnedayIsNotNull() {
            addCriterion("oneday is not null");
            return (Criteria) this;
        }

        public Criteria andOnedayEqualTo(String value) {
            addCriterion("oneday =", value, "oneday");
            return (Criteria) this;
        }

        public Criteria andOnedayNotEqualTo(String value) {
            addCriterion("oneday <>", value, "oneday");
            return (Criteria) this;
        }

        public Criteria andOnedayGreaterThan(String value) {
            addCriterion("oneday >", value, "oneday");
            return (Criteria) this;
        }

        public Criteria andOnedayGreaterThanOrEqualTo(String value) {
            addCriterion("oneday >=", value, "oneday");
            return (Criteria) this;
        }

        public Criteria andOnedayLessThan(String value) {
            addCriterion("oneday <", value, "oneday");
            return (Criteria) this;
        }

        public Criteria andOnedayLessThanOrEqualTo(String value) {
            addCriterion("oneday <=", value, "oneday");
            return (Criteria) this;
        }

        public Criteria andOnedayLike(String value) {
            addCriterion("oneday like", value, "oneday");
            return (Criteria) this;
        }

        public Criteria andOnedayNotLike(String value) {
            addCriterion("oneday not like", value, "oneday");
            return (Criteria) this;
        }

        public Criteria andOnedayIn(List<String> values) {
            addCriterion("oneday in", values, "oneday");
            return (Criteria) this;
        }

        public Criteria andOnedayNotIn(List<String> values) {
            addCriterion("oneday not in", values, "oneday");
            return (Criteria) this;
        }

        public Criteria andOnedayBetween(String value1, String value2) {
            addCriterion("oneday between", value1, value2, "oneday");
            return (Criteria) this;
        }

        public Criteria andOnedayNotBetween(String value1, String value2) {
            addCriterion("oneday not between", value1, value2, "oneday");
            return (Criteria) this;
        }

        public Criteria andTwodayIsNull() {
            addCriterion("twoday is null");
            return (Criteria) this;
        }

        public Criteria andTwodayIsNotNull() {
            addCriterion("twoday is not null");
            return (Criteria) this;
        }

        public Criteria andTwodayEqualTo(String value) {
            addCriterion("twoday =", value, "twoday");
            return (Criteria) this;
        }

        public Criteria andTwodayNotEqualTo(String value) {
            addCriterion("twoday <>", value, "twoday");
            return (Criteria) this;
        }

        public Criteria andTwodayGreaterThan(String value) {
            addCriterion("twoday >", value, "twoday");
            return (Criteria) this;
        }

        public Criteria andTwodayGreaterThanOrEqualTo(String value) {
            addCriterion("twoday >=", value, "twoday");
            return (Criteria) this;
        }

        public Criteria andTwodayLessThan(String value) {
            addCriterion("twoday <", value, "twoday");
            return (Criteria) this;
        }

        public Criteria andTwodayLessThanOrEqualTo(String value) {
            addCriterion("twoday <=", value, "twoday");
            return (Criteria) this;
        }

        public Criteria andTwodayLike(String value) {
            addCriterion("twoday like", value, "twoday");
            return (Criteria) this;
        }

        public Criteria andTwodayNotLike(String value) {
            addCriterion("twoday not like", value, "twoday");
            return (Criteria) this;
        }

        public Criteria andTwodayIn(List<String> values) {
            addCriterion("twoday in", values, "twoday");
            return (Criteria) this;
        }

        public Criteria andTwodayNotIn(List<String> values) {
            addCriterion("twoday not in", values, "twoday");
            return (Criteria) this;
        }

        public Criteria andTwodayBetween(String value1, String value2) {
            addCriterion("twoday between", value1, value2, "twoday");
            return (Criteria) this;
        }

        public Criteria andTwodayNotBetween(String value1, String value2) {
            addCriterion("twoday not between", value1, value2, "twoday");
            return (Criteria) this;
        }

        public Criteria andThreedayIsNull() {
            addCriterion("threeday is null");
            return (Criteria) this;
        }

        public Criteria andThreedayIsNotNull() {
            addCriterion("threeday is not null");
            return (Criteria) this;
        }

        public Criteria andThreedayEqualTo(String value) {
            addCriterion("threeday =", value, "threeday");
            return (Criteria) this;
        }

        public Criteria andThreedayNotEqualTo(String value) {
            addCriterion("threeday <>", value, "threeday");
            return (Criteria) this;
        }

        public Criteria andThreedayGreaterThan(String value) {
            addCriterion("threeday >", value, "threeday");
            return (Criteria) this;
        }

        public Criteria andThreedayGreaterThanOrEqualTo(String value) {
            addCriterion("threeday >=", value, "threeday");
            return (Criteria) this;
        }

        public Criteria andThreedayLessThan(String value) {
            addCriterion("threeday <", value, "threeday");
            return (Criteria) this;
        }

        public Criteria andThreedayLessThanOrEqualTo(String value) {
            addCriterion("threeday <=", value, "threeday");
            return (Criteria) this;
        }

        public Criteria andThreedayLike(String value) {
            addCriterion("threeday like", value, "threeday");
            return (Criteria) this;
        }

        public Criteria andThreedayNotLike(String value) {
            addCriterion("threeday not like", value, "threeday");
            return (Criteria) this;
        }

        public Criteria andThreedayIn(List<String> values) {
            addCriterion("threeday in", values, "threeday");
            return (Criteria) this;
        }

        public Criteria andThreedayNotIn(List<String> values) {
            addCriterion("threeday not in", values, "threeday");
            return (Criteria) this;
        }

        public Criteria andThreedayBetween(String value1, String value2) {
            addCriterion("threeday between", value1, value2, "threeday");
            return (Criteria) this;
        }

        public Criteria andThreedayNotBetween(String value1, String value2) {
            addCriterion("threeday not between", value1, value2, "threeday");
            return (Criteria) this;
        }

        public Criteria andFourdayIsNull() {
            addCriterion("fourday is null");
            return (Criteria) this;
        }

        public Criteria andFourdayIsNotNull() {
            addCriterion("fourday is not null");
            return (Criteria) this;
        }

        public Criteria andFourdayEqualTo(String value) {
            addCriterion("fourday =", value, "fourday");
            return (Criteria) this;
        }

        public Criteria andFourdayNotEqualTo(String value) {
            addCriterion("fourday <>", value, "fourday");
            return (Criteria) this;
        }

        public Criteria andFourdayGreaterThan(String value) {
            addCriterion("fourday >", value, "fourday");
            return (Criteria) this;
        }

        public Criteria andFourdayGreaterThanOrEqualTo(String value) {
            addCriterion("fourday >=", value, "fourday");
            return (Criteria) this;
        }

        public Criteria andFourdayLessThan(String value) {
            addCriterion("fourday <", value, "fourday");
            return (Criteria) this;
        }

        public Criteria andFourdayLessThanOrEqualTo(String value) {
            addCriterion("fourday <=", value, "fourday");
            return (Criteria) this;
        }

        public Criteria andFourdayLike(String value) {
            addCriterion("fourday like", value, "fourday");
            return (Criteria) this;
        }

        public Criteria andFourdayNotLike(String value) {
            addCriterion("fourday not like", value, "fourday");
            return (Criteria) this;
        }

        public Criteria andFourdayIn(List<String> values) {
            addCriterion("fourday in", values, "fourday");
            return (Criteria) this;
        }

        public Criteria andFourdayNotIn(List<String> values) {
            addCriterion("fourday not in", values, "fourday");
            return (Criteria) this;
        }

        public Criteria andFourdayBetween(String value1, String value2) {
            addCriterion("fourday between", value1, value2, "fourday");
            return (Criteria) this;
        }

        public Criteria andFourdayNotBetween(String value1, String value2) {
            addCriterion("fourday not between", value1, value2, "fourday");
            return (Criteria) this;
        }

        public Criteria andFivedayIsNull() {
            addCriterion("fiveday is null");
            return (Criteria) this;
        }

        public Criteria andFivedayIsNotNull() {
            addCriterion("fiveday is not null");
            return (Criteria) this;
        }

        public Criteria andFivedayEqualTo(String value) {
            addCriterion("fiveday =", value, "fiveday");
            return (Criteria) this;
        }

        public Criteria andFivedayNotEqualTo(String value) {
            addCriterion("fiveday <>", value, "fiveday");
            return (Criteria) this;
        }

        public Criteria andFivedayGreaterThan(String value) {
            addCriterion("fiveday >", value, "fiveday");
            return (Criteria) this;
        }

        public Criteria andFivedayGreaterThanOrEqualTo(String value) {
            addCriterion("fiveday >=", value, "fiveday");
            return (Criteria) this;
        }

        public Criteria andFivedayLessThan(String value) {
            addCriterion("fiveday <", value, "fiveday");
            return (Criteria) this;
        }

        public Criteria andFivedayLessThanOrEqualTo(String value) {
            addCriterion("fiveday <=", value, "fiveday");
            return (Criteria) this;
        }

        public Criteria andFivedayLike(String value) {
            addCriterion("fiveday like", value, "fiveday");
            return (Criteria) this;
        }

        public Criteria andFivedayNotLike(String value) {
            addCriterion("fiveday not like", value, "fiveday");
            return (Criteria) this;
        }

        public Criteria andFivedayIn(List<String> values) {
            addCriterion("fiveday in", values, "fiveday");
            return (Criteria) this;
        }

        public Criteria andFivedayNotIn(List<String> values) {
            addCriterion("fiveday not in", values, "fiveday");
            return (Criteria) this;
        }

        public Criteria andFivedayBetween(String value1, String value2) {
            addCriterion("fiveday between", value1, value2, "fiveday");
            return (Criteria) this;
        }

        public Criteria andFivedayNotBetween(String value1, String value2) {
            addCriterion("fiveday not between", value1, value2, "fiveday");
            return (Criteria) this;
        }

        public Criteria andSixdayIsNull() {
            addCriterion("sixday is null");
            return (Criteria) this;
        }

        public Criteria andSixdayIsNotNull() {
            addCriterion("sixday is not null");
            return (Criteria) this;
        }

        public Criteria andSixdayEqualTo(String value) {
            addCriterion("sixday =", value, "sixday");
            return (Criteria) this;
        }

        public Criteria andSixdayNotEqualTo(String value) {
            addCriterion("sixday <>", value, "sixday");
            return (Criteria) this;
        }

        public Criteria andSixdayGreaterThan(String value) {
            addCriterion("sixday >", value, "sixday");
            return (Criteria) this;
        }

        public Criteria andSixdayGreaterThanOrEqualTo(String value) {
            addCriterion("sixday >=", value, "sixday");
            return (Criteria) this;
        }

        public Criteria andSixdayLessThan(String value) {
            addCriterion("sixday <", value, "sixday");
            return (Criteria) this;
        }

        public Criteria andSixdayLessThanOrEqualTo(String value) {
            addCriterion("sixday <=", value, "sixday");
            return (Criteria) this;
        }

        public Criteria andSixdayLike(String value) {
            addCriterion("sixday like", value, "sixday");
            return (Criteria) this;
        }

        public Criteria andSixdayNotLike(String value) {
            addCriterion("sixday not like", value, "sixday");
            return (Criteria) this;
        }

        public Criteria andSixdayIn(List<String> values) {
            addCriterion("sixday in", values, "sixday");
            return (Criteria) this;
        }

        public Criteria andSixdayNotIn(List<String> values) {
            addCriterion("sixday not in", values, "sixday");
            return (Criteria) this;
        }

        public Criteria andSixdayBetween(String value1, String value2) {
            addCriterion("sixday between", value1, value2, "sixday");
            return (Criteria) this;
        }

        public Criteria andSixdayNotBetween(String value1, String value2) {
            addCriterion("sixday not between", value1, value2, "sixday");
            return (Criteria) this;
        }

        public Criteria andSevendayIsNull() {
            addCriterion("sevenday is null");
            return (Criteria) this;
        }

        public Criteria andSevendayIsNotNull() {
            addCriterion("sevenday is not null");
            return (Criteria) this;
        }

        public Criteria andSevendayEqualTo(String value) {
            addCriterion("sevenday =", value, "sevenday");
            return (Criteria) this;
        }

        public Criteria andSevendayNotEqualTo(String value) {
            addCriterion("sevenday <>", value, "sevenday");
            return (Criteria) this;
        }

        public Criteria andSevendayGreaterThan(String value) {
            addCriterion("sevenday >", value, "sevenday");
            return (Criteria) this;
        }

        public Criteria andSevendayGreaterThanOrEqualTo(String value) {
            addCriterion("sevenday >=", value, "sevenday");
            return (Criteria) this;
        }

        public Criteria andSevendayLessThan(String value) {
            addCriterion("sevenday <", value, "sevenday");
            return (Criteria) this;
        }

        public Criteria andSevendayLessThanOrEqualTo(String value) {
            addCriterion("sevenday <=", value, "sevenday");
            return (Criteria) this;
        }

        public Criteria andSevendayLike(String value) {
            addCriterion("sevenday like", value, "sevenday");
            return (Criteria) this;
        }

        public Criteria andSevendayNotLike(String value) {
            addCriterion("sevenday not like", value, "sevenday");
            return (Criteria) this;
        }

        public Criteria andSevendayIn(List<String> values) {
            addCriterion("sevenday in", values, "sevenday");
            return (Criteria) this;
        }

        public Criteria andSevendayNotIn(List<String> values) {
            addCriterion("sevenday not in", values, "sevenday");
            return (Criteria) this;
        }

        public Criteria andSevendayBetween(String value1, String value2) {
            addCriterion("sevenday between", value1, value2, "sevenday");
            return (Criteria) this;
        }

        public Criteria andSevendayNotBetween(String value1, String value2) {
            addCriterion("sevenday not between", value1, value2, "sevenday");
            return (Criteria) this;
        }

        public Criteria andEightdayIsNull() {
            addCriterion("eightday is null");
            return (Criteria) this;
        }

        public Criteria andEightdayIsNotNull() {
            addCriterion("eightday is not null");
            return (Criteria) this;
        }

        public Criteria andEightdayEqualTo(String value) {
            addCriterion("eightday =", value, "eightday");
            return (Criteria) this;
        }

        public Criteria andEightdayNotEqualTo(String value) {
            addCriterion("eightday <>", value, "eightday");
            return (Criteria) this;
        }

        public Criteria andEightdayGreaterThan(String value) {
            addCriterion("eightday >", value, "eightday");
            return (Criteria) this;
        }

        public Criteria andEightdayGreaterThanOrEqualTo(String value) {
            addCriterion("eightday >=", value, "eightday");
            return (Criteria) this;
        }

        public Criteria andEightdayLessThan(String value) {
            addCriterion("eightday <", value, "eightday");
            return (Criteria) this;
        }

        public Criteria andEightdayLessThanOrEqualTo(String value) {
            addCriterion("eightday <=", value, "eightday");
            return (Criteria) this;
        }

        public Criteria andEightdayLike(String value) {
            addCriterion("eightday like", value, "eightday");
            return (Criteria) this;
        }

        public Criteria andEightdayNotLike(String value) {
            addCriterion("eightday not like", value, "eightday");
            return (Criteria) this;
        }

        public Criteria andEightdayIn(List<String> values) {
            addCriterion("eightday in", values, "eightday");
            return (Criteria) this;
        }

        public Criteria andEightdayNotIn(List<String> values) {
            addCriterion("eightday not in", values, "eightday");
            return (Criteria) this;
        }

        public Criteria andEightdayBetween(String value1, String value2) {
            addCriterion("eightday between", value1, value2, "eightday");
            return (Criteria) this;
        }

        public Criteria andEightdayNotBetween(String value1, String value2) {
            addCriterion("eightday not between", value1, value2, "eightday");
            return (Criteria) this;
        }

        public Criteria andRegOnoffIsNull() {
            addCriterion("reg_onoff is null");
            return (Criteria) this;
        }

        public Criteria andRegOnoffIsNotNull() {
            addCriterion("reg_onoff is not null");
            return (Criteria) this;
        }

        public Criteria andRegOnoffEqualTo(String value) {
            addCriterion("reg_onoff =", value, "regOnoff");
            return (Criteria) this;
        }

        public Criteria andRegOnoffNotEqualTo(String value) {
            addCriterion("reg_onoff <>", value, "regOnoff");
            return (Criteria) this;
        }

        public Criteria andRegOnoffGreaterThan(String value) {
            addCriterion("reg_onoff >", value, "regOnoff");
            return (Criteria) this;
        }

        public Criteria andRegOnoffGreaterThanOrEqualTo(String value) {
            addCriterion("reg_onoff >=", value, "regOnoff");
            return (Criteria) this;
        }

        public Criteria andRegOnoffLessThan(String value) {
            addCriterion("reg_onoff <", value, "regOnoff");
            return (Criteria) this;
        }

        public Criteria andRegOnoffLessThanOrEqualTo(String value) {
            addCriterion("reg_onoff <=", value, "regOnoff");
            return (Criteria) this;
        }

        public Criteria andRegOnoffLike(String value) {
            addCriterion("reg_onoff like", value, "regOnoff");
            return (Criteria) this;
        }

        public Criteria andRegOnoffNotLike(String value) {
            addCriterion("reg_onoff not like", value, "regOnoff");
            return (Criteria) this;
        }

        public Criteria andRegOnoffIn(List<String> values) {
            addCriterion("reg_onoff in", values, "regOnoff");
            return (Criteria) this;
        }

        public Criteria andRegOnoffNotIn(List<String> values) {
            addCriterion("reg_onoff not in", values, "regOnoff");
            return (Criteria) this;
        }

        public Criteria andRegOnoffBetween(String value1, String value2) {
            addCriterion("reg_onoff between", value1, value2, "regOnoff");
            return (Criteria) this;
        }

        public Criteria andRegOnoffNotBetween(String value1, String value2) {
            addCriterion("reg_onoff not between", value1, value2, "regOnoff");
            return (Criteria) this;
        }

        public Criteria andRegIntegrationIsNull() {
            addCriterion("reg_integration is null");
            return (Criteria) this;
        }

        public Criteria andRegIntegrationIsNotNull() {
            addCriterion("reg_integration is not null");
            return (Criteria) this;
        }

        public Criteria andRegIntegrationEqualTo(String value) {
            addCriterion("reg_integration =", value, "regIntegration");
            return (Criteria) this;
        }

        public Criteria andRegIntegrationNotEqualTo(String value) {
            addCriterion("reg_integration <>", value, "regIntegration");
            return (Criteria) this;
        }

        public Criteria andRegIntegrationGreaterThan(String value) {
            addCriterion("reg_integration >", value, "regIntegration");
            return (Criteria) this;
        }

        public Criteria andRegIntegrationGreaterThanOrEqualTo(String value) {
            addCriterion("reg_integration >=", value, "regIntegration");
            return (Criteria) this;
        }

        public Criteria andRegIntegrationLessThan(String value) {
            addCriterion("reg_integration <", value, "regIntegration");
            return (Criteria) this;
        }

        public Criteria andRegIntegrationLessThanOrEqualTo(String value) {
            addCriterion("reg_integration <=", value, "regIntegration");
            return (Criteria) this;
        }

        public Criteria andRegIntegrationLike(String value) {
            addCriterion("reg_integration like", value, "regIntegration");
            return (Criteria) this;
        }

        public Criteria andRegIntegrationNotLike(String value) {
            addCriterion("reg_integration not like", value, "regIntegration");
            return (Criteria) this;
        }

        public Criteria andRegIntegrationIn(List<String> values) {
            addCriterion("reg_integration in", values, "regIntegration");
            return (Criteria) this;
        }

        public Criteria andRegIntegrationNotIn(List<String> values) {
            addCriterion("reg_integration not in", values, "regIntegration");
            return (Criteria) this;
        }

        public Criteria andRegIntegrationBetween(String value1, String value2) {
            addCriterion("reg_integration between", value1, value2, "regIntegration");
            return (Criteria) this;
        }

        public Criteria andRegIntegrationNotBetween(String value1, String value2) {
            addCriterion("reg_integration not between", value1, value2, "regIntegration");
            return (Criteria) this;
        }

        public Criteria andRegGrowthIsNull() {
            addCriterion("reg_growth is null");
            return (Criteria) this;
        }

        public Criteria andRegGrowthIsNotNull() {
            addCriterion("reg_growth is not null");
            return (Criteria) this;
        }

        public Criteria andRegGrowthEqualTo(String value) {
            addCriterion("reg_growth =", value, "regGrowth");
            return (Criteria) this;
        }

        public Criteria andRegGrowthNotEqualTo(String value) {
            addCriterion("reg_growth <>", value, "regGrowth");
            return (Criteria) this;
        }

        public Criteria andRegGrowthGreaterThan(String value) {
            addCriterion("reg_growth >", value, "regGrowth");
            return (Criteria) this;
        }

        public Criteria andRegGrowthGreaterThanOrEqualTo(String value) {
            addCriterion("reg_growth >=", value, "regGrowth");
            return (Criteria) this;
        }

        public Criteria andRegGrowthLessThan(String value) {
            addCriterion("reg_growth <", value, "regGrowth");
            return (Criteria) this;
        }

        public Criteria andRegGrowthLessThanOrEqualTo(String value) {
            addCriterion("reg_growth <=", value, "regGrowth");
            return (Criteria) this;
        }

        public Criteria andRegGrowthLike(String value) {
            addCriterion("reg_growth like", value, "regGrowth");
            return (Criteria) this;
        }

        public Criteria andRegGrowthNotLike(String value) {
            addCriterion("reg_growth not like", value, "regGrowth");
            return (Criteria) this;
        }

        public Criteria andRegGrowthIn(List<String> values) {
            addCriterion("reg_growth in", values, "regGrowth");
            return (Criteria) this;
        }

        public Criteria andRegGrowthNotIn(List<String> values) {
            addCriterion("reg_growth not in", values, "regGrowth");
            return (Criteria) this;
        }

        public Criteria andRegGrowthBetween(String value1, String value2) {
            addCriterion("reg_growth between", value1, value2, "regGrowth");
            return (Criteria) this;
        }

        public Criteria andRegGrowthNotBetween(String value1, String value2) {
            addCriterion("reg_growth not between", value1, value2, "regGrowth");
            return (Criteria) this;
        }

        public Criteria andInviteIntegratiIsNull() {
            addCriterion("invite_integrati is null");
            return (Criteria) this;
        }

        public Criteria andInviteIntegratiIsNotNull() {
            addCriterion("invite_integrati is not null");
            return (Criteria) this;
        }

        public Criteria andInviteIntegratiEqualTo(String value) {
            addCriterion("invite_integrati =", value, "inviteIntegrati");
            return (Criteria) this;
        }

        public Criteria andInviteIntegratiNotEqualTo(String value) {
            addCriterion("invite_integrati <>", value, "inviteIntegrati");
            return (Criteria) this;
        }

        public Criteria andInviteIntegratiGreaterThan(String value) {
            addCriterion("invite_integrati >", value, "inviteIntegrati");
            return (Criteria) this;
        }

        public Criteria andInviteIntegratiGreaterThanOrEqualTo(String value) {
            addCriterion("invite_integrati >=", value, "inviteIntegrati");
            return (Criteria) this;
        }

        public Criteria andInviteIntegratiLessThan(String value) {
            addCriterion("invite_integrati <", value, "inviteIntegrati");
            return (Criteria) this;
        }

        public Criteria andInviteIntegratiLessThanOrEqualTo(String value) {
            addCriterion("invite_integrati <=", value, "inviteIntegrati");
            return (Criteria) this;
        }

        public Criteria andInviteIntegratiLike(String value) {
            addCriterion("invite_integrati like", value, "inviteIntegrati");
            return (Criteria) this;
        }

        public Criteria andInviteIntegratiNotLike(String value) {
            addCriterion("invite_integrati not like", value, "inviteIntegrati");
            return (Criteria) this;
        }

        public Criteria andInviteIntegratiIn(List<String> values) {
            addCriterion("invite_integrati in", values, "inviteIntegrati");
            return (Criteria) this;
        }

        public Criteria andInviteIntegratiNotIn(List<String> values) {
            addCriterion("invite_integrati not in", values, "inviteIntegrati");
            return (Criteria) this;
        }

        public Criteria andInviteIntegratiBetween(String value1, String value2) {
            addCriterion("invite_integrati between", value1, value2, "inviteIntegrati");
            return (Criteria) this;
        }

        public Criteria andInviteIntegratiNotBetween(String value1, String value2) {
            addCriterion("invite_integrati not between", value1, value2, "inviteIntegrati");
            return (Criteria) this;
        }

        public Criteria andRstateIsNull() {
            addCriterion("rstate is null");
            return (Criteria) this;
        }

        public Criteria andRstateIsNotNull() {
            addCriterion("rstate is not null");
            return (Criteria) this;
        }

        public Criteria andRstateEqualTo(String value) {
            addCriterion("rstate =", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateNotEqualTo(String value) {
            addCriterion("rstate <>", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateGreaterThan(String value) {
            addCriterion("rstate >", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateGreaterThanOrEqualTo(String value) {
            addCriterion("rstate >=", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateLessThan(String value) {
            addCriterion("rstate <", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateLessThanOrEqualTo(String value) {
            addCriterion("rstate <=", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateLike(String value) {
            addCriterion("rstate like", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateNotLike(String value) {
            addCriterion("rstate not like", value, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateIn(List<String> values) {
            addCriterion("rstate in", values, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateNotIn(List<String> values) {
            addCriterion("rstate not in", values, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateBetween(String value1, String value2) {
            addCriterion("rstate between", value1, value2, "rstate");
            return (Criteria) this;
        }

        public Criteria andRstateNotBetween(String value1, String value2) {
            addCriterion("rstate not between", value1, value2, "rstate");
            return (Criteria) this;
        }

        public Criteria andGstateIsNull() {
            addCriterion("gstate is null");
            return (Criteria) this;
        }

        public Criteria andGstateIsNotNull() {
            addCriterion("gstate is not null");
            return (Criteria) this;
        }

        public Criteria andGstateEqualTo(String value) {
            addCriterion("gstate =", value, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateNotEqualTo(String value) {
            addCriterion("gstate <>", value, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateGreaterThan(String value) {
            addCriterion("gstate >", value, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateGreaterThanOrEqualTo(String value) {
            addCriterion("gstate >=", value, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateLessThan(String value) {
            addCriterion("gstate <", value, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateLessThanOrEqualTo(String value) {
            addCriterion("gstate <=", value, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateLike(String value) {
            addCriterion("gstate like", value, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateNotLike(String value) {
            addCriterion("gstate not like", value, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateIn(List<String> values) {
            addCriterion("gstate in", values, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateNotIn(List<String> values) {
            addCriterion("gstate not in", values, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateBetween(String value1, String value2) {
            addCriterion("gstate between", value1, value2, "gstate");
            return (Criteria) this;
        }

        public Criteria andGstateNotBetween(String value1, String value2) {
            addCriterion("gstate not between", value1, value2, "gstate");
            return (Criteria) this;
        }

        public Criteria andIstateIsNull() {
            addCriterion("istate is null");
            return (Criteria) this;
        }

        public Criteria andIstateIsNotNull() {
            addCriterion("istate is not null");
            return (Criteria) this;
        }

        public Criteria andIstateEqualTo(String value) {
            addCriterion("istate =", value, "istate");
            return (Criteria) this;
        }

        public Criteria andIstateNotEqualTo(String value) {
            addCriterion("istate <>", value, "istate");
            return (Criteria) this;
        }

        public Criteria andIstateGreaterThan(String value) {
            addCriterion("istate >", value, "istate");
            return (Criteria) this;
        }

        public Criteria andIstateGreaterThanOrEqualTo(String value) {
            addCriterion("istate >=", value, "istate");
            return (Criteria) this;
        }

        public Criteria andIstateLessThan(String value) {
            addCriterion("istate <", value, "istate");
            return (Criteria) this;
        }

        public Criteria andIstateLessThanOrEqualTo(String value) {
            addCriterion("istate <=", value, "istate");
            return (Criteria) this;
        }

        public Criteria andIstateLike(String value) {
            addCriterion("istate like", value, "istate");
            return (Criteria) this;
        }

        public Criteria andIstateNotLike(String value) {
            addCriterion("istate not like", value, "istate");
            return (Criteria) this;
        }

        public Criteria andIstateIn(List<String> values) {
            addCriterion("istate in", values, "istate");
            return (Criteria) this;
        }

        public Criteria andIstateNotIn(List<String> values) {
            addCriterion("istate not in", values, "istate");
            return (Criteria) this;
        }

        public Criteria andIstateBetween(String value1, String value2) {
            addCriterion("istate between", value1, value2, "istate");
            return (Criteria) this;
        }

        public Criteria andIstateNotBetween(String value1, String value2) {
            addCriterion("istate not between", value1, value2, "istate");
            return (Criteria) this;
        }

        public Criteria andPcNoticeIsNull() {
            addCriterion("PC_NOTICE is null");
            return (Criteria) this;
        }

        public Criteria andPcNoticeIsNotNull() {
            addCriterion("PC_NOTICE is not null");
            return (Criteria) this;
        }

        public Criteria andPcNoticeEqualTo(String value) {
            addCriterion("PC_NOTICE =", value, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeNotEqualTo(String value) {
            addCriterion("PC_NOTICE <>", value, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeGreaterThan(String value) {
            addCriterion("PC_NOTICE >", value, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("PC_NOTICE >=", value, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeLessThan(String value) {
            addCriterion("PC_NOTICE <", value, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeLessThanOrEqualTo(String value) {
            addCriterion("PC_NOTICE <=", value, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeLike(String value) {
            addCriterion("PC_NOTICE like", value, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeNotLike(String value) {
            addCriterion("PC_NOTICE not like", value, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeIn(List<String> values) {
            addCriterion("PC_NOTICE in", values, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeNotIn(List<String> values) {
            addCriterion("PC_NOTICE not in", values, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeBetween(String value1, String value2) {
            addCriterion("PC_NOTICE between", value1, value2, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeNotBetween(String value1, String value2) {
            addCriterion("PC_NOTICE not between", value1, value2, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeIsNull() {
            addCriterion("WAP_NOTICE is null");
            return (Criteria) this;
        }

        public Criteria andWapNoticeIsNotNull() {
            addCriterion("WAP_NOTICE is not null");
            return (Criteria) this;
        }

        public Criteria andWapNoticeEqualTo(String value) {
            addCriterion("WAP_NOTICE =", value, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeNotEqualTo(String value) {
            addCriterion("WAP_NOTICE <>", value, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeGreaterThan(String value) {
            addCriterion("WAP_NOTICE >", value, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("WAP_NOTICE >=", value, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeLessThan(String value) {
            addCriterion("WAP_NOTICE <", value, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeLessThanOrEqualTo(String value) {
            addCriterion("WAP_NOTICE <=", value, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeLike(String value) {
            addCriterion("WAP_NOTICE like", value, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeNotLike(String value) {
            addCriterion("WAP_NOTICE not like", value, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeIn(List<String> values) {
            addCriterion("WAP_NOTICE in", values, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeNotIn(List<String> values) {
            addCriterion("WAP_NOTICE not in", values, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeBetween(String value1, String value2) {
            addCriterion("WAP_NOTICE between", value1, value2, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeNotBetween(String value1, String value2) {
            addCriterion("WAP_NOTICE not between", value1, value2, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andLstateIsNull() {
            addCriterion("lstate is null");
            return (Criteria) this;
        }

        public Criteria andLstateIsNotNull() {
            addCriterion("lstate is not null");
            return (Criteria) this;
        }

        public Criteria andLstateEqualTo(String value) {
            addCriterion("lstate =", value, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateNotEqualTo(String value) {
            addCriterion("lstate <>", value, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateGreaterThan(String value) {
            addCriterion("lstate >", value, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateGreaterThanOrEqualTo(String value) {
            addCriterion("lstate >=", value, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateLessThan(String value) {
            addCriterion("lstate <", value, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateLessThanOrEqualTo(String value) {
            addCriterion("lstate <=", value, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateLike(String value) {
            addCriterion("lstate like", value, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateNotLike(String value) {
            addCriterion("lstate not like", value, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateIn(List<String> values) {
            addCriterion("lstate in", values, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateNotIn(List<String> values) {
            addCriterion("lstate not in", values, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateBetween(String value1, String value2) {
            addCriterion("lstate between", value1, value2, "lstate");
            return (Criteria) this;
        }

        public Criteria andLstateNotBetween(String value1, String value2) {
            addCriterion("lstate not between", value1, value2, "lstate");
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