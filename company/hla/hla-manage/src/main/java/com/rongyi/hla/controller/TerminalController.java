package com.rongyi.hla.controller;

import com.rongyi.hla.service.ops.TerminalService;
import com.rongyi.query.ops.TerminalQueryForTimeInfoParameter;
import com.rongyi.query.ops.TerminalQueryParameter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 转发ops接口的控制器
 *
 * @author: yechao
 * @date: 2018/08/22 15:27
 * @version: V1.0
 */
@Slf4j
@RestController
@RequestMapping("/forward/ops")
public class TerminalController {


    @Autowired
    private TerminalService terminalService;


    //1终端管理列表
    @RequestMapping(value = "/getTerminalList", method = RequestMethod.POST)
    public String getTerminalList(@RequestBody TerminalQueryParameter query) {
        log.debug("参数：{}", query.toString());
        return terminalService.getTerminalList(query);
    }

    //2截屏
    @RequestMapping(value = "/terminalScreenShot", method = RequestMethod.POST)
    public String terminalScreenShot(@RequestBody TerminalQueryParameter query) {
        log.debug("参数：{}", query.toString());
        return terminalService.terminalScreenShot(query);
    }

    //3.获取截屏图
    @RequestMapping(value = "/queryScreenResult", method = RequestMethod.POST)
    public String queryScreenResult(@RequestBody TerminalQueryParameter query) {
        log.debug("参数：{}", query.toString());
        return terminalService.queryScreenResult(query);
    }

    //4重启
    @RequestMapping(value = "/terminalReboot", method = RequestMethod.POST)
    public String terminalReboot(@RequestBody TerminalQueryParameter query) {
        log.debug("参数：{}", query.toString());
        return terminalService.terminalReboot(query);
    }

    //5定时开关机
    @RequestMapping(value = "/terminalTimeSet", method = RequestMethod.POST)
    public String terminalTimeSet(@RequestBody TerminalQueryParameter query) {
        log.debug("参数：{}", query.toString());
        return terminalService.terminalTimeSet(query);
    }

    //6
    @RequestMapping(value = "/terminalTimeInfo", method = RequestMethod.POST)
    public String terminalTimeInfo(@RequestBody TerminalQueryForTimeInfoParameter query) {
        log.debug("参数：{}", query.toString());
        return terminalService.terminalTimeInfo(query);
    }


}

