package com.rongyi.controller;


import com.rongyi.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
//@Api(value = "/user", description = "用户模块模块", produces = "application/json")
@RestController
@RequestMapping("/user/*")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/rfid", method = RequestMethod.POST)
//    @ApiOperation(value = "屏端,通过RFID查对应的SKU", notes = "查询SKU，注意条件为RFID")
    public Object selectProductsByRFIDCode(@RequestBody List<String> rfidCodes) {
        log.debug("参数 rfidCodes {}", rfidCodes);
        return "ResponseVO.success(userService.selectProductsByRFIDCodes(rfidCodes))";
    }


}
