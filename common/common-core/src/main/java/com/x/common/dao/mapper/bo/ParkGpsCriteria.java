package com.x.common.dao.mapper.bo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ParkGpsCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ParkGpsCriteria() {
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

        public Criteria andWgIdIsNull() {
            addCriterion("WG_ID is null");
            return (Criteria) this;
        }

        public Criteria andWgIdIsNotNull() {
            addCriterion("WG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWgIdEqualTo(String value) {
            addCriterion("WG_ID =", value, "wgId");
            return (Criteria) this;
        }

        public Criteria andWgIdNotEqualTo(String value) {
            addCriterion("WG_ID <>", value, "wgId");
            return (Criteria) this;
        }

        public Criteria andWgIdGreaterThan(String value) {
            addCriterion("WG_ID >", value, "wgId");
            return (Criteria) this;
        }

        public Criteria andWgIdGreaterThanOrEqualTo(String value) {
            addCriterion("WG_ID >=", value, "wgId");
            return (Criteria) this;
        }

        public Criteria andWgIdLessThan(String value) {
            addCriterion("WG_ID <", value, "wgId");
            return (Criteria) this;
        }

        public Criteria andWgIdLessThanOrEqualTo(String value) {
            addCriterion("WG_ID <=", value, "wgId");
            return (Criteria) this;
        }

        public Criteria andWgIdLike(String value) {
            addCriterion("WG_ID like", value, "wgId");
            return (Criteria) this;
        }

        public Criteria andWgIdNotLike(String value) {
            addCriterion("WG_ID not like", value, "wgId");
            return (Criteria) this;
        }

        public Criteria andWgIdIn(List<String> values) {
            addCriterion("WG_ID in", values, "wgId");
            return (Criteria) this;
        }

        public Criteria andWgIdNotIn(List<String> values) {
            addCriterion("WG_ID not in", values, "wgId");
            return (Criteria) this;
        }

        public Criteria andWgIdBetween(String value1, String value2) {
            addCriterion("WG_ID between", value1, value2, "wgId");
            return (Criteria) this;
        }

        public Criteria andWgIdNotBetween(String value1, String value2) {
            addCriterion("WG_ID not between", value1, value2, "wgId");
            return (Criteria) this;
        }

        public Criteria andWgNameIsNull() {
            addCriterion("WG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andWgNameIsNotNull() {
            addCriterion("WG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andWgNameEqualTo(String value) {
            addCriterion("WG_NAME =", value, "wgName");
            return (Criteria) this;
        }

        public Criteria andWgNameNotEqualTo(String value) {
            addCriterion("WG_NAME <>", value, "wgName");
            return (Criteria) this;
        }

        public Criteria andWgNameGreaterThan(String value) {
            addCriterion("WG_NAME >", value, "wgName");
            return (Criteria) this;
        }

        public Criteria andWgNameGreaterThanOrEqualTo(String value) {
            addCriterion("WG_NAME >=", value, "wgName");
            return (Criteria) this;
        }

        public Criteria andWgNameLessThan(String value) {
            addCriterion("WG_NAME <", value, "wgName");
            return (Criteria) this;
        }

        public Criteria andWgNameLessThanOrEqualTo(String value) {
            addCriterion("WG_NAME <=", value, "wgName");
            return (Criteria) this;
        }

        public Criteria andWgNameLike(String value) {
            addCriterion("WG_NAME like", value, "wgName");
            return (Criteria) this;
        }

        public Criteria andWgNameNotLike(String value) {
            addCriterion("WG_NAME not like", value, "wgName");
            return (Criteria) this;
        }

        public Criteria andWgNameIn(List<String> values) {
            addCriterion("WG_NAME in", values, "wgName");
            return (Criteria) this;
        }

        public Criteria andWgNameNotIn(List<String> values) {
            addCriterion("WG_NAME not in", values, "wgName");
            return (Criteria) this;
        }

        public Criteria andWgNameBetween(String value1, String value2) {
            addCriterion("WG_NAME between", value1, value2, "wgName");
            return (Criteria) this;
        }

        public Criteria andWgNameNotBetween(String value1, String value2) {
            addCriterion("WG_NAME not between", value1, value2, "wgName");
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

        public Criteria andParkIdOuterIsNull() {
            addCriterion("PARK_ID_OUTER is null");
            return (Criteria) this;
        }

        public Criteria andParkIdOuterIsNotNull() {
            addCriterion("PARK_ID_OUTER is not null");
            return (Criteria) this;
        }

        public Criteria andParkIdOuterEqualTo(String value) {
            addCriterion("PARK_ID_OUTER =", value, "parkIdOuter");
            return (Criteria) this;
        }

        public Criteria andParkIdOuterNotEqualTo(String value) {
            addCriterion("PARK_ID_OUTER <>", value, "parkIdOuter");
            return (Criteria) this;
        }

        public Criteria andParkIdOuterGreaterThan(String value) {
            addCriterion("PARK_ID_OUTER >", value, "parkIdOuter");
            return (Criteria) this;
        }

        public Criteria andParkIdOuterGreaterThanOrEqualTo(String value) {
            addCriterion("PARK_ID_OUTER >=", value, "parkIdOuter");
            return (Criteria) this;
        }

        public Criteria andParkIdOuterLessThan(String value) {
            addCriterion("PARK_ID_OUTER <", value, "parkIdOuter");
            return (Criteria) this;
        }

        public Criteria andParkIdOuterLessThanOrEqualTo(String value) {
            addCriterion("PARK_ID_OUTER <=", value, "parkIdOuter");
            return (Criteria) this;
        }

        public Criteria andParkIdOuterLike(String value) {
            addCriterion("PARK_ID_OUTER like", value, "parkIdOuter");
            return (Criteria) this;
        }

        public Criteria andParkIdOuterNotLike(String value) {
            addCriterion("PARK_ID_OUTER not like", value, "parkIdOuter");
            return (Criteria) this;
        }

        public Criteria andParkIdOuterIn(List<String> values) {
            addCriterion("PARK_ID_OUTER in", values, "parkIdOuter");
            return (Criteria) this;
        }

        public Criteria andParkIdOuterNotIn(List<String> values) {
            addCriterion("PARK_ID_OUTER not in", values, "parkIdOuter");
            return (Criteria) this;
        }

        public Criteria andParkIdOuterBetween(String value1, String value2) {
            addCriterion("PARK_ID_OUTER between", value1, value2, "parkIdOuter");
            return (Criteria) this;
        }

        public Criteria andParkIdOuterNotBetween(String value1, String value2) {
            addCriterion("PARK_ID_OUTER not between", value1, value2, "parkIdOuter");
            return (Criteria) this;
        }

        public Criteria andParkNameIsNull() {
            addCriterion("PARK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andParkNameIsNotNull() {
            addCriterion("PARK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andParkNameEqualTo(String value) {
            addCriterion("PARK_NAME =", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotEqualTo(String value) {
            addCriterion("PARK_NAME <>", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameGreaterThan(String value) {
            addCriterion("PARK_NAME >", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameGreaterThanOrEqualTo(String value) {
            addCriterion("PARK_NAME >=", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameLessThan(String value) {
            addCriterion("PARK_NAME <", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameLessThanOrEqualTo(String value) {
            addCriterion("PARK_NAME <=", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameLike(String value) {
            addCriterion("PARK_NAME like", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotLike(String value) {
            addCriterion("PARK_NAME not like", value, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameIn(List<String> values) {
            addCriterion("PARK_NAME in", values, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotIn(List<String> values) {
            addCriterion("PARK_NAME not in", values, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameBetween(String value1, String value2) {
            addCriterion("PARK_NAME between", value1, value2, "parkName");
            return (Criteria) this;
        }

        public Criteria andParkNameNotBetween(String value1, String value2) {
            addCriterion("PARK_NAME not between", value1, value2, "parkName");
            return (Criteria) this;
        }

        public Criteria andWorkTimesIsNull() {
            addCriterion("WORK_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimesIsNotNull() {
            addCriterion("WORK_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimesEqualTo(String value) {
            addCriterion("WORK_TIMES =", value, "workTimes");
            return (Criteria) this;
        }

        public Criteria andWorkTimesNotEqualTo(String value) {
            addCriterion("WORK_TIMES <>", value, "workTimes");
            return (Criteria) this;
        }

        public Criteria andWorkTimesGreaterThan(String value) {
            addCriterion("WORK_TIMES >", value, "workTimes");
            return (Criteria) this;
        }

        public Criteria andWorkTimesGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_TIMES >=", value, "workTimes");
            return (Criteria) this;
        }

        public Criteria andWorkTimesLessThan(String value) {
            addCriterion("WORK_TIMES <", value, "workTimes");
            return (Criteria) this;
        }

        public Criteria andWorkTimesLessThanOrEqualTo(String value) {
            addCriterion("WORK_TIMES <=", value, "workTimes");
            return (Criteria) this;
        }

        public Criteria andWorkTimesLike(String value) {
            addCriterion("WORK_TIMES like", value, "workTimes");
            return (Criteria) this;
        }

        public Criteria andWorkTimesNotLike(String value) {
            addCriterion("WORK_TIMES not like", value, "workTimes");
            return (Criteria) this;
        }

        public Criteria andWorkTimesIn(List<String> values) {
            addCriterion("WORK_TIMES in", values, "workTimes");
            return (Criteria) this;
        }

        public Criteria andWorkTimesNotIn(List<String> values) {
            addCriterion("WORK_TIMES not in", values, "workTimes");
            return (Criteria) this;
        }

        public Criteria andWorkTimesBetween(String value1, String value2) {
            addCriterion("WORK_TIMES between", value1, value2, "workTimes");
            return (Criteria) this;
        }

        public Criteria andWorkTimesNotBetween(String value1, String value2) {
            addCriterion("WORK_TIMES not between", value1, value2, "workTimes");
            return (Criteria) this;
        }

        public Criteria andMapLngIsNull() {
            addCriterion("MAP_LNG is null");
            return (Criteria) this;
        }

        public Criteria andMapLngIsNotNull() {
            addCriterion("MAP_LNG is not null");
            return (Criteria) this;
        }

        public Criteria andMapLngEqualTo(BigDecimal value) {
            addCriterion("MAP_LNG =", value, "mapLng");
            return (Criteria) this;
        }

        public Criteria andMapLngNotEqualTo(BigDecimal value) {
            addCriterion("MAP_LNG <>", value, "mapLng");
            return (Criteria) this;
        }

        public Criteria andMapLngGreaterThan(BigDecimal value) {
            addCriterion("MAP_LNG >", value, "mapLng");
            return (Criteria) this;
        }

        public Criteria andMapLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAP_LNG >=", value, "mapLng");
            return (Criteria) this;
        }

        public Criteria andMapLngLessThan(BigDecimal value) {
            addCriterion("MAP_LNG <", value, "mapLng");
            return (Criteria) this;
        }

        public Criteria andMapLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAP_LNG <=", value, "mapLng");
            return (Criteria) this;
        }

        public Criteria andMapLngIn(List<BigDecimal> values) {
            addCriterion("MAP_LNG in", values, "mapLng");
            return (Criteria) this;
        }

        public Criteria andMapLngNotIn(List<BigDecimal> values) {
            addCriterion("MAP_LNG not in", values, "mapLng");
            return (Criteria) this;
        }

        public Criteria andMapLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAP_LNG between", value1, value2, "mapLng");
            return (Criteria) this;
        }

        public Criteria andMapLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAP_LNG not between", value1, value2, "mapLng");
            return (Criteria) this;
        }

        public Criteria andMapLatIsNull() {
            addCriterion("MAP_LAT is null");
            return (Criteria) this;
        }

        public Criteria andMapLatIsNotNull() {
            addCriterion("MAP_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andMapLatEqualTo(BigDecimal value) {
            addCriterion("MAP_LAT =", value, "mapLat");
            return (Criteria) this;
        }

        public Criteria andMapLatNotEqualTo(BigDecimal value) {
            addCriterion("MAP_LAT <>", value, "mapLat");
            return (Criteria) this;
        }

        public Criteria andMapLatGreaterThan(BigDecimal value) {
            addCriterion("MAP_LAT >", value, "mapLat");
            return (Criteria) this;
        }

        public Criteria andMapLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAP_LAT >=", value, "mapLat");
            return (Criteria) this;
        }

        public Criteria andMapLatLessThan(BigDecimal value) {
            addCriterion("MAP_LAT <", value, "mapLat");
            return (Criteria) this;
        }

        public Criteria andMapLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAP_LAT <=", value, "mapLat");
            return (Criteria) this;
        }

        public Criteria andMapLatIn(List<BigDecimal> values) {
            addCriterion("MAP_LAT in", values, "mapLat");
            return (Criteria) this;
        }

        public Criteria andMapLatNotIn(List<BigDecimal> values) {
            addCriterion("MAP_LAT not in", values, "mapLat");
            return (Criteria) this;
        }

        public Criteria andMapLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAP_LAT between", value1, value2, "mapLat");
            return (Criteria) this;
        }

        public Criteria andMapLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAP_LAT not between", value1, value2, "mapLat");
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

        public Criteria andFeeStandardIdEqualTo(String value) {
            addCriterion("FEE_STANDARD_ID =", value, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdNotEqualTo(String value) {
            addCriterion("FEE_STANDARD_ID <>", value, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdGreaterThan(String value) {
            addCriterion("FEE_STANDARD_ID >", value, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_STANDARD_ID >=", value, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdLessThan(String value) {
            addCriterion("FEE_STANDARD_ID <", value, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdLessThanOrEqualTo(String value) {
            addCriterion("FEE_STANDARD_ID <=", value, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdLike(String value) {
            addCriterion("FEE_STANDARD_ID like", value, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdNotLike(String value) {
            addCriterion("FEE_STANDARD_ID not like", value, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdIn(List<String> values) {
            addCriterion("FEE_STANDARD_ID in", values, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdNotIn(List<String> values) {
            addCriterion("FEE_STANDARD_ID not in", values, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdBetween(String value1, String value2) {
            addCriterion("FEE_STANDARD_ID between", value1, value2, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andFeeStandardIdNotBetween(String value1, String value2) {
            addCriterion("FEE_STANDARD_ID not between", value1, value2, "feeStandardId");
            return (Criteria) this;
        }

        public Criteria andPublicDepictIsNull() {
            addCriterion("PUBLIC_DEPICT is null");
            return (Criteria) this;
        }

        public Criteria andPublicDepictIsNotNull() {
            addCriterion("PUBLIC_DEPICT is not null");
            return (Criteria) this;
        }

        public Criteria andPublicDepictEqualTo(String value) {
            addCriterion("PUBLIC_DEPICT =", value, "publicDepict");
            return (Criteria) this;
        }

        public Criteria andPublicDepictNotEqualTo(String value) {
            addCriterion("PUBLIC_DEPICT <>", value, "publicDepict");
            return (Criteria) this;
        }

        public Criteria andPublicDepictGreaterThan(String value) {
            addCriterion("PUBLIC_DEPICT >", value, "publicDepict");
            return (Criteria) this;
        }

        public Criteria andPublicDepictGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLIC_DEPICT >=", value, "publicDepict");
            return (Criteria) this;
        }

        public Criteria andPublicDepictLessThan(String value) {
            addCriterion("PUBLIC_DEPICT <", value, "publicDepict");
            return (Criteria) this;
        }

        public Criteria andPublicDepictLessThanOrEqualTo(String value) {
            addCriterion("PUBLIC_DEPICT <=", value, "publicDepict");
            return (Criteria) this;
        }

        public Criteria andPublicDepictLike(String value) {
            addCriterion("PUBLIC_DEPICT like", value, "publicDepict");
            return (Criteria) this;
        }

        public Criteria andPublicDepictNotLike(String value) {
            addCriterion("PUBLIC_DEPICT not like", value, "publicDepict");
            return (Criteria) this;
        }

        public Criteria andPublicDepictIn(List<String> values) {
            addCriterion("PUBLIC_DEPICT in", values, "publicDepict");
            return (Criteria) this;
        }

        public Criteria andPublicDepictNotIn(List<String> values) {
            addCriterion("PUBLIC_DEPICT not in", values, "publicDepict");
            return (Criteria) this;
        }

        public Criteria andPublicDepictBetween(String value1, String value2) {
            addCriterion("PUBLIC_DEPICT between", value1, value2, "publicDepict");
            return (Criteria) this;
        }

        public Criteria andPublicDepictNotBetween(String value1, String value2) {
            addCriterion("PUBLIC_DEPICT not between", value1, value2, "publicDepict");
            return (Criteria) this;
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

        public Criteria andParkTypeIsNull() {
            addCriterion("PARK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andParkTypeIsNotNull() {
            addCriterion("PARK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andParkTypeEqualTo(String value) {
            addCriterion("PARK_TYPE =", value, "parkType");
            return (Criteria) this;
        }

        public Criteria andParkTypeNotEqualTo(String value) {
            addCriterion("PARK_TYPE <>", value, "parkType");
            return (Criteria) this;
        }

        public Criteria andParkTypeGreaterThan(String value) {
            addCriterion("PARK_TYPE >", value, "parkType");
            return (Criteria) this;
        }

        public Criteria andParkTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PARK_TYPE >=", value, "parkType");
            return (Criteria) this;
        }

        public Criteria andParkTypeLessThan(String value) {
            addCriterion("PARK_TYPE <", value, "parkType");
            return (Criteria) this;
        }

        public Criteria andParkTypeLessThanOrEqualTo(String value) {
            addCriterion("PARK_TYPE <=", value, "parkType");
            return (Criteria) this;
        }

        public Criteria andParkTypeLike(String value) {
            addCriterion("PARK_TYPE like", value, "parkType");
            return (Criteria) this;
        }

        public Criteria andParkTypeNotLike(String value) {
            addCriterion("PARK_TYPE not like", value, "parkType");
            return (Criteria) this;
        }

        public Criteria andParkTypeIn(List<String> values) {
            addCriterion("PARK_TYPE in", values, "parkType");
            return (Criteria) this;
        }

        public Criteria andParkTypeNotIn(List<String> values) {
            addCriterion("PARK_TYPE not in", values, "parkType");
            return (Criteria) this;
        }

        public Criteria andParkTypeBetween(String value1, String value2) {
            addCriterion("PARK_TYPE between", value1, value2, "parkType");
            return (Criteria) this;
        }

        public Criteria andParkTypeNotBetween(String value1, String value2) {
            addCriterion("PARK_TYPE not between", value1, value2, "parkType");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("CITY_CODE =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("CITY_CODE <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("CITY_CODE >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_CODE >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("CITY_CODE <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("CITY_CODE <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("CITY_CODE like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("CITY_CODE not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("CITY_CODE in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("CITY_CODE not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("CITY_CODE between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("CITY_CODE not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("CITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("CITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("CITY_NAME =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("CITY_NAME <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("CITY_NAME >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_NAME >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("CITY_NAME <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("CITY_NAME <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("CITY_NAME like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("CITY_NAME not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("CITY_NAME in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("CITY_NAME not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("CITY_NAME between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("CITY_NAME not between", value1, value2, "cityName");
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

        public Criteria andParkDescIsNull() {
            addCriterion("park_desc is null");
            return (Criteria) this;
        }

        public Criteria andParkDescIsNotNull() {
            addCriterion("park_desc is not null");
            return (Criteria) this;
        }

        public Criteria andParkDescEqualTo(String value) {
            addCriterion("park_desc =", value, "parkDesc");
            return (Criteria) this;
        }

        public Criteria andParkDescNotEqualTo(String value) {
            addCriterion("park_desc <>", value, "parkDesc");
            return (Criteria) this;
        }

        public Criteria andParkDescGreaterThan(String value) {
            addCriterion("park_desc >", value, "parkDesc");
            return (Criteria) this;
        }

        public Criteria andParkDescGreaterThanOrEqualTo(String value) {
            addCriterion("park_desc >=", value, "parkDesc");
            return (Criteria) this;
        }

        public Criteria andParkDescLessThan(String value) {
            addCriterion("park_desc <", value, "parkDesc");
            return (Criteria) this;
        }

        public Criteria andParkDescLessThanOrEqualTo(String value) {
            addCriterion("park_desc <=", value, "parkDesc");
            return (Criteria) this;
        }

        public Criteria andParkDescLike(String value) {
            addCriterion("park_desc like", value, "parkDesc");
            return (Criteria) this;
        }

        public Criteria andParkDescNotLike(String value) {
            addCriterion("park_desc not like", value, "parkDesc");
            return (Criteria) this;
        }

        public Criteria andParkDescIn(List<String> values) {
            addCriterion("park_desc in", values, "parkDesc");
            return (Criteria) this;
        }

        public Criteria andParkDescNotIn(List<String> values) {
            addCriterion("park_desc not in", values, "parkDesc");
            return (Criteria) this;
        }

        public Criteria andParkDescBetween(String value1, String value2) {
            addCriterion("park_desc between", value1, value2, "parkDesc");
            return (Criteria) this;
        }

        public Criteria andParkDescNotBetween(String value1, String value2) {
            addCriterion("park_desc not between", value1, value2, "parkDesc");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNull() {
            addCriterion("user_mobile is null");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNotNull() {
            addCriterion("user_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andUserMobileEqualTo(String value) {
            addCriterion("user_mobile =", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotEqualTo(String value) {
            addCriterion("user_mobile <>", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThan(String value) {
            addCriterion("user_mobile >", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("user_mobile >=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThan(String value) {
            addCriterion("user_mobile <", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThanOrEqualTo(String value) {
            addCriterion("user_mobile <=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLike(String value) {
            addCriterion("user_mobile like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotLike(String value) {
            addCriterion("user_mobile not like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileIn(List<String> values) {
            addCriterion("user_mobile in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotIn(List<String> values) {
            addCriterion("user_mobile not in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileBetween(String value1, String value2) {
            addCriterion("user_mobile between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotBetween(String value1, String value2) {
            addCriterion("user_mobile not between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andPlaceTemIsNull() {
            addCriterion("place_tem is null");
            return (Criteria) this;
        }

        public Criteria andPlaceTemIsNotNull() {
            addCriterion("place_tem is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceTemEqualTo(Integer value) {
            addCriterion("place_tem =", value, "placeTem");
            return (Criteria) this;
        }

        public Criteria andPlaceTemNotEqualTo(Integer value) {
            addCriterion("place_tem <>", value, "placeTem");
            return (Criteria) this;
        }

        public Criteria andPlaceTemGreaterThan(Integer value) {
            addCriterion("place_tem >", value, "placeTem");
            return (Criteria) this;
        }

        public Criteria andPlaceTemGreaterThanOrEqualTo(Integer value) {
            addCriterion("place_tem >=", value, "placeTem");
            return (Criteria) this;
        }

        public Criteria andPlaceTemLessThan(Integer value) {
            addCriterion("place_tem <", value, "placeTem");
            return (Criteria) this;
        }

        public Criteria andPlaceTemLessThanOrEqualTo(Integer value) {
            addCriterion("place_tem <=", value, "placeTem");
            return (Criteria) this;
        }

        public Criteria andPlaceTemIn(List<Integer> values) {
            addCriterion("place_tem in", values, "placeTem");
            return (Criteria) this;
        }

        public Criteria andPlaceTemNotIn(List<Integer> values) {
            addCriterion("place_tem not in", values, "placeTem");
            return (Criteria) this;
        }

        public Criteria andPlaceTemBetween(Integer value1, Integer value2) {
            addCriterion("place_tem between", value1, value2, "placeTem");
            return (Criteria) this;
        }

        public Criteria andPlaceTemNotBetween(Integer value1, Integer value2) {
            addCriterion("place_tem not between", value1, value2, "placeTem");
            return (Criteria) this;
        }

        public Criteria andPlaceCountIsNull() {
            addCriterion("place_count is null");
            return (Criteria) this;
        }

        public Criteria andPlaceCountIsNotNull() {
            addCriterion("place_count is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceCountEqualTo(Integer value) {
            addCriterion("place_count =", value, "placeCount");
            return (Criteria) this;
        }

        public Criteria andPlaceCountNotEqualTo(Integer value) {
            addCriterion("place_count <>", value, "placeCount");
            return (Criteria) this;
        }

        public Criteria andPlaceCountGreaterThan(Integer value) {
            addCriterion("place_count >", value, "placeCount");
            return (Criteria) this;
        }

        public Criteria andPlaceCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("place_count >=", value, "placeCount");
            return (Criteria) this;
        }

        public Criteria andPlaceCountLessThan(Integer value) {
            addCriterion("place_count <", value, "placeCount");
            return (Criteria) this;
        }

        public Criteria andPlaceCountLessThanOrEqualTo(Integer value) {
            addCriterion("place_count <=", value, "placeCount");
            return (Criteria) this;
        }

        public Criteria andPlaceCountIn(List<Integer> values) {
            addCriterion("place_count in", values, "placeCount");
            return (Criteria) this;
        }

        public Criteria andPlaceCountNotIn(List<Integer> values) {
            addCriterion("place_count not in", values, "placeCount");
            return (Criteria) this;
        }

        public Criteria andPlaceCountBetween(Integer value1, Integer value2) {
            addCriterion("place_count between", value1, value2, "placeCount");
            return (Criteria) this;
        }

        public Criteria andPlaceCountNotBetween(Integer value1, Integer value2) {
            addCriterion("place_count not between", value1, value2, "placeCount");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Timestamp value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Timestamp value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Timestamp value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Timestamp value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Timestamp> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Timestamp> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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