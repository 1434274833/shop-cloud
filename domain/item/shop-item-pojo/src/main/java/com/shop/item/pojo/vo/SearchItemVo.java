package com.shop.item.pojo.vo;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "搜索商品VO")
public class SearchItemVo {
    private String itemId;
    private String itemName;
    private String price;
    private String sellCounts;
    private String imgUrl;


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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSellCounts() {
        return sellCounts;
    }

    public void setSellCounts(String sellCounts) {
        this.sellCounts = sellCounts;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
