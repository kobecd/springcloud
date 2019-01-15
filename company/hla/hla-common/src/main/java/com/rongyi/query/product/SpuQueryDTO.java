package com.rongyi.query.product;

import com.rongyi.dto.BaseDTO;
import lombok.Data;
import lombok.ToString;


/**
 * spu查询条件
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */
@Data
@ToString
public class SpuQueryDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private String name; // spu商品名称 模糊查询

    private String groupCode;//组别的code

    private Boolean state; // spu商品状态

}
