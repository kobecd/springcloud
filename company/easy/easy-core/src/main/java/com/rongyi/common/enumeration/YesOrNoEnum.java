package com.rongyi.common.enumeration;

/**
 * @Description:
 * @Author: 梁来宾
 * @Date: Created in 2018/3/1 17:04
 */
public enum YesOrNoEnum {
    YES(1, "是"),//是，对，可以
    NO(0, "否");


    private int value;
    private String label;

    YesOrNoEnum(int value, String label){
        this.value = value;
        this.label = label;
    }

    public int value(){
        return this.value;
    }
    public String label(){
    	return this.label;
    }
}
