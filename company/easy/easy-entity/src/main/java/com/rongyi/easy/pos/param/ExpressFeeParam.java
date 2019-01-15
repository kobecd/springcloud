package com.rongyi.easy.pos.param;

import com.rongyi.easy.pos.entity.ExpressFeeUnitEntity;

import java.io.Serializable;
import java.util.List;

/**
 * 获取运费请求参数
 *
 * @author wangjh7
 * @date 2017-06-20
 */
public class ExpressFeeParam implements Serializable {
    private String provinceId;
    private String provinceName;
    // 商品卡券集合
    private List<ExpressFeeUnitEntity> unitList;

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public List<ExpressFeeUnitEntity> getUnitList() {
        return unitList;
    }

    public void setUnitList(List<ExpressFeeUnitEntity> unitList) {
        this.unitList = unitList;
    }

    @Override
    public String toString() {
        return "ExpressFeeParam{" +
                "provinceId='" + provinceId + '\'' +
                ", provinceName='" + provinceName + '\'' +
                ", unitList=" + unitList +
                '}';
    }
}
