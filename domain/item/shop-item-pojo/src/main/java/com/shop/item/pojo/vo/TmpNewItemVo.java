package com.shop.item.pojo.vo;

public class TmpNewItemVo {
    private String specId;
    private String itemId;
    private String itemName;
    private String itemImgUrl;
    private String specName;
    private Integer priceDiscount;
    private Integer priceNormal;

    public String getSpecId() {
        return specId;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemImgUrl() {
        return itemImgUrl;
    }

    public void setItemImgUrl(String itemImgUrl) {
        this.itemImgUrl = itemImgUrl;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }
    
    public Integer getPriceDiscount() {
        return priceDiscount;
    }

    public void setPriceDiscount(Integer priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public Integer getPriceNormal() {
        return priceNormal;
    }

    public void setPriceNormal(Integer priceNormal) {
        this.priceNormal = priceNormal;
    }
}
