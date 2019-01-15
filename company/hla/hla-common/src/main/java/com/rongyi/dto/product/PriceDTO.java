package com.rongyi.dto.product;


import com.rongyi.dto.BaseDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

/**
 * 产品dto
 * 格式化价格
 */
@Setter
@Getter
@NoArgsConstructor
public class PriceDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private String sale; //
    private String cost; //
    private String market; //
    private Map<String,String> member_levels; //



}