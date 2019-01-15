package com.rongyi.easy.newcoupon.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: yb
 * Description:
 * DATE: 2018/1/8 14:59
 * Package:com.rongyi.easy.newcoupon.vo
 * Project:easy-coupon
 */
@Getter
@Setter
@ToString
public class OperateLogVO implements Serializable{
    private static final long serialVersionUID = -3651219621607908178L;
    /**  */
    private Integer id;

    /**
     * 审核人姓名
     */
    private String checkUserName;

    /**
     * 审核状态  2：挂起；3：审核通过；4：审核不通过  对应卡券的状态
     */
    private Integer checkStatus;

    /**
     * 审核时间
     */
    private String checkAt;

    /**
     * 卡券审核原因
     */
    private String checkReason;
}
