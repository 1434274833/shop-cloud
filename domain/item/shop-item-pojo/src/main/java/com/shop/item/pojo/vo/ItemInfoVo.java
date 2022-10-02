package com.shop.item.pojo.vo;

import io.swagger.annotations.ApiModel;

import java.util.List;

@ApiModel(value = "商品基本信息", description = "商品基本信息")
public class ItemInfoVo {
    private String id;
    private String content;
    private String itemName;

    private String specId;
    private Integer sellCounts;

    private List<ItemImgVo> itemImgList;

    private List<ItemParamsVo> itemParamList;

    private List<ItemSpecVo> itemSpecList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getSellCounts() {
        return sellCounts;
    }

    public void setSellCounts(Integer sellCounts) {
        this.sellCounts = sellCounts;
    }

    public List<ItemImgVo> getItemImgList() {
        return itemImgList;
    }

    public void setItemImgList(List<ItemImgVo> itemImgList) {
        this.itemImgList = itemImgList;
    }

    public List<ItemParamsVo> getItemParamList() {
        return itemParamList;
    }

    public void setItemParamList(List<ItemParamsVo> itemParamList) {
        this.itemParamList = itemParamList;
    }

    public List<ItemSpecVo> getItemSpecList() {
        return itemSpecList;
    }

    public void setItemSpecList(List<ItemSpecVo> itemSpecList) {
        this.itemSpecList = itemSpecList;
    }

    public String getSpecId() {
        return specId;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }
}
