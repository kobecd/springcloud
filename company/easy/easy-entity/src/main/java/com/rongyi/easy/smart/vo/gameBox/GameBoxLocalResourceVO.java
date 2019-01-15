package com.rongyi.easy.smart.vo.gameBox;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString(callSuper = true)
public class GameBoxLocalResourceVO implements Serializable {

    private String resource; //游戏模板包位置

    private String resourceName; //游戏模板名称

    private Integer resourceType; //游戏模板类型

}
