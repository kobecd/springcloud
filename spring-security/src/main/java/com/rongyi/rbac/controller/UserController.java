package com.rongyi.rbac.controller;


import com.alibaba.fastjson.JSONObject;
import com.rongyi.rbac.model.constants.CodeEnum;
import com.rongyi.rbac.model.param.AccountParam;
import com.rongyi.rbac.model.param.UserParam;
import com.rongyi.rbac.model.vo.UserInfoVO;
import com.rongyi.rbac.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Description：用户信息
 * Author:  caijie
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * Administrator          2018/8/16 19:27          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */

@Slf4j
@RestController
@RequestMapping("/user/*")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/queryUserList", method = RequestMethod.POST)
    public Object getUserList(@RequestBody UserParam param) {
        log.info( "UserController.getUserList | param" +  param);
        try{
            if(param.getCurrentPage() == null){
                param.setCurrentPage(1);
                param.setPageSize(10);
            }
            param.setPageStart((param.getCurrentPage() - 1) * param.getPageSize());
            int total = userService.queryUserListCount(param);
            List<UserInfoVO> userInforList =  userService.queryUserList(param);
        return ResponseVO.success(userInforList,param.getCurrentPage(),param.getPageSize(),total);

        }catch(Exception e){
            log.error("queryUserList error:"+e.getMessage(),e);
            return ResponseVO.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
    }


    @RequestMapping(value = "/queryUserInfoById", method = RequestMethod.POST)
    public Object getUserInfoByid(@RequestBody UserParam param) {
    log.info( "UserController.getUserInfoById | param" +  param);
        try{
            if(param == null || param.getUserId() == null){
                    return ResponseVO.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(),"参数不存在");
            }
            UserInfoVO userInfo = userService.getUserById(param.getUserId());
            log.info("UserController.getUserInfoByid | result" + userInfo);
            return ResponseVO.success(userInfo);

        }catch(Exception e){
            log.error("queryUserInfoById error:"+e.getMessage(),e);
            return ResponseVO.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
    }


    @RequestMapping(value = "/updateStatusById", method = RequestMethod.POST)
    public Object updateStatusById(@RequestBody AccountParam param) {
        log.info( "UserController.updateStatusById | param" +  param);
        try{
            if(param == null || param.getUserId() == null || param.getStatus() == null){
                return ResponseVO.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(),"参数不存在");
            }

            int result = userService.updateUserStatus(param);
            log.info("UserController.getUserInfoByid | result" + result);
            return ResponseVO.success(result);

        }catch(Exception e){
            log.error("updateStatusById error:"+e.getMessage(),e);
            return ResponseVO.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
    }


    @RequestMapping(value = "/editUser", method = RequestMethod.POST)
    public Object editUser(@RequestBody AccountParam param) {
        log.info( "UserController.editUser | param" +  param);
        try{
            if(param == null || param.getStatus() == null){
                return ResponseVO.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(),"参数不存在");
            }

            int userId = userService.editUser(param);
            log.info("UserController.editUser | result:" + userId);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put( "userId", userId);
            return ResponseVO.success(map);

        }catch(Exception e){
            log.error("editUser error:"+e.getMessage(),e);
            return ResponseVO.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), e.getMessage());
        }
    }

    @RequestMapping(value = "/resetPwd", method = RequestMethod.POST)
    public Object resetPwd(@RequestBody AccountParam param) {
        log.info( "UserController.resetPwd | param" +  param);
        try{
            if(param == null || param.getUserId() == null || param.getPassword() == null || param.getNewPassword() == null){
                return ResponseVO.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(),"参数不存在");
            }
            if(param.getQueryType() == null) {
                param.setQueryType(2); //1、校验密码 2、修改密码
            }
            boolean result = userService.resetPwd(param);
            JSONObject passwordIsPassword = new JSONObject();
            passwordIsPassword.put( "passwordIsPassword",result);
            log.info("UserController.editUser | result" +passwordIsPassword);
            return ResponseVO.success(passwordIsPassword);
        }catch(Exception e){
            log.error("resetPwd error:"+e.getMessage(),e);
            return ResponseVO.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
    }

}
