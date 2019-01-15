package com.rongyi.dto.product;


import com.rongyi.dto.BaseDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * 产品dto
 * 格式化价格
 */
@Setter
@Getter
@NoArgsConstructor
public class BelongDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private String code; //
    private String type; //
    private String category_code; //
    private String brand_code; //
    private List<String> ext_categories;


}