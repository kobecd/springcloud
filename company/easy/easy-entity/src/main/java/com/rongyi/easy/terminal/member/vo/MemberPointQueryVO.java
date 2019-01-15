package com.rongyi.easy.terminal.member.vo;

import java.io.Serializable;

/**
 * 
 * @ClassName     MemberPointQueryVO.java 
 * @Description   TODO 会员积分查询结果
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @author        huweijie 
 * @version       V1.0   
 * @Date          2017年8月24日 下午5:34:52
 */
@SuppressWarnings("serial")
public class MemberPointQueryVO implements Serializable{
	
	private Integer point;
	private Integer  hisPoint;
	
	
	public Integer getPoint() {
		return point;
	}
	public void setPoint(Integer point) {
		this.point = point;
	}
	public Integer getHisPoint() {
		return hisPoint;
	}
	public void setHisPoint(Integer hisPoint) {
		this.hisPoint = hisPoint;
	}
	@Override
	public String toString() {
		return "MemberPointQueryVO [point=" + point + ", hisPoint=" + hisPoint + "]";
	}
	

	
}
