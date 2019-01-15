package com.rongyi.easy.smart.vo.gameBox;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@ToString
public class GameBoxTerminalDataVO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * 设备ID
     */
    private String terminalId;
    /**
     * 设备排期模板数据列表
     */
    private List<?> config;
}
