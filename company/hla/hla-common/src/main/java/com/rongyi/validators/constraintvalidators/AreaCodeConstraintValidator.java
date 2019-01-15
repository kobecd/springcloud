package com.rongyi.validators.constraintvalidators;

import com.rongyi.validators.constraints.AreaCode;
import lombok.extern.slf4j.Slf4j;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

@Slf4j
public class AreaCodeConstraintValidator implements ConstraintValidator<AreaCode, String> {

    private static final Pattern p = Pattern.compile("\\d{6}");

    @Override
    public void initialize(AreaCode constraintAnnotation) {
        log.debug("方法{}", "public void initialize(AreaCode constraintAnnotation)");
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || "".equals(value)) return false;
        return p.matcher(value).matches();
    }

}
