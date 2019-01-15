
package com.rongyi.rss.coupon.merchant;

import com.rongyi.easy.coupon.entity.*;
import com.rongyi.easy.coupon.param.ActivityCouponParam;
import com.rongyi.easy.coupon.param.CouponOperaterSearchParam;
import com.rongyi.easy.coupon.param.CouponParam;
import com.rongyi.easy.coupon.param.MerchantCouponQueryParam;
import com.rongyi.easy.coupon.vo.MerchantCouponWebVO;
import com.rongyi.easy.coupon.vo.merchant.*;
import com.rongyi.easy.page.QueryParam;
import  java.util.List;
import java.util.Map;

/**
 * Descriptions:
 * Created by yb
 * Created at 2015/7/21 13:24.
 */
public interface MerchantCouponServce {

    List<MerchantCouponWebVO> findByWebParam(MerchantCouponQueryParam merchantCouponQueryParam);


    int countByWebParam(MerchantCouponQueryParam merchantCouponQueryParam);


    /**
     * 卡券查询通用接口
     *
     * @param queryParam
     * @return
     */
    MerchantPaging<Coupon> getCouponByPageMysql(QueryParam queryParam);



    /**
     * 商家卡券通用查询接口
     *
     * @param queryParam
     * @return
     */
    MerchantPaging<Coupon> getCouponByPageMysql(QueryParam queryParam, UserInfoVo UserInfoVo);

    /**
     * 商家卡券通用查询接口
     *
     * @param queryParam    查询参数
     * @param UserInfoVo
     * @param requiredCount 是否需要统计数据
     * @return
     */
    MerchantPaging<Coupon> getCouponByPageMysql(QueryParam queryParam, UserInfoVo UserInfoVo, Boolean requiredCount);

    /**
     * 商家卡券统计接口
     *
     * @param queryParam    查询参数
     * @param userInfoVo
     * @return
     */
    int getCountByParam(QueryParam queryParam, UserInfoVo userInfoVo);

    /**
     * 商家卡券通用查询接口
     *
     * @param queryParam 查询参数
     * @param UserInfoVo
     * @return id列表
     */
    List<String> getCouponIds(QueryParam queryParam, UserInfoVo UserInfoVo);

    /**
     * 商家优惠券，新增，修改，审核，删除等操作
     *
     * @param coupon
     * @return
     */
    Boolean updateCoupon(Coupon coupon, UserInfoVo userInfoVo) throws Exception;

    /**
     * 卡券普通修改字段
     *
     * @param coupon
     * @return
     */
    Boolean update(Coupon coupon) throws Exception;

    /**
     * 商家卡券活动券的创建
     *
     * @param coupon
     * @param userInfoVo
     * @return
     * @throws Exception
     */
    String createActivityCoupon(Coupon coupon, final UserInfoVo userInfoVo) throws Exception;

    /**
     * 商家卡券活动券的 update
     *
     * @param coupon
     * @param userInfoVo
     * @return
     * @throws Exception
     */
    boolean updateActivityCoupon(Coupon coupon, UserInfoVo userInfoVo) throws Exception;

    /**
     * 插入一条coupon
     *
     * @return coupon id
     */
    String insertCoupon(Integer inChannel, UserInfoVo createUser);

    /**
     * 获取未通过列表
     *
     * @param couponId
     * @param type
     * @return
     */
    List<CouponRejectRecord> getUnpassReasons(String couponId, Integer type);

    /**
     * 根据登录用户统计，该用户所对应集团/品牌/分公司/商场 下面优惠券的 审核状态的数量
     *
     * @param userInfoVo
     * @return
     */
    StatisticsCountVO statisticsCheckCount(UserInfoVo userInfoVo);

    /**
     * 根据登录用户统计，该用户所对应集团/品牌/分公司/商场 下面优惠券的 发布状态的数量
     *
     * @param userInfoVo
     * @return
     */
    StatisticsCountVO statisticsPublishCount(UserInfoVo userInfoVo);

    Coupon selectByPrimaryKey(String couponId);

    Coupon selectMerchantCouponById(String couponId);


    Coupon getCouponById(String couponId);


    /**
     * 批量插入商场通用券、活动券 通用店铺列表
     *
     * @param couponShops
     * @return
     */
    int batchInsertGeneralShops(List<CouponShop> couponShops,Integer type,String mallId);

    /**
     * 根据mallId 获取商场通用验证店铺
     * @param mallId
     * @param status 1 通用券；2：活动券
     * @return
     */
    List<CouponShop> getGeneralShopsByMallId(String mallId, int status);

    /**
     *  根据根据店铺ids 列表返回 每个店铺进行中的券的数量
     * @param shopIds
     * @return
     */
    List<ShopCouponsVO> shopsCouponsCount(List<String> shopIds);

    int insertCouponWechat(CouponWechat couponWechat);

    int updateCouponWechat(CouponWechat couponWechat);

    /**
     * 查询卡券运营数据
     * @param paramMap
     * @param user
     * @return
     */
    MerchantPaging<MerchantOpVO> getCouponBySearchParam(CouponOperaterSearchParam paramMap, UserInfoVo user);

    int getCountByParamMap(CouponOperaterSearchParam paramMap, UserInfoVo user);

    /**
     * 查找有微信appid merchantMid 为空的数据
     * @return
     */
    List<CouponWechat> findWechatCoupons();

    CouponWechat findByMerchantId(String couponId, String merchantId);

    /**
     * 更新 couponWechat
     * @param couponWechat
     * @return
     */
    int updateCouponWechatById(CouponWechat couponWechat);

    /**
     * 根据卡券id 获取卡券关联的商场id
     * @param id
     * @return
     */
    List<String> findByCouponId(String id);

}
 
