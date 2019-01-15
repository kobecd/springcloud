package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: yb
 * Description:
 * DATE: 2017/11/30 10:41
 * Package:com.rongyi.easy.newcoupon.dto
 * Project:easy-coupon
 */
@Getter
@Setter
@ToString(callSuper = true)
public class CouponCodeDTO extends BaseDTO {

    /**
     * z主键
     */
    private Integer id;
    /**
     * 卡券id
     */
    private Integer couponId;

    /**
     * 券码
     */
    private String othersCode;

    /**
     * 版本号
     */
    private String version;

    /**
     * true:查询失败记录， 否则查询成功记录
     */
    private Boolean failure;

    public CouponCodeDTO(){}

    public CouponCodeDTO(String version, Integer couponId, Integer currentPage, Integer pageSize){
        this.version = version;
        this.couponId = couponId;
        this.setCurrentPage(currentPage);
        this.setPageSize(pageSize);
    }
}
