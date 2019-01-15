package com.rongyi.easy.terminal.member.vo;

import java.io.Serializable;
import java.util.List;
/**
 * 
 * @ClassName     MallMemberRuleConfigQueryVO.java 
 * @Description   TODO 商家会员规则配置VO
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @author        huweijie 
 * @version       V1.0   
 * @Date          2017年8月28日 下午3:04:21
 */
@SuppressWarnings("serial")
public class MallMemberRuleConfigQueryVO implements Serializable{
	
	private List<String> images;

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "MallMemberRuleConfigQueryVO [images=" + images + "]";
	}

	

	
	
}
