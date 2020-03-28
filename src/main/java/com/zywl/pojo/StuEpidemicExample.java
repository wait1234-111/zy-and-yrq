package com.zywl.pojo;

import java.util.ArrayList;
import java.util.List;

public class StuEpidemicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuEpidemicExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStunoIsNull() {
            addCriterion("stuno is null");
            return (Criteria) this;
        }

        public Criteria andStunoIsNotNull() {
            addCriterion("stuno is not null");
            return (Criteria) this;
        }

        public Criteria andStunoEqualTo(String value) {
            addCriterion("stuno =", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoNotEqualTo(String value) {
            addCriterion("stuno <>", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoGreaterThan(String value) {
            addCriterion("stuno >", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoGreaterThanOrEqualTo(String value) {
            addCriterion("stuno >=", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoLessThan(String value) {
            addCriterion("stuno <", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoLessThanOrEqualTo(String value) {
            addCriterion("stuno <=", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoLike(String value) {
            addCriterion("stuno like", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoNotLike(String value) {
            addCriterion("stuno not like", value, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoIn(List<String> values) {
            addCriterion("stuno in", values, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoNotIn(List<String> values) {
            addCriterion("stuno not in", values, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoBetween(String value1, String value2) {
            addCriterion("stuno between", value1, value2, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunoNotBetween(String value1, String value2) {
            addCriterion("stuno not between", value1, value2, "stuno");
            return (Criteria) this;
        }

        public Criteria andStunameIsNull() {
            addCriterion("stuname is null");
            return (Criteria) this;
        }

        public Criteria andStunameIsNotNull() {
            addCriterion("stuname is not null");
            return (Criteria) this;
        }

        public Criteria andStunameEqualTo(String value) {
            addCriterion("stuname =", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotEqualTo(String value) {
            addCriterion("stuname <>", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThan(String value) {
            addCriterion("stuname >", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThanOrEqualTo(String value) {
            addCriterion("stuname >=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThan(String value) {
            addCriterion("stuname <", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThanOrEqualTo(String value) {
            addCriterion("stuname <=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLike(String value) {
            addCriterion("stuname like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotLike(String value) {
            addCriterion("stuname not like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameIn(List<String> values) {
            addCriterion("stuname in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotIn(List<String> values) {
            addCriterion("stuname not in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameBetween(String value1, String value2) {
            addCriterion("stuname between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotBetween(String value1, String value2) {
            addCriterion("stuname not between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andColleageIsNull() {
            addCriterion("colleage is null");
            return (Criteria) this;
        }

        public Criteria andColleageIsNotNull() {
            addCriterion("colleage is not null");
            return (Criteria) this;
        }

        public Criteria andColleageEqualTo(String value) {
            addCriterion("colleage =", value, "colleage");
            return (Criteria) this;
        }

        public Criteria andColleageNotEqualTo(String value) {
            addCriterion("colleage <>", value, "colleage");
            return (Criteria) this;
        }

        public Criteria andColleageGreaterThan(String value) {
            addCriterion("colleage >", value, "colleage");
            return (Criteria) this;
        }

        public Criteria andColleageGreaterThanOrEqualTo(String value) {
            addCriterion("colleage >=", value, "colleage");
            return (Criteria) this;
        }

        public Criteria andColleageLessThan(String value) {
            addCriterion("colleage <", value, "colleage");
            return (Criteria) this;
        }

        public Criteria andColleageLessThanOrEqualTo(String value) {
            addCriterion("colleage <=", value, "colleage");
            return (Criteria) this;
        }

        public Criteria andColleageLike(String value) {
            addCriterion("colleage like", value, "colleage");
            return (Criteria) this;
        }

        public Criteria andColleageNotLike(String value) {
            addCriterion("colleage not like", value, "colleage");
            return (Criteria) this;
        }

        public Criteria andColleageIn(List<String> values) {
            addCriterion("colleage in", values, "colleage");
            return (Criteria) this;
        }

        public Criteria andColleageNotIn(List<String> values) {
            addCriterion("colleage not in", values, "colleage");
            return (Criteria) this;
        }

        public Criteria andColleageBetween(String value1, String value2) {
            addCriterion("colleage between", value1, value2, "colleage");
            return (Criteria) this;
        }

        public Criteria andColleageNotBetween(String value1, String value2) {
            addCriterion("colleage not between", value1, value2, "colleage");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("classname is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("classname is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("classname =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("classname <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("classname >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("classname >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("classname <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("classname <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("classname like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("classname not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("classname in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("classname not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("classname between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("classname not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andFillintdateIsNull() {
            addCriterion("fillintdate is null");
            return (Criteria) this;
        }

        public Criteria andFillintdateIsNotNull() {
            addCriterion("fillintdate is not null");
            return (Criteria) this;
        }

        public Criteria andFillintdateEqualTo(String value) {
            addCriterion("fillintdate =", value, "fillintdate");
            return (Criteria) this;
        }

        public Criteria andFillintdateNotEqualTo(String value) {
            addCriterion("fillintdate <>", value, "fillintdate");
            return (Criteria) this;
        }

        public Criteria andFillintdateGreaterThan(String value) {
            addCriterion("fillintdate >", value, "fillintdate");
            return (Criteria) this;
        }

        public Criteria andFillintdateGreaterThanOrEqualTo(String value) {
            addCriterion("fillintdate >=", value, "fillintdate");
            return (Criteria) this;
        }

        public Criteria andFillintdateLessThan(String value) {
            addCriterion("fillintdate <", value, "fillintdate");
            return (Criteria) this;
        }

        public Criteria andFillintdateLessThanOrEqualTo(String value) {
            addCriterion("fillintdate <=", value, "fillintdate");
            return (Criteria) this;
        }

        public Criteria andFillintdateLike(String value) {
            addCriterion("fillintdate like", value, "fillintdate");
            return (Criteria) this;
        }

        public Criteria andFillintdateNotLike(String value) {
            addCriterion("fillintdate not like", value, "fillintdate");
            return (Criteria) this;
        }

        public Criteria andFillintdateIn(List<String> values) {
            addCriterion("fillintdate in", values, "fillintdate");
            return (Criteria) this;
        }

        public Criteria andFillintdateNotIn(List<String> values) {
            addCriterion("fillintdate not in", values, "fillintdate");
            return (Criteria) this;
        }

        public Criteria andFillintdateBetween(String value1, String value2) {
            addCriterion("fillintdate between", value1, value2, "fillintdate");
            return (Criteria) this;
        }

        public Criteria andFillintdateNotBetween(String value1, String value2) {
            addCriterion("fillintdate not between", value1, value2, "fillintdate");
            return (Criteria) this;
        }

        public Criteria andIsabroadIsNull() {
            addCriterion("isabroad is null");
            return (Criteria) this;
        }

        public Criteria andIsabroadIsNotNull() {
            addCriterion("isabroad is not null");
            return (Criteria) this;
        }

        public Criteria andIsabroadEqualTo(String value) {
            addCriterion("isabroad =", value, "isabroad");
            return (Criteria) this;
        }

        public Criteria andIsabroadNotEqualTo(String value) {
            addCriterion("isabroad <>", value, "isabroad");
            return (Criteria) this;
        }

        public Criteria andIsabroadGreaterThan(String value) {
            addCriterion("isabroad >", value, "isabroad");
            return (Criteria) this;
        }

        public Criteria andIsabroadGreaterThanOrEqualTo(String value) {
            addCriterion("isabroad >=", value, "isabroad");
            return (Criteria) this;
        }

        public Criteria andIsabroadLessThan(String value) {
            addCriterion("isabroad <", value, "isabroad");
            return (Criteria) this;
        }

        public Criteria andIsabroadLessThanOrEqualTo(String value) {
            addCriterion("isabroad <=", value, "isabroad");
            return (Criteria) this;
        }

        public Criteria andIsabroadLike(String value) {
            addCriterion("isabroad like", value, "isabroad");
            return (Criteria) this;
        }

        public Criteria andIsabroadNotLike(String value) {
            addCriterion("isabroad not like", value, "isabroad");
            return (Criteria) this;
        }

        public Criteria andIsabroadIn(List<String> values) {
            addCriterion("isabroad in", values, "isabroad");
            return (Criteria) this;
        }

        public Criteria andIsabroadNotIn(List<String> values) {
            addCriterion("isabroad not in", values, "isabroad");
            return (Criteria) this;
        }

        public Criteria andIsabroadBetween(String value1, String value2) {
            addCriterion("isabroad between", value1, value2, "isabroad");
            return (Criteria) this;
        }

        public Criteria andIsabroadNotBetween(String value1, String value2) {
            addCriterion("isabroad not between", value1, value2, "isabroad");
            return (Criteria) this;
        }

        public Criteria andIshubeiIsNull() {
            addCriterion("ishubei is null");
            return (Criteria) this;
        }

        public Criteria andIshubeiIsNotNull() {
            addCriterion("ishubei is not null");
            return (Criteria) this;
        }

        public Criteria andIshubeiEqualTo(String value) {
            addCriterion("ishubei =", value, "ishubei");
            return (Criteria) this;
        }

        public Criteria andIshubeiNotEqualTo(String value) {
            addCriterion("ishubei <>", value, "ishubei");
            return (Criteria) this;
        }

        public Criteria andIshubeiGreaterThan(String value) {
            addCriterion("ishubei >", value, "ishubei");
            return (Criteria) this;
        }

        public Criteria andIshubeiGreaterThanOrEqualTo(String value) {
            addCriterion("ishubei >=", value, "ishubei");
            return (Criteria) this;
        }

        public Criteria andIshubeiLessThan(String value) {
            addCriterion("ishubei <", value, "ishubei");
            return (Criteria) this;
        }

        public Criteria andIshubeiLessThanOrEqualTo(String value) {
            addCriterion("ishubei <=", value, "ishubei");
            return (Criteria) this;
        }

        public Criteria andIshubeiLike(String value) {
            addCriterion("ishubei like", value, "ishubei");
            return (Criteria) this;
        }

        public Criteria andIshubeiNotLike(String value) {
            addCriterion("ishubei not like", value, "ishubei");
            return (Criteria) this;
        }

        public Criteria andIshubeiIn(List<String> values) {
            addCriterion("ishubei in", values, "ishubei");
            return (Criteria) this;
        }

        public Criteria andIshubeiNotIn(List<String> values) {
            addCriterion("ishubei not in", values, "ishubei");
            return (Criteria) this;
        }

        public Criteria andIshubeiBetween(String value1, String value2) {
            addCriterion("ishubei between", value1, value2, "ishubei");
            return (Criteria) this;
        }

        public Criteria andIshubeiNotBetween(String value1, String value2) {
            addCriterion("ishubei not between", value1, value2, "ishubei");
            return (Criteria) this;
        }

        public Criteria andIwuhanIsNull() {
            addCriterion("iwuhan is null");
            return (Criteria) this;
        }

        public Criteria andIwuhanIsNotNull() {
            addCriterion("iwuhan is not null");
            return (Criteria) this;
        }

        public Criteria andIwuhanEqualTo(String value) {
            addCriterion("iwuhan =", value, "iwuhan");
            return (Criteria) this;
        }

        public Criteria andIwuhanNotEqualTo(String value) {
            addCriterion("iwuhan <>", value, "iwuhan");
            return (Criteria) this;
        }

        public Criteria andIwuhanGreaterThan(String value) {
            addCriterion("iwuhan >", value, "iwuhan");
            return (Criteria) this;
        }

        public Criteria andIwuhanGreaterThanOrEqualTo(String value) {
            addCriterion("iwuhan >=", value, "iwuhan");
            return (Criteria) this;
        }

        public Criteria andIwuhanLessThan(String value) {
            addCriterion("iwuhan <", value, "iwuhan");
            return (Criteria) this;
        }

        public Criteria andIwuhanLessThanOrEqualTo(String value) {
            addCriterion("iwuhan <=", value, "iwuhan");
            return (Criteria) this;
        }

        public Criteria andIwuhanLike(String value) {
            addCriterion("iwuhan like", value, "iwuhan");
            return (Criteria) this;
        }

        public Criteria andIwuhanNotLike(String value) {
            addCriterion("iwuhan not like", value, "iwuhan");
            return (Criteria) this;
        }

        public Criteria andIwuhanIn(List<String> values) {
            addCriterion("iwuhan in", values, "iwuhan");
            return (Criteria) this;
        }

        public Criteria andIwuhanNotIn(List<String> values) {
            addCriterion("iwuhan not in", values, "iwuhan");
            return (Criteria) this;
        }

        public Criteria andIwuhanBetween(String value1, String value2) {
            addCriterion("iwuhan between", value1, value2, "iwuhan");
            return (Criteria) this;
        }

        public Criteria andIwuhanNotBetween(String value1, String value2) {
            addCriterion("iwuhan not between", value1, value2, "iwuhan");
            return (Criteria) this;
        }

        public Criteria andInwuhanIsNull() {
            addCriterion("inwuhan is null");
            return (Criteria) this;
        }

        public Criteria andInwuhanIsNotNull() {
            addCriterion("inwuhan is not null");
            return (Criteria) this;
        }

        public Criteria andInwuhanEqualTo(String value) {
            addCriterion("inwuhan =", value, "inwuhan");
            return (Criteria) this;
        }

        public Criteria andInwuhanNotEqualTo(String value) {
            addCriterion("inwuhan <>", value, "inwuhan");
            return (Criteria) this;
        }

        public Criteria andInwuhanGreaterThan(String value) {
            addCriterion("inwuhan >", value, "inwuhan");
            return (Criteria) this;
        }

        public Criteria andInwuhanGreaterThanOrEqualTo(String value) {
            addCriterion("inwuhan >=", value, "inwuhan");
            return (Criteria) this;
        }

        public Criteria andInwuhanLessThan(String value) {
            addCriterion("inwuhan <", value, "inwuhan");
            return (Criteria) this;
        }

        public Criteria andInwuhanLessThanOrEqualTo(String value) {
            addCriterion("inwuhan <=", value, "inwuhan");
            return (Criteria) this;
        }

        public Criteria andInwuhanLike(String value) {
            addCriterion("inwuhan like", value, "inwuhan");
            return (Criteria) this;
        }

        public Criteria andInwuhanNotLike(String value) {
            addCriterion("inwuhan not like", value, "inwuhan");
            return (Criteria) this;
        }

        public Criteria andInwuhanIn(List<String> values) {
            addCriterion("inwuhan in", values, "inwuhan");
            return (Criteria) this;
        }

        public Criteria andInwuhanNotIn(List<String> values) {
            addCriterion("inwuhan not in", values, "inwuhan");
            return (Criteria) this;
        }

        public Criteria andInwuhanBetween(String value1, String value2) {
            addCriterion("inwuhan between", value1, value2, "inwuhan");
            return (Criteria) this;
        }

        public Criteria andInwuhanNotBetween(String value1, String value2) {
            addCriterion("inwuhan not between", value1, value2, "inwuhan");
            return (Criteria) this;
        }

        public Criteria andIshubeicontactIsNull() {
            addCriterion("ishubeicontact is null");
            return (Criteria) this;
        }

        public Criteria andIshubeicontactIsNotNull() {
            addCriterion("ishubeicontact is not null");
            return (Criteria) this;
        }

        public Criteria andIshubeicontactEqualTo(String value) {
            addCriterion("ishubeicontact =", value, "ishubeicontact");
            return (Criteria) this;
        }

        public Criteria andIshubeicontactNotEqualTo(String value) {
            addCriterion("ishubeicontact <>", value, "ishubeicontact");
            return (Criteria) this;
        }

        public Criteria andIshubeicontactGreaterThan(String value) {
            addCriterion("ishubeicontact >", value, "ishubeicontact");
            return (Criteria) this;
        }

        public Criteria andIshubeicontactGreaterThanOrEqualTo(String value) {
            addCriterion("ishubeicontact >=", value, "ishubeicontact");
            return (Criteria) this;
        }

        public Criteria andIshubeicontactLessThan(String value) {
            addCriterion("ishubeicontact <", value, "ishubeicontact");
            return (Criteria) this;
        }

        public Criteria andIshubeicontactLessThanOrEqualTo(String value) {
            addCriterion("ishubeicontact <=", value, "ishubeicontact");
            return (Criteria) this;
        }

        public Criteria andIshubeicontactLike(String value) {
            addCriterion("ishubeicontact like", value, "ishubeicontact");
            return (Criteria) this;
        }

        public Criteria andIshubeicontactNotLike(String value) {
            addCriterion("ishubeicontact not like", value, "ishubeicontact");
            return (Criteria) this;
        }

        public Criteria andIshubeicontactIn(List<String> values) {
            addCriterion("ishubeicontact in", values, "ishubeicontact");
            return (Criteria) this;
        }

        public Criteria andIshubeicontactNotIn(List<String> values) {
            addCriterion("ishubeicontact not in", values, "ishubeicontact");
            return (Criteria) this;
        }

        public Criteria andIshubeicontactBetween(String value1, String value2) {
            addCriterion("ishubeicontact between", value1, value2, "ishubeicontact");
            return (Criteria) this;
        }

        public Criteria andIshubeicontactNotBetween(String value1, String value2) {
            addCriterion("ishubeicontact not between", value1, value2, "ishubeicontact");
            return (Criteria) this;
        }

        public Criteria andIswuhancontactIsNull() {
            addCriterion("iswuhancontact is null");
            return (Criteria) this;
        }

        public Criteria andIswuhancontactIsNotNull() {
            addCriterion("iswuhancontact is not null");
            return (Criteria) this;
        }

        public Criteria andIswuhancontactEqualTo(String value) {
            addCriterion("iswuhancontact =", value, "iswuhancontact");
            return (Criteria) this;
        }

        public Criteria andIswuhancontactNotEqualTo(String value) {
            addCriterion("iswuhancontact <>", value, "iswuhancontact");
            return (Criteria) this;
        }

        public Criteria andIswuhancontactGreaterThan(String value) {
            addCriterion("iswuhancontact >", value, "iswuhancontact");
            return (Criteria) this;
        }

        public Criteria andIswuhancontactGreaterThanOrEqualTo(String value) {
            addCriterion("iswuhancontact >=", value, "iswuhancontact");
            return (Criteria) this;
        }

        public Criteria andIswuhancontactLessThan(String value) {
            addCriterion("iswuhancontact <", value, "iswuhancontact");
            return (Criteria) this;
        }

        public Criteria andIswuhancontactLessThanOrEqualTo(String value) {
            addCriterion("iswuhancontact <=", value, "iswuhancontact");
            return (Criteria) this;
        }

        public Criteria andIswuhancontactLike(String value) {
            addCriterion("iswuhancontact like", value, "iswuhancontact");
            return (Criteria) this;
        }

        public Criteria andIswuhancontactNotLike(String value) {
            addCriterion("iswuhancontact not like", value, "iswuhancontact");
            return (Criteria) this;
        }

        public Criteria andIswuhancontactIn(List<String> values) {
            addCriterion("iswuhancontact in", values, "iswuhancontact");
            return (Criteria) this;
        }

        public Criteria andIswuhancontactNotIn(List<String> values) {
            addCriterion("iswuhancontact not in", values, "iswuhancontact");
            return (Criteria) this;
        }

        public Criteria andIswuhancontactBetween(String value1, String value2) {
            addCriterion("iswuhancontact between", value1, value2, "iswuhancontact");
            return (Criteria) this;
        }

        public Criteria andIswuhancontactNotBetween(String value1, String value2) {
            addCriterion("iswuhancontact not between", value1, value2, "iswuhancontact");
            return (Criteria) this;
        }

        public Criteria andInhubeiIsNull() {
            addCriterion("inhubei is null");
            return (Criteria) this;
        }

        public Criteria andInhubeiIsNotNull() {
            addCriterion("inhubei is not null");
            return (Criteria) this;
        }

        public Criteria andInhubeiEqualTo(String value) {
            addCriterion("inhubei =", value, "inhubei");
            return (Criteria) this;
        }

        public Criteria andInhubeiNotEqualTo(String value) {
            addCriterion("inhubei <>", value, "inhubei");
            return (Criteria) this;
        }

        public Criteria andInhubeiGreaterThan(String value) {
            addCriterion("inhubei >", value, "inhubei");
            return (Criteria) this;
        }

        public Criteria andInhubeiGreaterThanOrEqualTo(String value) {
            addCriterion("inhubei >=", value, "inhubei");
            return (Criteria) this;
        }

        public Criteria andInhubeiLessThan(String value) {
            addCriterion("inhubei <", value, "inhubei");
            return (Criteria) this;
        }

        public Criteria andInhubeiLessThanOrEqualTo(String value) {
            addCriterion("inhubei <=", value, "inhubei");
            return (Criteria) this;
        }

        public Criteria andInhubeiLike(String value) {
            addCriterion("inhubei like", value, "inhubei");
            return (Criteria) this;
        }

        public Criteria andInhubeiNotLike(String value) {
            addCriterion("inhubei not like", value, "inhubei");
            return (Criteria) this;
        }

        public Criteria andInhubeiIn(List<String> values) {
            addCriterion("inhubei in", values, "inhubei");
            return (Criteria) this;
        }

        public Criteria andInhubeiNotIn(List<String> values) {
            addCriterion("inhubei not in", values, "inhubei");
            return (Criteria) this;
        }

        public Criteria andInhubeiBetween(String value1, String value2) {
            addCriterion("inhubei between", value1, value2, "inhubei");
            return (Criteria) this;
        }

        public Criteria andInhubeiNotBetween(String value1, String value2) {
            addCriterion("inhubei not between", value1, value2, "inhubei");
            return (Criteria) this;
        }

        public Criteria andIsgotoschoolIsNull() {
            addCriterion("isgotoschool is null");
            return (Criteria) this;
        }

        public Criteria andIsgotoschoolIsNotNull() {
            addCriterion("isgotoschool is not null");
            return (Criteria) this;
        }

        public Criteria andIsgotoschoolEqualTo(String value) {
            addCriterion("isgotoschool =", value, "isgotoschool");
            return (Criteria) this;
        }

        public Criteria andIsgotoschoolNotEqualTo(String value) {
            addCriterion("isgotoschool <>", value, "isgotoschool");
            return (Criteria) this;
        }

        public Criteria andIsgotoschoolGreaterThan(String value) {
            addCriterion("isgotoschool >", value, "isgotoschool");
            return (Criteria) this;
        }

        public Criteria andIsgotoschoolGreaterThanOrEqualTo(String value) {
            addCriterion("isgotoschool >=", value, "isgotoschool");
            return (Criteria) this;
        }

        public Criteria andIsgotoschoolLessThan(String value) {
            addCriterion("isgotoschool <", value, "isgotoschool");
            return (Criteria) this;
        }

        public Criteria andIsgotoschoolLessThanOrEqualTo(String value) {
            addCriterion("isgotoschool <=", value, "isgotoschool");
            return (Criteria) this;
        }

        public Criteria andIsgotoschoolLike(String value) {
            addCriterion("isgotoschool like", value, "isgotoschool");
            return (Criteria) this;
        }

        public Criteria andIsgotoschoolNotLike(String value) {
            addCriterion("isgotoschool not like", value, "isgotoschool");
            return (Criteria) this;
        }

        public Criteria andIsgotoschoolIn(List<String> values) {
            addCriterion("isgotoschool in", values, "isgotoschool");
            return (Criteria) this;
        }

        public Criteria andIsgotoschoolNotIn(List<String> values) {
            addCriterion("isgotoschool not in", values, "isgotoschool");
            return (Criteria) this;
        }

        public Criteria andIsgotoschoolBetween(String value1, String value2) {
            addCriterion("isgotoschool between", value1, value2, "isgotoschool");
            return (Criteria) this;
        }

        public Criteria andIsgotoschoolNotBetween(String value1, String value2) {
            addCriterion("isgotoschool not between", value1, value2, "isgotoschool");
            return (Criteria) this;
        }

        public Criteria andIsdistrustIsNull() {
            addCriterion("isdistrust is null");
            return (Criteria) this;
        }

        public Criteria andIsdistrustIsNotNull() {
            addCriterion("isdistrust is not null");
            return (Criteria) this;
        }

        public Criteria andIsdistrustEqualTo(String value) {
            addCriterion("isdistrust =", value, "isdistrust");
            return (Criteria) this;
        }

        public Criteria andIsdistrustNotEqualTo(String value) {
            addCriterion("isdistrust <>", value, "isdistrust");
            return (Criteria) this;
        }

        public Criteria andIsdistrustGreaterThan(String value) {
            addCriterion("isdistrust >", value, "isdistrust");
            return (Criteria) this;
        }

        public Criteria andIsdistrustGreaterThanOrEqualTo(String value) {
            addCriterion("isdistrust >=", value, "isdistrust");
            return (Criteria) this;
        }

        public Criteria andIsdistrustLessThan(String value) {
            addCriterion("isdistrust <", value, "isdistrust");
            return (Criteria) this;
        }

        public Criteria andIsdistrustLessThanOrEqualTo(String value) {
            addCriterion("isdistrust <=", value, "isdistrust");
            return (Criteria) this;
        }

        public Criteria andIsdistrustLike(String value) {
            addCriterion("isdistrust like", value, "isdistrust");
            return (Criteria) this;
        }

        public Criteria andIsdistrustNotLike(String value) {
            addCriterion("isdistrust not like", value, "isdistrust");
            return (Criteria) this;
        }

        public Criteria andIsdistrustIn(List<String> values) {
            addCriterion("isdistrust in", values, "isdistrust");
            return (Criteria) this;
        }

        public Criteria andIsdistrustNotIn(List<String> values) {
            addCriterion("isdistrust not in", values, "isdistrust");
            return (Criteria) this;
        }

        public Criteria andIsdistrustBetween(String value1, String value2) {
            addCriterion("isdistrust between", value1, value2, "isdistrust");
            return (Criteria) this;
        }

        public Criteria andIsdistrustNotBetween(String value1, String value2) {
            addCriterion("isdistrust not between", value1, value2, "isdistrust");
            return (Criteria) this;
        }

        public Criteria andIsdiagnoseIsNull() {
            addCriterion("isdiagnose is null");
            return (Criteria) this;
        }

        public Criteria andIsdiagnoseIsNotNull() {
            addCriterion("isdiagnose is not null");
            return (Criteria) this;
        }

        public Criteria andIsdiagnoseEqualTo(String value) {
            addCriterion("isdiagnose =", value, "isdiagnose");
            return (Criteria) this;
        }

        public Criteria andIsdiagnoseNotEqualTo(String value) {
            addCriterion("isdiagnose <>", value, "isdiagnose");
            return (Criteria) this;
        }

        public Criteria andIsdiagnoseGreaterThan(String value) {
            addCriterion("isdiagnose >", value, "isdiagnose");
            return (Criteria) this;
        }

        public Criteria andIsdiagnoseGreaterThanOrEqualTo(String value) {
            addCriterion("isdiagnose >=", value, "isdiagnose");
            return (Criteria) this;
        }

        public Criteria andIsdiagnoseLessThan(String value) {
            addCriterion("isdiagnose <", value, "isdiagnose");
            return (Criteria) this;
        }

        public Criteria andIsdiagnoseLessThanOrEqualTo(String value) {
            addCriterion("isdiagnose <=", value, "isdiagnose");
            return (Criteria) this;
        }

        public Criteria andIsdiagnoseLike(String value) {
            addCriterion("isdiagnose like", value, "isdiagnose");
            return (Criteria) this;
        }

        public Criteria andIsdiagnoseNotLike(String value) {
            addCriterion("isdiagnose not like", value, "isdiagnose");
            return (Criteria) this;
        }

        public Criteria andIsdiagnoseIn(List<String> values) {
            addCriterion("isdiagnose in", values, "isdiagnose");
            return (Criteria) this;
        }

        public Criteria andIsdiagnoseNotIn(List<String> values) {
            addCriterion("isdiagnose not in", values, "isdiagnose");
            return (Criteria) this;
        }

        public Criteria andIsdiagnoseBetween(String value1, String value2) {
            addCriterion("isdiagnose between", value1, value2, "isdiagnose");
            return (Criteria) this;
        }

        public Criteria andIsdiagnoseNotBetween(String value1, String value2) {
            addCriterion("isdiagnose not between", value1, value2, "isdiagnose");
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