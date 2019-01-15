package com.rongyi.easy.terminal.member.param;

import java.io.Serializable;
/**
 * 
 * @ClassName     GoodsDetailQueryParam.java 
 * @Description   TODO 商品详情查询PARAM
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @author        huweijie 
 * @version       V1.0   
 * @Date          2017年8月26日 下午5:19:07
 */
@SuppressWarnings("serial")
public class GoodsDetailQueryParam implements Serializable{
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "GoodsDetailQueryParam [id=" + id + "]";
	}
	
	
}
