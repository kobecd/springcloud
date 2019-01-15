package com.rongyi.easy.usercenter.member.param;

import java.io.Serializable;
/**
 * 
 * @ClassName     WeatherReportParam.java 
 * @Description   TODO 天气预报Param
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @author        huweijie 
 * @version       V1.0   
 * @Date          2017年8月24日 下午8:17:20
 */
@SuppressWarnings("serial")
public class WeatherReportParam implements Serializable{
	/**
	 * www.weather.com.cn 城市的代码
	 */
	private String cityNumber;
	
	public String getCityNumber() {
		return cityNumber;
	}
	public void setCityNumber(String cityNumber) {
		this.cityNumber = cityNumber;
	}
	@Override
	public String toString() {
		return "WeatherReportParam [cityNumber=" + cityNumber + "]";
	}
	
	
	

}
