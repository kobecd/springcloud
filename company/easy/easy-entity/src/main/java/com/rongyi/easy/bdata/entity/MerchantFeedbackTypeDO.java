package com.rongyi.easy.bdata.entity;

import com.rongyi.easy.bdata.dto.MerchantFeedbackTypeDTO;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Created With IntelliJ IDEA.
 *
 *
 * @author: WUHUI
 * @date: 2018/3/5
 */
public class MerchantFeedbackTypeDO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String mallId;

    private String type;

    private Integer valid;

    private Date createdAt;

    private Date updatedAt;

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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public MerchantFeedbackTypeDO(){}

    public MerchantFeedbackTypeDO(MerchantFeedbackTypeDTO feedbackTypeDTO){
        this.id = feedbackTypeDTO.getId();
        this.mallId = feedbackTypeDTO.getMallId();
        this.type = feedbackTypeDTO.getType();
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
