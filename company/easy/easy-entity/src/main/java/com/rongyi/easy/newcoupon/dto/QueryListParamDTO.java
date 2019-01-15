package com.rongyi.easy.newcoupon.dto;

import com.rongyi.core.constant.Constants;
import com.rongyi.core.util.SplitDateRangeUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yb
 * Description:
 * DATE: 2017/10/31 10:44
 * Package:com.rongyi.coupon.dal.domain.dto
 * Project:easy-coupon
 *
 */
@Getter
@Setter
@ToString
public class QueryListParamDTO extends BaseDTO  implements Serializable{
    private static final long serialVersionUID = 1084410311306149920L;

    /**
     * 卡券类型
     */
    private Integer couponTypeId;

    /**
     * 有效期段
     */
    private String indate;

    /**
     * 有效期开始时间
     */
    private String indateStart;

    /**
     * 有效期结束时间
     */
    private String indateEnd;

    /**
     * 0：审核通过后发布；1：指定发布时间；2：暂不发布
     */
    private Integer publishType;

    /**
     * 发布时间段
     */
    private String publishDate;

    /**
     * 发布开始时间
     */
    private String publishStart;

    /**
     * 发布结束时间
     */
    private String publishEnd;

    /**
     * 卡券来源；0：自建；1：导入；2：第三方获取
     */
    private Integer couponSource;

    /**
     * 发布渠道 1：卡券商城；2：积分商城；3：营销中心；4：游戏中心；5:互动屏；6：第三方平台 ；7：领券频道
     */
    private Integer publishChannel;

    /**
     * 关键字
     */
    private String keyword;

    /**
     * 状态。0：草稿；1：待审核；2：挂起；3：审核通过；4：审核不通过  5: 待发布  6：发布中；7：终止（下架） 8:删除;9:审核的全部
     */
    private Integer status;

    /**
     * 商家id
     */
    private String merchantId;

    /**
     * 0:总部 1: 商场 2：店铺
     */
    private Integer merchantType;

    /**
     * 总部或商场id
     * 当查询为店铺的时候，该字段才有值
     */
    private String centerId;

    /**
     * 店铺一级分类
     */
    private String shopFirstCategoryId;

    /**
     * 店铺二级分类
     */
    private String shopSecondCategoryId;

    /**
     * 用户id
     */
    private Integer userId;

    private String  updateAt;

    private String applyDate;

    //申请开始时间
    private String applyStartAt;
    //申请结束时间
    private String applyEndAt;

    // 是否是审核页面
    private Integer checkPage;


    public String getIndateStart() {
        return SplitDateRangeUtil.getDateFromDateRange(indate, SplitDateRangeUtil.REGEX_FIRST, SplitDateRangeUtil.INDEX_FIRST);
    }

    public String getIndateEnd() {
        return SplitDateRangeUtil.getDateFromDateRange(indate, SplitDateRangeUtil.REGEX_FIRST, SplitDateRangeUtil.INDEX_SECOND);
    }

    public String getPublishStart() {
        return SplitDateRangeUtil.getDateFromDateRange(publishDate, SplitDateRangeUtil.REGEX_FIRST, SplitDateRangeUtil.INDEX_FIRST);
    }

    public String getPublishEnd() {
        return SplitDateRangeUtil.getDateFromDateRange(publishDate, SplitDateRangeUtil.REGEX_FIRST, SplitDateRangeUtil.INDEX_SECOND);
    }

    public String getApplyStartAt() {
        return SplitDateRangeUtil.getDateFromDateRange(applyDate, SplitDateRangeUtil.REGEX_FIRST, SplitDateRangeUtil.INDEX_FIRST);
    }

    public String getApplyEndAt() {
        return SplitDateRangeUtil.getDateFromDateRange(applyDate, SplitDateRangeUtil.REGEX_FIRST, SplitDateRangeUtil.INDEX_SECOND);
    }
}
