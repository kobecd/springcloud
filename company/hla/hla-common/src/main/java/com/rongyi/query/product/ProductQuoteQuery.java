package com.rongyi.query.product;

import lombok.Getter;
import lombok.Setter;

/**
 *   @author: yechao
 *   @date: 2018/08/07 15:27
 *   @version: V1.0
 */
@Setter
@Getter
public class ProductQuoteQuery {

    private static final long serialVersionUID = 1L;

    private String productCode;     // 产品编码

    private String areaCode;        // 地区编码 (使用时方法注释上请加上省.市.区)

    private String categoryCode;    // 小类编码

    private String partnerCode;     // 合作方编码

    private String cellphone;       // 用户手机号

}