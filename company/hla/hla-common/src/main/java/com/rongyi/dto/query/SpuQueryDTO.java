package com.rongyi.dto.query;

import com.rongyi.dto.BaseDTO;
import lombok.Data;
import lombok.ToString;

/**
 * spu查询条件
 */
@Data
@ToString
public class SpuQueryDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private String name; // spu商品名称 模糊查询

}
