package com.rongyi.easy.mcmc.vo.commodity.new1.postage;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.core.constant.PostageTemplateConstants;
import com.rongyi.easy.roa.entity.AreaEntity;
import net.sf.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 商品运费模板VO
 */
public class PostageTemplateVO implements Serializable {
	private static final long serialVersionUID = -3022699601318372490L;

	private String id;

	private String name; // 模版名称

	private Integer status = PostageTemplateConstants.Status.NORMAL; // 状态：删除[0],正常[1]

	private String merchantId; // 创建模板的商户ID

	private Integer isExemption = PostageTemplateConstants.IsExemption.YES; // 是否包邮：是[0]，否[1]。默认0

	private Integer chargeType = PostageTemplateConstants.ChargeType.WEIGHT; // 计费方式：按重量[1]

	private List<PostageTemplateDetailVO> postageTemplateDetailVOs; // VO用

	private Integer createBy; // 创建人ID

	private Date createAt; // 创建日期

	private Integer updateBy; // 操作人ID

	private Date updateAt; // 操作日期

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public List<PostageTemplateDetailVO> getPostageTemplateDetailVOs() {
		return postageTemplateDetailVOs;
	}

	public void setPostageTemplateDetailVOs(List<PostageTemplateDetailVO> postageTemplateDetailVOs) {
		this.postageTemplateDetailVOs = postageTemplateDetailVOs;
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
		return "PostageTemplateVO{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", status=" + status +
				", merchantId='" + merchantId + '\'' +
				", isExemption=" + isExemption +
				", chargeType=" + chargeType +
				", postageTemplateDetailVOs=" + postageTemplateDetailVOs +
				", createBy=" + createBy +
				", createAt=" + createAt +
				", updateBy=" + updateBy +
				", updateAt=" + updateAt +
				'}';
	}

	public static void main(String[] args) {
		PostageTemplateVO commodityPostageTemplate = new PostageTemplateVO();
		List<PostageTemplateDetailVO> detailList = new ArrayList<>();
		PostageTemplateDetailVO detail = new PostageTemplateDetailVO();
		List<AreaEntity> areaEntityList = new ArrayList<>();
		AreaEntity areaEntity = new AreaEntity();
		areaEntityList.add(areaEntity);
		detail.setAreas(areaEntityList);
		detailList.add(detail);
		commodityPostageTemplate.setPostageTemplateDetailVOs(detailList);

		List<PostageTemplateVO> postageTemplateVOList = new ArrayList<>();
		postageTemplateVOList.add(commodityPostageTemplate);
		System.out.println(JSONObject.fromObject(commodityPostageTemplate));
		System.out.println(JSONObject.fromObject(ResponseVO.success()));
		System.out.println(JSONObject.fromObject(ResponseVO.success(commodityPostageTemplate)));
		System.out.println(JSONObject.fromObject(ResponseVO.success(postageTemplateVOList, 1, 10, 200)));
	}
}
