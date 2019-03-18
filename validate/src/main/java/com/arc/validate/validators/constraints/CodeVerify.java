package com.arc.validate.validators.constraints;


import com.arc.validate.validators.constraintvalidators.MyCodeConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 校验框架
 */
@Documented
@Constraint(validatedBy = MyCodeConstraintValidator.class)
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
public @interface CodeVerify {

    String message() default "{com.arc.validate.validators.constraints.CodeVerify.message}";

    String[] value() default {};

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Target({FIELD, METHOD, PARAMETER, ANNOTATION_TYPE})
    @Retention(RUNTIME)
    @Documented
    @interface List {
        CodeVerify[] value();
    }

}
