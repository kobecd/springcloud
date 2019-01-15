package com.rongyi.validators.constraints;

import com.rongyi.validators.constraintvalidators.AreaCodeConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = AreaCodeConstraintValidator.class)
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
public @interface AreaCode {

	String message() default "{cn.com.besttone.csp.validator.AreaCode.message}";
	
	String[] value() default { };

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
	@Target({ FIELD, METHOD, PARAMETER, ANNOTATION_TYPE })  
    @Retention(RUNTIME)  
    @Documented  
    @interface List {  
		AreaCode[] value();  
    }
	
}
