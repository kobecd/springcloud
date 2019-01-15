package com.rongyi.easy.terminal.member.param;

import java.io.Serializable;

/**
 * 
 * @ClassName     GoodsQueryParam.java 
 * @Description   TODO 商品查询PARAM
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @author        huweijie 
 * @version       V1.0   
 * @Date          2017年8月26日 下午5:04:02
 */
@SuppressWarnings("serial")
public class GoodsQueryParam implements Serializable{

	private String mallId;

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	@Override
	public String toString() {
		return "GoodsQueryParam [mallId=" + mallId + "]";
	}

	
	
	
}
