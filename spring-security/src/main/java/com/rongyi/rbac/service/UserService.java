package com.rongyi.rbac.service;

import com.rongyi.rbac.model.entity.UserInfo;
import com.rongyi.rbac.model.entity.UserRole;
import com.rongyi.rbac.model.param.AccountParam;
import com.rongyi.rbac.model.param.UserParam;
import com.rongyi.rbac.model.vo.UserInfoVO;

import java.util.List;

/**
 * Description：用户
 * Author:  caijie
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * Administrator          2018/8/16 19:27          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */

public interface UserService {

    List<UserInfo> findPageList(UserParam param);

    Integer findUsersCount(UserParam param);

    UserInfo getUserByUserAccount(String userAccount);

    UserInfoVO getUserById(Integer userId);

    int addNewUser(String username, String name, String nickname, String phone, String memo, String createBy);

    int updateUser(Integer id, String name, String nickname, String phone, String memo, String updateBy);

    int editUser(AccountParam param)throws Exception;

     List<UserRole> getUserRoleListByUserId(Integer userId);

    Boolean resetPwd(AccountParam param);

     int getUserByNameCount(String userName);

    List<Integer> roleIdsByUserId(Integer userId);

    List<UserInfoVO> queryUserList(UserParam param);

    int queryUserListCount(UserParam param);

    int updateStatus(Integer id, byte status, String reason);

    int updateUserStatus(AccountParam param);

    List<String> getAuthsValueByUserId(Integer userId);

    int saveUserRoles(Integer userId, String roles);

}
