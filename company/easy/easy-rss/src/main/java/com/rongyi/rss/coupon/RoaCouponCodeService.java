package com.rongyi.rss.coupon;

import com.rongyi.core.common.PagingVO;
import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.coupon.entity.CouponCode;
import com.rongyi.easy.coupon.entity.SimpleCouponEntity;
import com.rongyi.easy.coupon.entity.HgdzCouponQueryEntity;
import com.rongyi.easy.coupon.vo.CouponHistoryVO;

import java.util.List;
import java.util.Map;

public interface RoaCouponCodeService {

    /**
     * 根据券码查找券码信息
     *
     * @param code
     */
    CouponCode findCouponCodeByCode(String code);

    PagingVO<CouponHistoryVO> searchCouponCodeListAndCount(Map paramMap);

    /**
     * 通过couponId获取对应的券码List
     */
    List<CouponCode> getCouponCodeListByCouponId(Map paramsMap);

    /**
     * 更新券码表，成功返回true，失败返回false
     */
    int updateCouponCodeById(CouponCode couponCode);

    /**
     * 通过id改变券码当前状态
     *
     * @param id
     * @param status
     * @return
     */
     Boolean changeStatusById(Integer id, Integer status);

    /**
     * 根据券码Id查询
     *
     * @param couponCodeId
     * @return
     */
     CouponCode findOne(Long couponCodeId);

    /**
     * 根据卡券码更新状态
     *
     * @param couponCode
     * @param status
     * @return
     */
    boolean changeStatusByCode(String couponCode, Integer status);


    /**
     * 是否有优惠券
     *
     * @param couponId
     * @return
     */
    boolean isHasCouponCode(String couponId);

    /**
     * @Description（券码） 把未领取已经过期的券码状态改为过期状态（定时任务）
     */
//    public void updateAllCouponCodeValid();


    /**
     * 获取卡券券码
     *
     * @param couponId 卡券Id
     * @param quantity 数量
     * @return
     */
    String[] acquireCode(String couponId, int quantity);

    /**
     * 恢复卡券券码
     *
     * @param couponId 卡券Id
     * @param quantity 数量
     * @return
     */
    boolean recoverCode(String couponId, int quantity);

    boolean hasEnoughCode(String couponId);


    /**
     * 批量插入第三方券码
     *
     * @param list
     * @return
     */
     int batchInsert(List<CouponCode> list);

    /**
     * 批量插入生成的券码
     *
     * @param list
     * @return
     */
     int batchGenerateInsert(List<CouponCode> list);

    /**
     * 统计某个卡券的券码
     *
     * @param couponId
     * @return
     */
     int countByCouponId(String couponId);

     List<CouponCode> getCodesByCouponId(String couponId);


    /**
     * 更改券码状态 （推送用）
     *
     * @param couponCode
     * @param status
     * @return
     */
     int updateStatusByCouponCode(String couponCode, Integer status);

    /**
     * 通过版本号获取券码数量
     *
     * @param couponId
     * @param version
     * @return
     */
     int countByVersion(String couponId, String version);

    /**
     * 通过版本号获取券码列表
     *
     * @param couponId
     * @param version
     * @return
     */
    List<String> getCodeByVersion(String couponId, String version);

     List<CouponCode> getCouponCodesByCouponId(String couponId);

    /**
     * 根据couponId 生成券码
     *
     * @param couponId
     * @param count
     */
     void generateCouponCode(String couponId, int count);

    /**
     * 根据券码获取该券的价格
     *
     * @param couponCode
     * @return
     */
     Integer getCurrentPriceFromCode(String couponCode);

    /**
     * 获取卡券
     *
     * @param orderId
     * @param couponId
     * @param count
     * @return
     */
     List<SimpleCouponEntity> getHgdzCodeSn(String orderId, String couponId, int count) throws RYServiceException;

    /**
     * 查询卡券状态
     *
     * @param codeSn
     * @return
     */
     HgdzCouponQueryEntity queryHgdzCodeSn(String codeSn) throws RYServiceException;

    /**
     * 家得利处理冲正返回未使用的券码
     * @param couponId
     * @return
     */
     String getJiadeliCouponCode(String couponId,String couponCode) throws RYServiceException;

    /**
     * 取出所有卡券券码，并更新卡券状态为1
     * @param couponId
     * @return
     */
     List<String> getCodesAndUpdateStatus(String couponId);
}
