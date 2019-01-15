package com.rongyi.rss.rpb;

import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.vo.v6.PaymentEntityVo;

import java.util.Date;
import java.util.List;

public interface PaymentOrderService {

	/**
	 * @Description 批量更新支付流水状态 
	 * @param payNoList
	 * @param status
	 */
	Integer updateStatusList(List<String> payNoList,Integer status);
	
	/**
	 * @Description 
	 * @param date
	 * @return
	 */
	List<PaymentEntity> findList(Date date);

	PaymentEntityVo getPaymentEntityVoById(Integer id);

	PaymentEntityVo  getPaymentEntityVo(String orderNo, Integer tradeType);

}
