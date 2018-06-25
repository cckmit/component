package com.x.common.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class GnTDicAreaRegionCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public GnTDicAreaRegionCriteria() {
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

        public Criteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("AREA_CODE like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("AREA_CODE not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andLevIsNull() {
            addCriterion("LEV is null");
            return (Criteria) this;
        }

        public Criteria andLevIsNotNull() {
            addCriterion("LEV is not null");
            return (Criteria) this;
        }

        public Criteria andLevEqualTo(Integer value) {
            addCriterion("LEV =", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevNotEqualTo(Integer value) {
            addCriterion("LEV <>", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevGreaterThan(Integer value) {
            addCriterion("LEV >", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEV >=", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevLessThan(Integer value) {
            addCriterion("LEV <", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevLessThanOrEqualTo(Integer value) {
            addCriterion("LEV <=", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevIn(List<Integer> values) {
            addCriterion("LEV in", values, "lev");
            return (Criteria) this;
        }

        public Criteria andLevNotIn(List<Integer> values) {
            addCriterion("LEV not in", values, "lev");
            return (Criteria) this;
        }

        public Criteria andLevBetween(Integer value1, Integer value2) {
            addCriterion("LEV between", value1, value2, "lev");
            return (Criteria) this;
        }

        public Criteria andLevNotBetween(Integer value1, Integer value2) {
            addCriterion("LEV not between", value1, value2, "lev");
            return (Criteria) this;
        }

        public Criteria andAreaCode1IsNull() {
            addCriterion("AREA_CODE1 is null");
            return (Criteria) this;
        }

        public Criteria andAreaCode1IsNotNull() {
            addCriterion("AREA_CODE1 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCode1EqualTo(String value) {
            addCriterion("AREA_CODE1 =", value, "areaCode1");
            return (Criteria) this;
        }

        public Criteria andAreaCode1NotEqualTo(String value) {
            addCriterion("AREA_CODE1 <>", value, "areaCode1");
            return (Criteria) this;
        }

        public Criteria andAreaCode1GreaterThan(String value) {
            addCriterion("AREA_CODE1 >", value, "areaCode1");
            return (Criteria) this;
        }

        public Criteria andAreaCode1GreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE1 >=", value, "areaCode1");
            return (Criteria) this;
        }

        public Criteria andAreaCode1LessThan(String value) {
            addCriterion("AREA_CODE1 <", value, "areaCode1");
            return (Criteria) this;
        }

        public Criteria andAreaCode1LessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE1 <=", value, "areaCode1");
            return (Criteria) this;
        }

        public Criteria andAreaCode1Like(String value) {
            addCriterion("AREA_CODE1 like", value, "areaCode1");
            return (Criteria) this;
        }

        public Criteria andAreaCode1NotLike(String value) {
            addCriterion("AREA_CODE1 not like", value, "areaCode1");
            return (Criteria) this;
        }

        public Criteria andAreaCode1In(List<String> values) {
            addCriterion("AREA_CODE1 in", values, "areaCode1");
            return (Criteria) this;
        }

        public Criteria andAreaCode1NotIn(List<String> values) {
            addCriterion("AREA_CODE1 not in", values, "areaCode1");
            return (Criteria) this;
        }

        public Criteria andAreaCode1Between(String value1, String value2) {
            addCriterion("AREA_CODE1 between", value1, value2, "areaCode1");
            return (Criteria) this;
        }

        public Criteria andAreaCode1NotBetween(String value1, String value2) {
            addCriterion("AREA_CODE1 not between", value1, value2, "areaCode1");
            return (Criteria) this;
        }

        public Criteria andAreaCode2IsNull() {
            addCriterion("AREA_CODE2 is null");
            return (Criteria) this;
        }

        public Criteria andAreaCode2IsNotNull() {
            addCriterion("AREA_CODE2 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCode2EqualTo(String value) {
            addCriterion("AREA_CODE2 =", value, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2NotEqualTo(String value) {
            addCriterion("AREA_CODE2 <>", value, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2GreaterThan(String value) {
            addCriterion("AREA_CODE2 >", value, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2GreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE2 >=", value, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2LessThan(String value) {
            addCriterion("AREA_CODE2 <", value, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2LessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE2 <=", value, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2Like(String value) {
            addCriterion("AREA_CODE2 like", value, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2NotLike(String value) {
            addCriterion("AREA_CODE2 not like", value, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2In(List<String> values) {
            addCriterion("AREA_CODE2 in", values, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2NotIn(List<String> values) {
            addCriterion("AREA_CODE2 not in", values, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2Between(String value1, String value2) {
            addCriterion("AREA_CODE2 between", value1, value2, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2NotBetween(String value1, String value2) {
            addCriterion("AREA_CODE2 not between", value1, value2, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode3IsNull() {
            addCriterion("AREA_CODE3 is null");
            return (Criteria) this;
        }

        public Criteria andAreaCode3IsNotNull() {
            addCriterion("AREA_CODE3 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCode3EqualTo(String value) {
            addCriterion("AREA_CODE3 =", value, "areaCode3");
            return (Criteria) this;
        }

        public Criteria andAreaCode3NotEqualTo(String value) {
            addCriterion("AREA_CODE3 <>", value, "areaCode3");
            return (Criteria) this;
        }

        public Criteria andAreaCode3GreaterThan(String value) {
            addCriterion("AREA_CODE3 >", value, "areaCode3");
            return (Criteria) this;
        }

        public Criteria andAreaCode3GreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE3 >=", value, "areaCode3");
            return (Criteria) this;
        }

        public Criteria andAreaCode3LessThan(String value) {
            addCriterion("AREA_CODE3 <", value, "areaCode3");
            return (Criteria) this;
        }

        public Criteria andAreaCode3LessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE3 <=", value, "areaCode3");
            return (Criteria) this;
        }

        public Criteria andAreaCode3Like(String value) {
            addCriterion("AREA_CODE3 like", value, "areaCode3");
            return (Criteria) this;
        }

        public Criteria andAreaCode3NotLike(String value) {
            addCriterion("AREA_CODE3 not like", value, "areaCode3");
            return (Criteria) this;
        }

        public Criteria andAreaCode3In(List<String> values) {
            addCriterion("AREA_CODE3 in", values, "areaCode3");
            return (Criteria) this;
        }

        public Criteria andAreaCode3NotIn(List<String> values) {
            addCriterion("AREA_CODE3 not in", values, "areaCode3");
            return (Criteria) this;
        }

        public Criteria andAreaCode3Between(String value1, String value2) {
            addCriterion("AREA_CODE3 between", value1, value2, "areaCode3");
            return (Criteria) this;
        }

        public Criteria andAreaCode3NotBetween(String value1, String value2) {
            addCriterion("AREA_CODE3 not between", value1, value2, "areaCode3");
            return (Criteria) this;
        }

        public Criteria andSupAreaCodeIsNull() {
            addCriterion("SUP_AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSupAreaCodeIsNotNull() {
            addCriterion("SUP_AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSupAreaCodeEqualTo(String value) {
            addCriterion("SUP_AREA_CODE =", value, "supAreaCode");
            return (Criteria) this;
        }

        public Criteria andSupAreaCodeNotEqualTo(String value) {
            addCriterion("SUP_AREA_CODE <>", value, "supAreaCode");
            return (Criteria) this;
        }

        public Criteria andSupAreaCodeGreaterThan(String value) {
            addCriterion("SUP_AREA_CODE >", value, "supAreaCode");
            return (Criteria) this;
        }

        public Criteria andSupAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUP_AREA_CODE >=", value, "supAreaCode");
            return (Criteria) this;
        }

        public Criteria andSupAreaCodeLessThan(String value) {
            addCriterion("SUP_AREA_CODE <", value, "supAreaCode");
            return (Criteria) this;
        }

        public Criteria andSupAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("SUP_AREA_CODE <=", value, "supAreaCode");
            return (Criteria) this;
        }

        public Criteria andSupAreaCodeLike(String value) {
            addCriterion("SUP_AREA_CODE like", value, "supAreaCode");
            return (Criteria) this;
        }

        public Criteria andSupAreaCodeNotLike(String value) {
            addCriterion("SUP_AREA_CODE not like", value, "supAreaCode");
            return (Criteria) this;
        }

        public Criteria andSupAreaCodeIn(List<String> values) {
            addCriterion("SUP_AREA_CODE in", values, "supAreaCode");
            return (Criteria) this;
        }

        public Criteria andSupAreaCodeNotIn(List<String> values) {
            addCriterion("SUP_AREA_CODE not in", values, "supAreaCode");
            return (Criteria) this;
        }

        public Criteria andSupAreaCodeBetween(String value1, String value2) {
            addCriterion("SUP_AREA_CODE between", value1, value2, "supAreaCode");
            return (Criteria) this;
        }

        public Criteria andSupAreaCodeNotBetween(String value1, String value2) {
            addCriterion("SUP_AREA_CODE not between", value1, value2, "supAreaCode");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("AREA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("AREA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("AREA_NAME =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("AREA_NAME <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("AREA_NAME >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_NAME >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("AREA_NAME <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("AREA_NAME <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("AREA_NAME like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("AREA_NAME not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("AREA_NAME in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("AREA_NAME not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("AREA_NAME between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("AREA_NAME not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNull() {
            addCriterion("PINYIN is null");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNotNull() {
            addCriterion("PINYIN is not null");
            return (Criteria) this;
        }

        public Criteria andPinyinEqualTo(String value) {
            addCriterion("PINYIN =", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotEqualTo(String value) {
            addCriterion("PINYIN <>", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThan(String value) {
            addCriterion("PINYIN >", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("PINYIN >=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThan(String value) {
            addCriterion("PINYIN <", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThanOrEqualTo(String value) {
            addCriterion("PINYIN <=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLike(String value) {
            addCriterion("PINYIN like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotLike(String value) {
            addCriterion("PINYIN not like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinIn(List<String> values) {
            addCriterion("PINYIN in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotIn(List<String> values) {
            addCriterion("PINYIN not in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinBetween(String value1, String value2) {
            addCriterion("PINYIN between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotBetween(String value1, String value2) {
            addCriterion("PINYIN not between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andLangIsNull() {
            addCriterion("LANG is null");
            return (Criteria) this;
        }

        public Criteria andLangIsNotNull() {
            addCriterion("LANG is not null");
            return (Criteria) this;
        }

        public Criteria andLangEqualTo(String value) {
            addCriterion("LANG =", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotEqualTo(String value) {
            addCriterion("LANG <>", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangGreaterThan(String value) {
            addCriterion("LANG >", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangGreaterThanOrEqualTo(String value) {
            addCriterion("LANG >=", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangLessThan(String value) {
            addCriterion("LANG <", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangLessThanOrEqualTo(String value) {
            addCriterion("LANG <=", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangLike(String value) {
            addCriterion("LANG like", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotLike(String value) {
            addCriterion("LANG not like", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangIn(List<String> values) {
            addCriterion("LANG in", values, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotIn(List<String> values) {
            addCriterion("LANG not in", values, "lang");
            return (Criteria) this;
        }

        public Criteria andLangBetween(String value1, String value2) {
            addCriterion("LANG between", value1, value2, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotBetween(String value1, String value2) {
            addCriterion("LANG not between", value1, value2, "lang");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNull() {
            addCriterion("region_code is null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNotNull() {
            addCriterion("region_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeEqualTo(String value) {
            addCriterion("region_code =", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotEqualTo(String value) {
            addCriterion("region_code <>", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThan(String value) {
            addCriterion("region_code >", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("region_code >=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThan(String value) {
            addCriterion("region_code <", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("region_code <=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLike(String value) {
            addCriterion("region_code like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotLike(String value) {
            addCriterion("region_code not like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIn(List<String> values) {
            addCriterion("region_code in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotIn(List<String> values) {
            addCriterion("region_code not in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeBetween(String value1, String value2) {
            addCriterion("region_code between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotBetween(String value1, String value2) {
            addCriterion("region_code not between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andAreaNameShortIsNull() {
            addCriterion("AREA_NAME_SHORT is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameShortIsNotNull() {
            addCriterion("AREA_NAME_SHORT is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameShortEqualTo(String value) {
            addCriterion("AREA_NAME_SHORT =", value, "areaNameShort");
            return (Criteria) this;
        }

        public Criteria andAreaNameShortNotEqualTo(String value) {
            addCriterion("AREA_NAME_SHORT <>", value, "areaNameShort");
            return (Criteria) this;
        }

        public Criteria andAreaNameShortGreaterThan(String value) {
            addCriterion("AREA_NAME_SHORT >", value, "areaNameShort");
            return (Criteria) this;
        }

        public Criteria andAreaNameShortGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_NAME_SHORT >=", value, "areaNameShort");
            return (Criteria) this;
        }

        public Criteria andAreaNameShortLessThan(String value) {
            addCriterion("AREA_NAME_SHORT <", value, "areaNameShort");
            return (Criteria) this;
        }

        public Criteria andAreaNameShortLessThanOrEqualTo(String value) {
            addCriterion("AREA_NAME_SHORT <=", value, "areaNameShort");
            return (Criteria) this;
        }

        public Criteria andAreaNameShortLike(String value) {
            addCriterion("AREA_NAME_SHORT like", value, "areaNameShort");
            return (Criteria) this;
        }

        public Criteria andAreaNameShortNotLike(String value) {
            addCriterion("AREA_NAME_SHORT not like", value, "areaNameShort");
            return (Criteria) this;
        }

        public Criteria andAreaNameShortIn(List<String> values) {
            addCriterion("AREA_NAME_SHORT in", values, "areaNameShort");
            return (Criteria) this;
        }

        public Criteria andAreaNameShortNotIn(List<String> values) {
            addCriterion("AREA_NAME_SHORT not in", values, "areaNameShort");
            return (Criteria) this;
        }

        public Criteria andAreaNameShortBetween(String value1, String value2) {
            addCriterion("AREA_NAME_SHORT between", value1, value2, "areaNameShort");
            return (Criteria) this;
        }

        public Criteria andAreaNameShortNotBetween(String value1, String value2) {
            addCriterion("AREA_NAME_SHORT not between", value1, value2, "areaNameShort");
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