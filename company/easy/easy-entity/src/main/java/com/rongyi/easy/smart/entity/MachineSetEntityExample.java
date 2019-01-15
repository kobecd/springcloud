package com.rongyi.easy.smart.entity;

import java.util.ArrayList;
import java.util.List;

public class MachineSetEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MachineSetEntityExample() {
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

        public Criteria andOnTimeIsNull() {
            addCriterion("on_time is null");
            return (Criteria) this;
        }

        public Criteria andOnTimeIsNotNull() {
            addCriterion("on_time is not null");
            return (Criteria) this;
        }

        public Criteria andOnTimeEqualTo(Integer value) {
            addCriterion("on_time =", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeNotEqualTo(Integer value) {
            addCriterion("on_time <>", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeGreaterThan(Integer value) {
            addCriterion("on_time >", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("on_time >=", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeLessThan(Integer value) {
            addCriterion("on_time <", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeLessThanOrEqualTo(Integer value) {
            addCriterion("on_time <=", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeIn(List<Integer> values) {
            addCriterion("on_time in", values, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeNotIn(List<Integer> values) {
            addCriterion("on_time not in", values, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeBetween(Integer value1, Integer value2) {
            addCriterion("on_time between", value1, value2, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("on_time not between", value1, value2, "onTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeIsNull() {
            addCriterion("off_time is null");
            return (Criteria) this;
        }

        public Criteria andOffTimeIsNotNull() {
            addCriterion("off_time is not null");
            return (Criteria) this;
        }

        public Criteria andOffTimeEqualTo(Integer value) {
            addCriterion("off_time =", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotEqualTo(Integer value) {
            addCriterion("off_time <>", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeGreaterThan(Integer value) {
            addCriterion("off_time >", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("off_time >=", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeLessThan(Integer value) {
            addCriterion("off_time <", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeLessThanOrEqualTo(Integer value) {
            addCriterion("off_time <=", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeIn(List<Integer> values) {
            addCriterion("off_time in", values, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotIn(List<Integer> values) {
            addCriterion("off_time not in", values, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeBetween(Integer value1, Integer value2) {
            addCriterion("off_time between", value1, value2, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("off_time not between", value1, value2, "offTime");
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

        public Criteria andDateSetIsNull() {
            addCriterion("date_set is null");
            return (Criteria) this;
        }

        public Criteria andDateSetIsNotNull() {
            addCriterion("date_set is not null");
            return (Criteria) this;
        }

        public Criteria andDateSetEqualTo(Integer value) {
            addCriterion("date_set =", value, "dateSet");
            return (Criteria) this;
        }

        public Criteria andDateSetNotEqualTo(Integer value) {
            addCriterion("date_set <>", value, "dateSet");
            return (Criteria) this;
        }

        public Criteria andDateSetGreaterThan(Integer value) {
            addCriterion("date_set >", value, "dateSet");
            return (Criteria) this;
        }

        public Criteria andDateSetGreaterThanOrEqualTo(Integer value) {
            addCriterion("date_set >=", value, "dateSet");
            return (Criteria) this;
        }

        public Criteria andDateSetLessThan(Integer value) {
            addCriterion("date_set <", value, "dateSet");
            return (Criteria) this;
        }

        public Criteria andDateSetLessThanOrEqualTo(Integer value) {
            addCriterion("date_set <=", value, "dateSet");
            return (Criteria) this;
        }

        public Criteria andDateSetIn(List<Integer> values) {
            addCriterion("date_set in", values, "dateSet");
            return (Criteria) this;
        }

        public Criteria andDateSetNotIn(List<Integer> values) {
            addCriterion("date_set not in", values, "dateSet");
            return (Criteria) this;
        }

        public Criteria andDateSetBetween(Integer value1, Integer value2) {
            addCriterion("date_set between", value1, value2, "dateSet");
            return (Criteria) this;
        }

        public Criteria andDateSetNotBetween(Integer value1, Integer value2) {
            addCriterion("date_set not between", value1, value2, "dateSet");
            return (Criteria) this;
        }

        public Criteria andIsAbleIsNull() {
            addCriterion("is_able is null");
            return (Criteria) this;
        }

        public Criteria andIsAbleIsNotNull() {
            addCriterion("is_able is not null");
            return (Criteria) this;
        }

        public Criteria andIsAbleEqualTo(Byte value) {
            addCriterion("is_able =", value, "isAble");
            return (Criteria) this;
        }

        public Criteria andIsAbleNotEqualTo(Byte value) {
            addCriterion("is_able <>", value, "isAble");
            return (Criteria) this;
        }

        public Criteria andIsAbleGreaterThan(Byte value) {
            addCriterion("is_able >", value, "isAble");
            return (Criteria) this;
        }

        public Criteria andIsAbleGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_able >=", value, "isAble");
            return (Criteria) this;
        }

        public Criteria andIsAbleLessThan(Byte value) {
            addCriterion("is_able <", value, "isAble");
            return (Criteria) this;
        }

        public Criteria andIsAbleLessThanOrEqualTo(Byte value) {
            addCriterion("is_able <=", value, "isAble");
            return (Criteria) this;
        }

        public Criteria andIsAbleIn(List<Byte> values) {
            addCriterion("is_able in", values, "isAble");
            return (Criteria) this;
        }

        public Criteria andIsAbleNotIn(List<Byte> values) {
            addCriterion("is_able not in", values, "isAble");
            return (Criteria) this;
        }

        public Criteria andIsAbleBetween(Byte value1, Byte value2) {
            addCriterion("is_able between", value1, value2, "isAble");
            return (Criteria) this;
        }

        public Criteria andIsAbleNotBetween(Byte value1, Byte value2) {
            addCriterion("is_able not between", value1, value2, "isAble");
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