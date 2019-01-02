package com.rongyi.hla.service.ops;

import com.rongyi.query.ops.TerminalQueryForTimeInfoParameter;
import com.rongyi.query.ops.TerminalQueryParameter;

public interface TerminalService {
    //有5个接口去转发ops
    //1做接口参数校验 2、获取返回值然后返回字符串


    String getTerminalList(TerminalQueryParameter query);

    String terminalScreenShot(TerminalQueryParameter query);

    String queryScreenResult(TerminalQueryParameter query);

    String terminalReboot(TerminalQueryParameter query);

    String terminalTimeSet(TerminalQueryParameter query);

    String terminalTimeInfo(TerminalQueryForTimeInfoParameter query);
}
