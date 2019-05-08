package com.arc.security5.config.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 叶超
 * @since: 2019/5/8 22:19
 */
@Setter
@Getter
@ConfigurationProperties(prefix = "arc.security")
public class ArcSecurityProperties {

    private BrowserProperties browserProperties = new BrowserProperties();
}
