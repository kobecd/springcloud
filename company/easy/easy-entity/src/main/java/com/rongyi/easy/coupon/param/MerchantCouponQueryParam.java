package com.rongyi.easy.coupon.param;

import com.rongyi.core.constant.Constants;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: yb
 * Description:
 * DATE: 2017/12/19 15:08
 * Package:com.rongyi.easy.coupon.param
 * Project:easy-common
 */
public class MerchantCouponQueryParam implements Serializable {

    /** 1代金券自建；2 代金券第三方 3抵扣券 4活动券*/
    private Integer couponType;

    /** 名称关键字*/
    private String keyword;
    /**
     *  1:发布时间；2：有效时间；3：添加时间；4：预热时间
     */
    private Integer dateType;

    private String startAt;

    private String endAt;

    //待审核[0], 审核未通过[1], 审核通过[2] ;3:待发布；4：发布中；5：已结束；6：已停止
    private Integer status;

    private String mallId;

    private String shopId;

    /**
     * 集团id
     */
    private String groupId;

    /**
     * 品牌id
     */
    private String brandId;

    /**
     * 是否是砂之船商场
     */
    private boolean szcMall;

    /**
     * 是否是砂之船总部
     */
    private boolean szcHeadQuarter;

    private Integer currentPage;

    private Integer pageSize;

    private Integer start;

    private Integer thrid;

    /** 砂之船卡券，通过来是否重新编辑补齐数据过，0：未；1：是*/
    private Integer created;

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Integer getThrid() {
        return thrid;
    }

    public void setThrid(Integer thrid) {
        this.thrid = thrid;
    }

    public Integer getCurrentPage() {
        return currentPage==null? Constants.CouponPage.CURRENT_PAGE:currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize==null? Constants.CouponPage.PAGE_SIZE:pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getStart() {
        return (this.getCurrentPage()-1)*this.getPageSize();
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getDateType() {
        return dateType;
    }

    public void setDateType(Integer dateType) {
        this.dateType = dateType;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public boolean isSzcMall() {
        return szcMall;
    }

    public void setSzcMall(boolean szcMall) {
        this.szcMall = szcMall;
    }

    public boolean isSzcHeadQuarter() {
        return szcHeadQuarter;
    }

    public void setSzcHeadQuarter(boolean szcHeadQuarter) {
        this.szcHeadQuarter = szcHeadQuarter;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
