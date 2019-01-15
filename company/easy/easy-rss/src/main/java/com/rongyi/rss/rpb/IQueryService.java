package com.rongyi.rss.rpb;

import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.dto.PaymentQueryDto;
import com.rongyi.easy.rpb.param.PaymentOrderParam;
import com.rongyi.easy.rpb.vo.v6.PaymentEntityVo;
import com.rongyi.easy.rpb.vo.v6.PaymentStatisticEntityVo;

import java.util.List;
import java.util.Map;

/**
 * 查询接口
 * conan
 * 2017/2/27 13:46
 **/
public interface IQueryService {

    /**
     * 根据支付流水号及类型查询订单详情
     * @param orderNoList 支付流水号集合
     * @param tradeType 0支付  1退款
     * @return 订单详情列表
     */
    List<PaymentEntity> batchQueryByOrderNos(List<String> orderNoList,Integer tradeType);

    /**
     * 查询订单支付数据
     * @param orderNo 订单号
     * @param tradeType 交易类型
     * @param status 状态
     * @param payChannel 支付类型
     * @return PaymentEntity
     */
    PaymentEntityVo queryByOrderNoAndTradeType(String orderNo, Integer tradeType, Integer status, Integer payChannel);

    /**
     * 查询订单列表数据
     * @param param
     * @return
     */
    List<PaymentEntityVo> queryListByParam(PaymentOrderParam param);
    /**
     * 查询订单总记录数
     * @param paymentParam
     * @return
     */
    Integer queryCountByParam(PaymentOrderParam paymentParam);

    /**
     * 根据支付单号查询paymentOrder
     * @param payNo
     * @return
     */
    PaymentEntity queryByPayNo(String payNo);

    /**
     * 查询退款需要信息
     */
    public PaymentEntityVo queryByRefundParam(String orderNo, String payNo,String tradeNo,String weBankOrderNo,
                                              Integer tradeType, Integer status, Integer payChannel);

    List<PaymentEntityVo> queryListByMap(Map<String, Object> queryMap);

    List<PaymentEntity> queryListByOrderNoAndTradeType(PaymentQueryDto paymentOrderDto);

    List<PaymentEntityVo> batchQueryByCorrespondOrderNos(List<String> ryPayNoList, Integer type, Integer billSource, Integer status);

    PaymentEntityVo queryDetailByQueryDto(PaymentQueryDto queryDto);

    /**
     * 根据付款的单号 查询对应对款的列表信息
     * @param orderNo
     * @param payNo
     * @param tradeNo
     * @param webankOrderNo
     * @return
     */
    List<PaymentEntity> queryRefundListByPayOrderNo(String orderNo, String payNo, String tradeNo, String webankOrderNo);

    /**
     * 生成订单exl数据
     */
    void createPayment();

    /**
     * 查询商家订单统计信息
     * @param paymentParam
     * @return
     */
    PaymentStatisticEntityVo queryStatistic(PaymentOrderParam paymentParam);

    /**
     * 查询商家订单详情
     */

    PaymentEntityVo queryBsOrderDetail(String payNo);

    void noPayOrderExecute();
}
