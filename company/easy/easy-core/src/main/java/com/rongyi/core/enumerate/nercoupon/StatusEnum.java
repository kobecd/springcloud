package com.rongyi.core.enumerate.nercoupon;

import com.rongyi.core.framework.exception.CouponException;

/**
 * @author: yb
 * Description: 状态 0：草稿；1：待审核；2：审核通过；3：审核不通过  4: 待发布  5：发布中；6：终止（下架）
 * DATE: 2017/11/2 11:10
 * Package:com.rongyi.coupon.entity.enums
 * Project:easy-coupon
 */
public enum StatusEnum {
    DRAFT_STATUS(0, "草稿"),
    STAY_CHECK_STATUS(1, "待审核"),
    HANG_UP_STATUS(2, "挂起"),
    PASS_CHECK_STATUS(3, "审核通过"),
    UNPASS_CHECK_STATUS(4, "审核不通过"),
    STAY_PUBLISH_STATUS(5, "待发布"),
    PUBLISHING_STATUS(6, "发布中"),
    STOP_STATUS(7, "已终止"),
    DELETED_STATUS(8, "删除"),
    ;
    private Integer code;

    private String desc;

    StatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static StatusEnum getStatusEnumByCode(Integer code){
        for(StatusEnum statusEnum: values()){
            if(statusEnum.getCode().equals(code)){
                return statusEnum;
            }
        }
        return null;
    }

}
