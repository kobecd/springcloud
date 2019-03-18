package com.arc.validate.validators.constraintvalidators;


import com.arc.validate.validators.constraints.CodeVerify;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyCodeConstraintValidator implements ConstraintValidator<CodeVerify, String> {


    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        if (value == null || "".equals(value)) {
            return false;
        } else {
            System.out.println("-------------------------------");
            System.out.println(value);
            System.out.println("-------------------------------");
            return true;
        }
    }


    @Override
    public void initialize(CodeVerify constraintAnnotation) {

    }
}
