package com.rongyi.dto.product;


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
public class AttrsDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private String color; //
    private String volume; //
    private String size; //
    private String weight; //
    private String year; //
    private String season; //



}