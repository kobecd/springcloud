package com.rongyi.easy.smart.vo.gameBox;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class GameBoxTemplateDataVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板ID
     */
    private Integer templateId;
    /**
     * 模板下的数据列表
     */
    private Object data;

}
