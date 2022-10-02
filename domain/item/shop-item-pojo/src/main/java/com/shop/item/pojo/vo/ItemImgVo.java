package com.shop.item.pojo.vo;

import io.swagger.annotations.ApiModel;

@ApiModel(value="商品图片",description = "商品图片")
public class ItemImgVo {

    private String imgId;
    private  Integer isMain;

    private  Integer sort;

    private  String url;

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId;
    }

    public Integer getIsMain() {
        return isMain;
    }

    public void setIsMain(Integer isMain) {
        this.isMain = isMain;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
