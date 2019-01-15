package com.rongyi.context.config.annotations;


import com.rongyi.context.config.configurations.Swagger2ApiConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(Swagger2ApiConfiguration.class)
@Documented
public @interface EnableSwagger2Api {

}
