package com.x.common.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SysAdvertManagerCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysAdvertManagerCriteria() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andAdvertisingPositionIsNull() {
            addCriterion("advertising_position is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPositionIsNotNull() {
            addCriterion("advertising_position is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPositionEqualTo(String value) {
            addCriterion("advertising_position =", value, "advertisingPosition");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPositionNotEqualTo(String value) {
            addCriterion("advertising_position <>", value, "advertisingPosition");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPositionGreaterThan(String value) {
            addCriterion("advertising_position >", value, "advertisingPosition");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPositionGreaterThanOrEqualTo(String value) {
            addCriterion("advertising_position >=", value, "advertisingPosition");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPositionLessThan(String value) {
            addCriterion("advertising_position <", value, "advertisingPosition");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPositionLessThanOrEqualTo(String value) {
            addCriterion("advertising_position <=", value, "advertisingPosition");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPositionLike(String value) {
            addCriterion("advertising_position like", value, "advertisingPosition");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPositionNotLike(String value) {
            addCriterion("advertising_position not like", value, "advertisingPosition");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPositionIn(List<String> values) {
            addCriterion("advertising_position in", values, "advertisingPosition");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPositionNotIn(List<String> values) {
            addCriterion("advertising_position not in", values, "advertisingPosition");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPositionBetween(String value1, String value2) {
            addCriterion("advertising_position between", value1, value2, "advertisingPosition");
            return (Criteria) this;
        }

        public Criteria andAdvertisingPositionNotBetween(String value1, String value2) {
            addCriterion("advertising_position not between", value1, value2, "advertisingPosition");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameIsNull() {
            addCriterion("advertising_name is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameIsNotNull() {
            addCriterion("advertising_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameEqualTo(String value) {
            addCriterion("advertising_name =", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameNotEqualTo(String value) {
            addCriterion("advertising_name <>", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameGreaterThan(String value) {
            addCriterion("advertising_name >", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameGreaterThanOrEqualTo(String value) {
            addCriterion("advertising_name >=", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameLessThan(String value) {
            addCriterion("advertising_name <", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameLessThanOrEqualTo(String value) {
            addCriterion("advertising_name <=", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameLike(String value) {
            addCriterion("advertising_name like", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameNotLike(String value) {
            addCriterion("advertising_name not like", value, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameIn(List<String> values) {
            addCriterion("advertising_name in", values, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameNotIn(List<String> values) {
            addCriterion("advertising_name not in", values, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameBetween(String value1, String value2) {
            addCriterion("advertising_name between", value1, value2, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andAdvertisingNameNotBetween(String value1, String value2) {
            addCriterion("advertising_name not between", value1, value2, "advertisingName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andThumbnailIdIsNull() {
            addCriterion("thumbnail_id is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailIdIsNotNull() {
            addCriterion("thumbnail_id is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailIdEqualTo(String value) {
            addCriterion("thumbnail_id =", value, "thumbnailId");
            return (Criteria) this;
        }

        public Criteria andThumbnailIdNotEqualTo(String value) {
            addCriterion("thumbnail_id <>", value, "thumbnailId");
            return (Criteria) this;
        }

        public Criteria andThumbnailIdGreaterThan(String value) {
            addCriterion("thumbnail_id >", value, "thumbnailId");
            return (Criteria) this;
        }

        public Criteria andThumbnailIdGreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail_id >=", value, "thumbnailId");
            return (Criteria) this;
        }

        public Criteria andThumbnailIdLessThan(String value) {
            addCriterion("thumbnail_id <", value, "thumbnailId");
            return (Criteria) this;
        }

        public Criteria andThumbnailIdLessThanOrEqualTo(String value) {
            addCriterion("thumbnail_id <=", value, "thumbnailId");
            return (Criteria) this;
        }

        public Criteria andThumbnailIdLike(String value) {
            addCriterion("thumbnail_id like", value, "thumbnailId");
            return (Criteria) this;
        }

        public Criteria andThumbnailIdNotLike(String value) {
            addCriterion("thumbnail_id not like", value, "thumbnailId");
            return (Criteria) this;
        }

        public Criteria andThumbnailIdIn(List<String> values) {
            addCriterion("thumbnail_id in", values, "thumbnailId");
            return (Criteria) this;
        }

        public Criteria andThumbnailIdNotIn(List<String> values) {
            addCriterion("thumbnail_id not in", values, "thumbnailId");
            return (Criteria) this;
        }

        public Criteria andThumbnailIdBetween(String value1, String value2) {
            addCriterion("thumbnail_id between", value1, value2, "thumbnailId");
            return (Criteria) this;
        }

        public Criteria andThumbnailIdNotBetween(String value1, String value2) {
            addCriterion("thumbnail_id not between", value1, value2, "thumbnailId");
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

        public Criteria andUpdateaditorIsNull() {
            addCriterion("updateaditor is null");
            return (Criteria) this;
        }

        public Criteria andUpdateaditorIsNotNull() {
            addCriterion("updateaditor is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateaditorEqualTo(String value) {
            addCriterion("updateaditor =", value, "updateaditor");
            return (Criteria) this;
        }

        public Criteria andUpdateaditorNotEqualTo(String value) {
            addCriterion("updateaditor <>", value, "updateaditor");
            return (Criteria) this;
        }

        public Criteria andUpdateaditorGreaterThan(String value) {
            addCriterion("updateaditor >", value, "updateaditor");
            return (Criteria) this;
        }

        public Criteria andUpdateaditorGreaterThanOrEqualTo(String value) {
            addCriterion("updateaditor >=", value, "updateaditor");
            return (Criteria) this;
        }

        public Criteria andUpdateaditorLessThan(String value) {
            addCriterion("updateaditor <", value, "updateaditor");
            return (Criteria) this;
        }

        public Criteria andUpdateaditorLessThanOrEqualTo(String value) {
            addCriterion("updateaditor <=", value, "updateaditor");
            return (Criteria) this;
        }

        public Criteria andUpdateaditorLike(String value) {
            addCriterion("updateaditor like", value, "updateaditor");
            return (Criteria) this;
        }

        public Criteria andUpdateaditorNotLike(String value) {
            addCriterion("updateaditor not like", value, "updateaditor");
            return (Criteria) this;
        }

        public Criteria andUpdateaditorIn(List<String> values) {
            addCriterion("updateaditor in", values, "updateaditor");
            return (Criteria) this;
        }

        public Criteria andUpdateaditorNotIn(List<String> values) {
            addCriterion("updateaditor not in", values, "updateaditor");
            return (Criteria) this;
        }

        public Criteria andUpdateaditorBetween(String value1, String value2) {
            addCriterion("updateaditor between", value1, value2, "updateaditor");
            return (Criteria) this;
        }

        public Criteria andUpdateaditorNotBetween(String value1, String value2) {
            addCriterion("updateaditor not between", value1, value2, "updateaditor");
            return (Criteria) this;
        }

        public Criteria andClickRateIsNull() {
            addCriterion("click_rate is null");
            return (Criteria) this;
        }

        public Criteria andClickRateIsNotNull() {
            addCriterion("click_rate is not null");
            return (Criteria) this;
        }

        public Criteria andClickRateEqualTo(Long value) {
            addCriterion("click_rate =", value, "clickRate");
            return (Criteria) this;
        }

        public Criteria andClickRateNotEqualTo(Long value) {
            addCriterion("click_rate <>", value, "clickRate");
            return (Criteria) this;
        }

        public Criteria andClickRateGreaterThan(Long value) {
            addCriterion("click_rate >", value, "clickRate");
            return (Criteria) this;
        }

        public Criteria andClickRateGreaterThanOrEqualTo(Long value) {
            addCriterion("click_rate >=", value, "clickRate");
            return (Criteria) this;
        }

        public Criteria andClickRateLessThan(Long value) {
            addCriterion("click_rate <", value, "clickRate");
            return (Criteria) this;
        }

        public Criteria andClickRateLessThanOrEqualTo(Long value) {
            addCriterion("click_rate <=", value, "clickRate");
            return (Criteria) this;
        }

        public Criteria andClickRateIn(List<Long> values) {
            addCriterion("click_rate in", values, "clickRate");
            return (Criteria) this;
        }

        public Criteria andClickRateNotIn(List<Long> values) {
            addCriterion("click_rate not in", values, "clickRate");
            return (Criteria) this;
        }

        public Criteria andClickRateBetween(Long value1, Long value2) {
            addCriterion("click_rate between", value1, value2, "clickRate");
            return (Criteria) this;
        }

        public Criteria andClickRateNotBetween(Long value1, Long value2) {
            addCriterion("click_rate not between", value1, value2, "clickRate");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andRegionalLanguageIsNull() {
            addCriterion("regional_language is null");
            return (Criteria) this;
        }

        public Criteria andRegionalLanguageIsNotNull() {
            addCriterion("regional_language is not null");
            return (Criteria) this;
        }

        public Criteria andRegionalLanguageEqualTo(String value) {
            addCriterion("regional_language =", value, "regionalLanguage");
            return (Criteria) this;
        }

        public Criteria andRegionalLanguageNotEqualTo(String value) {
            addCriterion("regional_language <>", value, "regionalLanguage");
            return (Criteria) this;
        }

        public Criteria andRegionalLanguageGreaterThan(String value) {
            addCriterion("regional_language >", value, "regionalLanguage");
            return (Criteria) this;
        }

        public Criteria andRegionalLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("regional_language >=", value, "regionalLanguage");
            return (Criteria) this;
        }

        public Criteria andRegionalLanguageLessThan(String value) {
            addCriterion("regional_language <", value, "regionalLanguage");
            return (Criteria) this;
        }

        public Criteria andRegionalLanguageLessThanOrEqualTo(String value) {
            addCriterion("regional_language <=", value, "regionalLanguage");
            return (Criteria) this;
        }

        public Criteria andRegionalLanguageLike(String value) {
            addCriterion("regional_language like", value, "regionalLanguage");
            return (Criteria) this;
        }

        public Criteria andRegionalLanguageNotLike(String value) {
            addCriterion("regional_language not like", value, "regionalLanguage");
            return (Criteria) this;
        }

        public Criteria andRegionalLanguageIn(List<String> values) {
            addCriterion("regional_language in", values, "regionalLanguage");
            return (Criteria) this;
        }

        public Criteria andRegionalLanguageNotIn(List<String> values) {
            addCriterion("regional_language not in", values, "regionalLanguage");
            return (Criteria) this;
        }

        public Criteria andRegionalLanguageBetween(String value1, String value2) {
            addCriterion("regional_language between", value1, value2, "regionalLanguage");
            return (Criteria) this;
        }

        public Criteria andRegionalLanguageNotBetween(String value1, String value2) {
            addCriterion("regional_language not between", value1, value2, "regionalLanguage");
            return (Criteria) this;
        }

        public Criteria andAdvertisingTypeIsNull() {
            addCriterion("advertising_type is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingTypeIsNotNull() {
            addCriterion("advertising_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingTypeEqualTo(String value) {
            addCriterion("advertising_type =", value, "advertisingType");
            return (Criteria) this;
        }

        public Criteria andAdvertisingTypeNotEqualTo(String value) {
            addCriterion("advertising_type <>", value, "advertisingType");
            return (Criteria) this;
        }

        public Criteria andAdvertisingTypeGreaterThan(String value) {
            addCriterion("advertising_type >", value, "advertisingType");
            return (Criteria) this;
        }

        public Criteria andAdvertisingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("advertising_type >=", value, "advertisingType");
            return (Criteria) this;
        }

        public Criteria andAdvertisingTypeLessThan(String value) {
            addCriterion("advertising_type <", value, "advertisingType");
            return (Criteria) this;
        }

        public Criteria andAdvertisingTypeLessThanOrEqualTo(String value) {
            addCriterion("advertising_type <=", value, "advertisingType");
            return (Criteria) this;
        }

        public Criteria andAdvertisingTypeLike(String value) {
            addCriterion("advertising_type like", value, "advertisingType");
            return (Criteria) this;
        }

        public Criteria andAdvertisingTypeNotLike(String value) {
            addCriterion("advertising_type not like", value, "advertisingType");
            return (Criteria) this;
        }

        public Criteria andAdvertisingTypeIn(List<String> values) {
            addCriterion("advertising_type in", values, "advertisingType");
            return (Criteria) this;
        }

        public Criteria andAdvertisingTypeNotIn(List<String> values) {
            addCriterion("advertising_type not in", values, "advertisingType");
            return (Criteria) this;
        }

        public Criteria andAdvertisingTypeBetween(String value1, String value2) {
            addCriterion("advertising_type between", value1, value2, "advertisingType");
            return (Criteria) this;
        }

        public Criteria andAdvertisingTypeNotBetween(String value1, String value2) {
            addCriterion("advertising_type not between", value1, value2, "advertisingType");
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

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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