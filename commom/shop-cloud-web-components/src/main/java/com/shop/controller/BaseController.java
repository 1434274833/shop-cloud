package com.shop.controller;

import org.springframework.stereotype.Controller;

import java.io.File;

@Controller
public class BaseController {
    protected final Integer PAGESIZE=20;
    // 支付中心的调用地址
    protected String paymentUrl = "http://payment.t.mukewang.com/foodie-payment/payment/createMerchantOrder";		// produce

    protected String imageUploadUrl = File.separator+"Users/dingshuangqiu/Documents/images/foodie/face";
}
