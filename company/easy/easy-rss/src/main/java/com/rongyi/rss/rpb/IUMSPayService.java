package com.rongyi.rss.rpb;

import com.rongyi.core.Exception.TradePayException;
import com.rongyi.easy.rpb.dto.UMSPaySignDto;
import com.rongyi.easy.rpb.vo.RyMchVo;

import java.util.Map;

/*
 * Description:  银联支付
 * Author: zhuming 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * zhuming      2018/5/17    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public interface IUMSPayService {


    /**
     *   银联公众号支付
     * @author zhuming
     * @date 2018/5/17 19:52
     * @param ryMchVo
     * @param umsPaySignVo
     * @return
     * @throws TradePayException
     */
    public Map<String, Object> getPaySign(RyMchVo ryMchVo, UMSPaySignDto umsPaySignVo) throws TradePayException;


    /**
     * 银联查询
     *
     * @author zhuming
     * @date 2018/5/19 17:23
     * @param umsPaySignDto
     * @return
     * @throws TradePayException
     */
    public  Map<String, Object> umsPayQuery(UMSPaySignDto umsPaySignDto)throws TradePayException;

    /**
     * 银联退款
     *
     * @author zhuming
     * @date 2018/5/21 13:28
     * @param umsPaySignDto
     * @return
     * @throws TradePayException
     */
    public  Map<String, Object> umsPayRefund(UMSPaySignDto umsPaySignDto)throws TradePayException;

    /**
     * 银联退款查询
     *
     * @author zhuming
     * @date 2018/5/23 16:05
     * @param umsPaySignDto
     * @return
     * @throws TradePayException
     */
    public  Map<String, Object> umsPayRefundQuery(UMSPaySignDto umsPaySignDto)throws TradePayException;

    /**
     *  银联b扫c支付
     *
     * @param ryMchVo
     * @param umsPaySignDto
     * @return
     * @throws TradePayException
     */
    public Map<String, Object> umsPunchPay(RyMchVo ryMchVo, UMSPaySignDto umsPaySignDto)throws TradePayException;

    /**
     * 银联支付撤销
     *
     * @param umsPaySignDto
     * @return
     * @throws TradePayException
     */
    public Map<String, Object> umsPayReverse(UMSPaySignDto umsPaySignDto) throws TradePayException;

}
