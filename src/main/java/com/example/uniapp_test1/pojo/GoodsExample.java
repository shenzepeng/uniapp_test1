package com.example.uniapp_test1.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(Double value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(Double value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(Double value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(Double value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(Double value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<Double> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<Double> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(Double value1, Double value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(Double value1, Double value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNull() {
            addCriterion("goods_img is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNotNull() {
            addCriterion("goods_img is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgEqualTo(String value) {
            addCriterion("goods_img =", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotEqualTo(String value) {
            addCriterion("goods_img <>", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThan(String value) {
            addCriterion("goods_img >", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThanOrEqualTo(String value) {
            addCriterion("goods_img >=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThan(String value) {
            addCriterion("goods_img <", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThanOrEqualTo(String value) {
            addCriterion("goods_img <=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLike(String value) {
            addCriterion("goods_img like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotLike(String value) {
            addCriterion("goods_img not like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIn(List<String> values) {
            addCriterion("goods_img in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotIn(List<String> values) {
            addCriterion("goods_img not in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgBetween(String value1, String value2) {
            addCriterion("goods_img between", value1, value2, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotBetween(String value1, String value2) {
            addCriterion("goods_img not between", value1, value2, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsNumbersIsNull() {
            addCriterion("goods_numbers is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumbersIsNotNull() {
            addCriterion("goods_numbers is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumbersEqualTo(Integer value) {
            addCriterion("goods_numbers =", value, "goodsNumbers");
            return (Criteria) this;
        }

        public Criteria andGoodsNumbersNotEqualTo(Integer value) {
            addCriterion("goods_numbers <>", value, "goodsNumbers");
            return (Criteria) this;
        }

        public Criteria andGoodsNumbersGreaterThan(Integer value) {
            addCriterion("goods_numbers >", value, "goodsNumbers");
            return (Criteria) this;
        }

        public Criteria andGoodsNumbersGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_numbers >=", value, "goodsNumbers");
            return (Criteria) this;
        }

        public Criteria andGoodsNumbersLessThan(Integer value) {
            addCriterion("goods_numbers <", value, "goodsNumbers");
            return (Criteria) this;
        }

        public Criteria andGoodsNumbersLessThanOrEqualTo(Integer value) {
            addCriterion("goods_numbers <=", value, "goodsNumbers");
            return (Criteria) this;
        }

        public Criteria andGoodsNumbersIn(List<Integer> values) {
            addCriterion("goods_numbers in", values, "goodsNumbers");
            return (Criteria) this;
        }

        public Criteria andGoodsNumbersNotIn(List<Integer> values) {
            addCriterion("goods_numbers not in", values, "goodsNumbers");
            return (Criteria) this;
        }

        public Criteria andGoodsNumbersBetween(Integer value1, Integer value2) {
            addCriterion("goods_numbers between", value1, value2, "goodsNumbers");
            return (Criteria) this;
        }

        public Criteria andGoodsNumbersNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_numbers not between", value1, value2, "goodsNumbers");
            return (Criteria) this;
        }

        public Criteria andGoodsExistIsNull() {
            addCriterion("goods_exist is null");
            return (Criteria) this;
        }

        public Criteria andGoodsExistIsNotNull() {
            addCriterion("goods_exist is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsExistEqualTo(Integer value) {
            addCriterion("goods_exist =", value, "goodsExist");
            return (Criteria) this;
        }

        public Criteria andGoodsExistNotEqualTo(Integer value) {
            addCriterion("goods_exist <>", value, "goodsExist");
            return (Criteria) this;
        }

        public Criteria andGoodsExistGreaterThan(Integer value) {
            addCriterion("goods_exist >", value, "goodsExist");
            return (Criteria) this;
        }

        public Criteria andGoodsExistGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_exist >=", value, "goodsExist");
            return (Criteria) this;
        }

        public Criteria andGoodsExistLessThan(Integer value) {
            addCriterion("goods_exist <", value, "goodsExist");
            return (Criteria) this;
        }

        public Criteria andGoodsExistLessThanOrEqualTo(Integer value) {
            addCriterion("goods_exist <=", value, "goodsExist");
            return (Criteria) this;
        }

        public Criteria andGoodsExistIn(List<Integer> values) {
            addCriterion("goods_exist in", values, "goodsExist");
            return (Criteria) this;
        }

        public Criteria andGoodsExistNotIn(List<Integer> values) {
            addCriterion("goods_exist not in", values, "goodsExist");
            return (Criteria) this;
        }

        public Criteria andGoodsExistBetween(Integer value1, Integer value2) {
            addCriterion("goods_exist between", value1, value2, "goodsExist");
            return (Criteria) this;
        }

        public Criteria andGoodsExistNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_exist not between", value1, value2, "goodsExist");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceIsNull() {
            addCriterion("goods_introduce is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceIsNotNull() {
            addCriterion("goods_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceEqualTo(String value) {
            addCriterion("goods_introduce =", value, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceNotEqualTo(String value) {
            addCriterion("goods_introduce <>", value, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceGreaterThan(String value) {
            addCriterion("goods_introduce >", value, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("goods_introduce >=", value, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceLessThan(String value) {
            addCriterion("goods_introduce <", value, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceLessThanOrEqualTo(String value) {
            addCriterion("goods_introduce <=", value, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceLike(String value) {
            addCriterion("goods_introduce like", value, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceNotLike(String value) {
            addCriterion("goods_introduce not like", value, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceIn(List<String> values) {
            addCriterion("goods_introduce in", values, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceNotIn(List<String> values) {
            addCriterion("goods_introduce not in", values, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceBetween(String value1, String value2) {
            addCriterion("goods_introduce between", value1, value2, "goodsIntroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsIntroduceNotBetween(String value1, String value2) {
            addCriterion("goods_introduce not between", value1, value2, "goodsIntroduce");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsImgsIsNull() {
            addCriterion("goods_imgs is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgsIsNotNull() {
            addCriterion("goods_imgs is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgsEqualTo(String value) {
            addCriterion("goods_imgs =", value, "goodsImgs");
            return (Criteria) this;
        }

        public Criteria andGoodsImgsNotEqualTo(String value) {
            addCriterion("goods_imgs <>", value, "goodsImgs");
            return (Criteria) this;
        }

        public Criteria andGoodsImgsGreaterThan(String value) {
            addCriterion("goods_imgs >", value, "goodsImgs");
            return (Criteria) this;
        }

        public Criteria andGoodsImgsGreaterThanOrEqualTo(String value) {
            addCriterion("goods_imgs >=", value, "goodsImgs");
            return (Criteria) this;
        }

        public Criteria andGoodsImgsLessThan(String value) {
            addCriterion("goods_imgs <", value, "goodsImgs");
            return (Criteria) this;
        }

        public Criteria andGoodsImgsLessThanOrEqualTo(String value) {
            addCriterion("goods_imgs <=", value, "goodsImgs");
            return (Criteria) this;
        }

        public Criteria andGoodsImgsLike(String value) {
            addCriterion("goods_imgs like", value, "goodsImgs");
            return (Criteria) this;
        }

        public Criteria andGoodsImgsNotLike(String value) {
            addCriterion("goods_imgs not like", value, "goodsImgs");
            return (Criteria) this;
        }

        public Criteria andGoodsImgsIn(List<String> values) {
            addCriterion("goods_imgs in", values, "goodsImgs");
            return (Criteria) this;
        }

        public Criteria andGoodsImgsNotIn(List<String> values) {
            addCriterion("goods_imgs not in", values, "goodsImgs");
            return (Criteria) this;
        }

        public Criteria andGoodsImgsBetween(String value1, String value2) {
            addCriterion("goods_imgs between", value1, value2, "goodsImgs");
            return (Criteria) this;
        }

        public Criteria andGoodsImgsNotBetween(String value1, String value2) {
            addCriterion("goods_imgs not between", value1, value2, "goodsImgs");
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