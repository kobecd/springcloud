package com.rongyi.easy.smart.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@ToString
public class GameCaseDTO implements Serializable {

    private String terminalId; //设备名称

    private Set<Integer> templateId; //模板id

    private List<Integer> gameBoxCaseId; //模板关联游戏id

}
