package com.rongyi.rss.newcoupon.web;

import com.rongyi.easy.newcoupon.vo.MallVipLeverVO;

import java.util.List;

/**
 * 获取商场会员等级
 * @author: yb
 * Description:
 * DATE: 2018/1/6 14:02
 * Package:com.rongyi.rss.newcoupon.web
 * Project:easy-coupon
 */
public interface IVipLeverlService {
    /**
     * 获取商场会员等级列表
     *
     * @return
     */
     List<MallVipLeverVO> getMallVipLevelList(String mallId);
}
