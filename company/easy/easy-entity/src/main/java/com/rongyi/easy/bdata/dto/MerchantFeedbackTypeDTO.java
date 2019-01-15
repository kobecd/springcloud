package com.rongyi.easy.bdata.dto;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2018/3/5
 */
public class MerchantFeedbackTypeDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String mallId;

    private String type;

    private Integer valid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
