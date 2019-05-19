package com.arc.security0.controller.test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * @author 叶超
 * @since: 2019/5/7 21:41
 */
@Setter
@Getter
@ToString
public class WireMockMdle {

    @NotNull
    private String url;

    private Object object;
}
