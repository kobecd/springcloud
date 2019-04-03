package com.arc.model.query.product;

import com.arc.model.dto.BaseDTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * spu查询条件
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */
@Setter
@Getter
public class SpuQueryDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private String name; // spu商品名称 模糊查询

    private String groupCode;//组别的code

    private Boolean state; // spu商品状态

}
