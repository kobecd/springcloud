package com.rongyi.easy.newcoupon.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/12/27
 */
@Setter
@Getter
@ToString(callSuper = true)
public class CouponCodeTotalVO extends BaseVO {
    private Integer id;

    /**
     * 导入卡券时的文件名
     */
    private String fileName;

    /**
     * 本次导入成功数量
     */
    private Integer successCount;

    /**
     * 本次导入失败数量
     */
    private Integer failureCount;

    /**
     * 版本号
     */
    private String version;

    private String createdAt;

    private Integer createdBy;

    private String createdUser;
}
