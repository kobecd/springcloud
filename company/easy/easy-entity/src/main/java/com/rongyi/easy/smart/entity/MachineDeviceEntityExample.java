package com.rongyi.easy.smart.entity;

import java.util.ArrayList;
import java.util.List;

public class MachineDeviceEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MachineDeviceEntityExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOsIsNull() {
            addCriterion("os is null");
            return (Criteria) this;
        }

        public Criteria andOsIsNotNull() {
            addCriterion("os is not null");
            return (Criteria) this;
        }

        public Criteria andOsEqualTo(String value) {
            addCriterion("os =", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotEqualTo(String value) {
            addCriterion("os <>", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThan(String value) {
            addCriterion("os >", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThanOrEqualTo(String value) {
            addCriterion("os >=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThan(String value) {
            addCriterion("os <", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThanOrEqualTo(String value) {
            addCriterion("os <=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLike(String value) {
            addCriterion("os like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotLike(String value) {
            addCriterion("os not like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsIn(List<String> values) {
            addCriterion("os in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotIn(List<String> values) {
            addCriterion("os not in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsBetween(String value1, String value2) {
            addCriterion("os between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotBetween(String value1, String value2) {
            addCriterion("os not between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andOsVersionIsNull() {
            addCriterion("os_version is null");
            return (Criteria) this;
        }

        public Criteria andOsVersionIsNotNull() {
            addCriterion("os_version is not null");
            return (Criteria) this;
        }

        public Criteria andOsVersionEqualTo(String value) {
            addCriterion("os_version =", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionNotEqualTo(String value) {
            addCriterion("os_version <>", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionGreaterThan(String value) {
            addCriterion("os_version >", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionGreaterThanOrEqualTo(String value) {
            addCriterion("os_version >=", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionLessThan(String value) {
            addCriterion("os_version <", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionLessThanOrEqualTo(String value) {
            addCriterion("os_version <=", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionLike(String value) {
            addCriterion("os_version like", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionNotLike(String value) {
            addCriterion("os_version not like", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionIn(List<String> values) {
            addCriterion("os_version in", values, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionNotIn(List<String> values) {
            addCriterion("os_version not in", values, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionBetween(String value1, String value2) {
            addCriterion("os_version between", value1, value2, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionNotBetween(String value1, String value2) {
            addCriterion("os_version not between", value1, value2, "osVersion");
            return (Criteria) this;
        }

        public Criteria andMainboardIsNull() {
            addCriterion("mainboard is null");
            return (Criteria) this;
        }

        public Criteria andMainboardIsNotNull() {
            addCriterion("mainboard is not null");
            return (Criteria) this;
        }

        public Criteria andMainboardEqualTo(String value) {
            addCriterion("mainboard =", value, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardNotEqualTo(String value) {
            addCriterion("mainboard <>", value, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardGreaterThan(String value) {
            addCriterion("mainboard >", value, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardGreaterThanOrEqualTo(String value) {
            addCriterion("mainboard >=", value, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardLessThan(String value) {
            addCriterion("mainboard <", value, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardLessThanOrEqualTo(String value) {
            addCriterion("mainboard <=", value, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardLike(String value) {
            addCriterion("mainboard like", value, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardNotLike(String value) {
            addCriterion("mainboard not like", value, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardIn(List<String> values) {
            addCriterion("mainboard in", values, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardNotIn(List<String> values) {
            addCriterion("mainboard not in", values, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardBetween(String value1, String value2) {
            addCriterion("mainboard between", value1, value2, "mainboard");
            return (Criteria) this;
        }

        public Criteria andMainboardNotBetween(String value1, String value2) {
            addCriterion("mainboard not between", value1, value2, "mainboard");
            return (Criteria) this;
        }

        public Criteria andBuildIdIsNull() {
            addCriterion("build_id is null");
            return (Criteria) this;
        }

        public Criteria andBuildIdIsNotNull() {
            addCriterion("build_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuildIdEqualTo(String value) {
            addCriterion("build_id =", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdNotEqualTo(String value) {
            addCriterion("build_id <>", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdGreaterThan(String value) {
            addCriterion("build_id >", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdGreaterThanOrEqualTo(String value) {
            addCriterion("build_id >=", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdLessThan(String value) {
            addCriterion("build_id <", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdLessThanOrEqualTo(String value) {
            addCriterion("build_id <=", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdLike(String value) {
            addCriterion("build_id like", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdNotLike(String value) {
            addCriterion("build_id not like", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdIn(List<String> values) {
            addCriterion("build_id in", values, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdNotIn(List<String> values) {
            addCriterion("build_id not in", values, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdBetween(String value1, String value2) {
            addCriterion("build_id between", value1, value2, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdNotBetween(String value1, String value2) {
            addCriterion("build_id not between", value1, value2, "buildId");
            return (Criteria) this;
        }

        public Criteria andResolutionIsNull() {
            addCriterion("resolution is null");
            return (Criteria) this;
        }

        public Criteria andResolutionIsNotNull() {
            addCriterion("resolution is not null");
            return (Criteria) this;
        }

        public Criteria andResolutionEqualTo(String value) {
            addCriterion("resolution =", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionNotEqualTo(String value) {
            addCriterion("resolution <>", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionGreaterThan(String value) {
            addCriterion("resolution >", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionGreaterThanOrEqualTo(String value) {
            addCriterion("resolution >=", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionLessThan(String value) {
            addCriterion("resolution <", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionLessThanOrEqualTo(String value) {
            addCriterion("resolution <=", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionLike(String value) {
            addCriterion("resolution like", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionNotLike(String value) {
            addCriterion("resolution not like", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionIn(List<String> values) {
            addCriterion("resolution in", values, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionNotIn(List<String> values) {
            addCriterion("resolution not in", values, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionBetween(String value1, String value2) {
            addCriterion("resolution between", value1, value2, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionNotBetween(String value1, String value2) {
            addCriterion("resolution not between", value1, value2, "resolution");
            return (Criteria) this;
        }

        public Criteria andRamIsNull() {
            addCriterion("ram is null");
            return (Criteria) this;
        }

        public Criteria andRamIsNotNull() {
            addCriterion("ram is not null");
            return (Criteria) this;
        }

        public Criteria andRamEqualTo(Short value) {
            addCriterion("ram =", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotEqualTo(Short value) {
            addCriterion("ram <>", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamGreaterThan(Short value) {
            addCriterion("ram >", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamGreaterThanOrEqualTo(Short value) {
            addCriterion("ram >=", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamLessThan(Short value) {
            addCriterion("ram <", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamLessThanOrEqualTo(Short value) {
            addCriterion("ram <=", value, "ram");
            return (Criteria) this;
        }

        public Criteria andRamIn(List<Short> values) {
            addCriterion("ram in", values, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotIn(List<Short> values) {
            addCriterion("ram not in", values, "ram");
            return (Criteria) this;
        }

        public Criteria andRamBetween(Short value1, Short value2) {
            addCriterion("ram between", value1, value2, "ram");
            return (Criteria) this;
        }

        public Criteria andRamNotBetween(Short value1, Short value2) {
            addCriterion("ram not between", value1, value2, "ram");
            return (Criteria) this;
        }

        public Criteria andNetworkStateIsNull() {
            addCriterion("network_state is null");
            return (Criteria) this;
        }

        public Criteria andNetworkStateIsNotNull() {
            addCriterion("network_state is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkStateEqualTo(Short value) {
            addCriterion("network_state =", value, "networkState");
            return (Criteria) this;
        }

        public Criteria andNetworkStateNotEqualTo(Short value) {
            addCriterion("network_state <>", value, "networkState");
            return (Criteria) this;
        }

        public Criteria andNetworkStateGreaterThan(Short value) {
            addCriterion("network_state >", value, "networkState");
            return (Criteria) this;
        }

        public Criteria andNetworkStateGreaterThanOrEqualTo(Short value) {
            addCriterion("network_state >=", value, "networkState");
            return (Criteria) this;
        }

        public Criteria andNetworkStateLessThan(Short value) {
            addCriterion("network_state <", value, "networkState");
            return (Criteria) this;
        }

        public Criteria andNetworkStateLessThanOrEqualTo(Short value) {
            addCriterion("network_state <=", value, "networkState");
            return (Criteria) this;
        }

        public Criteria andNetworkStateIn(List<Short> values) {
            addCriterion("network_state in", values, "networkState");
            return (Criteria) this;
        }

        public Criteria andNetworkStateNotIn(List<Short> values) {
            addCriterion("network_state not in", values, "networkState");
            return (Criteria) this;
        }

        public Criteria andNetworkStateBetween(Short value1, Short value2) {
            addCriterion("network_state between", value1, value2, "networkState");
            return (Criteria) this;
        }

        public Criteria andNetworkStateNotBetween(Short value1, Short value2) {
            addCriterion("network_state not between", value1, value2, "networkState");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIsNull() {
            addCriterion("network_type is null");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIsNotNull() {
            addCriterion("network_type is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeEqualTo(String value) {
            addCriterion("network_type =", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeNotEqualTo(String value) {
            addCriterion("network_type <>", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeGreaterThan(String value) {
            addCriterion("network_type >", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeGreaterThanOrEqualTo(String value) {
            addCriterion("network_type >=", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeLessThan(String value) {
            addCriterion("network_type <", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeLessThanOrEqualTo(String value) {
            addCriterion("network_type <=", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeLike(String value) {
            addCriterion("network_type like", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeNotLike(String value) {
            addCriterion("network_type not like", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIn(List<String> values) {
            addCriterion("network_type in", values, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeNotIn(List<String> values) {
            addCriterion("network_type not in", values, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeBetween(String value1, String value2) {
            addCriterion("network_type between", value1, value2, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeNotBetween(String value1, String value2) {
            addCriterion("network_type not between", value1, value2, "networkType");
            return (Criteria) this;
        }

        public Criteria andMacIsNull() {
            addCriterion("mac is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("mac is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(String value) {
            addCriterion("mac =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(String value) {
            addCriterion("mac <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(String value) {
            addCriterion("mac >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(String value) {
            addCriterion("mac >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(String value) {
            addCriterion("mac <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(String value) {
            addCriterion("mac <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLike(String value) {
            addCriterion("mac like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotLike(String value) {
            addCriterion("mac not like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(List<String> values) {
            addCriterion("mac in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(List<String> values) {
            addCriterion("mac not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(String value1, String value2) {
            addCriterion("mac between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(String value1, String value2) {
            addCriterion("mac not between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andSdIsNull() {
            addCriterion("sd is null");
            return (Criteria) this;
        }

        public Criteria andSdIsNotNull() {
            addCriterion("sd is not null");
            return (Criteria) this;
        }

        public Criteria andSdEqualTo(String value) {
            addCriterion("sd =", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdNotEqualTo(String value) {
            addCriterion("sd <>", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdGreaterThan(String value) {
            addCriterion("sd >", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdGreaterThanOrEqualTo(String value) {
            addCriterion("sd >=", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdLessThan(String value) {
            addCriterion("sd <", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdLessThanOrEqualTo(String value) {
            addCriterion("sd <=", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdLike(String value) {
            addCriterion("sd like", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdNotLike(String value) {
            addCriterion("sd not like", value, "sd");
            return (Criteria) this;
        }

        public Criteria andSdIn(List<String> values) {
            addCriterion("sd in", values, "sd");
            return (Criteria) this;
        }

        public Criteria andSdNotIn(List<String> values) {
            addCriterion("sd not in", values, "sd");
            return (Criteria) this;
        }

        public Criteria andSdBetween(String value1, String value2) {
            addCriterion("sd between", value1, value2, "sd");
            return (Criteria) this;
        }

        public Criteria andSdNotBetween(String value1, String value2) {
            addCriterion("sd not between", value1, value2, "sd");
            return (Criteria) this;
        }

        public Criteria andBluetoothIsNull() {
            addCriterion("bluetooth is null");
            return (Criteria) this;
        }

        public Criteria andBluetoothIsNotNull() {
            addCriterion("bluetooth is not null");
            return (Criteria) this;
        }

        public Criteria andBluetoothEqualTo(Byte value) {
            addCriterion("bluetooth =", value, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothNotEqualTo(Byte value) {
            addCriterion("bluetooth <>", value, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothGreaterThan(Byte value) {
            addCriterion("bluetooth >", value, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothGreaterThanOrEqualTo(Byte value) {
            addCriterion("bluetooth >=", value, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothLessThan(Byte value) {
            addCriterion("bluetooth <", value, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothLessThanOrEqualTo(Byte value) {
            addCriterion("bluetooth <=", value, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothIn(List<Byte> values) {
            addCriterion("bluetooth in", values, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothNotIn(List<Byte> values) {
            addCriterion("bluetooth not in", values, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothBetween(Byte value1, Byte value2) {
            addCriterion("bluetooth between", value1, value2, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andBluetoothNotBetween(Byte value1, Byte value2) {
            addCriterion("bluetooth not between", value1, value2, "bluetooth");
            return (Criteria) this;
        }

        public Criteria andCameraIsNull() {
            addCriterion("camera is null");
            return (Criteria) this;
        }

        public Criteria andCameraIsNotNull() {
            addCriterion("camera is not null");
            return (Criteria) this;
        }

        public Criteria andCameraEqualTo(Byte value) {
            addCriterion("camera =", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraNotEqualTo(Byte value) {
            addCriterion("camera <>", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraGreaterThan(Byte value) {
            addCriterion("camera >", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraGreaterThanOrEqualTo(Byte value) {
            addCriterion("camera >=", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraLessThan(Byte value) {
            addCriterion("camera <", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraLessThanOrEqualTo(Byte value) {
            addCriterion("camera <=", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraIn(List<Byte> values) {
            addCriterion("camera in", values, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraNotIn(List<Byte> values) {
            addCriterion("camera not in", values, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraBetween(Byte value1, Byte value2) {
            addCriterion("camera between", value1, value2, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraNotBetween(Byte value1, Byte value2) {
            addCriterion("camera not between", value1, value2, "camera");
            return (Criteria) this;
        }

        public Criteria andMachineIdIsNull() {
            addCriterion("machine_id is null");
            return (Criteria) this;
        }

        public Criteria andMachineIdIsNotNull() {
            addCriterion("machine_id is not null");
            return (Criteria) this;
        }

        public Criteria andMachineIdEqualTo(Integer value) {
            addCriterion("machine_id =", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotEqualTo(Integer value) {
            addCriterion("machine_id <>", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdGreaterThan(Integer value) {
            addCriterion("machine_id >", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_id >=", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLessThan(Integer value) {
            addCriterion("machine_id <", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLessThanOrEqualTo(Integer value) {
            addCriterion("machine_id <=", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdIn(List<Integer> values) {
            addCriterion("machine_id in", values, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotIn(List<Integer> values) {
            addCriterion("machine_id not in", values, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdBetween(Integer value1, Integer value2) {
            addCriterion("machine_id between", value1, value2, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_id not between", value1, value2, "machineId");
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