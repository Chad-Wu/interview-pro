package com.wch.interviewpro.constant;

public interface RedisConstant {
    // redis common key
    String SIGN_IN_KEY = "interviewpro:user:signin";

    static String getRedisKey(int year, int userId) {
        return String.format("%s:%d:%d", SIGN_IN_KEY, year, userId );
    }
}
