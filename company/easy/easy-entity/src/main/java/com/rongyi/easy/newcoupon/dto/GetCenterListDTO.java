package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author: yb
 * Description:
 * DATE: 2017/11/21 17:16
 * Package:com.rongyi.easy.newcoupon.dto
 * Project:easy-coupon
 */
@Setter
@Getter
@ToString(callSuper = true)
public class GetCenterListDTO implements Serializable{
    private static final long serialVersionUID = 7623525000150594129L;
    /** 卡券关联记录id */
    private Integer id;
    /** 卡券id */
    private Integer couponId;
    /** 卡券名称 */
    private String couponName;
    /** 卡券展示名称 */
    private String showName;
    /** 卡券类型 */
    private String couponType;
    /** 卡券类型显示名称 */
    private String typeShowName;
    /** 剩余库存 */
    private Integer surplusCount;
    /** 已领取数 */
    private Integer getCount;
    /** 是否设置规则 0：否；1：是*/
    private Integer settedRule;
    /** 状态 1：预热中；2：发券中 ；3：已领完*/
    private Integer status;
}
