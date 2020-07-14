package com.study.bean;

import java.util.Date;

public class BjRoad {
    private Long id;

    private Date createAt;

    private Date updateAt;

    private Integer version;

    private Boolean usable;

    private String roadName;

    private String startLocation;

    private String endLocation;

    private Integer roadLength;

    private Integer laneWidth;

    private Integer sidewalkWidth;

    private Integer laneArea;

    private Integer sidewalkArea;

    private Integer roadArea;

    private Integer greenArea;

    private Integer hardeningStreeArea;

    private Integer sumArea;

    private Short cleanLevel;

    private Boolean painted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Boolean getUsable() {
        return usable;
    }

    public void setUsable(Boolean usable) {
        this.usable = usable;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName == null ? null : roadName.trim();
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation == null ? null : startLocation.trim();
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation == null ? null : endLocation.trim();
    }

    public Integer getRoadLength() {
        return roadLength;
    }

    public void setRoadLength(Integer roadLength) {
        this.roadLength = roadLength;
    }

    public Integer getLaneWidth() {
        return laneWidth;
    }

    public void setLaneWidth(Integer laneWidth) {
        this.laneWidth = laneWidth;
    }

    public Integer getSidewalkWidth() {
        return sidewalkWidth;
    }

    public void setSidewalkWidth(Integer sidewalkWidth) {
        this.sidewalkWidth = sidewalkWidth;
    }

    public Integer getLaneArea() {
        return laneArea;
    }

    public void setLaneArea(Integer laneArea) {
        this.laneArea = laneArea;
    }

    public Integer getSidewalkArea() {
        return sidewalkArea;
    }

    public void setSidewalkArea(Integer sidewalkArea) {
        this.sidewalkArea = sidewalkArea;
    }

    public Integer getRoadArea() {
        return roadArea;
    }

    public void setRoadArea(Integer roadArea) {
        this.roadArea = roadArea;
    }

    public Integer getGreenArea() {
        return greenArea;
    }

    public void setGreenArea(Integer greenArea) {
        this.greenArea = greenArea;
    }

    public Integer getHardeningStreeArea() {
        return hardeningStreeArea;
    }

    public void setHardeningStreeArea(Integer hardeningStreeArea) {
        this.hardeningStreeArea = hardeningStreeArea;
    }

    public Integer getSumArea() {
        return sumArea;
    }

    public void setSumArea(Integer sumArea) {
        this.sumArea = sumArea;
    }

    public Short getCleanLevel() {
        return cleanLevel;
    }

    public void setCleanLevel(Short cleanLevel) {
        this.cleanLevel = cleanLevel;
    }

    public Boolean getPainted() {
        return painted;
    }

    public void setPainted(Boolean painted) {
        this.painted = painted;
    }
}