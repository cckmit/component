package com.x.common.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class SysMailInformationCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysMailInformationCriteria() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
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

        public Criteria andTaxCertificateIdIsNull() {
            addCriterion("tax_certificate_id is null");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateIdIsNotNull() {
            addCriterion("tax_certificate_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateIdEqualTo(String value) {
            addCriterion("tax_certificate_id =", value, "taxCertificateId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateIdNotEqualTo(String value) {
            addCriterion("tax_certificate_id <>", value, "taxCertificateId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateIdGreaterThan(String value) {
            addCriterion("tax_certificate_id >", value, "taxCertificateId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateIdGreaterThanOrEqualTo(String value) {
            addCriterion("tax_certificate_id >=", value, "taxCertificateId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateIdLessThan(String value) {
            addCriterion("tax_certificate_id <", value, "taxCertificateId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateIdLessThanOrEqualTo(String value) {
            addCriterion("tax_certificate_id <=", value, "taxCertificateId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateIdLike(String value) {
            addCriterion("tax_certificate_id like", value, "taxCertificateId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateIdNotLike(String value) {
            addCriterion("tax_certificate_id not like", value, "taxCertificateId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateIdIn(List<String> values) {
            addCriterion("tax_certificate_id in", values, "taxCertificateId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateIdNotIn(List<String> values) {
            addCriterion("tax_certificate_id not in", values, "taxCertificateId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateIdBetween(String value1, String value2) {
            addCriterion("tax_certificate_id between", value1, value2, "taxCertificateId");
            return (Criteria) this;
        }

        public Criteria andTaxCertificateIdNotBetween(String value1, String value2) {
            addCriterion("tax_certificate_id not between", value1, value2, "taxCertificateId");
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

        public Criteria andPostcodeIsNull() {
            addCriterion("postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("postcode not between", value1, value2, "postcode");
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