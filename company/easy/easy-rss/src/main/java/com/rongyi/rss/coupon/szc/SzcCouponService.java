package com.rongyi.rss.coupon.szc;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.coupon.entity.szc.SzcUserCoupon;
import com.rongyi.easy.coupon.vo.SzcMallVO;

import java.util.List;

/**
 * Description:砂之船定时同步卡券信息接口
 * Author: yb
 * DATE: 2017/7/27 15:09
 * Package:com.rongyi.rss.coupon
 * Project:easy-market
 */
public interface SzcCouponService  {
    /**
     * 定时同步
     * 砂之船卡券同步接口
     */
    void synSzcCoupon();

//    /**
//     * 定时同步，砂之船已经核销的券码状态
//     */
//    void synSzcUserCoupon();

    /**
     * 领取砂之船卡券。
     * @param vipId 砂之船会员id ，必传
     * @param couponId 卡券id，必传
     * @param phone 手机号，必传
     * @return
     */
    ResponseVO getSzcCoupon(String vipId, String couponId,String phone) throws Exception;
    
    /**
     * 砂之船卡包列表
     * @param vipId
     * @return
     * @throws Exception
     */
    ResponseVO getUserSzcCouponList(String vipId,Integer status,String mallId) throws Exception;
    /**
     * 砂之船卡包详情
     * @param couponCode
     * @param szcCouponId
     * @return
     * @throws Exception
     */
    public ResponseVO getSzcCouponInfo(String couponCode, Integer szcCouponId,String vipId) throws Exception;
    
    /**
     * 根据会员内码和卡券id查询是否领券
     * @param vipId
     * @param couponId
     * @return
     * @throws Exception
     */
    boolean isGetCoupon(String vipId, String couponId) ;


    /**
     * 获取砂之船商场信息
     * @return
     */
    List<SzcMallVO> findSzcMallsInfo();

}
