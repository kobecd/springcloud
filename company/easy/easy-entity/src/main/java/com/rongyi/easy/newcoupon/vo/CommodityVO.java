package com.rongyi.easy.newcoupon.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/11/2
 */
@Setter
@Getter
@ToString(callSuper = true)
public class CommodityVO extends BaseVO {

    private String commodityId;

    private String commodityName;
}
