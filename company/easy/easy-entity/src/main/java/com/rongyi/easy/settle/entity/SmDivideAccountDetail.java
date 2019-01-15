package com.rongyi.easy.settle.entity;

import java.util.Date;

public class SmDivideAccountDetail {
    private Integer id;

    private String mallMid;

    private String shopMid;

    private Date billDate;

    private String billBatchNo;

    private Integer divideAccountId;

    private Integer orderNum;

    private Integer unitNum;

    private Integer payAmount;

    private Integer rebateAmount;

    private Integer mallScore;

    private Integer settleAmount;

    private String createBy;

    private String updateBy;

    private Date createAt;

    private Date updateAt;

    private Byte isDelete;

    private Integer promoteCommission;//分销商佣金
    private Integer totalCommission;//总分销佣金
    private Integer commissionSettle;//分销佣金结算，1:总部扣除剩余佣金:、2:总部不扣除剩余佣金

    private Integer totalOrderAmount;//订单总金额

    private Integer reductionFeeInt;//满减活动扣减金额

    private Integer refundFeeInt;//退款金额 包含邮费

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMallMid() {
		return mallMid;
	}

	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
	}

	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}

	public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getBillBatchNo() {
        return billBatchNo;
    }

    public void setBillBatchNo(String billBatchNo) {
        this.billBatchNo = billBatchNo;
    }

    public Integer getDivideAccountId() {
        return divideAccountId;
    }

    public void setDivideAccountId(Integer divideAccountId) {
        this.divideAccountId = divideAccountId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getUnitNum() {
        return unitNum;
    }

    public void setUnitNum(Integer unitNum) {
        this.unitNum = unitNum;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getRebateAmount() {
        return rebateAmount;
    }

    public void setRebateAmount(Integer rebateAmount) {
        this.rebateAmount = rebateAmount;
    }

    public Integer getMallScore() {
        return mallScore;
    }

    public void setMallScore(Integer mallScore) {
        this.mallScore = mallScore;
    }

    public Integer getSettleAmount() {
        return settleAmount;
    }

    public void setSettleAmount(Integer settleAmount) {
        this.settleAmount = settleAmount;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getPromoteCommission() {
        return promoteCommission;
    }

    public void setPromoteCommission(Integer promoteCommission) {
        this.promoteCommission = promoteCommission;
    }

    public Integer getTotalCommission() {
        return totalCommission;
    }

    public void setTotalCommission(Integer totalCommission) {
        this.totalCommission = totalCommission;
    }

    public Integer getCommissionSettle() {
        return commissionSettle;
    }

    public void setCommissionSettle(Integer commissionSettle) {
        this.commissionSettle = commissionSettle;
    }

    public Integer getTotalOrderAmount() {
        return totalOrderAmount;
    }

    public void setTotalOrderAmount(Integer totalOrderAmount) {
        this.totalOrderAmount = totalOrderAmount;
    }

    public Integer getReductionFeeInt() {
        return reductionFeeInt;
    }

    public void setReductionFeeInt(Integer reductionFeeInt) {
        this.reductionFeeInt = reductionFeeInt;
    }

    public Integer getRefundFeeInt() {
        return refundFeeInt;
    }

    public void setRefundFeeInt(Integer refundFeeInt) {
        this.refundFeeInt = refundFeeInt;
    }
}