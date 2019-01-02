package com.rongyi.rbac.controller;

import com.rongyi.rbac.model.constants.Constant;
import com.rongyi.rbac.model.entity.UserInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class BaseController {


    /**
     * 获取当前session里面的用户
     *
     * @return
     */
    public UserInfo getSessionUser(HttpServletRequest request, HttpSession session) {
        UserInfo user = null;
        user = (UserInfo) request.getSession().getAttribute("sessionUserInfo");
        if (user == null) {
            user = (UserInfo) session.getAttribute( Constant.USER_SESSIONKEY);
        }
        return user;
    }
}
