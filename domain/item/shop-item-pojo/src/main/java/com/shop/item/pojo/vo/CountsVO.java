package com.shop.item.pojo.vo;


import io.swagger.annotations.ApiModel;

@ApiModel("评价数据 VO")
public class CountsVO {
    private Integer goodCounts;
    private Integer totalCounts;
    private Integer normalCounts;
    private Integer badCounts;

    public CountsVO(){
        this.goodCounts=0;
        this.totalCounts=0;
        this.normalCounts=0;
        this.badCounts=0;
    }

    public Integer getGoodCounts() {
        return goodCounts;
    }

    public void setGoodCounts(Integer goodCounts) {
        this.goodCounts = goodCounts;
    }

    public Integer getTotalCounts() {
        return totalCounts;
    }

    public void setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
    }

    public Integer getNormalCounts() {
        return normalCounts;
    }

    public void setNormalCounts(Integer normalCounts) {
        this.normalCounts = normalCounts;
    }

    public Integer getBadCounts() {
        return badCounts;
    }

    public void setBadCounts(Integer badCounts) {
        this.badCounts = badCounts;
    }
}
