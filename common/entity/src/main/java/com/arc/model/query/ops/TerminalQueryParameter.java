package com.arc.model.query.ops;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * 前端调用后台接口用到的转发时的接收参数的对象
 */
@Data
@ToString
public class TerminalQueryParameter {

    private static final long serialVersionUID = 1L;

    private int page = 1;//当前页

    private int pageSize = 10;//页码数字

    private String mallId;

    private String terminalCode;//终端设备号码

    List<Integer> machineIdList;//机器列表

    List<Integer> controlIdList;//控制列表

    List<Date> list;

    List<MachineSetParameter> machineSetParamList;

    }
