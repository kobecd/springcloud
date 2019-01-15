package com.rongyi.easy.terminal.member.param;

import java.io.Serializable;
/**
 * 
 * @ClassName     MemberPointExchangeParam.java 
 * @Description   TODO 会员积分兑换param
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @author        huweijie 
 * @version       V1.0   
 * @Date          2017年8月24日 下午5:31:05
 */
@SuppressWarnings("serial")
public class MemberPointExchangeParam implements Serializable {
	
	private String mallId;
	private Integer platform;
	private Long uid;
	private Integer point;
	/**
	 * op_type: 1-签到，2-活动，3-积分兑换，4-积分抵扣，5-积分录入，6-自助积分，
	 * 7-超时未支付订单积分返回，8-消费送积分，9-完善信息，10-流量包兑换，11-下单失败，
	 * 12-充值，13-抵扣，14-充值赠送，15-退款，16-注册送积分，17-预约。
	 * */
	private String opType;
	private String detail;
	private String phone;
	private String extra;
	
	private Integer type;
	private String code;
	private String goodsId;
	/**
	 * 礼品类型1商品2卡券3停车券
	 */
	private Integer goodsType;
	/**
	 * 兑换数量
	 */
	private Integer exchangeNumber;
	
	/**
	 * 兑换方式 1手机号 2小票 3微信
	 */
	private Integer exchangeType;
	
	public Integer getExchangeType() {
		return exchangeType;
	}
	public void setExchangeType(Integer exchangeType) {
		this.exchangeType = exchangeType;
	}
	public Integer getExchangeNumber() {
		return exchangeNumber;
	}
	public void setExchangeNumber(Integer exchangeNumber) {
		this.exchangeNumber = exchangeNumber;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public Integer getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(Integer goodsType) {
		this.goodsType = goodsType;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
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
	@Override
	public String toString() {
		return "MemberPointExchangeParam [mallId=" + mallId + ", platform=" + platform + ", uid=" + uid + ", point="
				+ point + ", opType=" + opType + ", detail=" + detail + ", phone=" + phone + ", extra=" + extra
				+ ", type=" + type + ", code=" + code + ", goodsId=" + goodsId + ", goodsType=" + goodsType
				+ ", exchangeNumber=" + exchangeNumber + ", exchangeType=" + exchangeType + "]";
	}

	

}
