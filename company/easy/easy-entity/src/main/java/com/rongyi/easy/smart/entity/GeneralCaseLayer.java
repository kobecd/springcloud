package com.rongyi.easy.smart.entity;

import com.rongyi.core.bean.BeanUtil;
import com.rongyi.easy.smart.vo.CommodityCategoryVO;
import com.rongyi.easy.smart.vo.CommodityVO;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

/**
 * Created by yandong on 2017/11/13.
 */
public class GeneralCaseLayer<T> extends CaseLayer {

    private T data;

    private List<T> dataList;

    private Map<String, T> dataMap;


    public GeneralCaseLayer(){

    }

    public GeneralCaseLayer(CaseLayer caseLayer){
        BeanUtil.copyPropertiesIgnoreNull(caseLayer, this);
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    public Map<String, T> getDataMap() {
        return dataMap;
    }

    public void setDataMap(Map<String, T> dataMap) {
        this.dataMap = dataMap;
    }

    @Override
    public String toString() {
        return "GeneralCaseLayer{" +
                "data=" + data +
                ", dataList=" + dataList +
                ", dataMap=" + dataMap +
                "} " + super.toString();
    }
}
