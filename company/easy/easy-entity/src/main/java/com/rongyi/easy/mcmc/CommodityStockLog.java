package com.rongyi.easy.mcmc;

import com.rongyi.core.constant.Identity;
import com.rongyi.core.enumerate.mcmc.CommodityType;
import com.rongyi.easy.activitymanage.entity.GoodsInAppList;
import com.rongyi.easy.malllife.common.util.Utils;
import com.rongyi.easy.malllife.constants.Constants;
import com.rongyi.easy.mcmc.constant.CommodityConstants;
import com.rongyi.easy.mcmc.constant.CommodityDataStatus;
import com.rongyi.easy.mcmc.constant.CommodityTerminalType;
import com.rongyi.easy.mcmc.vo.CommodityVO;
import com.rongyi.easy.util.CommodityUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.*;

/**
 * 商品表 app商品对象
 */
@Entity(value="mcmc_commodity_stock_log",noClassnameStored=true)
public class CommodityStockLog implements  Serializable,Cloneable{
	private static final long serialVersionUID = -3022699601318371490L;

	@Id
	private ObjectId id;
	private String totalCommodityId; // 商品总表ID
	private String commodityId; // 商品分表ID
	private String shopMid; // 店铺MID
	private String shopName; // 店铺名称
	private String specId; // 规格ID
	private String total; // 总量
	private String stock; // 剩余库存
	private String updateBy; // 操作用户ID
	private Date updateAt; // 操作时间

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getTotalCommodityId() {
		return totalCommodityId;
	}

	public void setTotalCommodityId(String totalCommodityId) {
		this.totalCommodityId = totalCommodityId;
	}

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getSpecId() {
		return specId;
	}

	public void setSpecId(String specId) {
		this.specId = specId;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	@Override
	public String toString() {
		return "CommodityStockLog{" +
				"id=" + id +
				", totalCommodityId='" + totalCommodityId + '\'' +
				", commodityId='" + commodityId + '\'' +
				", shopMid='" + shopMid + '\'' +
				", shopName='" + shopName + '\'' +
				", specId='" + specId + '\'' +
				", total='" + total + '\'' +
				", stock='" + stock + '\'' +
				", updateBy='" + updateBy + '\'' +
				", updateAt=" + updateAt +
				'}';
	}

	public void wrapCommodityStockLogByCommodity(Commodity commodity, CommoditySpec spec) {
		this.totalCommodityId = commodity.getSystemNumber();
		this.commodityId = commodity.getId().toString();
		this.shopMid = commodity.getShopMid();
		this.shopName = commodity.getShopName();
		this.specId = spec.getId().toString();
		this.total = spec.getTotal();
		this.stock = spec.getStock();
		this.updateBy = commodity.getUpdate_by();
		this.updateAt = new Date();
	}
}
