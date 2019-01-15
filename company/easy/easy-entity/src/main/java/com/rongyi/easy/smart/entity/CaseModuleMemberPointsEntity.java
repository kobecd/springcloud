package com.rongyi.easy.smart.entity;

import java.util.List;

public class CaseModuleMemberPointsEntity {
    private Integer id;

    private String mallId;

    private Integer caseId;

    private String bgImg;

    private Byte isRecom;

    private String giftIds;

    private String giftNames;

    private List gifts;

    private String createBy;

    private String updateBy;

    private Integer createAt;

    private Integer updateAt;

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

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getBgImg() {
        return bgImg;
    }

    public void setBgImg(String bgImg) {
        this.bgImg = bgImg;
    }

    public Byte getIsRecom() {
        return isRecom;
    }

    public void setIsRecom(Byte isRecom) {
        this.isRecom = isRecom;
    }

    public String getGiftIds() {
        return giftIds;
    }

    public void setGiftIds(String giftIds) {
        this.giftIds = giftIds;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }

    public String getGiftNames() {
        return giftNames;
    }

    public void setGiftNames(String giftNames) {
        this.giftNames = giftNames;
    }

    public List getGifts() {
        return gifts;
    }

    public void setGifts(List gifts) {
        this.gifts = gifts;
    }
}