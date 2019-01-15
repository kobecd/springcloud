package com.rongyi.rss.coupon.merchant;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.entity.SzcUploadBatch;
import com.rongyi.easy.coupon.entity.SzcUploadCount;
import com.rongyi.easy.coupon.entity.SzcUploadDetail;

import java.util.List;

/**
 * Created by yandong on 2017/7/24.
 */
public interface SzcCouponUploadService {

    SzcUploadBatch createSzcUploadBatch(String couponId);

    Integer addSzcUploadDetail(Integer batchId, List<String> phoneList);

    List<SzcUploadCount> querySzcUploadCount(String couponId);

    List<SzcUploadDetail> querySzcUploaddetailList(String couponId, List<Integer> pushStates, Integer batchId, Integer smsState, Integer pageNo, Integer pageSize);

    Integer updatePushState(Integer pushState, List<Integer> detailIdList);

    Integer loadUploadDetail(String couponId, List<String> phoneList);

    List<SzcUploadBatch> queryBatch(String couponId, Integer pageNo, Integer pageSize);

    int countSzcUploadBatch(String couponId);

    ResponseResult sendSms(String couponId);

    void pushCoupon(Integer batchId, Coupon coupon);
}
