package com.x.centra.dst.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class DstCustDiscountInstanceCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public DstCustDiscountInstanceCriteria() {
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

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("TENANT_ID =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("TENANT_ID <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("TENANT_ID >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("TENANT_ID >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("TENANT_ID <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("TENANT_ID <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("TENANT_ID like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("TENANT_ID not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("TENANT_ID in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("TENANT_ID not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("TENANT_ID between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("TENANT_ID not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdIsNull() {
            addCriterion("INSTANCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andInstanceIdIsNotNull() {
            addCriterion("INSTANCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceIdEqualTo(String value) {
            addCriterion("INSTANCE_ID =", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdNotEqualTo(String value) {
            addCriterion("INSTANCE_ID <>", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdGreaterThan(String value) {
            addCriterion("INSTANCE_ID >", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("INSTANCE_ID >=", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdLessThan(String value) {
            addCriterion("INSTANCE_ID <", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdLessThanOrEqualTo(String value) {
            addCriterion("INSTANCE_ID <=", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdLike(String value) {
            addCriterion("INSTANCE_ID like", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdNotLike(String value) {
            addCriterion("INSTANCE_ID not like", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdIn(List<String> values) {
            addCriterion("INSTANCE_ID in", values, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdNotIn(List<String> values) {
            addCriterion("INSTANCE_ID not in", values, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdBetween(String value1, String value2) {
            addCriterion("INSTANCE_ID between", value1, value2, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdNotBetween(String value1, String value2) {
            addCriterion("INSTANCE_ID not between", value1, value2, "instanceId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdIsNull() {
            addCriterion("DISCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIdIsNotNull() {
            addCriterion("DISCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountIdEqualTo(String value) {
            addCriterion("DISCOUNT_ID =", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdNotEqualTo(String value) {
            addCriterion("DISCOUNT_ID <>", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdGreaterThan(String value) {
            addCriterion("DISCOUNT_ID >", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdGreaterThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_ID >=", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdLessThan(String value) {
            addCriterion("DISCOUNT_ID <", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdLessThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_ID <=", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdLike(String value) {
            addCriterion("DISCOUNT_ID like", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdNotLike(String value) {
            addCriterion("DISCOUNT_ID not like", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdIn(List<String> values) {
            addCriterion("DISCOUNT_ID in", values, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdNotIn(List<String> values) {
            addCriterion("DISCOUNT_ID not in", values, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdBetween(String value1, String value2) {
            addCriterion("DISCOUNT_ID between", value1, value2, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdNotBetween(String value1, String value2) {
            addCriterion("DISCOUNT_ID not between", value1, value2, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeIsNull() {
            addCriterion("DISCOUNT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeIsNotNull() {
            addCriterion("DISCOUNT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeEqualTo(String value) {
            addCriterion("DISCOUNT_CODE =", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotEqualTo(String value) {
            addCriterion("DISCOUNT_CODE <>", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeGreaterThan(String value) {
            addCriterion("DISCOUNT_CODE >", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_CODE >=", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeLessThan(String value) {
            addCriterion("DISCOUNT_CODE <", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeLessThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_CODE <=", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeLike(String value) {
            addCriterion("DISCOUNT_CODE like", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotLike(String value) {
            addCriterion("DISCOUNT_CODE not like", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeIn(List<String> values) {
            addCriterion("DISCOUNT_CODE in", values, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotIn(List<String> values) {
            addCriterion("DISCOUNT_CODE not in", values, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeBetween(String value1, String value2) {
            addCriterion("DISCOUNT_CODE between", value1, value2, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotBetween(String value1, String value2) {
            addCriterion("DISCOUNT_CODE not between", value1, value2, "discountCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeIsNull() {
            addCriterion("OWNER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeIsNotNull() {
            addCriterion("OWNER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeEqualTo(String value) {
            addCriterion("OWNER_CODE =", value, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeNotEqualTo(String value) {
            addCriterion("OWNER_CODE <>", value, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeGreaterThan(String value) {
            addCriterion("OWNER_CODE >", value, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER_CODE >=", value, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeLessThan(String value) {
            addCriterion("OWNER_CODE <", value, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeLessThanOrEqualTo(String value) {
            addCriterion("OWNER_CODE <=", value, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeLike(String value) {
            addCriterion("OWNER_CODE like", value, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeNotLike(String value) {
            addCriterion("OWNER_CODE not like", value, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeIn(List<String> values) {
            addCriterion("OWNER_CODE in", values, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeNotIn(List<String> values) {
            addCriterion("OWNER_CODE not in", values, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeBetween(String value1, String value2) {
            addCriterion("OWNER_CODE between", value1, value2, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeNotBetween(String value1, String value2) {
            addCriterion("OWNER_CODE not between", value1, value2, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerInstanceCodeIsNull() {
            addCriterion("OWNER_INSTANCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOwnerInstanceCodeIsNotNull() {
            addCriterion("OWNER_INSTANCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerInstanceCodeEqualTo(String value) {
            addCriterion("OWNER_INSTANCE_CODE =", value, "ownerInstanceCode");
            return (Criteria) this;
        }

        public Criteria andOwnerInstanceCodeNotEqualTo(String value) {
            addCriterion("OWNER_INSTANCE_CODE <>", value, "ownerInstanceCode");
            return (Criteria) this;
        }

        public Criteria andOwnerInstanceCodeGreaterThan(String value) {
            addCriterion("OWNER_INSTANCE_CODE >", value, "ownerInstanceCode");
            return (Criteria) this;
        }

        public Criteria andOwnerInstanceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER_INSTANCE_CODE >=", value, "ownerInstanceCode");
            return (Criteria) this;
        }

        public Criteria andOwnerInstanceCodeLessThan(String value) {
            addCriterion("OWNER_INSTANCE_CODE <", value, "ownerInstanceCode");
            return (Criteria) this;
        }

        public Criteria andOwnerInstanceCodeLessThanOrEqualTo(String value) {
            addCriterion("OWNER_INSTANCE_CODE <=", value, "ownerInstanceCode");
            return (Criteria) this;
        }

        public Criteria andOwnerInstanceCodeLike(String value) {
            addCriterion("OWNER_INSTANCE_CODE like", value, "ownerInstanceCode");
            return (Criteria) this;
        }

        public Criteria andOwnerInstanceCodeNotLike(String value) {
            addCriterion("OWNER_INSTANCE_CODE not like", value, "ownerInstanceCode");
            return (Criteria) this;
        }

        public Criteria andOwnerInstanceCodeIn(List<String> values) {
            addCriterion("OWNER_INSTANCE_CODE in", values, "ownerInstanceCode");
            return (Criteria) this;
        }

        public Criteria andOwnerInstanceCodeNotIn(List<String> values) {
            addCriterion("OWNER_INSTANCE_CODE not in", values, "ownerInstanceCode");
            return (Criteria) this;
        }

        public Criteria andOwnerInstanceCodeBetween(String value1, String value2) {
            addCriterion("OWNER_INSTANCE_CODE between", value1, value2, "ownerInstanceCode");
            return (Criteria) this;
        }

        public Criteria andOwnerInstanceCodeNotBetween(String value1, String value2) {
            addCriterion("OWNER_INSTANCE_CODE not between", value1, value2, "ownerInstanceCode");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("CUST_ID like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("CUST_ID not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andDiscountPayDateIsNull() {
            addCriterion("DISCOUNT_PAY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPayDateIsNotNull() {
            addCriterion("DISCOUNT_PAY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPayDateEqualTo(Timestamp value) {
            addCriterion("DISCOUNT_PAY_DATE =", value, "discountPayDate");
            return (Criteria) this;
        }

        public Criteria andDiscountPayDateNotEqualTo(Timestamp value) {
            addCriterion("DISCOUNT_PAY_DATE <>", value, "discountPayDate");
            return (Criteria) this;
        }

        public Criteria andDiscountPayDateGreaterThan(Timestamp value) {
            addCriterion("DISCOUNT_PAY_DATE >", value, "discountPayDate");
            return (Criteria) this;
        }

        public Criteria andDiscountPayDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("DISCOUNT_PAY_DATE >=", value, "discountPayDate");
            return (Criteria) this;
        }

        public Criteria andDiscountPayDateLessThan(Timestamp value) {
            addCriterion("DISCOUNT_PAY_DATE <", value, "discountPayDate");
            return (Criteria) this;
        }

        public Criteria andDiscountPayDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("DISCOUNT_PAY_DATE <=", value, "discountPayDate");
            return (Criteria) this;
        }

        public Criteria andDiscountPayDateIn(List<Timestamp> values) {
            addCriterion("DISCOUNT_PAY_DATE in", values, "discountPayDate");
            return (Criteria) this;
        }

        public Criteria andDiscountPayDateNotIn(List<Timestamp> values) {
            addCriterion("DISCOUNT_PAY_DATE not in", values, "discountPayDate");
            return (Criteria) this;
        }

        public Criteria andDiscountPayDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("DISCOUNT_PAY_DATE between", value1, value2, "discountPayDate");
            return (Criteria) this;
        }

        public Criteria andDiscountPayDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("DISCOUNT_PAY_DATE not between", value1, value2, "discountPayDate");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIsNull() {
            addCriterion("ACTIVE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIsNotNull() {
            addCriterion("ACTIVE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andActiveStatusEqualTo(String value) {
            addCriterion("ACTIVE_STATUS =", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusNotEqualTo(String value) {
            addCriterion("ACTIVE_STATUS <>", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusGreaterThan(String value) {
            addCriterion("ACTIVE_STATUS >", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVE_STATUS >=", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusLessThan(String value) {
            addCriterion("ACTIVE_STATUS <", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusLessThanOrEqualTo(String value) {
            addCriterion("ACTIVE_STATUS <=", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusLike(String value) {
            addCriterion("ACTIVE_STATUS like", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusNotLike(String value) {
            addCriterion("ACTIVE_STATUS not like", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIn(List<String> values) {
            addCriterion("ACTIVE_STATUS in", values, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusNotIn(List<String> values) {
            addCriterion("ACTIVE_STATUS not in", values, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusBetween(String value1, String value2) {
            addCriterion("ACTIVE_STATUS between", value1, value2, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusNotBetween(String value1, String value2) {
            addCriterion("ACTIVE_STATUS not between", value1, value2, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveDateIsNull() {
            addCriterion("ACTIVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andActiveDateIsNotNull() {
            addCriterion("ACTIVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andActiveDateEqualTo(Timestamp value) {
            addCriterion("ACTIVE_DATE =", value, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateNotEqualTo(Timestamp value) {
            addCriterion("ACTIVE_DATE <>", value, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateGreaterThan(Timestamp value) {
            addCriterion("ACTIVE_DATE >", value, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("ACTIVE_DATE >=", value, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateLessThan(Timestamp value) {
            addCriterion("ACTIVE_DATE <", value, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("ACTIVE_DATE <=", value, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateIn(List<Timestamp> values) {
            addCriterion("ACTIVE_DATE in", values, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateNotIn(List<Timestamp> values) {
            addCriterion("ACTIVE_DATE not in", values, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ACTIVE_DATE between", value1, value2, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ACTIVE_DATE not between", value1, value2, "activeDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIsNull() {
            addCriterion("EFFECTIVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIsNotNull() {
            addCriterion("EFFECTIVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateEqualTo(Timestamp value) {
            addCriterion("EFFECTIVE_DATE =", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotEqualTo(Timestamp value) {
            addCriterion("EFFECTIVE_DATE <>", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateGreaterThan(Timestamp value) {
            addCriterion("EFFECTIVE_DATE >", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("EFFECTIVE_DATE >=", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateLessThan(Timestamp value) {
            addCriterion("EFFECTIVE_DATE <", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("EFFECTIVE_DATE <=", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIn(List<Timestamp> values) {
            addCriterion("EFFECTIVE_DATE in", values, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotIn(List<Timestamp> values) {
            addCriterion("EFFECTIVE_DATE not in", values, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("EFFECTIVE_DATE between", value1, value2, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("EFFECTIVE_DATE not between", value1, value2, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIsNull() {
            addCriterion("EXPIRATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIsNotNull() {
            addCriterion("EXPIRATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateEqualTo(Timestamp value) {
            addCriterion("EXPIRATION_DATE =", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotEqualTo(Timestamp value) {
            addCriterion("EXPIRATION_DATE <>", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThan(Timestamp value) {
            addCriterion("EXPIRATION_DATE >", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("EXPIRATION_DATE >=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThan(Timestamp value) {
            addCriterion("EXPIRATION_DATE <", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("EXPIRATION_DATE <=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIn(List<Timestamp> values) {
            addCriterion("EXPIRATION_DATE in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotIn(List<Timestamp> values) {
            addCriterion("EXPIRATION_DATE not in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("EXPIRATION_DATE between", value1, value2, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("EXPIRATION_DATE not between", value1, value2, "expirationDate");
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

        public Criteria andCreateUserIdIsNull() {
            addCriterion("CREATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("CREATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(String value) {
            addCriterion("CREATE_USER_ID =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(String value) {
            addCriterion("CREATE_USER_ID <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(String value) {
            addCriterion("CREATE_USER_ID >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_ID >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(String value) {
            addCriterion("CREATE_USER_ID <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_ID <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLike(String value) {
            addCriterion("CREATE_USER_ID like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotLike(String value) {
            addCriterion("CREATE_USER_ID not like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<String> values) {
            addCriterion("CREATE_USER_ID in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<String> values) {
            addCriterion("CREATE_USER_ID not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(String value1, String value2) {
            addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Timestamp value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Timestamp value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Timestamp value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Timestamp value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Timestamp> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Timestamp> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemindIndexIsNull() {
            addCriterion("REMIND_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andRemindIndexIsNotNull() {
            addCriterion("REMIND_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andRemindIndexEqualTo(String value) {
            addCriterion("REMIND_INDEX =", value, "remindIndex");
            return (Criteria) this;
        }

        public Criteria andRemindIndexNotEqualTo(String value) {
            addCriterion("REMIND_INDEX <>", value, "remindIndex");
            return (Criteria) this;
        }

        public Criteria andRemindIndexGreaterThan(String value) {
            addCriterion("REMIND_INDEX >", value, "remindIndex");
            return (Criteria) this;
        }

        public Criteria andRemindIndexGreaterThanOrEqualTo(String value) {
            addCriterion("REMIND_INDEX >=", value, "remindIndex");
            return (Criteria) this;
        }

        public Criteria andRemindIndexLessThan(String value) {
            addCriterion("REMIND_INDEX <", value, "remindIndex");
            return (Criteria) this;
        }

        public Criteria andRemindIndexLessThanOrEqualTo(String value) {
            addCriterion("REMIND_INDEX <=", value, "remindIndex");
            return (Criteria) this;
        }

        public Criteria andRemindIndexLike(String value) {
            addCriterion("REMIND_INDEX like", value, "remindIndex");
            return (Criteria) this;
        }

        public Criteria andRemindIndexNotLike(String value) {
            addCriterion("REMIND_INDEX not like", value, "remindIndex");
            return (Criteria) this;
        }

        public Criteria andRemindIndexIn(List<String> values) {
            addCriterion("REMIND_INDEX in", values, "remindIndex");
            return (Criteria) this;
        }

        public Criteria andRemindIndexNotIn(List<String> values) {
            addCriterion("REMIND_INDEX not in", values, "remindIndex");
            return (Criteria) this;
        }

        public Criteria andRemindIndexBetween(String value1, String value2) {
            addCriterion("REMIND_INDEX between", value1, value2, "remindIndex");
            return (Criteria) this;
        }

        public Criteria andRemindIndexNotBetween(String value1, String value2) {
            addCriterion("REMIND_INDEX not between", value1, value2, "remindIndex");
            return (Criteria) this;
        }

        public Criteria andRemindStateIsNull() {
            addCriterion("REMIND_STATE is null");
            return (Criteria) this;
        }

        public Criteria andRemindStateIsNotNull() {
            addCriterion("REMIND_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andRemindStateEqualTo(String value) {
            addCriterion("REMIND_STATE =", value, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateNotEqualTo(String value) {
            addCriterion("REMIND_STATE <>", value, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateGreaterThan(String value) {
            addCriterion("REMIND_STATE >", value, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateGreaterThanOrEqualTo(String value) {
            addCriterion("REMIND_STATE >=", value, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateLessThan(String value) {
            addCriterion("REMIND_STATE <", value, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateLessThanOrEqualTo(String value) {
            addCriterion("REMIND_STATE <=", value, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateLike(String value) {
            addCriterion("REMIND_STATE like", value, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateNotLike(String value) {
            addCriterion("REMIND_STATE not like", value, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateIn(List<String> values) {
            addCriterion("REMIND_STATE in", values, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateNotIn(List<String> values) {
            addCriterion("REMIND_STATE not in", values, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateBetween(String value1, String value2) {
            addCriterion("REMIND_STATE between", value1, value2, "remindState");
            return (Criteria) this;
        }

        public Criteria andRemindStateNotBetween(String value1, String value2) {
            addCriterion("REMIND_STATE not between", value1, value2, "remindState");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("CUST_NAME =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("CUST_NAME <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("CUST_NAME >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NAME >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("CUST_NAME <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_NAME <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("CUST_NAME like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("CUST_NAME not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("CUST_NAME in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("CUST_NAME not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("CUST_NAME between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("CUST_NAME not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameIsNull() {
            addCriterion("DISCOUNT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDiscountNameIsNotNull() {
            addCriterion("DISCOUNT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountNameEqualTo(String value) {
            addCriterion("DISCOUNT_NAME =", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameNotEqualTo(String value) {
            addCriterion("DISCOUNT_NAME <>", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameGreaterThan(String value) {
            addCriterion("DISCOUNT_NAME >", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameGreaterThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_NAME >=", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameLessThan(String value) {
            addCriterion("DISCOUNT_NAME <", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameLessThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_NAME <=", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameLike(String value) {
            addCriterion("DISCOUNT_NAME like", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameNotLike(String value) {
            addCriterion("DISCOUNT_NAME not like", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameIn(List<String> values) {
            addCriterion("DISCOUNT_NAME in", values, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameNotIn(List<String> values) {
            addCriterion("DISCOUNT_NAME not in", values, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameBetween(String value1, String value2) {
            addCriterion("DISCOUNT_NAME between", value1, value2, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameNotBetween(String value1, String value2) {
            addCriterion("DISCOUNT_NAME not between", value1, value2, "discountName");
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