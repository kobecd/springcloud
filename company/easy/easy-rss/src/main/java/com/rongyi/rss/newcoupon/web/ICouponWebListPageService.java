package com.rongyi.rss.newcoupon.web;

import com.rongyi.core.framework.exception.CouponException;
import com.rongyi.easy.newcoupon.dto.OperationParamDTO;
import com.rongyi.easy.newcoupon.dto.QueryListParamDTO;
import com.rongyi.easy.newcoupon.dto.CouponListWebDTO;
import com.rongyi.easy.newcoupon.vo.OperateLogVO;

import java.util.List;

/**
 * @author: yb
 * Description: 后台列表页面服务
 * DATE: 2017/10/31 15:31
 * Package:com.rongyi.coupon.service
 * Project:easy-coupon
 */
public interface ICouponWebListPageService {
    /**
     * 后台列表接口
     *
     * @param queryListParamDTO
     * @return
     */
    List<CouponListWebDTO> listWeb(QueryListParamDTO queryListParamDTO);


    /**
     * 后台列表统计接口
     *
     * @param queryListParamDTO
     * @return
     */
    int countWeb(QueryListParamDTO queryListParamDTO);


    /**
     * 发布
     *
     * @param couponId
     * @return
     */
    Boolean publish(Integer couponId, Integer userId) throws CouponException;

    /**
     * 批量终止
     *
     * @param checkParamDTO
     * @return
     */
    Boolean batchStop(OperationParamDTO checkParamDTO) throws CouponException;

    /**
     * 审核
     *
     * @param checkParamDTO
     * @return
     */
    Boolean check(OperationParamDTO checkParamDTO) throws CouponException;

    /**
     * 删除
     *
     * @param couponId
     * @return
     */
    Boolean delete(Integer couponId, Integer userId) throws CouponException;

    /**
     * 自建追加库存追加库存
     *
     * @param operationParamDTO
     * @return
     */
    Boolean addStock(OperationParamDTO operationParamDTO) throws CouponException;

    /**
     * 查看操作日志
     * @param operationParamDTO
     * @return
     */
    List<OperateLogVO> listOperateLogs(OperationParamDTO operationParamDTO);
}
