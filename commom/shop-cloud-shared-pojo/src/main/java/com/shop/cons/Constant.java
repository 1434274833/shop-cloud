package com.shop.cons;

public class Constant {

    public static final String USER_FACE = "http://122.152.205.72:88/group1/M00/00/05/CpoxxFw_8_qAIlFXAAAcIhVPdSg994.png";

    // 支付中心的调用地址
    public static final String paymentUrl = "http://payment.t.mukewang.com/foodie-payment/payment/createMerchantOrder";        // produce

    // 支付中心的调用地址
    public static final String returnUrl = "http://localhost:8088/orders/notifyMerchantOrderPaid";        // produce


    public static final String payUserName="1434274833";
    public static final String payPwd="13fd-ew3r";

    //redis key
    public static final String index_carousel="carousel";//首页轮播图
    public static final String cats="cats";//一级分类
    public static final String subCat="subCat";//二级分类
    public static final String shopCart="shopcart";//购物车
    public static final String token="user_token";//令牌
    public static final String temp_ticket="temp_ticket";//令牌
    public static final String user_ticket="user_ticket";//令牌
    public static final Integer ZERO = 0;

    public static final Integer ONE = 1;

    public static final Integer TWO = 2;

    public static final Integer THREE = 3;
}
