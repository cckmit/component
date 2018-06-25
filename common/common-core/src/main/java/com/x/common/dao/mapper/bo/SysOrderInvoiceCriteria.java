package com.x.common.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SysOrderInvoiceCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysOrderInvoiceCriteria() {
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

        public Criteria andInvoiceIdIsNull() {
            addCriterion("invoice_id is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIsNotNull() {
            addCriterion("invoice_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdEqualTo(String value) {
            addCriterion("invoice_id =", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotEqualTo(String value) {
            addCriterion("invoice_id <>", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdGreaterThan(String value) {
            addCriterion("invoice_id >", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_id >=", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLessThan(String value) {
            addCriterion("invoice_id <", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLessThanOrEqualTo(String value) {
            addCriterion("invoice_id <=", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLike(String value) {
            addCriterion("invoice_id like", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotLike(String value) {
            addCriterion("invoice_id not like", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIn(List<String> values) {
            addCriterion("invoice_id in", values, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotIn(List<String> values) {
            addCriterion("invoice_id not in", values, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdBetween(String value1, String value2) {
            addCriterion("invoice_id between", value1, value2, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotBetween(String value1, String value2) {
            addCriterion("invoice_id not between", value1, value2, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(String value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(String value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(String value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(String value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLike(String value) {
            addCriterion("order_number like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotLike(String value) {
            addCriterion("order_number not like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<String> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<String> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(String value1, String value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(String value1, String value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountIsNull() {
            addCriterion("invoice_amount is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountIsNotNull() {
            addCriterion("invoice_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountEqualTo(long value) {
            addCriterion("invoice_amount =", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountNotEqualTo(long value) {
            addCriterion("invoice_amount <>", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountGreaterThan(long value) {
            addCriterion("invoice_amount >", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountGreaterThanOrEqualTo(long value) {
            addCriterion("invoice_amount >=", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountLessThan(long value) {
            addCriterion("invoice_amount <", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountLessThanOrEqualTo(long value) {
            addCriterion("invoice_amount <=", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountIn(List<Long> values) {
            addCriterion("invoice_amount in", values, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountNotIn(List<Long> values) {
            addCriterion("invoice_amount not in", values, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountBetween(long value1, long value2) {
            addCriterion("invoice_amount between", value1, value2, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountNotBetween(long value1, long value2) {
            addCriterion("invoice_amount not between", value1, value2, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andProposerIsNull() {
            addCriterion("proposer is null");
            return (Criteria) this;
        }

        public Criteria andProposerIsNotNull() {
            addCriterion("proposer is not null");
            return (Criteria) this;
        }

        public Criteria andProposerEqualTo(String value) {
            addCriterion("proposer =", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotEqualTo(String value) {
            addCriterion("proposer <>", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerGreaterThan(String value) {
            addCriterion("proposer >", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerGreaterThanOrEqualTo(String value) {
            addCriterion("proposer >=", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLessThan(String value) {
            addCriterion("proposer <", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLessThanOrEqualTo(String value) {
            addCriterion("proposer <=", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLike(String value) {
            addCriterion("proposer like", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotLike(String value) {
            addCriterion("proposer not like", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerIn(List<String> values) {
            addCriterion("proposer in", values, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotIn(List<String> values) {
            addCriterion("proposer not in", values, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerBetween(String value1, String value2) {
            addCriterion("proposer between", value1, value2, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotBetween(String value1, String value2) {
            addCriterion("proposer not between", value1, value2, "proposer");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(String value) {
            addCriterion("invoice_type =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(String value) {
            addCriterion("invoice_type <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(String value) {
            addCriterion("invoice_type >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_type >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(String value) {
            addCriterion("invoice_type <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("invoice_type <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLike(String value) {
            addCriterion("invoice_type like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotLike(String value) {
            addCriterion("invoice_type not like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<String> values) {
            addCriterion("invoice_type in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<String> values) {
            addCriterion("invoice_type not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(String value1, String value2) {
            addCriterion("invoice_type between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("invoice_type not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNull() {
            addCriterion("invoice_title is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNotNull() {
            addCriterion("invoice_title is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleEqualTo(String value) {
            addCriterion("invoice_title =", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotEqualTo(String value) {
            addCriterion("invoice_title <>", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThan(String value) {
            addCriterion("invoice_title >", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_title >=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThan(String value) {
            addCriterion("invoice_title <", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThanOrEqualTo(String value) {
            addCriterion("invoice_title <=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLike(String value) {
            addCriterion("invoice_title like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotLike(String value) {
            addCriterion("invoice_title not like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIn(List<String> values) {
            addCriterion("invoice_title in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotIn(List<String> values) {
            addCriterion("invoice_title not in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleBetween(String value1, String value2) {
            addCriterion("invoice_title between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotBetween(String value1, String value2) {
            addCriterion("invoice_title not between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIsNull() {
            addCriterion("invoice_content is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIsNotNull() {
            addCriterion("invoice_content is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentEqualTo(String value) {
            addCriterion("invoice_content =", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotEqualTo(String value) {
            addCriterion("invoice_content <>", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentGreaterThan(String value) {
            addCriterion("invoice_content >", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_content >=", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentLessThan(String value) {
            addCriterion("invoice_content <", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentLessThanOrEqualTo(String value) {
            addCriterion("invoice_content <=", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentLike(String value) {
            addCriterion("invoice_content like", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotLike(String value) {
            addCriterion("invoice_content not like", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIn(List<String> values) {
            addCriterion("invoice_content in", values, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotIn(List<String> values) {
            addCriterion("invoice_content not in", values, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentBetween(String value1, String value2) {
            addCriterion("invoice_content between", value1, value2, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotBetween(String value1, String value2) {
            addCriterion("invoice_content not between", value1, value2, "invoiceContent");
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

        public Criteria andDrawerIsNull() {
            addCriterion("drawer is null");
            return (Criteria) this;
        }

        public Criteria andDrawerIsNotNull() {
            addCriterion("drawer is not null");
            return (Criteria) this;
        }

        public Criteria andDrawerEqualTo(String value) {
            addCriterion("drawer =", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerNotEqualTo(String value) {
            addCriterion("drawer <>", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerGreaterThan(String value) {
            addCriterion("drawer >", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerGreaterThanOrEqualTo(String value) {
            addCriterion("drawer >=", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerLessThan(String value) {
            addCriterion("drawer <", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerLessThanOrEqualTo(String value) {
            addCriterion("drawer <=", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerLike(String value) {
            addCriterion("drawer like", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerNotLike(String value) {
            addCriterion("drawer not like", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerIn(List<String> values) {
            addCriterion("drawer in", values, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerNotIn(List<String> values) {
            addCriterion("drawer not in", values, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerBetween(String value1, String value2) {
            addCriterion("drawer between", value1, value2, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerNotBetween(String value1, String value2) {
            addCriterion("drawer not between", value1, value2, "drawer");
            return (Criteria) this;
        }

        public Criteria andRecipientsIsNull() {
            addCriterion("recipients is null");
            return (Criteria) this;
        }

        public Criteria andRecipientsIsNotNull() {
            addCriterion("recipients is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientsEqualTo(String value) {
            addCriterion("recipients =", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsNotEqualTo(String value) {
            addCriterion("recipients <>", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsGreaterThan(String value) {
            addCriterion("recipients >", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsGreaterThanOrEqualTo(String value) {
            addCriterion("recipients >=", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsLessThan(String value) {
            addCriterion("recipients <", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsLessThanOrEqualTo(String value) {
            addCriterion("recipients <=", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsLike(String value) {
            addCriterion("recipients like", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsNotLike(String value) {
            addCriterion("recipients not like", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsIn(List<String> values) {
            addCriterion("recipients in", values, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsNotIn(List<String> values) {
            addCriterion("recipients not in", values, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsBetween(String value1, String value2) {
            addCriterion("recipients between", value1, value2, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsNotBetween(String value1, String value2) {
            addCriterion("recipients not between", value1, value2, "recipients");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNull() {
            addCriterion("contact_number is null");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNotNull() {
            addCriterion("contact_number is not null");
            return (Criteria) this;
        }

        public Criteria andContactNumberEqualTo(String value) {
            addCriterion("contact_number =", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotEqualTo(String value) {
            addCriterion("contact_number <>", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThan(String value) {
            addCriterion("contact_number >", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThanOrEqualTo(String value) {
            addCriterion("contact_number >=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThan(String value) {
            addCriterion("contact_number <", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThanOrEqualTo(String value) {
            addCriterion("contact_number <=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLike(String value) {
            addCriterion("contact_number like", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotLike(String value) {
            addCriterion("contact_number not like", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberIn(List<String> values) {
            addCriterion("contact_number in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotIn(List<String> values) {
            addCriterion("contact_number not in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberBetween(String value1, String value2) {
            addCriterion("contact_number between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotBetween(String value1, String value2) {
            addCriterion("contact_number not between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCnCityIsNull() {
            addCriterion("cn_city is null");
            return (Criteria) this;
        }

        public Criteria andCnCityIsNotNull() {
            addCriterion("cn_city is not null");
            return (Criteria) this;
        }

        public Criteria andCnCityEqualTo(String value) {
            addCriterion("cn_city =", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotEqualTo(String value) {
            addCriterion("cn_city <>", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityGreaterThan(String value) {
            addCriterion("cn_city >", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityGreaterThanOrEqualTo(String value) {
            addCriterion("cn_city >=", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityLessThan(String value) {
            addCriterion("cn_city <", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityLessThanOrEqualTo(String value) {
            addCriterion("cn_city <=", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityLike(String value) {
            addCriterion("cn_city like", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotLike(String value) {
            addCriterion("cn_city not like", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityIn(List<String> values) {
            addCriterion("cn_city in", values, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotIn(List<String> values) {
            addCriterion("cn_city not in", values, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityBetween(String value1, String value2) {
            addCriterion("cn_city between", value1, value2, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotBetween(String value1, String value2) {
            addCriterion("cn_city not between", value1, value2, "cnCity");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNull() {
            addCriterion("logistics_company is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNotNull() {
            addCriterion("logistics_company is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyEqualTo(String value) {
            addCriterion("logistics_company =", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotEqualTo(String value) {
            addCriterion("logistics_company <>", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThan(String value) {
            addCriterion("logistics_company >", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_company >=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThan(String value) {
            addCriterion("logistics_company <", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThanOrEqualTo(String value) {
            addCriterion("logistics_company <=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLike(String value) {
            addCriterion("logistics_company like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotLike(String value) {
            addCriterion("logistics_company not like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIn(List<String> values) {
            addCriterion("logistics_company in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotIn(List<String> values) {
            addCriterion("logistics_company not in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyBetween(String value1, String value2) {
            addCriterion("logistics_company between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotBetween(String value1, String value2) {
            addCriterion("logistics_company not between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberIsNull() {
            addCriterion("logistics_number is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberIsNotNull() {
            addCriterion("logistics_number is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberEqualTo(String value) {
            addCriterion("logistics_number =", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberNotEqualTo(String value) {
            addCriterion("logistics_number <>", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberGreaterThan(String value) {
            addCriterion("logistics_number >", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_number >=", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberLessThan(String value) {
            addCriterion("logistics_number <", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberLessThanOrEqualTo(String value) {
            addCriterion("logistics_number <=", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberLike(String value) {
            addCriterion("logistics_number like", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberNotLike(String value) {
            addCriterion("logistics_number not like", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberIn(List<String> values) {
            addCriterion("logistics_number in", values, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberNotIn(List<String> values) {
            addCriterion("logistics_number not in", values, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberBetween(String value1, String value2) {
            addCriterion("logistics_number between", value1, value2, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberNotBetween(String value1, String value2) {
            addCriterion("logistics_number not between", value1, value2, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Timestamp value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Timestamp value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Timestamp value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Timestamp value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Timestamp> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Timestamp> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
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

        public Criteria andBillingTimeIsNull() {
            addCriterion("billing_time is null");
            return (Criteria) this;
        }

        public Criteria andBillingTimeIsNotNull() {
            addCriterion("billing_time is not null");
            return (Criteria) this;
        }

        public Criteria andBillingTimeEqualTo(Timestamp value) {
            addCriterion("billing_time =", value, "billingTime");
            return (Criteria) this;
        }

        public Criteria andBillingTimeNotEqualTo(Timestamp value) {
            addCriterion("billing_time <>", value, "billingTime");
            return (Criteria) this;
        }

        public Criteria andBillingTimeGreaterThan(Timestamp value) {
            addCriterion("billing_time >", value, "billingTime");
            return (Criteria) this;
        }

        public Criteria andBillingTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("billing_time >=", value, "billingTime");
            return (Criteria) this;
        }

        public Criteria andBillingTimeLessThan(Timestamp value) {
            addCriterion("billing_time <", value, "billingTime");
            return (Criteria) this;
        }

        public Criteria andBillingTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("billing_time <=", value, "billingTime");
            return (Criteria) this;
        }

        public Criteria andBillingTimeIn(List<Timestamp> values) {
            addCriterion("billing_time in", values, "billingTime");
            return (Criteria) this;
        }

        public Criteria andBillingTimeNotIn(List<Timestamp> values) {
            addCriterion("billing_time not in", values, "billingTime");
            return (Criteria) this;
        }

        public Criteria andBillingTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("billing_time between", value1, value2, "billingTime");
            return (Criteria) this;
        }

        public Criteria andBillingTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("billing_time not between", value1, value2, "billingTime");
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

        public Criteria andInvoiceNumberIsNull() {
            addCriterion("invoice_number is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIsNotNull() {
            addCriterion("invoice_number is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberEqualTo(String value) {
            addCriterion("invoice_number =", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotEqualTo(String value) {
            addCriterion("invoice_number <>", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThan(String value) {
            addCriterion("invoice_number >", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_number >=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThan(String value) {
            addCriterion("invoice_number <", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThanOrEqualTo(String value) {
            addCriterion("invoice_number <=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLike(String value) {
            addCriterion("invoice_number like", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotLike(String value) {
            addCriterion("invoice_number not like", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIn(List<String> values) {
            addCriterion("invoice_number in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotIn(List<String> values) {
            addCriterion("invoice_number not in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberBetween(String value1, String value2) {
            addCriterion("invoice_number between", value1, value2, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotBetween(String value1, String value2) {
            addCriterion("invoice_number not between", value1, value2, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarkIsNull() {
            addCriterion("Invoice_remark is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarkIsNotNull() {
            addCriterion("Invoice_remark is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarkEqualTo(String value) {
            addCriterion("Invoice_remark =", value, "invoiceRemark");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarkNotEqualTo(String value) {
            addCriterion("Invoice_remark <>", value, "invoiceRemark");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarkGreaterThan(String value) {
            addCriterion("Invoice_remark >", value, "invoiceRemark");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Invoice_remark >=", value, "invoiceRemark");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarkLessThan(String value) {
            addCriterion("Invoice_remark <", value, "invoiceRemark");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarkLessThanOrEqualTo(String value) {
            addCriterion("Invoice_remark <=", value, "invoiceRemark");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarkLike(String value) {
            addCriterion("Invoice_remark like", value, "invoiceRemark");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarkNotLike(String value) {
            addCriterion("Invoice_remark not like", value, "invoiceRemark");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarkIn(List<String> values) {
            addCriterion("Invoice_remark in", values, "invoiceRemark");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarkNotIn(List<String> values) {
            addCriterion("Invoice_remark not in", values, "invoiceRemark");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarkBetween(String value1, String value2) {
            addCriterion("Invoice_remark between", value1, value2, "invoiceRemark");
            return (Criteria) this;
        }

        public Criteria andInvoiceRemarkNotBetween(String value1, String value2) {
            addCriterion("Invoice_remark not between", value1, value2, "invoiceRemark");
            return (Criteria) this;
        }

        public Criteria andFeedbackIsNull() {
            addCriterion("feedback is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIsNotNull() {
            addCriterion("feedback is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackEqualTo(String value) {
            addCriterion("feedback =", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotEqualTo(String value) {
            addCriterion("feedback <>", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackGreaterThan(String value) {
            addCriterion("feedback >", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackGreaterThanOrEqualTo(String value) {
            addCriterion("feedback >=", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLessThan(String value) {
            addCriterion("feedback <", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLessThanOrEqualTo(String value) {
            addCriterion("feedback <=", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLike(String value) {
            addCriterion("feedback like", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotLike(String value) {
            addCriterion("feedback not like", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackIn(List<String> values) {
            addCriterion("feedback in", values, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotIn(List<String> values) {
            addCriterion("feedback not in", values, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackBetween(String value1, String value2) {
            addCriterion("feedback between", value1, value2, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotBetween(String value1, String value2) {
            addCriterion("feedback not between", value1, value2, "feedback");
            return (Criteria) this;
        }

        public Criteria andAditorRemarkIsNull() {
            addCriterion("aditor_remark is null");
            return (Criteria) this;
        }

        public Criteria andAditorRemarkIsNotNull() {
            addCriterion("aditor_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAditorRemarkEqualTo(String value) {
            addCriterion("aditor_remark =", value, "aditorRemark");
            return (Criteria) this;
        }

        public Criteria andAditorRemarkNotEqualTo(String value) {
            addCriterion("aditor_remark <>", value, "aditorRemark");
            return (Criteria) this;
        }

        public Criteria andAditorRemarkGreaterThan(String value) {
            addCriterion("aditor_remark >", value, "aditorRemark");
            return (Criteria) this;
        }

        public Criteria andAditorRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("aditor_remark >=", value, "aditorRemark");
            return (Criteria) this;
        }

        public Criteria andAditorRemarkLessThan(String value) {
            addCriterion("aditor_remark <", value, "aditorRemark");
            return (Criteria) this;
        }

        public Criteria andAditorRemarkLessThanOrEqualTo(String value) {
            addCriterion("aditor_remark <=", value, "aditorRemark");
            return (Criteria) this;
        }

        public Criteria andAditorRemarkLike(String value) {
            addCriterion("aditor_remark like", value, "aditorRemark");
            return (Criteria) this;
        }

        public Criteria andAditorRemarkNotLike(String value) {
            addCriterion("aditor_remark not like", value, "aditorRemark");
            return (Criteria) this;
        }

        public Criteria andAditorRemarkIn(List<String> values) {
            addCriterion("aditor_remark in", values, "aditorRemark");
            return (Criteria) this;
        }

        public Criteria andAditorRemarkNotIn(List<String> values) {
            addCriterion("aditor_remark not in", values, "aditorRemark");
            return (Criteria) this;
        }

        public Criteria andAditorRemarkBetween(String value1, String value2) {
            addCriterion("aditor_remark between", value1, value2, "aditorRemark");
            return (Criteria) this;
        }

        public Criteria andAditorRemarkNotBetween(String value1, String value2) {
            addCriterion("aditor_remark not between", value1, value2, "aditorRemark");
            return (Criteria) this;
        }

        public Criteria andMailInformationIdIsNull() {
            addCriterion("mail_information_id is null");
            return (Criteria) this;
        }

        public Criteria andMailInformationIdIsNotNull() {
            addCriterion("mail_information_id is not null");
            return (Criteria) this;
        }

        public Criteria andMailInformationIdEqualTo(String value) {
            addCriterion("mail_information_id =", value, "mailInformationId");
            return (Criteria) this;
        }

        public Criteria andMailInformationIdNotEqualTo(String value) {
            addCriterion("mail_information_id <>", value, "mailInformationId");
            return (Criteria) this;
        }

        public Criteria andMailInformationIdGreaterThan(String value) {
            addCriterion("mail_information_id >", value, "mailInformationId");
            return (Criteria) this;
        }

        public Criteria andMailInformationIdGreaterThanOrEqualTo(String value) {
            addCriterion("mail_information_id >=", value, "mailInformationId");
            return (Criteria) this;
        }

        public Criteria andMailInformationIdLessThan(String value) {
            addCriterion("mail_information_id <", value, "mailInformationId");
            return (Criteria) this;
        }

        public Criteria andMailInformationIdLessThanOrEqualTo(String value) {
            addCriterion("mail_information_id <=", value, "mailInformationId");
            return (Criteria) this;
        }

        public Criteria andMailInformationIdLike(String value) {
            addCriterion("mail_information_id like", value, "mailInformationId");
            return (Criteria) this;
        }

        public Criteria andMailInformationIdNotLike(String value) {
            addCriterion("mail_information_id not like", value, "mailInformationId");
            return (Criteria) this;
        }

        public Criteria andMailInformationIdIn(List<String> values) {
            addCriterion("mail_information_id in", values, "mailInformationId");
            return (Criteria) this;
        }

        public Criteria andMailInformationIdNotIn(List<String> values) {
            addCriterion("mail_information_id not in", values, "mailInformationId");
            return (Criteria) this;
        }

        public Criteria andMailInformationIdBetween(String value1, String value2) {
            addCriterion("mail_information_id between", value1, value2, "mailInformationId");
            return (Criteria) this;
        }

        public Criteria andMailInformationIdNotBetween(String value1, String value2) {
            addCriterion("mail_information_id not between", value1, value2, "mailInformationId");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNull() {
            addCriterion("registered_address is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNotNull() {
            addCriterion("registered_address is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressEqualTo(String value) {
            addCriterion("registered_address =", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotEqualTo(String value) {
            addCriterion("registered_address <>", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThan(String value) {
            addCriterion("registered_address >", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThanOrEqualTo(String value) {
            addCriterion("registered_address >=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThan(String value) {
            addCriterion("registered_address <", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThanOrEqualTo(String value) {
            addCriterion("registered_address <=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLike(String value) {
            addCriterion("registered_address like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotLike(String value) {
            addCriterion("registered_address not like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIn(List<String> values) {
            addCriterion("registered_address in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotIn(List<String> values) {
            addCriterion("registered_address not in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressBetween(String value1, String value2) {
            addCriterion("registered_address between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotBetween(String value1, String value2) {
            addCriterion("registered_address not between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredPhoneIsNull() {
            addCriterion("registered_phone is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredPhoneIsNotNull() {
            addCriterion("registered_phone is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredPhoneEqualTo(String value) {
            addCriterion("registered_phone =", value, "registeredPhone");
            return (Criteria) this;
        }

        public Criteria andRegisteredPhoneNotEqualTo(String value) {
            addCriterion("registered_phone <>", value, "registeredPhone");
            return (Criteria) this;
        }

        public Criteria andRegisteredPhoneGreaterThan(String value) {
            addCriterion("registered_phone >", value, "registeredPhone");
            return (Criteria) this;
        }

        public Criteria andRegisteredPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("registered_phone >=", value, "registeredPhone");
            return (Criteria) this;
        }

        public Criteria andRegisteredPhoneLessThan(String value) {
            addCriterion("registered_phone <", value, "registeredPhone");
            return (Criteria) this;
        }

        public Criteria andRegisteredPhoneLessThanOrEqualTo(String value) {
            addCriterion("registered_phone <=", value, "registeredPhone");
            return (Criteria) this;
        }

        public Criteria andRegisteredPhoneLike(String value) {
            addCriterion("registered_phone like", value, "registeredPhone");
            return (Criteria) this;
        }

        public Criteria andRegisteredPhoneNotLike(String value) {
            addCriterion("registered_phone not like", value, "registeredPhone");
            return (Criteria) this;
        }

        public Criteria andRegisteredPhoneIn(List<String> values) {
            addCriterion("registered_phone in", values, "registeredPhone");
            return (Criteria) this;
        }

        public Criteria andRegisteredPhoneNotIn(List<String> values) {
            addCriterion("registered_phone not in", values, "registeredPhone");
            return (Criteria) this;
        }

        public Criteria andRegisteredPhoneBetween(String value1, String value2) {
            addCriterion("registered_phone between", value1, value2, "registeredPhone");
            return (Criteria) this;
        }

        public Criteria andRegisteredPhoneNotBetween(String value1, String value2) {
            addCriterion("registered_phone not between", value1, value2, "registeredPhone");
            return (Criteria) this;
        }

        public Criteria andBankDepositIsNull() {
            addCriterion("bank_deposit is null");
            return (Criteria) this;
        }

        public Criteria andBankDepositIsNotNull() {
            addCriterion("bank_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andBankDepositEqualTo(String value) {
            addCriterion("bank_deposit =", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositNotEqualTo(String value) {
            addCriterion("bank_deposit <>", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositGreaterThan(String value) {
            addCriterion("bank_deposit >", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositGreaterThanOrEqualTo(String value) {
            addCriterion("bank_deposit >=", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositLessThan(String value) {
            addCriterion("bank_deposit <", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositLessThanOrEqualTo(String value) {
            addCriterion("bank_deposit <=", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositLike(String value) {
            addCriterion("bank_deposit like", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositNotLike(String value) {
            addCriterion("bank_deposit not like", value, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositIn(List<String> values) {
            addCriterion("bank_deposit in", values, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositNotIn(List<String> values) {
            addCriterion("bank_deposit not in", values, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositBetween(String value1, String value2) {
            addCriterion("bank_deposit between", value1, value2, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankDepositNotBetween(String value1, String value2) {
            addCriterion("bank_deposit not between", value1, value2, "bankDeposit");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberIsNull() {
            addCriterion("identify_number is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberIsNotNull() {
            addCriterion("identify_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberEqualTo(String value) {
            addCriterion("identify_number =", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberNotEqualTo(String value) {
            addCriterion("identify_number <>", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberGreaterThan(String value) {
            addCriterion("identify_number >", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberGreaterThanOrEqualTo(String value) {
            addCriterion("identify_number >=", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberLessThan(String value) {
            addCriterion("identify_number <", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberLessThanOrEqualTo(String value) {
            addCriterion("identify_number <=", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberLike(String value) {
            addCriterion("identify_number like", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberNotLike(String value) {
            addCriterion("identify_number not like", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberIn(List<String> values) {
            addCriterion("identify_number in", values, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberNotIn(List<String> values) {
            addCriterion("identify_number not in", values, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberBetween(String value1, String value2) {
            addCriterion("identify_number between", value1, value2, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberNotBetween(String value1, String value2) {
            addCriterion("identify_number not between", value1, value2, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andTaxPageIdIsNull() {
            addCriterion("tax_page_id is null");
            return (Criteria) this;
        }

        public Criteria andTaxPageIdIsNotNull() {
            addCriterion("tax_page_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaxPageIdEqualTo(String value) {
            addCriterion("tax_page_id =", value, "taxPageId");
            return (Criteria) this;
        }

        public Criteria andTaxPageIdNotEqualTo(String value) {
            addCriterion("tax_page_id <>", value, "taxPageId");
            return (Criteria) this;
        }

        public Criteria andTaxPageIdGreaterThan(String value) {
            addCriterion("tax_page_id >", value, "taxPageId");
            return (Criteria) this;
        }

        public Criteria andTaxPageIdGreaterThanOrEqualTo(String value) {
            addCriterion("tax_page_id >=", value, "taxPageId");
            return (Criteria) this;
        }

        public Criteria andTaxPageIdLessThan(String value) {
            addCriterion("tax_page_id <", value, "taxPageId");
            return (Criteria) this;
        }

        public Criteria andTaxPageIdLessThanOrEqualTo(String value) {
            addCriterion("tax_page_id <=", value, "taxPageId");
            return (Criteria) this;
        }

        public Criteria andTaxPageIdLike(String value) {
            addCriterion("tax_page_id like", value, "taxPageId");
            return (Criteria) this;
        }

        public Criteria andTaxPageIdNotLike(String value) {
            addCriterion("tax_page_id not like", value, "taxPageId");
            return (Criteria) this;
        }

        public Criteria andTaxPageIdIn(List<String> values) {
            addCriterion("tax_page_id in", values, "taxPageId");
            return (Criteria) this;
        }

        public Criteria andTaxPageIdNotIn(List<String> values) {
            addCriterion("tax_page_id not in", values, "taxPageId");
            return (Criteria) this;
        }

        public Criteria andTaxPageIdBetween(String value1, String value2) {
            addCriterion("tax_page_id between", value1, value2, "taxPageId");
            return (Criteria) this;
        }

        public Criteria andTaxPageIdNotBetween(String value1, String value2) {
            addCriterion("tax_page_id not between", value1, value2, "taxPageId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateUploadIdIsNull() {
            addCriterion("tax_certificate_upload_id is null");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateUploadIdIsNotNull() {
            addCriterion("tax_certificate_upload_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateUploadIdEqualTo(String value) {
            addCriterion("tax_certificate_upload_id =", value, "taxCertificateUploadId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateUploadIdNotEqualTo(String value) {
            addCriterion("tax_certificate_upload_id <>", value, "taxCertificateUploadId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateUploadIdGreaterThan(String value) {
            addCriterion("tax_certificate_upload_id >", value, "taxCertificateUploadId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateUploadIdGreaterThanOrEqualTo(String value) {
            addCriterion("tax_certificate_upload_id >=", value, "taxCertificateUploadId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateUploadIdLessThan(String value) {
            addCriterion("tax_certificate_upload_id <", value, "taxCertificateUploadId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateUploadIdLessThanOrEqualTo(String value) {
            addCriterion("tax_certificate_upload_id <=", value, "taxCertificateUploadId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateUploadIdLike(String value) {
            addCriterion("tax_certificate_upload_id like", value, "taxCertificateUploadId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateUploadIdNotLike(String value) {
            addCriterion("tax_certificate_upload_id not like", value, "taxCertificateUploadId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateUploadIdIn(List<String> values) {
            addCriterion("tax_certificate_upload_id in", values, "taxCertificateUploadId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateUploadIdNotIn(List<String> values) {
            addCriterion("tax_certificate_upload_id not in", values, "taxCertificateUploadId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateUploadIdBetween(String value1, String value2) {
            addCriterion("tax_certificate_upload_id between", value1, value2, "taxCertificateUploadId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateUploadIdNotBetween(String value1, String value2) {
            addCriterion("tax_certificate_upload_id not between", value1, value2, "taxCertificateUploadId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationIdIsNull() {
            addCriterion("taxpayer_identification_id is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationIdIsNotNull() {
            addCriterion("taxpayer_identification_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationIdEqualTo(String value) {
            addCriterion("taxpayer_identification_id =", value, "taxpayerIdentificationId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationIdNotEqualTo(String value) {
            addCriterion("taxpayer_identification_id <>", value, "taxpayerIdentificationId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationIdGreaterThan(String value) {
            addCriterion("taxpayer_identification_id >", value, "taxpayerIdentificationId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationIdGreaterThanOrEqualTo(String value) {
            addCriterion("taxpayer_identification_id >=", value, "taxpayerIdentificationId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationIdLessThan(String value) {
            addCriterion("taxpayer_identification_id <", value, "taxpayerIdentificationId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationIdLessThanOrEqualTo(String value) {
            addCriterion("taxpayer_identification_id <=", value, "taxpayerIdentificationId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationIdLike(String value) {
            addCriterion("taxpayer_identification_id like", value, "taxpayerIdentificationId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationIdNotLike(String value) {
            addCriterion("taxpayer_identification_id not like", value, "taxpayerIdentificationId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationIdIn(List<String> values) {
            addCriterion("taxpayer_identification_id in", values, "taxpayerIdentificationId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationIdNotIn(List<String> values) {
            addCriterion("taxpayer_identification_id not in", values, "taxpayerIdentificationId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationIdBetween(String value1, String value2) {
            addCriterion("taxpayer_identification_id between", value1, value2, "taxpayerIdentificationId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationIdNotBetween(String value1, String value2) {
            addCriterion("taxpayer_identification_id not between", value1, value2, "taxpayerIdentificationId");
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