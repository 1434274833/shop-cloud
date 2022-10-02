package com.shop.enums;

public enum OrderCode {
    WAIT(10, "等待付款"),
    PAY_SEND(20, "已支付，待发货"),
    SENDED_RECEIVED(30, "已发货，待收货"),
    SUCCESS(40, "交易成功"),
    CLOSE(50, "交易关闭");
    private Integer status;
    private String value;

    OrderCode(Integer status, String value) {
        this.status = status;
        this.value = value;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
