package com.rongyi.hla.service.ops.impl;

import com.alibaba.fastjson.JSON;
import com.rongyi.hla.service.ops.TerminalService;
import com.rongyi.query.ops.TerminalQueryForTimeInfoParameter;
import com.rongyi.query.ops.TerminalQueryParameter;
import com.rongyi.utils.TerminalHttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TerminalServiceServiceImpl implements TerminalService {

    @Autowired
    private TerminalHttpUtil terminalHttpUtil;

    @Value("${hla.ops.url.pathForTerminalList}")
    private String pathForTerminalList;

    @Value("${hla.ops.url.pathForTerminalScreenShot}")
    private String pathForTerminalScreenShot;

    @Value("${hla.ops.url.pathForQueryScreenResult}")
    private String pathForQueryScreenResult;

    @Value("${hla.ops.url.pathForTerminalReboot}")
    private String pathForTerminalReboot;

    @Value("${hla.ops.url.pathForTerminalTimeSet}")
    private String pathForTerminalTimeSet;

    @Value("${hla.ops.url.pathForTerminalTimeInfo}")
    private String pathForTerminalTimeInfo;


    @Override
    public String getTerminalList(TerminalQueryParameter query) {
        String jsonString = JSON.toJSONString(query);
        System.out.println(query.toString());
        System.out.println(jsonString);

        return terminalHttpUtil.post(pathForTerminalList,jsonString);
    }

    @Override
    public String terminalScreenShot(TerminalQueryParameter query) {
        return terminalHttpUtil.post(pathForTerminalScreenShot,JSON.toJSONString(query));
    }

    @Override
    public String queryScreenResult(TerminalQueryParameter query) {
        return terminalHttpUtil.post(pathForQueryScreenResult,JSON.toJSONString(query));

    }

    @Override
    public String terminalReboot(TerminalQueryParameter query) {
        return terminalHttpUtil.post(pathForTerminalReboot,JSON.toJSONString(query));

    }

    @Override
    public String terminalTimeSet(TerminalQueryParameter query) {
        return terminalHttpUtil.post(pathForTerminalTimeSet,JSON.toJSONString(query));
    }

    @Override
    public String terminalTimeInfo(TerminalQueryForTimeInfoParameter query) {
        return terminalHttpUtil.post(pathForTerminalTimeInfo,JSON.toJSONString(query));

    }
}
