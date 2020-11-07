package com.example.demo.po;

import java.util.ArrayList;
import java.util.List;

public class ClientuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientuserExample() {
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

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUNoIsNull() {
            addCriterion("u_no is null");
            return (Criteria) this;
        }

        public Criteria andUNoIsNotNull() {
            addCriterion("u_no is not null");
            return (Criteria) this;
        }

        public Criteria andUNoEqualTo(Integer value) {
            addCriterion("u_no =", value, "uNo");
            return (Criteria) this;
        }

        public Criteria andUNoNotEqualTo(Integer value) {
            addCriterion("u_no <>", value, "uNo");
            return (Criteria) this;
        }

        public Criteria andUNoGreaterThan(Integer value) {
            addCriterion("u_no >", value, "uNo");
            return (Criteria) this;
        }

        public Criteria andUNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_no >=", value, "uNo");
            return (Criteria) this;
        }

        public Criteria andUNoLessThan(Integer value) {
            addCriterion("u_no <", value, "uNo");
            return (Criteria) this;
        }

        public Criteria andUNoLessThanOrEqualTo(Integer value) {
            addCriterion("u_no <=", value, "uNo");
            return (Criteria) this;
        }

        public Criteria andUNoIn(List<Integer> values) {
            addCriterion("u_no in", values, "uNo");
            return (Criteria) this;
        }

        public Criteria andUNoNotIn(List<Integer> values) {
            addCriterion("u_no not in", values, "uNo");
            return (Criteria) this;
        }

        public Criteria andUNoBetween(Integer value1, Integer value2) {
            addCriterion("u_no between", value1, value2, "uNo");
            return (Criteria) this;
        }

        public Criteria andUNoNotBetween(Integer value1, Integer value2) {
            addCriterion("u_no not between", value1, value2, "uNo");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUPwdIsNull() {
            addCriterion("u_pwd is null");
            return (Criteria) this;
        }

        public Criteria andUPwdIsNotNull() {
            addCriterion("u_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andUPwdEqualTo(String value) {
            addCriterion("u_pwd =", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotEqualTo(String value) {
            addCriterion("u_pwd <>", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdGreaterThan(String value) {
            addCriterion("u_pwd >", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdGreaterThanOrEqualTo(String value) {
            addCriterion("u_pwd >=", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLessThan(String value) {
            addCriterion("u_pwd <", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLessThanOrEqualTo(String value) {
            addCriterion("u_pwd <=", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLike(String value) {
            addCriterion("u_pwd like", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotLike(String value) {
            addCriterion("u_pwd not like", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdIn(List<String> values) {
            addCriterion("u_pwd in", values, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotIn(List<String> values) {
            addCriterion("u_pwd not in", values, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdBetween(String value1, String value2) {
            addCriterion("u_pwd between", value1, value2, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotBetween(String value1, String value2) {
            addCriterion("u_pwd not between", value1, value2, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUQqIsNull() {
            addCriterion("u_qq is null");
            return (Criteria) this;
        }

        public Criteria andUQqIsNotNull() {
            addCriterion("u_qq is not null");
            return (Criteria) this;
        }

        public Criteria andUQqEqualTo(String value) {
            addCriterion("u_qq =", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqNotEqualTo(String value) {
            addCriterion("u_qq <>", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqGreaterThan(String value) {
            addCriterion("u_qq >", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqGreaterThanOrEqualTo(String value) {
            addCriterion("u_qq >=", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqLessThan(String value) {
            addCriterion("u_qq <", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqLessThanOrEqualTo(String value) {
            addCriterion("u_qq <=", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqLike(String value) {
            addCriterion("u_qq like", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqNotLike(String value) {
            addCriterion("u_qq not like", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqIn(List<String> values) {
            addCriterion("u_qq in", values, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqNotIn(List<String> values) {
            addCriterion("u_qq not in", values, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqBetween(String value1, String value2) {
            addCriterion("u_qq between", value1, value2, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqNotBetween(String value1, String value2) {
            addCriterion("u_qq not between", value1, value2, "uQq");
            return (Criteria) this;
        }

        public Criteria andUBorrowIsNull() {
            addCriterion("u_borrow is null");
            return (Criteria) this;
        }

        public Criteria andUBorrowIsNotNull() {
            addCriterion("u_borrow is not null");
            return (Criteria) this;
        }

        public Criteria andUBorrowEqualTo(Integer value) {
            addCriterion("u_borrow =", value, "uBorrow");
            return (Criteria) this;
        }

        public Criteria andUBorrowNotEqualTo(Integer value) {
            addCriterion("u_borrow <>", value, "uBorrow");
            return (Criteria) this;
        }

        public Criteria andUBorrowGreaterThan(Integer value) {
            addCriterion("u_borrow >", value, "uBorrow");
            return (Criteria) this;
        }

        public Criteria andUBorrowGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_borrow >=", value, "uBorrow");
            return (Criteria) this;
        }

        public Criteria andUBorrowLessThan(Integer value) {
            addCriterion("u_borrow <", value, "uBorrow");
            return (Criteria) this;
        }

        public Criteria andUBorrowLessThanOrEqualTo(Integer value) {
            addCriterion("u_borrow <=", value, "uBorrow");
            return (Criteria) this;
        }

        public Criteria andUBorrowIn(List<Integer> values) {
            addCriterion("u_borrow in", values, "uBorrow");
            return (Criteria) this;
        }

        public Criteria andUBorrowNotIn(List<Integer> values) {
            addCriterion("u_borrow not in", values, "uBorrow");
            return (Criteria) this;
        }

        public Criteria andUBorrowBetween(Integer value1, Integer value2) {
            addCriterion("u_borrow between", value1, value2, "uBorrow");
            return (Criteria) this;
        }

        public Criteria andUBorrowNotBetween(Integer value1, Integer value2) {
            addCriterion("u_borrow not between", value1, value2, "uBorrow");
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