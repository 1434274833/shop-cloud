package com.shop.enums;

public enum HttpStatus {
    SUCCESS(200,"success"),
    ERROR(400,"error"),

    NOT_NULL(410,"不能为空"),

    //不能为空
    NOT_NULL_1(410,"用户名不能为空"),
    NOT_NULL_2(410,"密码不能为空"),
    NOT_NULL_3(410,"确认密码不能为空"),
    EXIST(501,"已存在"),
    PWD_NOT_SAME(502,"密码不一致"),
    PWD_NOT_LENGTH(503,"密码长度不足6位"),
    PWD_MORE_LENGTH(503,"密码长度不能超过12位"),
    PAYMETHOD_NOT(504,"不支持此支付方式"),
    LOGIN_ERROR(500,"用户名或者密码错误"),
    BEAN_ERROR(505,"bean属性异常"),
    FILE_NULL(506,"文件为空"),
    ;
    int status;
    String msg;



    HttpStatus(int status,String msg){
        this.setStatus(status);
        this.setMsg(msg);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
