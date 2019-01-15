package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author: yb
 * Description:
 * DATE: 2017/10/31 17:22
 * Package:com.rongyi.easy.newcoupon.dto
 * Project:easy-coupon
 */
@Getter
@Setter
@ToString
public class OperationParamDTO implements Serializable {

    private static final long serialVersionUID = 8575497932823413102L;

    private Integer id;

    /**
     * 数量
     */
    private Integer count;
    /**
     * 原因
     */
    private String reason;
    /**
     * 2:挂起 3：审核通过；4：审核不通过;5: 待发布  6：发布中；7：终止（下架） 8:删除
     *
     */
    private Integer status;

    /**
     * 操作人id
     */
    private Integer checkUserId;

    /**
     * 操作人名称
     */
    private String checkUserName;

    /**
     * id列表
     */
    private List<Integer> ids;

}
