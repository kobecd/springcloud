package com.rongyi.easy.smart.entity;

import java.util.ArrayList;
import java.util.List;

public class CaseModuleMemberPointsEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaseModuleMemberPointsEntityExample() {
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

        public Criteria andCaseIdIsNull() {
            addCriterion("case_id is null");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNotNull() {
            addCriterion("case_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaseIdEqualTo(Integer value) {
            addCriterion("case_id =", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotEqualTo(Integer value) {
            addCriterion("case_id <>", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThan(Integer value) {
            addCriterion("case_id >", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_id >=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThan(Integer value) {
            addCriterion("case_id <", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("case_id <=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIn(List<Integer> values) {
            addCriterion("case_id in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotIn(List<Integer> values) {
            addCriterion("case_id not in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdBetween(Integer value1, Integer value2) {
            addCriterion("case_id between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("case_id not between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andBgImgIsNull() {
            addCriterion("bg_img is null");
            return (Criteria) this;
        }

        public Criteria andBgImgIsNotNull() {
            addCriterion("bg_img is not null");
            return (Criteria) this;
        }

        public Criteria andBgImgEqualTo(String value) {
            addCriterion("bg_img =", value, "bgImg");
            return (Criteria) this;
        }

        public Criteria andBgImgNotEqualTo(String value) {
            addCriterion("bg_img <>", value, "bgImg");
            return (Criteria) this;
        }

        public Criteria andBgImgGreaterThan(String value) {
            addCriterion("bg_img >", value, "bgImg");
            return (Criteria) this;
        }

        public Criteria andBgImgGreaterThanOrEqualTo(String value) {
            addCriterion("bg_img >=", value, "bgImg");
            return (Criteria) this;
        }

        public Criteria andBgImgLessThan(String value) {
            addCriterion("bg_img <", value, "bgImg");
            return (Criteria) this;
        }

        public Criteria andBgImgLessThanOrEqualTo(String value) {
            addCriterion("bg_img <=", value, "bgImg");
            return (Criteria) this;
        }

        public Criteria andBgImgLike(String value) {
            addCriterion("bg_img like", value, "bgImg");
            return (Criteria) this;
        }

        public Criteria andBgImgNotLike(String value) {
            addCriterion("bg_img not like", value, "bgImg");
            return (Criteria) this;
        }

        public Criteria andBgImgIn(List<String> values) {
            addCriterion("bg_img in", values, "bgImg");
            return (Criteria) this;
        }

        public Criteria andBgImgNotIn(List<String> values) {
            addCriterion("bg_img not in", values, "bgImg");
            return (Criteria) this;
        }

        public Criteria andBgImgBetween(String value1, String value2) {
            addCriterion("bg_img between", value1, value2, "bgImg");
            return (Criteria) this;
        }

        public Criteria andBgImgNotBetween(String value1, String value2) {
            addCriterion("bg_img not between", value1, value2, "bgImg");
            return (Criteria) this;
        }

        public Criteria andIsRecomIsNull() {
            addCriterion("is_recom is null");
            return (Criteria) this;
        }

        public Criteria andIsRecomIsNotNull() {
            addCriterion("is_recom is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecomEqualTo(Byte value) {
            addCriterion("is_recom =", value, "isRecom");
            return (Criteria) this;
        }

        public Criteria andIsRecomNotEqualTo(Byte value) {
            addCriterion("is_recom <>", value, "isRecom");
            return (Criteria) this;
        }

        public Criteria andIsRecomGreaterThan(Byte value) {
            addCriterion("is_recom >", value, "isRecom");
            return (Criteria) this;
        }

        public Criteria andIsRecomGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_recom >=", value, "isRecom");
            return (Criteria) this;
        }

        public Criteria andIsRecomLessThan(Byte value) {
            addCriterion("is_recom <", value, "isRecom");
            return (Criteria) this;
        }

        public Criteria andIsRecomLessThanOrEqualTo(Byte value) {
            addCriterion("is_recom <=", value, "isRecom");
            return (Criteria) this;
        }

        public Criteria andIsRecomIn(List<Byte> values) {
            addCriterion("is_recom in", values, "isRecom");
            return (Criteria) this;
        }

        public Criteria andIsRecomNotIn(List<Byte> values) {
            addCriterion("is_recom not in", values, "isRecom");
            return (Criteria) this;
        }

        public Criteria andIsRecomBetween(Byte value1, Byte value2) {
            addCriterion("is_recom between", value1, value2, "isRecom");
            return (Criteria) this;
        }

        public Criteria andIsRecomNotBetween(Byte value1, Byte value2) {
            addCriterion("is_recom not between", value1, value2, "isRecom");
            return (Criteria) this;
        }

        public Criteria andGiftIdsIsNull() {
            addCriterion("gift_ids is null");
            return (Criteria) this;
        }

        public Criteria andGiftIdsIsNotNull() {
            addCriterion("gift_ids is not null");
            return (Criteria) this;
        }

        public Criteria andGiftIdsEqualTo(String value) {
            addCriterion("gift_ids =", value, "giftIds");
            return (Criteria) this;
        }

        public Criteria andGiftIdsNotEqualTo(String value) {
            addCriterion("gift_ids <>", value, "giftIds");
            return (Criteria) this;
        }

        public Criteria andGiftIdsGreaterThan(String value) {
            addCriterion("gift_ids >", value, "giftIds");
            return (Criteria) this;
        }

        public Criteria andGiftIdsGreaterThanOrEqualTo(String value) {
            addCriterion("gift_ids >=", value, "giftIds");
            return (Criteria) this;
        }

        public Criteria andGiftIdsLessThan(String value) {
            addCriterion("gift_ids <", value, "giftIds");
            return (Criteria) this;
        }

        public Criteria andGiftIdsLessThanOrEqualTo(String value) {
            addCriterion("gift_ids <=", value, "giftIds");
            return (Criteria) this;
        }

        public Criteria andGiftIdsLike(String value) {
            addCriterion("gift_ids like", value, "giftIds");
            return (Criteria) this;
        }

        public Criteria andGiftIdsNotLike(String value) {
            addCriterion("gift_ids not like", value, "giftIds");
            return (Criteria) this;
        }

        public Criteria andGiftIdsIn(List<String> values) {
            addCriterion("gift_ids in", values, "giftIds");
            return (Criteria) this;
        }

        public Criteria andGiftIdsNotIn(List<String> values) {
            addCriterion("gift_ids not in", values, "giftIds");
            return (Criteria) this;
        }

        public Criteria andGiftIdsBetween(String value1, String value2) {
            addCriterion("gift_ids between", value1, value2, "giftIds");
            return (Criteria) this;
        }

        public Criteria andGiftIdsNotBetween(String value1, String value2) {
            addCriterion("gift_ids not between", value1, value2, "giftIds");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Integer value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Integer value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Integer value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Integer value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Integer value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Integer> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Integer> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Integer value1, Integer value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Integer value1, Integer value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Integer value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Integer value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Integer value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Integer value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Integer value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Integer> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Integer> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Integer value1, Integer value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Integer value1, Integer value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
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