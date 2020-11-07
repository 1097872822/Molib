package com.example.demo.po;

import java.util.ArrayList;
import java.util.List;

public class VideosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideosExample() {
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

        public Criteria andVIdIsNull() {
            addCriterion("v_id is null");
            return (Criteria) this;
        }

        public Criteria andVIdIsNotNull() {
            addCriterion("v_id is not null");
            return (Criteria) this;
        }

        public Criteria andVIdEqualTo(Integer value) {
            addCriterion("v_id =", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotEqualTo(Integer value) {
            addCriterion("v_id <>", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdGreaterThan(Integer value) {
            addCriterion("v_id >", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("v_id >=", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdLessThan(Integer value) {
            addCriterion("v_id <", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdLessThanOrEqualTo(Integer value) {
            addCriterion("v_id <=", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdIn(List<Integer> values) {
            addCriterion("v_id in", values, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotIn(List<Integer> values) {
            addCriterion("v_id not in", values, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdBetween(Integer value1, Integer value2) {
            addCriterion("v_id between", value1, value2, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotBetween(Integer value1, Integer value2) {
            addCriterion("v_id not between", value1, value2, "vId");
            return (Criteria) this;
        }

        public Criteria andVNameIsNull() {
            addCriterion("v_name is null");
            return (Criteria) this;
        }

        public Criteria andVNameIsNotNull() {
            addCriterion("v_name is not null");
            return (Criteria) this;
        }

        public Criteria andVNameEqualTo(String value) {
            addCriterion("v_name =", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotEqualTo(String value) {
            addCriterion("v_name <>", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameGreaterThan(String value) {
            addCriterion("v_name >", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameGreaterThanOrEqualTo(String value) {
            addCriterion("v_name >=", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameLessThan(String value) {
            addCriterion("v_name <", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameLessThanOrEqualTo(String value) {
            addCriterion("v_name <=", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameLike(String value) {
            addCriterion("v_name like", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotLike(String value) {
            addCriterion("v_name not like", value, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameIn(List<String> values) {
            addCriterion("v_name in", values, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotIn(List<String> values) {
            addCriterion("v_name not in", values, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameBetween(String value1, String value2) {
            addCriterion("v_name between", value1, value2, "vName");
            return (Criteria) this;
        }

        public Criteria andVNameNotBetween(String value1, String value2) {
            addCriterion("v_name not between", value1, value2, "vName");
            return (Criteria) this;
        }

        public Criteria andVUrlIsNull() {
            addCriterion("v_url is null");
            return (Criteria) this;
        }

        public Criteria andVUrlIsNotNull() {
            addCriterion("v_url is not null");
            return (Criteria) this;
        }

        public Criteria andVUrlEqualTo(String value) {
            addCriterion("v_url =", value, "vUrl");
            return (Criteria) this;
        }

        public Criteria andVUrlNotEqualTo(String value) {
            addCriterion("v_url <>", value, "vUrl");
            return (Criteria) this;
        }

        public Criteria andVUrlGreaterThan(String value) {
            addCriterion("v_url >", value, "vUrl");
            return (Criteria) this;
        }

        public Criteria andVUrlGreaterThanOrEqualTo(String value) {
            addCriterion("v_url >=", value, "vUrl");
            return (Criteria) this;
        }

        public Criteria andVUrlLessThan(String value) {
            addCriterion("v_url <", value, "vUrl");
            return (Criteria) this;
        }

        public Criteria andVUrlLessThanOrEqualTo(String value) {
            addCriterion("v_url <=", value, "vUrl");
            return (Criteria) this;
        }

        public Criteria andVUrlLike(String value) {
            addCriterion("v_url like", value, "vUrl");
            return (Criteria) this;
        }

        public Criteria andVUrlNotLike(String value) {
            addCriterion("v_url not like", value, "vUrl");
            return (Criteria) this;
        }

        public Criteria andVUrlIn(List<String> values) {
            addCriterion("v_url in", values, "vUrl");
            return (Criteria) this;
        }

        public Criteria andVUrlNotIn(List<String> values) {
            addCriterion("v_url not in", values, "vUrl");
            return (Criteria) this;
        }

        public Criteria andVUrlBetween(String value1, String value2) {
            addCriterion("v_url between", value1, value2, "vUrl");
            return (Criteria) this;
        }

        public Criteria andVUrlNotBetween(String value1, String value2) {
            addCriterion("v_url not between", value1, value2, "vUrl");
            return (Criteria) this;
        }

        public Criteria andVImgIsNull() {
            addCriterion("v_img is null");
            return (Criteria) this;
        }

        public Criteria andVImgIsNotNull() {
            addCriterion("v_img is not null");
            return (Criteria) this;
        }

        public Criteria andVImgEqualTo(String value) {
            addCriterion("v_img =", value, "vImg");
            return (Criteria) this;
        }

        public Criteria andVImgNotEqualTo(String value) {
            addCriterion("v_img <>", value, "vImg");
            return (Criteria) this;
        }

        public Criteria andVImgGreaterThan(String value) {
            addCriterion("v_img >", value, "vImg");
            return (Criteria) this;
        }

        public Criteria andVImgGreaterThanOrEqualTo(String value) {
            addCriterion("v_img >=", value, "vImg");
            return (Criteria) this;
        }

        public Criteria andVImgLessThan(String value) {
            addCriterion("v_img <", value, "vImg");
            return (Criteria) this;
        }

        public Criteria andVImgLessThanOrEqualTo(String value) {
            addCriterion("v_img <=", value, "vImg");
            return (Criteria) this;
        }

        public Criteria andVImgLike(String value) {
            addCriterion("v_img like", value, "vImg");
            return (Criteria) this;
        }

        public Criteria andVImgNotLike(String value) {
            addCriterion("v_img not like", value, "vImg");
            return (Criteria) this;
        }

        public Criteria andVImgIn(List<String> values) {
            addCriterion("v_img in", values, "vImg");
            return (Criteria) this;
        }

        public Criteria andVImgNotIn(List<String> values) {
            addCriterion("v_img not in", values, "vImg");
            return (Criteria) this;
        }

        public Criteria andVImgBetween(String value1, String value2) {
            addCriterion("v_img between", value1, value2, "vImg");
            return (Criteria) this;
        }

        public Criteria andVImgNotBetween(String value1, String value2) {
            addCriterion("v_img not between", value1, value2, "vImg");
            return (Criteria) this;
        }

        public Criteria andVConcentIsNull() {
            addCriterion("v_concent is null");
            return (Criteria) this;
        }

        public Criteria andVConcentIsNotNull() {
            addCriterion("v_concent is not null");
            return (Criteria) this;
        }

        public Criteria andVConcentEqualTo(String value) {
            addCriterion("v_concent =", value, "vConcent");
            return (Criteria) this;
        }

        public Criteria andVConcentNotEqualTo(String value) {
            addCriterion("v_concent <>", value, "vConcent");
            return (Criteria) this;
        }

        public Criteria andVConcentGreaterThan(String value) {
            addCriterion("v_concent >", value, "vConcent");
            return (Criteria) this;
        }

        public Criteria andVConcentGreaterThanOrEqualTo(String value) {
            addCriterion("v_concent >=", value, "vConcent");
            return (Criteria) this;
        }

        public Criteria andVConcentLessThan(String value) {
            addCriterion("v_concent <", value, "vConcent");
            return (Criteria) this;
        }

        public Criteria andVConcentLessThanOrEqualTo(String value) {
            addCriterion("v_concent <=", value, "vConcent");
            return (Criteria) this;
        }

        public Criteria andVConcentLike(String value) {
            addCriterion("v_concent like", value, "vConcent");
            return (Criteria) this;
        }

        public Criteria andVConcentNotLike(String value) {
            addCriterion("v_concent not like", value, "vConcent");
            return (Criteria) this;
        }

        public Criteria andVConcentIn(List<String> values) {
            addCriterion("v_concent in", values, "vConcent");
            return (Criteria) this;
        }

        public Criteria andVConcentNotIn(List<String> values) {
            addCriterion("v_concent not in", values, "vConcent");
            return (Criteria) this;
        }

        public Criteria andVConcentBetween(String value1, String value2) {
            addCriterion("v_concent between", value1, value2, "vConcent");
            return (Criteria) this;
        }

        public Criteria andVConcentNotBetween(String value1, String value2) {
            addCriterion("v_concent not between", value1, value2, "vConcent");
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