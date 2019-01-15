package com.rongyi.service;

import com.rongyi.entity.UserInfo;
import com.rongyi.entity.UserRole;
import com.rongyi.param.AccountListParam;
import com.rongyi.param.AccountParam;

import java.util.List;
import java.util.Map;

public interface UserService {

    UserInfo getByUsername(String username);

    List<UserInfo> findPageList(AccountListParam param);

    Integer findUsersCount(AccountListParam param);

    UserInfo getUserByUserAccount(String userAccount);

    List<UserInfo> getUserList(int offset, int pageSize, byte status, String username);

    UserInfo getUserById(Integer userId);

    UserInfo getUserByUsername(String username);

    int addNewUser(String username, String name, String nickname, String phone, String memo, String createBy);

    int updateUser(Integer id, String name, String nickname, String phone, String memo, String updateBy);

    int editUser(AccountParam param);

   // List<BDUserAccountVO> getUsersByName(String userName, byte status);

     List<UserRole> getUserRoleListByUserId(Integer userId);

     int resetPwd(Integer id, String password);

    Map getSessionUserFromRedis(String ryst, boolean bConvertToObj) throws Exception;

     List<UserInfo> getUserByName(String userName,int offset, int pageSize);

     int getUserByNameCount(String userName);

    List<Integer> roleIdsByUserId(Integer userId);








}
