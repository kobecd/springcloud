package com.rongyi.rss.tradecenter;

import com.rongyi.easy.malllife.vo.CouponRefundDetailVO;
import com.rongyi.easy.tradecenter.TradeUserCode;
import com.rongyi.easy.tradecenter.vo.CouponOrderVO;

import java.util.List;
import java.util.Map;

/**
 * Created by xgq on 2015/8/19.
 */
public interface ITradeUserCodeService {

    TradeUserCode getTradeUserCode(String code);

    void updateTradeUserCode(TradeUserCode tradeUserCode);

    TradeUserCode findTradeUserCouponById(Integer id);

    int buyedCouponCount(String couponId, String userId);

    List<TradeUserCode> findTradeUserCodeList(Integer orderId, String couponId);

    void updateTradeUserCodeStatusByIds(List<Integer> tradeUserCodeIds, int status,String paymentId);

    Map<String, Object> findTradeUserCodeForStatistics(Map<String, Object> paramsMap);

    Map<String, Object> findTradeUserCodeForStatisticsCounts(Map<String, Object> paramsMap);

    int dailyBuyCount(String couponId, String userId);

    /**
     * 条件查询用户券码数量
     * @param paramsMap
     * @return
     */
    int getUserCodeNumByMap(Map<String, Object> paramsMap);

    int countByParamsMap(Map<String, Object> paramsMap);

    CouponRefundDetailVO getRefundDetail(Integer refundId);

    List<CouponOrderVO> getCouponOrderListForWX(String buyerId,String openId,String userPhone,int pageSize,int currentPage,String type);

    /**
     * 作废
     * @param couponId
     * @return
     */
    int obsoleteByCouponId(String couponId);

    int obsoleteByOrderId(Integer orderId);

    int updateCodeByOrderId(Integer orderId, String code);

    List<TradeUserCode> findByActivityName(String activityName, Integer status,Integer pageSize,Integer start);

    int countByActivityName(String activityName, Integer status);

    List<TradeUserCode> findByUserIdAndCouponId(String userId, String CouponId);

    /**
     * 
     * Description: 核销
     *
     * @param couponId
     * @param couponCodes
     * @author lianglaibin
     * @date 2018年5月24日
     */
    void confirmUsed(String couponId, String... couponCodes);
    
    /**
     * 
     * Description: 冲正
     *
     * @param couponId
     * @param couponCodes
     * @author lianglaibin
     * @date 2018年5月24日
     */
    void cancelUsed(String couponId, String... couponCodes);
}
