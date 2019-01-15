package com.rongyi.easy.bdata.entity;

import com.rongyi.core.util.ListUtil;
import com.rongyi.easy.bdata.dto.MerchantFeedbackDTO;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2018/3/5
 */
public class MerchantFeedbackDO implements Serializable {

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

    private Date createdAt;

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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public MerchantFeedbackDO(){}

    public MerchantFeedbackDO(MerchantFeedbackDTO merchantFeedbackDTO){
        this.mallId = merchantFeedbackDTO.getMallId();
        this.userId = merchantFeedbackDTO.getUserId();
        this.userName = merchantFeedbackDTO.getUserName();
        this.phone = merchantFeedbackDTO.getPhone();
        this.openId = merchantFeedbackDTO.getOpenId();
        this.type = merchantFeedbackDTO.getType();
        this.title = merchantFeedbackDTO.getTitle();
        this.content = merchantFeedbackDTO.getContent();
        this.point = merchantFeedbackDTO.getPoint();
        this.pictures = ListUtil.changeList2String(merchantFeedbackDTO.getPictures(), ",");
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
