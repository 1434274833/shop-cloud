package com.shop.enums;


import com.shop.cons.Constant;

public enum CategoryEnum {

    ONE_LEVEL(Constant.ONE),
    TWO_LEVEL(Constant.TWO),
    ThREE_LEVEL(Constant.THREE);

    Integer type;

    CategoryEnum(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }
}
