package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/11/17
 */
@Setter
@Getter
@ToString(callSuper = true)
public class CommodityCategoryQueryDTO extends BaseDTO {
    private String parentId;

    private Boolean searchAll;

    private List<String> categoryIds;
}
