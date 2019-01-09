package com.rongyi.rbac.controller;

import com.rongyi.rbac.model.constants.CodeEnum;
import com.rongyi.rbac.model.param.RoleAuthParam;
import com.rongyi.rbac.service.RoleAuthService;
import com.rongyi.rbac.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description：用户权限
 * Author:  caijie
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * Administrator          2018/8/16 19:27          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
@Slf4j
@RestController
@RequestMapping("/role/*")
public class RoleController {

    @Autowired
    private RoleAuthService roleAuthService;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/resetRoleUser", method = RequestMethod.POST)
    public Object resetRoleUser(@RequestBody RoleAuthParam param) {

        log.info( "RoleController.resetRoleUser | param" +  param);
        try{
            if(param == null || param.getUserId() == null ){
                return ResponseVO.failure( CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(),"参数不存在");
            }
            if(param.getUserId() == 1){
                return ResponseVO.failure( CodeEnum.FIAL_SAVE_CONFIG.getCodeInt(),"超级管理员权限不能修改");
            }
            roleAuthService.resetRoleUser(param);
            return ResponseVO.success();

        }catch(Exception e){
            log.error("resetRoleUser error:"+e.getMessage(),e);
            return ResponseVO.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
    }

    @RequestMapping(value = "/queryUserAuthList", method = RequestMethod.POST)
    public Object queryUserAuthList(@RequestBody RoleAuthParam param) {

        log.info( "RoleController.resetRoleUser | param" +  param);
        try{
            if(param == null || param.getUserId() == null ){
                return ResponseVO.failure( CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(),"参数不存在");
            }
            List<String> userAuthList = userService.getAuthsValueByUserId(param.getUserId());
            return ResponseVO.success(userAuthList);

        }catch(Exception e){
            log.error("resetRoleUser error:"+e.getMessage(),e);
            return ResponseVO.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
    }


}
