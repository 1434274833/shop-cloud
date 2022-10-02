package com.shop.enums;


import com.shop.cons.Constant;

public enum YesOrNo {
    YES(Constant.ONE),
    NO(Constant.ZERO);
    Integer type;

    YesOrNo(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }
}
