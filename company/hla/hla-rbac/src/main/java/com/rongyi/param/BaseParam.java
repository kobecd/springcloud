package com.rongyi.param;

import lombok.Data;

/**
 * Description：
 * Author:  caijie
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * caijie           2018/8/17 0:14          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
 @Data
public class BaseParam {

    private Integer page;
    private Integer pageSize;
    private Integer pageStart;
    private Integer currentPage;
}
