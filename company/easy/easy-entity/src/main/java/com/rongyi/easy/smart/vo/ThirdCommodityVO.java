package com.rongyi.easy.smart.vo;

import java.io.Serializable;

public class ThirdCommodityVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String category;//分类
	private String content;//商品详情
	private Long createTime;//抓取时间
	private Integer freight;//运费
	private String goodsId;//商品id
	private Integer id;//
	private String mallId;//商城id
	private String name;//商品名称
	private Integer newPrice;//现价 单位分
	private Integer oldPrice;//原价 单位分
	private Integer out;//已售
	private String pic;//商品图片
	private Integer status;//状态:0下架 1上架
	private String stock;//库存
	private String updateTime;//更新时间
	private String url;//商品链接

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Integer getFreight() {
		return freight;
	}

	public void setFreight(Integer freight) {
		this.freight = freight;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getNewPrice() {
		return newPrice;
	}

	public void setNewPrice(Integer newPrice) {
		this.newPrice = newPrice;
	}

	public Integer getOldPrice() {
		return oldPrice;
	}

	public void setOldPrice(Integer oldPrice) {
		this.oldPrice = oldPrice;
	}

	public Integer getOut() {
		return out;
	}

	public void setOut(Integer out) {
		this.out = out;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "ThirdCommodityVO{" +
				"category='" + category + '\'' +
				", content='" + content + '\'' +
				", createTime=" + createTime +
				", freight=" + freight +
				", goodsId='" + goodsId + '\'' +
				", id=" + id +
				", mallId='" + mallId + '\'' +
				", name='" + name + '\'' +
				", newPrice=" + newPrice +
				", oldPrice=" + oldPrice +
				", out=" + out +
				", pic='" + pic + '\'' +
				", status=" + status +
				", stock='" + stock + '\'' +
				", updateTime='" + updateTime + '\'' +
				", url='" + url + '\'' +
				'}';
	}
}
