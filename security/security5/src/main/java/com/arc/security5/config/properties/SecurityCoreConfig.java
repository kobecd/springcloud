package com.arc.security5.config.properties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author 叶超
 * @since: 2019/5/8 22:23
 */
@Configuration
@EnableConfigurationProperties(ArcSecurityProperties.class)
public class SecurityCoreConfig {
}
