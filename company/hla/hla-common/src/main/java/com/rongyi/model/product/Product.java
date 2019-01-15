package com.rongyi.model.product;

import com.rongyi.model.BaseDO;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 产品表
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */
@Getter
@Setter
public class Product extends BaseDO {

    private static final long serialVersionUID = 1L;


    private String type;
    
    private String name;

    private Date createTime; // 创建时间

    private Date updateTime; // 更新时间

}