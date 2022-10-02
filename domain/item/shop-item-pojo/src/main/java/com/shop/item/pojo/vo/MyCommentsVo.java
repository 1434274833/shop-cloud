package com.shop.item.pojo.vo;

import io.swagger.annotations.ApiModel;

import java.util.Date;

@ApiModel("评价数据 VO")
public class MyCommentsVo {
    private String commentId;
    private String itemName;
    private String itemImg;
    private String content;
    private String specName;
    private Date createdTime;

    public String getCommentId() {
        return commentId;
    }

    public void setId(String commentId) {
        this.commentId = commentId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemImg() {
        return itemImg;
    }

    public void setItemImg(String itemImg) {
        this.itemImg = itemImg;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
