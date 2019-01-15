package com.rongyi.easy.mcmc.param.postage;

import com.rongyi.easy.roa.entity.AreaEntity;

import java.io.Serializable;
import java.util.List;

/**
 * 商品运费模板详情VO
 */
public class PostageDetailSaveParam implements Serializable {
	private static final long serialVersionUID = -3022699601318372490L;

	private String id;

	private Integer logisticType; // 物流方式：快递[1]

	private Double basicWeight; // 首重

	private Double basicPrice; // 首重的金额

	private Double nextWeight; // 续重

	private Double nextPrice; // 续重的金额

	private Integer isDefault = 0; // 是否是默认配置的数据：是[0]、否[1]。默认0

	private List<String> areaIds; // 可配送地区MID集合

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getLogisticType() {
		return logisticType;
	}

	public void setLogisticType(Integer logisticType) {
		this.logisticType = logisticType;
	}

	public Double getBasicWeight() {
		return basicWeight;
	}

	public void setBasicWeight(Double basicWeight) {
		this.basicWeight = basicWeight;
	}

	public Double getBasicPrice() {
		return basicPrice;
	}

	public void setBasicPrice(Double basicPrice) {
		this.basicPrice = basicPrice;
	}

	public Double getNextWeight() {
		return nextWeight;
	}

	public void setNextWeight(Double nextWeight) {
		this.nextWeight = nextWeight;
	}

	public Double getNextPrice() {
		return nextPrice;
	}

	public void setNextPrice(Double nextPrice) {
		this.nextPrice = nextPrice;
	}

	public Integer getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}

	public List<String> getAreaIds() {
		return areaIds;
	}

	public void setAreaIds(List<String> areaIds) {
		this.areaIds = areaIds;
	}

	@Override
	public String toString() {
		return "PostageTemplateDetailVO{" +
				"id='" + id + '\'' +
				", logisticType=" + logisticType +
				", basicWeight=" + basicWeight +
				", basicPrice=" + basicPrice +
				", nextWeight=" + nextWeight +
				", nextPrice=" + nextPrice +
				", isDefault=" + isDefault +
				", areaIds=" + areaIds +
				'}';
	}
}
