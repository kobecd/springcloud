package com.arc.security6.config;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 叶超
 * @since 2019/5/9 23:45
 */
@Setter
@Getter
public class StaticFied {

    public static final String loginUrl = "/testLogin";
    public static final String verifyCode = "/verify/code";
    public static final String KEY_FOR_COOKIE = "H4S5H6A7C1P6K";
    public static final String KEY_PRIFIX_FOR_VERIFY_CODE ="KEY_FOR_VERIFY_CODE@";
}
