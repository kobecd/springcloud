package com.arc.validate.validators.constraintvalidators;


import com.arc.validate.validators.constraints.MyCode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyCodeConstraintValidator implements ConstraintValidator<MyCode, String> {

//    private static final Pattern p = Pattern.compile("\\d{6}");


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
    public void initialize(MyCode constraintAnnotation) {

    }
}
