package com.rongyi.easy.smart.entity;

import java.util.ArrayList;
import java.util.List;

public class MachineExpandEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MachineExpandEntityExample() {
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

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(Integer value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(Integer value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(Integer value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(Integer value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(Integer value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<Integer> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<Integer> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(Integer value1, Integer value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(Integer value1, Integer value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("customer_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("customer_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(Short value) {
            addCriterion("customer_type =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(Short value) {
            addCriterion("customer_type <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(Short value) {
            addCriterion("customer_type >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("customer_type >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(Short value) {
            addCriterion("customer_type <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(Short value) {
            addCriterion("customer_type <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<Short> values) {
            addCriterion("customer_type in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<Short> values) {
            addCriterion("customer_type not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(Short value1, Short value2) {
            addCriterion("customer_type between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(Short value1, Short value2) {
            addCriterion("customer_type not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andMallIdIsNull() {
            addCriterion("mall_id is null");
            return (Criteria) this;
        }

        public Criteria andMallIdIsNotNull() {
            addCriterion("mall_id is not null");
            return (Criteria) this;
        }

        public Criteria andMallIdEqualTo(String value) {
            addCriterion("mall_id =", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdNotEqualTo(String value) {
            addCriterion("mall_id <>", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdGreaterThan(String value) {
            addCriterion("mall_id >", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdGreaterThanOrEqualTo(String value) {
            addCriterion("mall_id >=", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdLessThan(String value) {
            addCriterion("mall_id <", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdLessThanOrEqualTo(String value) {
            addCriterion("mall_id <=", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdLike(String value) {
            addCriterion("mall_id like", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdNotLike(String value) {
            addCriterion("mall_id not like", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdIn(List<String> values) {
            addCriterion("mall_id in", values, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdNotIn(List<String> values) {
            addCriterion("mall_id not in", values, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdBetween(String value1, String value2) {
            addCriterion("mall_id between", value1, value2, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdNotBetween(String value1, String value2) {
            addCriterion("mall_id not between", value1, value2, "mallId");
            return (Criteria) this;
        }

        public Criteria andFloorIdIsNull() {
            addCriterion("floor_id is null");
            return (Criteria) this;
        }

        public Criteria andFloorIdIsNotNull() {
            addCriterion("floor_id is not null");
            return (Criteria) this;
        }

        public Criteria andFloorIdEqualTo(Integer value) {
            addCriterion("floor_id =", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotEqualTo(Integer value) {
            addCriterion("floor_id <>", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdGreaterThan(Integer value) {
            addCriterion("floor_id >", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor_id >=", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdLessThan(Integer value) {
            addCriterion("floor_id <", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdLessThanOrEqualTo(Integer value) {
            addCriterion("floor_id <=", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdIn(List<Integer> values) {
            addCriterion("floor_id in", values, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotIn(List<Integer> values) {
            addCriterion("floor_id not in", values, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdBetween(Integer value1, Integer value2) {
            addCriterion("floor_id between", value1, value2, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("floor_id not between", value1, value2, "floorId");
            return (Criteria) this;
        }

        public Criteria andCoordinateXIsNull() {
            addCriterion("coordinate_x is null");
            return (Criteria) this;
        }

        public Criteria andCoordinateXIsNotNull() {
            addCriterion("coordinate_x is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinateXEqualTo(Integer value) {
            addCriterion("coordinate_x =", value, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXNotEqualTo(Integer value) {
            addCriterion("coordinate_x <>", value, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXGreaterThan(Integer value) {
            addCriterion("coordinate_x >", value, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXGreaterThanOrEqualTo(Integer value) {
            addCriterion("coordinate_x >=", value, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXLessThan(Integer value) {
            addCriterion("coordinate_x <", value, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXLessThanOrEqualTo(Integer value) {
            addCriterion("coordinate_x <=", value, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXIn(List<Integer> values) {
            addCriterion("coordinate_x in", values, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXNotIn(List<Integer> values) {
            addCriterion("coordinate_x not in", values, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXBetween(Integer value1, Integer value2) {
            addCriterion("coordinate_x between", value1, value2, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXNotBetween(Integer value1, Integer value2) {
            addCriterion("coordinate_x not between", value1, value2, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateYIsNull() {
            addCriterion("coordinate_y is null");
            return (Criteria) this;
        }

        public Criteria andCoordinateYIsNotNull() {
            addCriterion("coordinate_y is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinateYEqualTo(Integer value) {
            addCriterion("coordinate_y =", value, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYNotEqualTo(Integer value) {
            addCriterion("coordinate_y <>", value, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYGreaterThan(Integer value) {
            addCriterion("coordinate_y >", value, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYGreaterThanOrEqualTo(Integer value) {
            addCriterion("coordinate_y >=", value, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYLessThan(Integer value) {
            addCriterion("coordinate_y <", value, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYLessThanOrEqualTo(Integer value) {
            addCriterion("coordinate_y <=", value, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYIn(List<Integer> values) {
            addCriterion("coordinate_y in", values, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYNotIn(List<Integer> values) {
            addCriterion("coordinate_y not in", values, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYBetween(Integer value1, Integer value2) {
            addCriterion("coordinate_y between", value1, value2, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYNotBetween(Integer value1, Integer value2) {
            addCriterion("coordinate_y not between", value1, value2, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("customer_phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("customer_phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("customer_phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("customer_phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("customer_phone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("customer_phone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("customer_phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("customer_phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("customer_phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainNameIsNull() {
            addCriterion("maintain_name is null");
            return (Criteria) this;
        }

        public Criteria andMaintainNameIsNotNull() {
            addCriterion("maintain_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainNameEqualTo(String value) {
            addCriterion("maintain_name =", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameNotEqualTo(String value) {
            addCriterion("maintain_name <>", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameGreaterThan(String value) {
            addCriterion("maintain_name >", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_name >=", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameLessThan(String value) {
            addCriterion("maintain_name <", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameLessThanOrEqualTo(String value) {
            addCriterion("maintain_name <=", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameLike(String value) {
            addCriterion("maintain_name like", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameNotLike(String value) {
            addCriterion("maintain_name not like", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameIn(List<String> values) {
            addCriterion("maintain_name in", values, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameNotIn(List<String> values) {
            addCriterion("maintain_name not in", values, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameBetween(String value1, String value2) {
            addCriterion("maintain_name between", value1, value2, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameNotBetween(String value1, String value2) {
            addCriterion("maintain_name not between", value1, value2, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneIsNull() {
            addCriterion("maintain_phone is null");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneIsNotNull() {
            addCriterion("maintain_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneEqualTo(String value) {
            addCriterion("maintain_phone =", value, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneNotEqualTo(String value) {
            addCriterion("maintain_phone <>", value, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneGreaterThan(String value) {
            addCriterion("maintain_phone >", value, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_phone >=", value, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneLessThan(String value) {
            addCriterion("maintain_phone <", value, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneLessThanOrEqualTo(String value) {
            addCriterion("maintain_phone <=", value, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneLike(String value) {
            addCriterion("maintain_phone like", value, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneNotLike(String value) {
            addCriterion("maintain_phone not like", value, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneIn(List<String> values) {
            addCriterion("maintain_phone in", values, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneNotIn(List<String> values) {
            addCriterion("maintain_phone not in", values, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneBetween(String value1, String value2) {
            addCriterion("maintain_phone between", value1, value2, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andMaintainPhoneNotBetween(String value1, String value2) {
            addCriterion("maintain_phone not between", value1, value2, "maintainPhone");
            return (Criteria) this;
        }

        public Criteria andBdNameIsNull() {
            addCriterion("bd_name is null");
            return (Criteria) this;
        }

        public Criteria andBdNameIsNotNull() {
            addCriterion("bd_name is not null");
            return (Criteria) this;
        }

        public Criteria andBdNameEqualTo(String value) {
            addCriterion("bd_name =", value, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameNotEqualTo(String value) {
            addCriterion("bd_name <>", value, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameGreaterThan(String value) {
            addCriterion("bd_name >", value, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameGreaterThanOrEqualTo(String value) {
            addCriterion("bd_name >=", value, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameLessThan(String value) {
            addCriterion("bd_name <", value, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameLessThanOrEqualTo(String value) {
            addCriterion("bd_name <=", value, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameLike(String value) {
            addCriterion("bd_name like", value, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameNotLike(String value) {
            addCriterion("bd_name not like", value, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameIn(List<String> values) {
            addCriterion("bd_name in", values, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameNotIn(List<String> values) {
            addCriterion("bd_name not in", values, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameBetween(String value1, String value2) {
            addCriterion("bd_name between", value1, value2, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameNotBetween(String value1, String value2) {
            addCriterion("bd_name not between", value1, value2, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdPhoneIsNull() {
            addCriterion("bd_phone is null");
            return (Criteria) this;
        }

        public Criteria andBdPhoneIsNotNull() {
            addCriterion("bd_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBdPhoneEqualTo(String value) {
            addCriterion("bd_phone =", value, "bdPhone");
            return (Criteria) this;
        }

        public Criteria andBdPhoneNotEqualTo(String value) {
            addCriterion("bd_phone <>", value, "bdPhone");
            return (Criteria) this;
        }

        public Criteria andBdPhoneGreaterThan(String value) {
            addCriterion("bd_phone >", value, "bdPhone");
            return (Criteria) this;
        }

        public Criteria andBdPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("bd_phone >=", value, "bdPhone");
            return (Criteria) this;
        }

        public Criteria andBdPhoneLessThan(String value) {
            addCriterion("bd_phone <", value, "bdPhone");
            return (Criteria) this;
        }

        public Criteria andBdPhoneLessThanOrEqualTo(String value) {
            addCriterion("bd_phone <=", value, "bdPhone");
            return (Criteria) this;
        }

        public Criteria andBdPhoneLike(String value) {
            addCriterion("bd_phone like", value, "bdPhone");
            return (Criteria) this;
        }

        public Criteria andBdPhoneNotLike(String value) {
            addCriterion("bd_phone not like", value, "bdPhone");
            return (Criteria) this;
        }

        public Criteria andBdPhoneIn(List<String> values) {
            addCriterion("bd_phone in", values, "bdPhone");
            return (Criteria) this;
        }

        public Criteria andBdPhoneNotIn(List<String> values) {
            addCriterion("bd_phone not in", values, "bdPhone");
            return (Criteria) this;
        }

        public Criteria andBdPhoneBetween(String value1, String value2) {
            addCriterion("bd_phone between", value1, value2, "bdPhone");
            return (Criteria) this;
        }

        public Criteria andBdPhoneNotBetween(String value1, String value2) {
            addCriterion("bd_phone not between", value1, value2, "bdPhone");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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