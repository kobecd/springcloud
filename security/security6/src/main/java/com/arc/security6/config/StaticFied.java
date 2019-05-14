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
    public static final String loginProcessingUrl = "/login/form/v1";

    public static final String verifyCode = "/verify/code";

    public static final String KEY_FOR_COOKIE = "KEY_FOR_VERIFY_CODE@";

    public static final String KEY_PREFIX_FOR_VERIFY_CODE =KEY_FOR_COOKIE;
}
