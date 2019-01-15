package com.rongyi.rss.bdata;

import com.rongyi.easy.bdata.dto.MerchantFeedbackDTO;
import com.rongyi.easy.bdata.dto.MerchantFeedbackTypeDTO;
import com.rongyi.easy.bdata.entity.MerchantFeedbackDO;
import com.rongyi.easy.bdata.entity.MerchantFeedbackTypeDO;

import java.util.List;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2018/3/5
 */
public interface MerchantFeedBackService {

    int insert(MerchantFeedbackDTO feedbackDTO);

    List<MerchantFeedbackDO> list(MerchantFeedbackDTO feedbackDTO);

    int count(MerchantFeedbackDTO feedbackDTO);

    MerchantFeedbackDO detail(Integer id);
}
