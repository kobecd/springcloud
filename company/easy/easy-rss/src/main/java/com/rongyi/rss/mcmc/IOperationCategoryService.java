package com.rongyi.rss.mcmc;

import com.rongyi.easy.bdata.entity.Shop;
import com.rongyi.easy.bsoms.entity.SessionUserInfo;
import com.rongyi.easy.mcmc.entity.OperationCategoryDO;
import com.rongyi.easy.mcmc.param.OperationCategoryParam;

import java.util.List;

/**
 * Created by WUH on 2017/6/1.
 * 商品运营类目service
 */
public interface IOperationCategoryService {
    List<OperationCategoryDO> list(OperationCategoryParam param);

//    int count(String shopId);

    String save(OperationCategoryParam param);

//    String saveDO(List<OperationCategoryDO> categoryDOList);

    boolean update(OperationCategoryParam param);

    boolean delete(OperationCategoryParam param);

    OperationCategoryDO getById(String id);

//    OperationCategoryDO getByIdOrParentId(String id);

    boolean updateSort(OperationCategoryParam param);

    List<OperationCategoryDO> getByIds(List<String> ids);

    List<String> syncByIdsAndShopId(List<String> ids, String shopMid);
}
