package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/10/30\
 *
 */
@Setter
@Getter
@ToString
public class TimePlugin implements Serializable {

    private List<Integer> weekday;

    private List<String> timeScope;
}
