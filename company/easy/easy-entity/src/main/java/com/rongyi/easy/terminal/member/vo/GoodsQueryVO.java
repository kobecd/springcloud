package com.rongyi.easy.terminal.member.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @ClassName     GoodsQueryVO.java 
 * @Description   TODO 商品查询结果VO
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @author        huweijie 
 * @version       V1.0   
 * @Date          2017年8月26日 下午5:21:32
 */
@SuppressWarnings("serial")
public class GoodsQueryVO implements Serializable{

	private List<GoodsDetailVO> list;
	
	public List<GoodsDetailVO> getList() {
		return list;
	}

	public void setList(List<GoodsDetailVO> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "GoodsQueryVO [list=" + list + "]";
	}
	
	
	
}
