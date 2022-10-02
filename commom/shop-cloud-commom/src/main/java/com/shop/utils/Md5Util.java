package com.shop.utils;

import org.apache.tomcat.util.codec.binary.Base64;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Util {


    public static String md5(String content) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            String newStr = Base64.encodeBase64String(digest.digest(content.getBytes()));
            return newStr;
        } catch (NoSuchAlgorithmException e) {

            throw new RuntimeException(e);
        }
    }
}
