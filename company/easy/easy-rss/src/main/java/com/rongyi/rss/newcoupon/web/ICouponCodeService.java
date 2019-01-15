package com.rongyi.rss.newcoupon.web;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.newcoupon.dto.CouponCodeDTO;
import com.rongyi.easy.newcoupon.dto.CouponCodeTempDTO;
import com.rongyi.easy.newcoupon.vo.CouponCodeRepeatVO;
import com.rongyi.easy.newcoupon.vo.CouponCodeTotalVO;
import com.rongyi.easy.newcoupon.vo.CouponCodeVO;

import java.util.List;


/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/11/16
 */
public interface ICouponCodeService {
    /**
     * 券码导入
     * @param bytes excel
     * @return 该批次券码标志
     */
    CouponCodeTotalVO importCouponCodes(byte[] bytes, CouponCodeTempDTO codeTempDTO) throws Exception;

    ResponseVO listCouponCode(CouponCodeDTO couponCodeDTO);

    ResponseVO getFailureList(CouponCodeDTO couponCodeDTO);

    /**
     * 批量删除导入的券码
     * @param
     * @return
     */
    int deleteCodesByVersion(String version);

    int deleteCodesByTotalId(Integer totalId);

    CouponCodeTotalVO couponCodeDetail(Integer id);

    CouponCodeTotalVO couponCodeDetailByCouponId(Integer couponId);

    ResponseVO getImportedTotalList(CouponCodeDTO couponCodeDTO);

    int getFailureCountByTotalId(Integer totalId);

    List<CouponCodeRepeatVO> getFailureListByTotalId(Integer totalId, Integer currentPage, Integer pageSize);

    int getSuccessCountByTotalId(Integer totalId);

    List<CouponCodeVO> getSuccessListByTotalId(Integer totalId, Integer currentPage, Integer pageSize);

//    CouponCodeVO getByCouponCode(String couponCode);

}
