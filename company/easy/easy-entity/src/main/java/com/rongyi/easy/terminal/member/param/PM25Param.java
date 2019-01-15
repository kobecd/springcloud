package com.rongyi.easy.terminal.member.param;

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
	 * http://www.pm25.in 区名或区号
	 */
	private String area;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "PM25Param [area=" + area + "]";
	}

}
