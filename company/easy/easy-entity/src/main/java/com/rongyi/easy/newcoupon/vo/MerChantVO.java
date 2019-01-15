package com.rongyi.easy.newcoupon.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2018/1/6
 */
@Setter
@Getter
@ToString(callSuper = true)
public class MerChantVO extends BaseVO {

    private String id;

    private String name;

    private List<String> categoryId;
}
