package com.rongyi.easy.bdata.vo;

import com.rongyi.core.common.util.date.DateUtil;
import com.rongyi.easy.bdata.entity.MerchantFeedbackTypeDO;

import java.io.Serializable;
/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2018/3/6
 */
public class MerchantFeedbackTypeVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String mallId;

    private String type;

    private String createdAt;

    private String updatedAt;

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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public MerchantFeedbackTypeVO(MerchantFeedbackTypeDO feedbackTypeDO){
        this.id = feedbackTypeDO.getId();
        this.mallId = feedbackTypeDO.getMallId();
        this.type = feedbackTypeDO.getType();
        if(feedbackTypeDO.getCreatedAt() != null){
            this.createdAt = DateUtil.format(feedbackTypeDO.getCreatedAt(), DateUtil.PATTERN_YMDHMSS);
        }
        if(feedbackTypeDO.getUpdatedAt() != null){
            this.updatedAt = DateUtil.format(feedbackTypeDO.getUpdatedAt(), DateUtil.PATTERN_YMDHMSS);
        }
    }
}
