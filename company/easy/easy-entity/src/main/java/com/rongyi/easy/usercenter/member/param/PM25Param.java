package com.rongyi.easy.usercenter.member.param;

import java.io.Serializable;
/**
 * 
 * @ClassName     PM25Param.java 
 * @Description   TODO PM2.5Param
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @author        huweijie 
 * @version       V1.0   
 * @Date          2017年8月24日 下午8:17:20
 */
@SuppressWarnings("serial")
public class PM25Param implements Serializable{
	
	/**
	 * http://www.pm25.in 区号
	 */
	private String areaCode;
	
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	
	@Override
	public String toString() {
		return "PM25Param [areaCode=" + areaCode + "]";
	}
	
	
	

}
