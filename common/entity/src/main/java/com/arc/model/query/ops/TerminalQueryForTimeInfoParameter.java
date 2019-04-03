package com.arc.model.query.ops;

import lombok.Data;
import lombok.ToString;

/**
 * 前端调用后台接口用到的转发时的接收参数的对象
 * 注意
 */
@Data
@ToString
public class TerminalQueryForTimeInfoParameter {

    private static final long serialVersionUID = 1L;

    private String mallId;

   private  int machineId;

    }
