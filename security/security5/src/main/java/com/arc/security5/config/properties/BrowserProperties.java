package com.arc.security5.config.properties;

import lombok.Getter;
import lombok.Setter;

/**
 * 自动读取配置文件中配置
 *
 * @author 叶超
 * @since: 2019/5/8 22:24
 */
@Setter
@Getter
public class BrowserProperties {

    private String loginUrl = "/arc-login.html";
}
