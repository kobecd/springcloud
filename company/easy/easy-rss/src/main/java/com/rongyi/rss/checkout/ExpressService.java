package com.rongyi.rss.checkout;

import com.rongyi.easy.mcmc.vo.CommodityVO;
import com.rongyi.easy.pos.param.ExpressFeeParam;

import java.util.List;

/**
 * desc
 *
 * @author wangjh7
 * @date 2017-06-17
 **/
public interface ExpressService {

    /**
     * 计算运费
     *
     * @param orderSource
     * @param provinceId  省ID(mongo id)
     * @param commodityList
     * @return
     */
    double getExpressFee(Integer orderSource, String provinceId, List<CommodityVO> commodityList);

    /**
     * 计算运费
     *
     * @param orderSource
     * @param expressFeeParam
     * @return
     */
    double getExpressFee(Integer orderSource, ExpressFeeParam expressFeeParam);
}
