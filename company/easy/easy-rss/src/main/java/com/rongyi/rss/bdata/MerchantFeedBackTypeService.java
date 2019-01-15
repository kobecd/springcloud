package com.rongyi.rss.bdata;

import com.rongyi.easy.bdata.dto.MerchantFeedbackTypeDTO;
import com.rongyi.easy.bdata.entity.MerchantFeedbackTypeDO;

import java.util.List;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2018/3/5
 */
public interface MerchantFeedBackTypeService {

    int insert(MerchantFeedbackTypeDTO feedbackTypeDTO);

    List<MerchantFeedbackTypeDO> listAll(MerchantFeedbackTypeDTO feedbackTypeDTO);

    int update(MerchantFeedbackTypeDTO feedbackTypeDO);
}
