package com.rongyi.rbac.controller;

import com.rongyi.vo.ResponseVO;
import com.rongyi.rbac.model.constants.Constant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description：登陆模块
 * Author:  caijie
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * caijie          2018/8/21 13:50          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */


@Slf4j
@RestController
@RequestMapping("/login/*")
@Controller
public class LoginController {

    /**
     * @Author： Administrator
     * @Description： 是ajax请求则返回json，否则跳转到登陆页
     * @Date： 2018/8/22 17:27
     * @Param： [request, response, authentication]
     * @Return： void
     */
    @RequestMapping(value = "/loginPage")
    public void login(HttpServletRequest request,HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
        if(isAjaxRequest(request)){
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().println("{\"meta\": {\"errno\":\""+ Constant.ErrorCode.NOTLOGIN +"\",\"msg\": \"请先登陆！\"},\"result\": {\"data\": 0 },\"success\": true }");
        }else {
            response.sendRedirect("http://hlhsdp.hlzj.com/hailan/login");
        }

    }

  /**
   * @Author： Administrator
   * @Description： 判断是否ajax请求
   * @Date： 2018/8/22 17:23
   * @Param： [request]
   * @Return： boolean
   */

    public static boolean isAjaxRequest(HttpServletRequest request) {
        String ajaxFlag = request.getHeader("X-Requested-With");
        return ajaxFlag != null && "XMLHttpRequest".equals(ajaxFlag);
    }

    /**
     * @Author： caijie
     * @Description： ajax登录
     * @Date： 2018/8/22 17:27
     * @Param： [request, response, authentication]
     * @Return： com.rongyi.api.ResponseVO
     */
    @RequestMapping(value = "/ajaxLogin")
    @ResponseBody
    public ResponseVO ajaxDoLogin(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
        return  ResponseVO.success();
    }
}
