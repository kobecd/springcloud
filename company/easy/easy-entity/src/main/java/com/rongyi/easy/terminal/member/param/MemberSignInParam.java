package com.rongyi.easy.terminal.member.param;

import java.io.Serializable;
/**
 * 
 * @ClassName     MemberSiginInParam.java 
 * @Description   TODO
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @author        huweijie 
 * @version       V1.0   
 * @Date          2017年8月26日 上午10:02:49
 */
@SuppressWarnings("serial")
public class MemberSignInParam implements Serializable{
	private String mallId;
	private Integer platform;
	private Long uid;
	private Integer point;
	private String detail;
	private String phone;
	private String extra;
	/**
	 * op_type: 1-签到，2-活动，3-积分兑换，4-积分抵扣，5-积分录入，6-自助积分，
	 * 7-超时未支付订单积分返回，8-消费送积分，9-完善信息，10-流量包兑换，11-下单失败，
	 * 12-充值，13-抵扣，14-充值赠送，15-退款，16-注册送积分，17-预约。
	 * */
	private String opType;
	
	
	
	public Integer getPlatform() {
		return platform;
	}
	public void setPlatform(Integer platform) {
		this.platform = platform;
	}
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public Integer getPoint() {
		return point;
	}
	public void setPoint(Integer point) {
		this.point = point;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getOpType() {
		return opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}
	
	
	
	
}
