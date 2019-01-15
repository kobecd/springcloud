package com.rongyi.easy.terminal.member.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @ClassName     GoodsDetailVO.java 
 * @Description   TODO 商品详情VO
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @author        huweijie 
 * @version       V1.0   
 * @Date          2017年8月26日 下午5:17:29
 */
@SuppressWarnings("serial")
public class GoodsDetailVO implements Serializable{
	private String mallId;
	private String name;
	private String desc;
	/**
	 * 限购数量
	 */
	private String purchaseLimit;
	private String id;
	/**
	 * 礼品类型1商品2卡券3停车券
	 */
	private Integer type;
	/**
	 * 兑换类型(1.兑换,2换购,2种都有,用英文逗号隔开)
	 */
	private String exchangeType;
	/**
	 * 积分设置类型 (1-统一设置,2-分别设置)
	 */
	private Integer pointType;
	/**
	 * 换购类型1，同一设置，2按照等级设置
	 */
	private Integer buyType;
	/**
	 * 配送方式（1.自提,2快递,2种都有,用逗号隔开）
	 */
	private String deliveryType;
	/**
	 * 快递方式
	 */
	private Integer expressType;
	private String period;
	private String onAt;
	private String offAt;
	private Integer cost;
	private Integer status;
	private Integer stock;
	/**
	 * 购买数量
	 */
	private Integer bought;
	private Integer freight;
	private String platform;
	private Integer pointVip1;
	private Integer levelVip1;
	private Integer pointVip2;
	private Integer levelVip2;
	private Integer pointVip3;
	private Integer levelVip3;
	private Integer pointVip4;
	private Integer levelVip4;
	/**
	 * 非会员状态默认积分数
	 */
	private Integer defaultPoint;
	private String pic;
	private List<String> pics;
	private Boolean isHotGoods;
	private String goodsDetailWechatUrl;
	private String giftNo;//礼品编码
	
	
	public String getGiftNo() {
		return giftNo;
	}
	public void setGiftNo(String giftNo) {
		this.giftNo = giftNo;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getPurchaseLimit() {
		return purchaseLimit;
	}
	public void setPurchaseLimit(String purchaseLimit) {
		this.purchaseLimit = purchaseLimit;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getExchangeType() {
		return exchangeType;
	}
	public void setExchangeType(String exchangeType) {
		this.exchangeType = exchangeType;
	}
	public Integer getPointType() {
		return pointType;
	}
	public void setPointType(Integer pointType) {
		this.pointType = pointType;
	}
	public Integer getBuyType() {
		return buyType;
	}
	public void setBuyType(Integer buyType) {
		this.buyType = buyType;
	}
	public String getDeliveryType() {
		return deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}
	public Integer getExpressType() {
		return expressType;
	}
	public void setExpressType(Integer expressType) {
		this.expressType = expressType;
	}
	
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getOnAt() {
		return onAt;
	}
	public void setOnAt(String onAt) {
		this.onAt = onAt;
	}
	public String getOffAt() {
		return offAt;
	}
	public void setOffAt(String offAt) {
		this.offAt = offAt;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getBought() {
		return bought;
	}
	public void setBought(Integer bought) {
		this.bought = bought;
	}
	public Integer getFreight() {
		return freight;
	}
	public void setFreight(Integer freight) {
		this.freight = freight;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public Integer getPointVip1() {
		return pointVip1;
	}
	public void setPointVip1(Integer pointVip1) {
		this.pointVip1 = pointVip1;
	}
	public Integer getLevelVip1() {
		return levelVip1;
	}
	public void setLevelVip1(Integer levelVip1) {
		this.levelVip1 = levelVip1;
	}
	public Integer getPointVip2() {
		return pointVip2;
	}
	public void setPointVip2(Integer pointVip2) {
		this.pointVip2 = pointVip2;
	}
	public Integer getLevelVip2() {
		return levelVip2;
	}
	public void setLevelVip2(Integer levelVip2) {
		this.levelVip2 = levelVip2;
	}
	public Integer getPointVip3() {
		return pointVip3;
	}
	public void setPointVip3(Integer pointVip3) {
		this.pointVip3 = pointVip3;
	}
	public Integer getLevelVip3() {
		return levelVip3;
	}
	public void setLevelVip3(Integer levelVip3) {
		this.levelVip3 = levelVip3;
	}
	public Integer getPointVip4() {
		return pointVip4;
	}
	public void setPointVip4(Integer pointVip4) {
		this.pointVip4 = pointVip4;
	}
	public Integer getLevelVip4() {
		return levelVip4;
	}
	public void setLevelVip4(Integer levelVip4) {
		this.levelVip4 = levelVip4;
	}
	public Integer getDefaultPoint() {
		return defaultPoint;
	}
	public void setDefaultPoint(Integer defaultPoint) {
		this.defaultPoint = defaultPoint;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public List<String> getPics() {
		return pics;
	}
	public void setPics(List<String> pics) {
		this.pics = pics;
	}
	public Boolean getIsHotGoods() {
		return isHotGoods;
	}
	public void setIsHotGoods(Boolean isHotGoods) {
		this.isHotGoods = isHotGoods;
	}
	public String getGoodsDetailWechatUrl() {
		return goodsDetailWechatUrl;
	}
	public void setGoodsDetailWechatUrl(String goodsDetailWechatUrl) {
		this.goodsDetailWechatUrl = goodsDetailWechatUrl;
	}
	
	@Override
	public String toString() {
		return "GoodsDetailVO [mallId=" + mallId + ", name=" + name + ", desc=" + desc + ", purchaseLimit="
				+ purchaseLimit + ", id=" + id + ", type=" + type + ", exchangeType=" + exchangeType + ", pointType="
				+ pointType + ", buyType=" + buyType + ", deliveryType=" + deliveryType + ", expressType=" + expressType
				+ ", period=" + period + ", onAt=" + onAt + ", offAt=" + offAt + ", cost=" + cost + ", status=" + status
				+ ", stock=" + stock + ", bought=" + bought + ", freight=" + freight + ", platform=" + platform
				+ ", pointVip1=" + pointVip1 + ", levelVip1=" + levelVip1 + ", pointVip2=" + pointVip2 + ", levelVip2="
				+ levelVip2 + ", pointVip3=" + pointVip3 + ", levelVip3=" + levelVip3 + ", pointVip4=" + pointVip4
				+ ", levelVip4=" + levelVip4 + ", defaultPoint=" + defaultPoint + ", pic=" + pic + ", pics=" + pics
				+ ", isHotGoods=" + isHotGoods + ", goodsDetailWechatUrl=" + goodsDetailWechatUrl + "]";
	}
	
	
	
	
	
}
