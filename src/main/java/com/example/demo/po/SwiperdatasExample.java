package com.example.demo.po;

import java.util.ArrayList;
import java.util.List;

public class SwiperdatasExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SwiperdatasExample() {
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

        public Criteria andSwIdIsNull() {
            addCriterion("sw_id is null");
            return (Criteria) this;
        }

        public Criteria andSwIdIsNotNull() {
            addCriterion("sw_id is not null");
            return (Criteria) this;
        }

        public Criteria andSwIdEqualTo(Integer value) {
            addCriterion("sw_id =", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdNotEqualTo(Integer value) {
            addCriterion("sw_id <>", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdGreaterThan(Integer value) {
            addCriterion("sw_id >", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sw_id >=", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdLessThan(Integer value) {
            addCriterion("sw_id <", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdLessThanOrEqualTo(Integer value) {
            addCriterion("sw_id <=", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdIn(List<Integer> values) {
            addCriterion("sw_id in", values, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdNotIn(List<Integer> values) {
            addCriterion("sw_id not in", values, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdBetween(Integer value1, Integer value2) {
            addCriterion("sw_id between", value1, value2, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sw_id not between", value1, value2, "swId");
            return (Criteria) this;
        }

        public Criteria andSwImgIsNull() {
            addCriterion("sw_img is null");
            return (Criteria) this;
        }

        public Criteria andSwImgIsNotNull() {
            addCriterion("sw_img is not null");
            return (Criteria) this;
        }

        public Criteria andSwImgEqualTo(String value) {
            addCriterion("sw_img =", value, "swImg");
            return (Criteria) this;
        }

        public Criteria andSwImgNotEqualTo(String value) {
            addCriterion("sw_img <>", value, "swImg");
            return (Criteria) this;
        }

        public Criteria andSwImgGreaterThan(String value) {
            addCriterion("sw_img >", value, "swImg");
            return (Criteria) this;
        }

        public Criteria andSwImgGreaterThanOrEqualTo(String value) {
            addCriterion("sw_img >=", value, "swImg");
            return (Criteria) this;
        }

        public Criteria andSwImgLessThan(String value) {
            addCriterion("sw_img <", value, "swImg");
            return (Criteria) this;
        }

        public Criteria andSwImgLessThanOrEqualTo(String value) {
            addCriterion("sw_img <=", value, "swImg");
            return (Criteria) this;
        }

        public Criteria andSwImgLike(String value) {
            addCriterion("sw_img like", value, "swImg");
            return (Criteria) this;
        }

        public Criteria andSwImgNotLike(String value) {
            addCriterion("sw_img not like", value, "swImg");
            return (Criteria) this;
        }

        public Criteria andSwImgIn(List<String> values) {
            addCriterion("sw_img in", values, "swImg");
            return (Criteria) this;
        }

        public Criteria andSwImgNotIn(List<String> values) {
            addCriterion("sw_img not in", values, "swImg");
            return (Criteria) this;
        }

        public Criteria andSwImgBetween(String value1, String value2) {
            addCriterion("sw_img between", value1, value2, "swImg");
            return (Criteria) this;
        }

        public Criteria andSwImgNotBetween(String value1, String value2) {
            addCriterion("sw_img not between", value1, value2, "swImg");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIsNull() {
            addCriterion("open_type is null");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIsNotNull() {
            addCriterion("open_type is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTypeEqualTo(String value) {
            addCriterion("open_type =", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotEqualTo(String value) {
            addCriterion("open_type <>", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeGreaterThan(String value) {
            addCriterion("open_type >", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeGreaterThanOrEqualTo(String value) {
            addCriterion("open_type >=", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLessThan(String value) {
            addCriterion("open_type <", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLessThanOrEqualTo(String value) {
            addCriterion("open_type <=", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLike(String value) {
            addCriterion("open_type like", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotLike(String value) {
            addCriterion("open_type not like", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIn(List<String> values) {
            addCriterion("open_type in", values, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotIn(List<String> values) {
            addCriterion("open_type not in", values, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeBetween(String value1, String value2) {
            addCriterion("open_type between", value1, value2, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotBetween(String value1, String value2) {
            addCriterion("open_type not between", value1, value2, "openType");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andNavigatoUrlIsNull() {
            addCriterion("navigato_url is null");
            return (Criteria) this;
        }

        public Criteria andNavigatoUrlIsNotNull() {
            addCriterion("navigato_url is not null");
            return (Criteria) this;
        }

        public Criteria andNavigatoUrlEqualTo(String value) {
            addCriterion("navigato_url =", value, "navigatoUrl");
            return (Criteria) this;
        }

        public Criteria andNavigatoUrlNotEqualTo(String value) {
            addCriterion("navigato_url <>", value, "navigatoUrl");
            return (Criteria) this;
        }

        public Criteria andNavigatoUrlGreaterThan(String value) {
            addCriterion("navigato_url >", value, "navigatoUrl");
            return (Criteria) this;
        }

        public Criteria andNavigatoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("navigato_url >=", value, "navigatoUrl");
            return (Criteria) this;
        }

        public Criteria andNavigatoUrlLessThan(String value) {
            addCriterion("navigato_url <", value, "navigatoUrl");
            return (Criteria) this;
        }

        public Criteria andNavigatoUrlLessThanOrEqualTo(String value) {
            addCriterion("navigato_url <=", value, "navigatoUrl");
            return (Criteria) this;
        }

        public Criteria andNavigatoUrlLike(String value) {
            addCriterion("navigato_url like", value, "navigatoUrl");
            return (Criteria) this;
        }

        public Criteria andNavigatoUrlNotLike(String value) {
            addCriterion("navigato_url not like", value, "navigatoUrl");
            return (Criteria) this;
        }

        public Criteria andNavigatoUrlIn(List<String> values) {
            addCriterion("navigato_url in", values, "navigatoUrl");
            return (Criteria) this;
        }

        public Criteria andNavigatoUrlNotIn(List<String> values) {
            addCriterion("navigato_url not in", values, "navigatoUrl");
            return (Criteria) this;
        }

        public Criteria andNavigatoUrlBetween(String value1, String value2) {
            addCriterion("navigato_url between", value1, value2, "navigatoUrl");
            return (Criteria) this;
        }

        public Criteria andNavigatoUrlNotBetween(String value1, String value2) {
            addCriterion("navigato_url not between", value1, value2, "navigatoUrl");
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