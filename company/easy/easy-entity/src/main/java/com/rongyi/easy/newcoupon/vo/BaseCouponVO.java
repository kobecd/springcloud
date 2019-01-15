package com.rongyi.easy.newcoupon.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/10/30
 * 发布信息
 */
@Setter
@Getter
@ToString(callSuper = true)
public class BaseCouponVO extends BaseVO {

    private Integer id;

    /**
     * 商户类型， 0：总部 1：商场 2：店铺
     */
    private Integer merchantType;

    /**
     * 商户id
     */
    private String merchantId;

    /**
     * 商户父店铺/商场id
     */
    private String merchantParentId;

    private String name;

    private List<String> pictures;

    /**
     * 0:自建, 1:导入, 2:第三方获取
     */
    private Integer couponSource;

    /**
     * 卡券导入uuid
     */
    private String codeUuid;

    /**
     * 0:自建, 1:导入, 2:第三方获取
     */
    private Integer codeSource;

    /**
     * 发放总量
     */
    private Integer totalCount;

    /**
     * 展示券码类型 0:系统券码, 1：第三方券码
     */
    private Integer showCodeType;

    /**
     * 发布类型 0:审核通过后发布, 1:指定发布时间, 2:暂不发布
     */
    private Integer publishTimeType;

    /**
     * 发布开始时间
     */
    private String publishStartAt;

    /**
     * 发布结束时间
     */
    private String publishEndAt;

    /**
     * 失效类型 0:固定日期失效,  1:领取后多长时间失效
     */
    private Integer validType;

    /**
     * 固定日期失效
     */
    private String invalidDate;

    /**
     * 0：当天，1：明天
     */
    private Integer startValidDate;

    /**
     * 有效期跨度，单位：天
     */
    private Integer endValidDate;

    /**
     * 发布渠道 0:不限, 1：卡券商城, 2:积分商城, 3:营销中心, 4:游戏中心, 5:互动屏, 6:第三方平台, 7:领券频道
     */
    private List<Integer> publishList;


}
