package com.shop.pojo;


import com.shop.enums.HttpStatus;

import java.util.Map;

public class ResultJson {


    private int status;
    private String msg;

    private Object data;

    ResultJson() {
    }

    ResultJson(HttpStatus status, Object data, String msg) {
        this.setData(data);
        this.setStatus(status.getStatus());
        this.setMsg(status.getMsg());
    }
    public static ResultJson build() {
        return new ResultJson();
    }
    public static ResultJson build(HttpStatus status, Object data, String msg) {
        return new ResultJson(status, data, msg);
    }

    public static ResultJson build(HttpStatus status, Object data) {
        return new ResultJson(status, data, null);
    }

    public static ResultJson build(HttpStatus status) {
        return new ResultJson(status, null, null);
    }

    public ResultJson ok() {
        this.setMsg(HttpStatus.SUCCESS.getMsg());
        this.setData(null);
        this.setStatus(HttpStatus.SUCCESS.getStatus());
        return this;
    }

    public ResultJson ok(HttpStatus httpStatus) {
        this.setMsg(httpStatus.getMsg());
        this.setData(null);
        this.setStatus(httpStatus.getStatus());
        return this;
    }

    public ResultJson ok(HttpStatus httpStatus,Object data) {
        this.setMsg(httpStatus.getMsg());
        this.setData(data);
        this.setStatus(httpStatus.getStatus());
        return this;
    }

    public ResultJson error() {
        this.setMsg(HttpStatus.ERROR.getMsg());
        this.setData(null);
        this.setStatus(HttpStatus.ERROR.getStatus());
        return this;
    }

    public ResultJson errorMap(Map<String,String> map) {
        this.setMsg(HttpStatus.BEAN_ERROR.getMsg());
        this.setData(map);
        this.setStatus(HttpStatus.BEAN_ERROR.getStatus());
        return this;
    }

    public ResultJson error(String msg) {
        this.setMsg(msg);
        this.setData(null);
        this.setStatus(HttpStatus.ERROR.getStatus());
        return this;
    }

    public ResultJson error(HttpStatus httpStatus) {
        this.setMsg(httpStatus.getMsg());
        this.setData(null);
        this.setStatus(httpStatus.getStatus());
        return this;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
