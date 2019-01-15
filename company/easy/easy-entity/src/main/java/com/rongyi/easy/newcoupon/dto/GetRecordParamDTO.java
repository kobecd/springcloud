package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author: yb
 * Description:
 * DATE: 2017/11/24 16:09
 * Package:com.rongyi.easy.newcoupon.dto
 * Project:easy-coupon
 */
@Getter
@Setter
@ToString
public class GetRecordParamDTO extends BaseDTO {

    private static final long serialVersionUID = -2276046791836417963L;

    /** 券码 */
    private String couponCode;

    /** 领取用户手机号 */
    private String userPhone;

    /** 领取时间范围 最小时间 */
    private Date getStartAt;

    /** 领取时间范围 最大时间 */
    private Date getEndAt;

    /** 1：卡券商城；2：积分商城；3：营销中心；4：游戏中心；5:互动屏；6：第三方平台 ；7：领券频道 */
    private Integer getChannel;

    /** 卡券名称 */
    private String couponName;

    /** 卡券类型id */
    private Integer couponTypeId;

    /** 验证时间 范围最小时间 */
    private Date validStartAt;

    /** 验证时间 范围最大时间 */
    private Date validEndAt;

    /** 0:未使用；1：已使用；2：已过期；3：已作废 */
    private Integer status;

    /** 验证平台；0：商家后台；1：摩店；2：微信（公众号）；3：小程序；4：第三方平台 */
    private Integer validPlatform;

    /**  */
    private String merchantType;

    private String merchantId;

}
