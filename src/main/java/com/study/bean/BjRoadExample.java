package com.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BjRoadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BjRoadExample() {
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

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
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

        public Criteria andUpdateAtEqualTo(Date value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Date value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Date value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Date value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Date value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Date> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Date> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Date value1, Date value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Date value1, Date value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andUsableIsNull() {
            addCriterion("usable is null");
            return (Criteria) this;
        }

        public Criteria andUsableIsNotNull() {
            addCriterion("usable is not null");
            return (Criteria) this;
        }

        public Criteria andUsableEqualTo(Boolean value) {
            addCriterion("usable =", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableNotEqualTo(Boolean value) {
            addCriterion("usable <>", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableGreaterThan(Boolean value) {
            addCriterion("usable >", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("usable >=", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableLessThan(Boolean value) {
            addCriterion("usable <", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableLessThanOrEqualTo(Boolean value) {
            addCriterion("usable <=", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableIn(List<Boolean> values) {
            addCriterion("usable in", values, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableNotIn(List<Boolean> values) {
            addCriterion("usable not in", values, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableBetween(Boolean value1, Boolean value2) {
            addCriterion("usable between", value1, value2, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("usable not between", value1, value2, "usable");
            return (Criteria) this;
        }

        public Criteria andRoadNameIsNull() {
            addCriterion("road_name is null");
            return (Criteria) this;
        }

        public Criteria andRoadNameIsNotNull() {
            addCriterion("road_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoadNameEqualTo(String value) {
            addCriterion("road_name =", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameNotEqualTo(String value) {
            addCriterion("road_name <>", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameGreaterThan(String value) {
            addCriterion("road_name >", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameGreaterThanOrEqualTo(String value) {
            addCriterion("road_name >=", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameLessThan(String value) {
            addCriterion("road_name <", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameLessThanOrEqualTo(String value) {
            addCriterion("road_name <=", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameLike(String value) {
            addCriterion("road_name like", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameNotLike(String value) {
            addCriterion("road_name not like", value, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameIn(List<String> values) {
            addCriterion("road_name in", values, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameNotIn(List<String> values) {
            addCriterion("road_name not in", values, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameBetween(String value1, String value2) {
            addCriterion("road_name between", value1, value2, "roadName");
            return (Criteria) this;
        }

        public Criteria andRoadNameNotBetween(String value1, String value2) {
            addCriterion("road_name not between", value1, value2, "roadName");
            return (Criteria) this;
        }

        public Criteria andStartLocationIsNull() {
            addCriterion("start_location is null");
            return (Criteria) this;
        }

        public Criteria andStartLocationIsNotNull() {
            addCriterion("start_location is not null");
            return (Criteria) this;
        }

        public Criteria andStartLocationEqualTo(String value) {
            addCriterion("start_location =", value, "startLocation");
            return (Criteria) this;
        }

        public Criteria andStartLocationNotEqualTo(String value) {
            addCriterion("start_location <>", value, "startLocation");
            return (Criteria) this;
        }

        public Criteria andStartLocationGreaterThan(String value) {
            addCriterion("start_location >", value, "startLocation");
            return (Criteria) this;
        }

        public Criteria andStartLocationGreaterThanOrEqualTo(String value) {
            addCriterion("start_location >=", value, "startLocation");
            return (Criteria) this;
        }

        public Criteria andStartLocationLessThan(String value) {
            addCriterion("start_location <", value, "startLocation");
            return (Criteria) this;
        }

        public Criteria andStartLocationLessThanOrEqualTo(String value) {
            addCriterion("start_location <=", value, "startLocation");
            return (Criteria) this;
        }

        public Criteria andStartLocationLike(String value) {
            addCriterion("start_location like", value, "startLocation");
            return (Criteria) this;
        }

        public Criteria andStartLocationNotLike(String value) {
            addCriterion("start_location not like", value, "startLocation");
            return (Criteria) this;
        }

        public Criteria andStartLocationIn(List<String> values) {
            addCriterion("start_location in", values, "startLocation");
            return (Criteria) this;
        }

        public Criteria andStartLocationNotIn(List<String> values) {
            addCriterion("start_location not in", values, "startLocation");
            return (Criteria) this;
        }

        public Criteria andStartLocationBetween(String value1, String value2) {
            addCriterion("start_location between", value1, value2, "startLocation");
            return (Criteria) this;
        }

        public Criteria andStartLocationNotBetween(String value1, String value2) {
            addCriterion("start_location not between", value1, value2, "startLocation");
            return (Criteria) this;
        }

        public Criteria andEndLocationIsNull() {
            addCriterion("end_location is null");
            return (Criteria) this;
        }

        public Criteria andEndLocationIsNotNull() {
            addCriterion("end_location is not null");
            return (Criteria) this;
        }

        public Criteria andEndLocationEqualTo(String value) {
            addCriterion("end_location =", value, "endLocation");
            return (Criteria) this;
        }

        public Criteria andEndLocationNotEqualTo(String value) {
            addCriterion("end_location <>", value, "endLocation");
            return (Criteria) this;
        }

        public Criteria andEndLocationGreaterThan(String value) {
            addCriterion("end_location >", value, "endLocation");
            return (Criteria) this;
        }

        public Criteria andEndLocationGreaterThanOrEqualTo(String value) {
            addCriterion("end_location >=", value, "endLocation");
            return (Criteria) this;
        }

        public Criteria andEndLocationLessThan(String value) {
            addCriterion("end_location <", value, "endLocation");
            return (Criteria) this;
        }

        public Criteria andEndLocationLessThanOrEqualTo(String value) {
            addCriterion("end_location <=", value, "endLocation");
            return (Criteria) this;
        }

        public Criteria andEndLocationLike(String value) {
            addCriterion("end_location like", value, "endLocation");
            return (Criteria) this;
        }

        public Criteria andEndLocationNotLike(String value) {
            addCriterion("end_location not like", value, "endLocation");
            return (Criteria) this;
        }

        public Criteria andEndLocationIn(List<String> values) {
            addCriterion("end_location in", values, "endLocation");
            return (Criteria) this;
        }

        public Criteria andEndLocationNotIn(List<String> values) {
            addCriterion("end_location not in", values, "endLocation");
            return (Criteria) this;
        }

        public Criteria andEndLocationBetween(String value1, String value2) {
            addCriterion("end_location between", value1, value2, "endLocation");
            return (Criteria) this;
        }

        public Criteria andEndLocationNotBetween(String value1, String value2) {
            addCriterion("end_location not between", value1, value2, "endLocation");
            return (Criteria) this;
        }

        public Criteria andRoadLengthIsNull() {
            addCriterion("road_length is null");
            return (Criteria) this;
        }

        public Criteria andRoadLengthIsNotNull() {
            addCriterion("road_length is not null");
            return (Criteria) this;
        }

        public Criteria andRoadLengthEqualTo(Integer value) {
            addCriterion("road_length =", value, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthNotEqualTo(Integer value) {
            addCriterion("road_length <>", value, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthGreaterThan(Integer value) {
            addCriterion("road_length >", value, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("road_length >=", value, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthLessThan(Integer value) {
            addCriterion("road_length <", value, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthLessThanOrEqualTo(Integer value) {
            addCriterion("road_length <=", value, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthIn(List<Integer> values) {
            addCriterion("road_length in", values, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthNotIn(List<Integer> values) {
            addCriterion("road_length not in", values, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthBetween(Integer value1, Integer value2) {
            addCriterion("road_length between", value1, value2, "roadLength");
            return (Criteria) this;
        }

        public Criteria andRoadLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("road_length not between", value1, value2, "roadLength");
            return (Criteria) this;
        }

        public Criteria andLaneWidthIsNull() {
            addCriterion("lane_width is null");
            return (Criteria) this;
        }

        public Criteria andLaneWidthIsNotNull() {
            addCriterion("lane_width is not null");
            return (Criteria) this;
        }

        public Criteria andLaneWidthEqualTo(Integer value) {
            addCriterion("lane_width =", value, "laneWidth");
            return (Criteria) this;
        }

        public Criteria andLaneWidthNotEqualTo(Integer value) {
            addCriterion("lane_width <>", value, "laneWidth");
            return (Criteria) this;
        }

        public Criteria andLaneWidthGreaterThan(Integer value) {
            addCriterion("lane_width >", value, "laneWidth");
            return (Criteria) this;
        }

        public Criteria andLaneWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("lane_width >=", value, "laneWidth");
            return (Criteria) this;
        }

        public Criteria andLaneWidthLessThan(Integer value) {
            addCriterion("lane_width <", value, "laneWidth");
            return (Criteria) this;
        }

        public Criteria andLaneWidthLessThanOrEqualTo(Integer value) {
            addCriterion("lane_width <=", value, "laneWidth");
            return (Criteria) this;
        }

        public Criteria andLaneWidthIn(List<Integer> values) {
            addCriterion("lane_width in", values, "laneWidth");
            return (Criteria) this;
        }

        public Criteria andLaneWidthNotIn(List<Integer> values) {
            addCriterion("lane_width not in", values, "laneWidth");
            return (Criteria) this;
        }

        public Criteria andLaneWidthBetween(Integer value1, Integer value2) {
            addCriterion("lane_width between", value1, value2, "laneWidth");
            return (Criteria) this;
        }

        public Criteria andLaneWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("lane_width not between", value1, value2, "laneWidth");
            return (Criteria) this;
        }

        public Criteria andSidewalkWidthIsNull() {
            addCriterion("sidewalk_width is null");
            return (Criteria) this;
        }

        public Criteria andSidewalkWidthIsNotNull() {
            addCriterion("sidewalk_width is not null");
            return (Criteria) this;
        }

        public Criteria andSidewalkWidthEqualTo(Integer value) {
            addCriterion("sidewalk_width =", value, "sidewalkWidth");
            return (Criteria) this;
        }

        public Criteria andSidewalkWidthNotEqualTo(Integer value) {
            addCriterion("sidewalk_width <>", value, "sidewalkWidth");
            return (Criteria) this;
        }

        public Criteria andSidewalkWidthGreaterThan(Integer value) {
            addCriterion("sidewalk_width >", value, "sidewalkWidth");
            return (Criteria) this;
        }

        public Criteria andSidewalkWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("sidewalk_width >=", value, "sidewalkWidth");
            return (Criteria) this;
        }

        public Criteria andSidewalkWidthLessThan(Integer value) {
            addCriterion("sidewalk_width <", value, "sidewalkWidth");
            return (Criteria) this;
        }

        public Criteria andSidewalkWidthLessThanOrEqualTo(Integer value) {
            addCriterion("sidewalk_width <=", value, "sidewalkWidth");
            return (Criteria) this;
        }

        public Criteria andSidewalkWidthIn(List<Integer> values) {
            addCriterion("sidewalk_width in", values, "sidewalkWidth");
            return (Criteria) this;
        }

        public Criteria andSidewalkWidthNotIn(List<Integer> values) {
            addCriterion("sidewalk_width not in", values, "sidewalkWidth");
            return (Criteria) this;
        }

        public Criteria andSidewalkWidthBetween(Integer value1, Integer value2) {
            addCriterion("sidewalk_width between", value1, value2, "sidewalkWidth");
            return (Criteria) this;
        }

        public Criteria andSidewalkWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("sidewalk_width not between", value1, value2, "sidewalkWidth");
            return (Criteria) this;
        }

        public Criteria andLaneAreaIsNull() {
            addCriterion("lane_area is null");
            return (Criteria) this;
        }

        public Criteria andLaneAreaIsNotNull() {
            addCriterion("lane_area is not null");
            return (Criteria) this;
        }

        public Criteria andLaneAreaEqualTo(Integer value) {
            addCriterion("lane_area =", value, "laneArea");
            return (Criteria) this;
        }

        public Criteria andLaneAreaNotEqualTo(Integer value) {
            addCriterion("lane_area <>", value, "laneArea");
            return (Criteria) this;
        }

        public Criteria andLaneAreaGreaterThan(Integer value) {
            addCriterion("lane_area >", value, "laneArea");
            return (Criteria) this;
        }

        public Criteria andLaneAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("lane_area >=", value, "laneArea");
            return (Criteria) this;
        }

        public Criteria andLaneAreaLessThan(Integer value) {
            addCriterion("lane_area <", value, "laneArea");
            return (Criteria) this;
        }

        public Criteria andLaneAreaLessThanOrEqualTo(Integer value) {
            addCriterion("lane_area <=", value, "laneArea");
            return (Criteria) this;
        }

        public Criteria andLaneAreaIn(List<Integer> values) {
            addCriterion("lane_area in", values, "laneArea");
            return (Criteria) this;
        }

        public Criteria andLaneAreaNotIn(List<Integer> values) {
            addCriterion("lane_area not in", values, "laneArea");
            return (Criteria) this;
        }

        public Criteria andLaneAreaBetween(Integer value1, Integer value2) {
            addCriterion("lane_area between", value1, value2, "laneArea");
            return (Criteria) this;
        }

        public Criteria andLaneAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("lane_area not between", value1, value2, "laneArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaIsNull() {
            addCriterion("sidewalk_area is null");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaIsNotNull() {
            addCriterion("sidewalk_area is not null");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaEqualTo(Integer value) {
            addCriterion("sidewalk_area =", value, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaNotEqualTo(Integer value) {
            addCriterion("sidewalk_area <>", value, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaGreaterThan(Integer value) {
            addCriterion("sidewalk_area >", value, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("sidewalk_area >=", value, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaLessThan(Integer value) {
            addCriterion("sidewalk_area <", value, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaLessThanOrEqualTo(Integer value) {
            addCriterion("sidewalk_area <=", value, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaIn(List<Integer> values) {
            addCriterion("sidewalk_area in", values, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaNotIn(List<Integer> values) {
            addCriterion("sidewalk_area not in", values, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaBetween(Integer value1, Integer value2) {
            addCriterion("sidewalk_area between", value1, value2, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andSidewalkAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("sidewalk_area not between", value1, value2, "sidewalkArea");
            return (Criteria) this;
        }

        public Criteria andRoadAreaIsNull() {
            addCriterion("road_area is null");
            return (Criteria) this;
        }

        public Criteria andRoadAreaIsNotNull() {
            addCriterion("road_area is not null");
            return (Criteria) this;
        }

        public Criteria andRoadAreaEqualTo(Integer value) {
            addCriterion("road_area =", value, "roadArea");
            return (Criteria) this;
        }

        public Criteria andRoadAreaNotEqualTo(Integer value) {
            addCriterion("road_area <>", value, "roadArea");
            return (Criteria) this;
        }

        public Criteria andRoadAreaGreaterThan(Integer value) {
            addCriterion("road_area >", value, "roadArea");
            return (Criteria) this;
        }

        public Criteria andRoadAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("road_area >=", value, "roadArea");
            return (Criteria) this;
        }

        public Criteria andRoadAreaLessThan(Integer value) {
            addCriterion("road_area <", value, "roadArea");
            return (Criteria) this;
        }

        public Criteria andRoadAreaLessThanOrEqualTo(Integer value) {
            addCriterion("road_area <=", value, "roadArea");
            return (Criteria) this;
        }

        public Criteria andRoadAreaIn(List<Integer> values) {
            addCriterion("road_area in", values, "roadArea");
            return (Criteria) this;
        }

        public Criteria andRoadAreaNotIn(List<Integer> values) {
            addCriterion("road_area not in", values, "roadArea");
            return (Criteria) this;
        }

        public Criteria andRoadAreaBetween(Integer value1, Integer value2) {
            addCriterion("road_area between", value1, value2, "roadArea");
            return (Criteria) this;
        }

        public Criteria andRoadAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("road_area not between", value1, value2, "roadArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaIsNull() {
            addCriterion("green_area is null");
            return (Criteria) this;
        }

        public Criteria andGreenAreaIsNotNull() {
            addCriterion("green_area is not null");
            return (Criteria) this;
        }

        public Criteria andGreenAreaEqualTo(Integer value) {
            addCriterion("green_area =", value, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaNotEqualTo(Integer value) {
            addCriterion("green_area <>", value, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaGreaterThan(Integer value) {
            addCriterion("green_area >", value, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("green_area >=", value, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaLessThan(Integer value) {
            addCriterion("green_area <", value, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaLessThanOrEqualTo(Integer value) {
            addCriterion("green_area <=", value, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaIn(List<Integer> values) {
            addCriterion("green_area in", values, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaNotIn(List<Integer> values) {
            addCriterion("green_area not in", values, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaBetween(Integer value1, Integer value2) {
            addCriterion("green_area between", value1, value2, "greenArea");
            return (Criteria) this;
        }

        public Criteria andGreenAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("green_area not between", value1, value2, "greenArea");
            return (Criteria) this;
        }

        public Criteria andHardeningStreeAreaIsNull() {
            addCriterion("hardening_stree_area is null");
            return (Criteria) this;
        }

        public Criteria andHardeningStreeAreaIsNotNull() {
            addCriterion("hardening_stree_area is not null");
            return (Criteria) this;
        }

        public Criteria andHardeningStreeAreaEqualTo(Integer value) {
            addCriterion("hardening_stree_area =", value, "hardeningStreeArea");
            return (Criteria) this;
        }

        public Criteria andHardeningStreeAreaNotEqualTo(Integer value) {
            addCriterion("hardening_stree_area <>", value, "hardeningStreeArea");
            return (Criteria) this;
        }

        public Criteria andHardeningStreeAreaGreaterThan(Integer value) {
            addCriterion("hardening_stree_area >", value, "hardeningStreeArea");
            return (Criteria) this;
        }

        public Criteria andHardeningStreeAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("hardening_stree_area >=", value, "hardeningStreeArea");
            return (Criteria) this;
        }

        public Criteria andHardeningStreeAreaLessThan(Integer value) {
            addCriterion("hardening_stree_area <", value, "hardeningStreeArea");
            return (Criteria) this;
        }

        public Criteria andHardeningStreeAreaLessThanOrEqualTo(Integer value) {
            addCriterion("hardening_stree_area <=", value, "hardeningStreeArea");
            return (Criteria) this;
        }

        public Criteria andHardeningStreeAreaIn(List<Integer> values) {
            addCriterion("hardening_stree_area in", values, "hardeningStreeArea");
            return (Criteria) this;
        }

        public Criteria andHardeningStreeAreaNotIn(List<Integer> values) {
            addCriterion("hardening_stree_area not in", values, "hardeningStreeArea");
            return (Criteria) this;
        }

        public Criteria andHardeningStreeAreaBetween(Integer value1, Integer value2) {
            addCriterion("hardening_stree_area between", value1, value2, "hardeningStreeArea");
            return (Criteria) this;
        }

        public Criteria andHardeningStreeAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("hardening_stree_area not between", value1, value2, "hardeningStreeArea");
            return (Criteria) this;
        }

        public Criteria andSumAreaIsNull() {
            addCriterion("sum_area is null");
            return (Criteria) this;
        }

        public Criteria andSumAreaIsNotNull() {
            addCriterion("sum_area is not null");
            return (Criteria) this;
        }

        public Criteria andSumAreaEqualTo(Integer value) {
            addCriterion("sum_area =", value, "sumArea");
            return (Criteria) this;
        }

        public Criteria andSumAreaNotEqualTo(Integer value) {
            addCriterion("sum_area <>", value, "sumArea");
            return (Criteria) this;
        }

        public Criteria andSumAreaGreaterThan(Integer value) {
            addCriterion("sum_area >", value, "sumArea");
            return (Criteria) this;
        }

        public Criteria andSumAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_area >=", value, "sumArea");
            return (Criteria) this;
        }

        public Criteria andSumAreaLessThan(Integer value) {
            addCriterion("sum_area <", value, "sumArea");
            return (Criteria) this;
        }

        public Criteria andSumAreaLessThanOrEqualTo(Integer value) {
            addCriterion("sum_area <=", value, "sumArea");
            return (Criteria) this;
        }

        public Criteria andSumAreaIn(List<Integer> values) {
            addCriterion("sum_area in", values, "sumArea");
            return (Criteria) this;
        }

        public Criteria andSumAreaNotIn(List<Integer> values) {
            addCriterion("sum_area not in", values, "sumArea");
            return (Criteria) this;
        }

        public Criteria andSumAreaBetween(Integer value1, Integer value2) {
            addCriterion("sum_area between", value1, value2, "sumArea");
            return (Criteria) this;
        }

        public Criteria andSumAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_area not between", value1, value2, "sumArea");
            return (Criteria) this;
        }

        public Criteria andCleanLevelIsNull() {
            addCriterion("clean_level is null");
            return (Criteria) this;
        }

        public Criteria andCleanLevelIsNotNull() {
            addCriterion("clean_level is not null");
            return (Criteria) this;
        }

        public Criteria andCleanLevelEqualTo(Short value) {
            addCriterion("clean_level =", value, "cleanLevel");
            return (Criteria) this;
        }

        public Criteria andCleanLevelNotEqualTo(Short value) {
            addCriterion("clean_level <>", value, "cleanLevel");
            return (Criteria) this;
        }

        public Criteria andCleanLevelGreaterThan(Short value) {
            addCriterion("clean_level >", value, "cleanLevel");
            return (Criteria) this;
        }

        public Criteria andCleanLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("clean_level >=", value, "cleanLevel");
            return (Criteria) this;
        }

        public Criteria andCleanLevelLessThan(Short value) {
            addCriterion("clean_level <", value, "cleanLevel");
            return (Criteria) this;
        }

        public Criteria andCleanLevelLessThanOrEqualTo(Short value) {
            addCriterion("clean_level <=", value, "cleanLevel");
            return (Criteria) this;
        }

        public Criteria andCleanLevelIn(List<Short> values) {
            addCriterion("clean_level in", values, "cleanLevel");
            return (Criteria) this;
        }

        public Criteria andCleanLevelNotIn(List<Short> values) {
            addCriterion("clean_level not in", values, "cleanLevel");
            return (Criteria) this;
        }

        public Criteria andCleanLevelBetween(Short value1, Short value2) {
            addCriterion("clean_level between", value1, value2, "cleanLevel");
            return (Criteria) this;
        }

        public Criteria andCleanLevelNotBetween(Short value1, Short value2) {
            addCriterion("clean_level not between", value1, value2, "cleanLevel");
            return (Criteria) this;
        }

        public Criteria andPaintedIsNull() {
            addCriterion("painted is null");
            return (Criteria) this;
        }

        public Criteria andPaintedIsNotNull() {
            addCriterion("painted is not null");
            return (Criteria) this;
        }

        public Criteria andPaintedEqualTo(Boolean value) {
            addCriterion("painted =", value, "painted");
            return (Criteria) this;
        }

        public Criteria andPaintedNotEqualTo(Boolean value) {
            addCriterion("painted <>", value, "painted");
            return (Criteria) this;
        }

        public Criteria andPaintedGreaterThan(Boolean value) {
            addCriterion("painted >", value, "painted");
            return (Criteria) this;
        }

        public Criteria andPaintedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("painted >=", value, "painted");
            return (Criteria) this;
        }

        public Criteria andPaintedLessThan(Boolean value) {
            addCriterion("painted <", value, "painted");
            return (Criteria) this;
        }

        public Criteria andPaintedLessThanOrEqualTo(Boolean value) {
            addCriterion("painted <=", value, "painted");
            return (Criteria) this;
        }

        public Criteria andPaintedIn(List<Boolean> values) {
            addCriterion("painted in", values, "painted");
            return (Criteria) this;
        }

        public Criteria andPaintedNotIn(List<Boolean> values) {
            addCriterion("painted not in", values, "painted");
            return (Criteria) this;
        }

        public Criteria andPaintedBetween(Boolean value1, Boolean value2) {
            addCriterion("painted between", value1, value2, "painted");
            return (Criteria) this;
        }

        public Criteria andPaintedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("painted not between", value1, value2, "painted");
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