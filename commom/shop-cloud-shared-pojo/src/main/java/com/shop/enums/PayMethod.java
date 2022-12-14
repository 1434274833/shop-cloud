package com.shop.enums;


import com.shop.cons.Constant;

public enum PayMethod {
    WECHAT(Constant.ONE,"微信支付"),
    ALIPAY(Constant.TWO,"支付宝支付")
    ;
    Integer type;
    String value;

    PayMethod(Integer type,String value){
        this.type=type;
        this.value=value;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
