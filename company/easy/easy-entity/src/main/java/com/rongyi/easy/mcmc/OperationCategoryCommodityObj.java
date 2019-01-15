package com.rongyi.easy.mcmc;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yaoyiwei on 2017/6/28.
 */
public class OperationCategoryCommodityObj implements Serializable {

    private String shopMid;
    private List<String> operationCategoryIds;

    public OperationCategoryCommodityObj(String shopMid, List<String> operationCategoryIds) {
        this.shopMid = shopMid;
        this.operationCategoryIds = operationCategoryIds;
    }


    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public List<String> getOperationCategoryIds() {
        return operationCategoryIds;
    }

    public void setOperationCategoryIds(List<String> operationCategoryIds) {
        this.operationCategoryIds = operationCategoryIds;
    }

    @Override
    public String toString() {
        return "OperationCategoryCommodityObj{" +
                "shopMid='" + shopMid + '\'' +
                ", operationCategoryIds='" + operationCategoryIds + '\'' +
                '}';
    }
}
