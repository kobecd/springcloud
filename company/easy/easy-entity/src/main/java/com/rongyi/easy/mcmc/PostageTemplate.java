package com.rongyi.easy.mcmc;

import com.rongyi.core.constant.PostageTemplateConstants;
import com.rongyi.easy.mcmc.param.postage.PostageSaveParam;
import com.rongyi.easy.util.new1.MongoUtil;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 商品运费模板表：不能设置默认值，涉及到mogno更新数据时的判断非空
 */
@Entity(value="postage_template",noClassnameStored=true)
public class PostageTemplate implements  Serializable,Cloneable{
	private static final long serialVersionUID = -3022699601318372490L;

	@Id
	private ObjectId id;

	private String name; // 模版名称

	private Integer status = PostageTemplateConstants.Status.NORMAL; // 状态：删除[0],正常[1]

	private String merchantId; // 创建模板的商户ID

	private Integer isExemption = PostageTemplateConstants.IsExemption.YES; // 是否包邮：是[0]，否[1]。默认0

	private Integer chargeType = PostageTemplateConstants.ChargeType.WEIGHT; // 计费方式：按重量[1]

	private List<String> postageTemplateDetailIds;

	private Integer createBy; // 创建人ID

	private Date createAt; // 创建日期

	private Integer updateBy; // 操作人ID

	private Date updateAt; // 操作日期

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public Integer getIsExemption() {
		return isExemption;
	}

	public void setIsExemption(Integer isExemption) {
		this.isExemption = isExemption;
	}

	public Integer getChargeType() {
		return chargeType;
	}

	public void setChargeType(Integer chargeType) {
		this.chargeType = chargeType;
	}

	public List<String> getPostageTemplateDetailIds() {
		return postageTemplateDetailIds;
	}

	public void setPostageTemplateDetailIds(List<String> postageTemplateDetailIds) {
		this.postageTemplateDetailIds = postageTemplateDetailIds;
	}


	public Integer getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Integer getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(Integer updateBy) {
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
		return "PostageTemplate{" +
				"id=" + id +
				", name='" + name + '\'' +
				", status=" + status +
				", merchantId='" + merchantId + '\'' +
				", isExemption=" + isExemption +
				", chargeType=" + chargeType +
				", postageTemplateDetailIds=" + postageTemplateDetailIds +
				", createBy=" + createBy +
				", createAt=" + createAt +
				", updateBy=" + updateBy +
				", updateAt=" + updateAt +
				'}';
	}

	/**
	 * postageTemplateDetailIds不在此处理
	 * @param param
	 */
	public void wrapPostageTemplateByParam(PostageSaveParam param) {
		if (null == param) {
			return;
		}
		if (MongoUtil.isMongoId(param.getId())) {
			this.id = new ObjectId(param.getId());
		}
		this.name = param.getName();
		this.status = param.getStatus();
		this.isExemption = param.getIsExemption();
		this.chargeType = param.getChargeType();
		this.merchantId = param.getMerchantId();
		this.createBy = param.getCreateBy();
		this.createAt = param.getCreateAt();
		this.updateBy = param.getUpdateBy();
		this.updateAt = param.getUpdateAt();
	}

	public static void main(String[] args) {
		PostageTemplate commodityPostageTemplate = new PostageTemplate();
		List<PostageTemplateDetail> detailList = new ArrayList<>();
		PostageTemplateDetail detail = new PostageTemplateDetail();
		detailList.add(detail);
	}
}
