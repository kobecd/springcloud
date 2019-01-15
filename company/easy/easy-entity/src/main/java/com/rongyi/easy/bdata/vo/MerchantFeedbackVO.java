package com.rongyi.easy.bdata.vo;

import com.rongyi.core.common.util.date.DateUtil;
import com.rongyi.easy.bdata.entity.MerchantFeedbackDO;

import java.io.Serializable;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2018/3/6
 */
public class MerchantFeedbackVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    private String mallId;

    private Integer userId;

    private String userName;

    private String phone;

    private String openId;

    private Integer type;

    private String title;

    private String content;

    private String point;

    private String pictures;

    private String createdAt;

    public MerchantFeedbackVO(MerchantFeedbackDO feedbackDO){
        this.id = feedbackDO.getId();
        this.mallId = feedbackDO.getMallId();
        this.userId = feedbackDO.getUserId();
        this.userName = feedbackDO.getUserName();
        this.phone = feedbackDO.getPhone();
        this.openId = feedbackDO.getOpenId();
        this.type = feedbackDO.getType();
        this.title = feedbackDO.getTitle();
        this.content =feedbackDO.getContent();
        this.point = feedbackDO.getPoint();
        this.pictures = feedbackDO.getPictures();
        if(feedbackDO.getCreatedAt() != null){
            this.createdAt = DateUtil.format(feedbackDO.getCreatedAt(), DateUtil.PATTERN_YMDHMSS);
        }
    }

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

}
