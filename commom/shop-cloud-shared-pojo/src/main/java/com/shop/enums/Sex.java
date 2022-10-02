package com.shop.enums;

public enum Sex {
    MAN("男", 0),

    WOMAN("女", 1),

    SECRET("保密", 2);
    private final String type;
    private final int value;


    Sex(String type, int value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }
}
