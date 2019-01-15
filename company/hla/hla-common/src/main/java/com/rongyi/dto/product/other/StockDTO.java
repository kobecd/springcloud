package com.rongyi.dto.product.other;


import com.rongyi.dto.BaseDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 产品dto
 * 格式化价格
 */
@Setter
@Getter
@NoArgsConstructor
public class StockDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private String stock; //
    private String freez; //
    private String warning; //
    private String minimum; //
    private String maximum; //
    private String step; //
    private String store_place; //
    private String out_stock_sale; //



}