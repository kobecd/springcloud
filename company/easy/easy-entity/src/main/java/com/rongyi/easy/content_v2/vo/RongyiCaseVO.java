package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: yb
 * Description:
 * DATE: 2017/12/20 16:11
 * Package:com.rongyi.easy.content_v2.entity
 * Project:easy-common
 */
public class RongyiCaseVO implements Serializable {

    private static final long serialVersionUID = -2756536926846017411L;

    private Integer id;

    private String imgUrls;

    private String title;

    private String detailUrl;

    //0:全渠道；1：智能终端；2：实体线上化；3：全场景支付；4：互动营销；5：营销推广
    private Byte caseType;

    private Integer caseSort;

    private Date createAt;

    private Integer createBy;

    private Date updateAt;

    private Integer updateBy;

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgUrls() {
        return imgUrls;
    }

    public void setImgUrls(String imgUrls) {
        this.imgUrls = imgUrls;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public Byte getCaseType() {
        return caseType;
    }

    public void setCaseType(Byte caseType) {
        this.caseType = caseType;
    }

    public Integer getCaseSort() {
        return caseSort;
    }

    public void setCaseSort(Integer caseSort) {
        this.caseSort = caseSort;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
