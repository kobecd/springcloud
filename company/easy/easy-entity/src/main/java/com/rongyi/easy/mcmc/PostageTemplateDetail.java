package com.rongyi.easy.mcmc;

import com.rongyi.core.constant.PostageTemplateConstants;
import com.rongyi.easy.mcmc.param.postage.PostageDetailSaveParam;
import com.rongyi.easy.util.new1.MongoUtil;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 商品运费模板详情表：不能设置默认值，涉及到mogno更新数据时的判断非空
 */
@Entity(value="postage_template_detail",noClassnameStored=true)
public class PostageTemplateDetail implements  Serializable,Cloneable{
	private static final long serialVersionUID = -3022699601318372490L;

	@Id
	private ObjectId id;

	private Integer logisticType = PostageTemplateConstants.LogisticType.EXPRESS; // 物流方式：快递[1]

	private Double basicWeight = 0d; // 首重

	private Double basicPrice = 0d; // 首重的金额

	private Double nextWeight = 0d; // 续重

	private Double nextPrice = 0d; // 续重的金额

	private Integer isDefault = PostageTemplateConstants.IsDefault.YES; // 是否是默认配置的数据：是[0]、否[1]。默认0

	private List<String> areaIds; // 可配送地区MID集合

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
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
		return "PostageTemplate{" +
				"id=" + id +
				", logisticType=" + logisticType +
				", basicWeight=" + basicWeight +
				", basicPrice=" + basicPrice +
				", nextWeight=" + nextWeight +
				", nextPrice=" + nextPrice +
				", isDefault=" + isDefault +
				", areaIds=" + areaIds +
				'}';
	}

	public void wrapByDetailSaveParam(PostageDetailSaveParam param) {
		if (MongoUtil.isMongoId(param.getId())) {
			this.id = new ObjectId(param.getId());
		}
		this.logisticType = param.getLogisticType();
		this.basicWeight = param.getBasicWeight();
		this.basicPrice = param.getBasicPrice();
		this.nextWeight = param.getNextWeight();
		this.nextPrice = param.getNextPrice();
		this.isDefault = param.getIsDefault();
		this.areaIds = param.getAreaIds();
	}
}
