package com.rongyi.service.impl;

import com.rongyi.dao.UserDao;
import com.rongyi.dao.UserRoleDao;
import com.rongyi.entity.Authority;
import com.rongyi.entity.UserInfo;
import com.rongyi.entity.UserRole;
import com.rongyi.mapper.UserMapper;
import com.rongyi.param.AccountListParam;
import com.rongyi.param.AccountParam;
import com.rongyi.param.UserRoleParam;
import com.rongyi.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper usersMapper;

    @Autowired
    private UserDao usersDao;
    @Autowired
    private RoleServiceImpl rolesService;
    
    
//    @Autowired
//    private RedisService iRyRedisService;

    @Autowired
    private UserRoleDao userRolesDao;

    /**
     * Description：根据账号查询是否存在已启用的账号
     * Author:  Administrator
     * History: 变更记录
     * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
     * Administrator          2018/8/16 19:27          1.0
     * ModifiedRemark:
     * Copyright (C): 上海容易网电子商务股份有限公司
     */

    @Override
    public UserInfo getByUsername(String userAccount) {
            Map<String,Object> paraMap = new HashMap<String, Object>();
            paraMap.put("userAccount", userAccount);
            return usersMapper.getUserByUserAccount(paraMap);

    }

    /**
     * 获取内部员工账号列表
     * @param param
     * @return
     */
    public List<UserInfo> findPageList(AccountListParam param) {
        return usersDao.findPageList(param);
    }
    /**
     * 获取内部员工账号数量
     * @param param
     * @return
     */
    public Integer findUsersCount(AccountListParam param){
        return usersDao.findUsersCount(param);
    }
    /**
     * 根据账号查询已启用的账号信息
     * @param userAccount
     * @return
     */
    public UserInfo getUserByUserAccount(String userAccount) {
        return usersDao.getUserByUserAccount(userAccount);
    }

    public List<UserInfo> getUserList(int offset, int pageSize, byte status, String username) {
        return usersDao.getUserList(offset, pageSize, status, username);
    }

    public UserInfo getUserById(Integer userId) {
        return usersDao.getUserById(userId);
    }

    public UserInfo getUserByUsername(String username) {
        return usersDao.getUserByUsername(username);
    }

    public int addNewUser(String username, String name, String nickname, String phone, String memo, String createBy) {
        log.info("======添加账号======");
        UserInfo user = usersDao.getUserByUsername(username);
        if (user.getId() != null) {
            throw new RuntimeException("账号名称不能重复");
        }
        return usersDao.addNewUser(username, name, nickname, phone, memo, createBy);
    }

    public int updateUser(Integer id, String name, String nickname, String phone, String memo, String updateBy) {
        return usersDao.updateUser(id, name, nickname, phone, memo, updateBy);
    }

    public int editUser(AccountParam param){
        log.info("新建/修改账号信息");
        return usersDao.editUser(param);
    }


    /**
     * 查询用户角色
     *
     * @param userId
     *            用户ID
     * @return
     */
    public List<UserRole> getUserRoleListByUserId(Integer userId) {
        return userRolesDao.getUserRoleListByUserId(userId);
    }

    public int resetPwd(Integer id, String password) {
        log.info("====修改账号密码=====");
        return usersDao.resetPwd(id, password);
    }

    /**
     * 分配用户角色
     *
     * @param userId
     * @param roles
     * @return
     */
    public int saveUserRoles(Integer userId, String roles) {
        userRolesDao.deleteByExample(userId);
        Map map = new HashMap();
        map.put("userId", userId);
        map.put("roles", roles.split("-"));
        return userRolesDao.save(map);
    }
    /**
     * 分配用户角色
     *
     * @param param
     * @return
     */
    public int saveUserRoles(UserRoleParam param) {
        userRolesDao.deleteByExample(param.getUserId());
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("userId", param.getUserId());
        map.put("roles", param.getRoleIds());
        return userRolesDao.save(map);
    }

    /**
     * 修改用户状态
     *
     * @param id
     * @param status
     * @param reason
     * @return
     */
    public int updateStatus(Integer id, byte status, String reason) {
        log.info("=======修改用户状态=========");
        return usersDao.updateStatus(id, status, reason);
    }
    /**
     * 停用/启用用户账号
     * @param param
     * @return
     */
    public int updateUserStatus(AccountParam param){
        log.info("停用/启用用户账号");
        return usersDao.updateUserStatus(param);
    }

    /**
     * 获取所有用户信息，包括锁定和正常
     *
     * @param username
     * @return
     */
    public List<UserInfo> getAllByUsername(String username) {
        return usersDao.getAllByUsername(username);
    }

    /**
     * 获取用户权限
     */
    public List<String> getAuthsValueByUserId(Integer userId) {
        log.info("=======获取用户权限=id==" + userId + "======");
        List<Authority> auths = usersDao.getAuthsByUserId(userId);
        List<String> authValues = new ArrayList<String>();
        for (Authority auth : auths) {
            authValues.add(auth.getValue());
        }
        return authValues;
    }

    @Override
    public Map getSessionUserFromRedis(String ryst, boolean bConvertToObj) throws Exception {

        return Collections.emptyMap();

//        log.info("==getSessionUserFromRedis(ryst:" + ryst + ")==");
//        if (StringUtils.isBlank(ryst)) {
//            return null;
//        }
////        Map userMap = iRyRedisService.getByKey(ryst, Map.class);
//        if (userMap == null) {
//            return null;
//        }
//        /*
//         * 增加 调取一次接口 存一次用户信息到redis
//         */
////        iRyRedisService.setObject(ryst, userMap);
////        iRyRedisService.expire(ryst,Constant.SESSION_TIMEOUT);
////        if (!bConvertToObj) {
////            return userMap;
////        }
//        Map result = null;
//        if (userMap.get("userInfo") != null) {
//            UserInfo userInfo = (UserInfo) JsonUtil.getDTO(userMap.get("userInfo").toString(), UserInfo.class);
//            result = new HashMap();
//            result.put("userInfo", userInfo);
//        }
//        if (userMap.get("authorities") != null) {
//            Object[] authsObj = JsonUtil.getObjectArrayFromJson(userMap.get("authorities").toString());
//
//            if (authsObj != null && authsObj.length > 0) {
//                List<String> authorities = new ArrayList<String>();
//                for (Object obj : authsObj) {
//                    authorities.add(obj.toString());
//                }
//                result.put("authorities", authorities);
//            }
//        }
//        return result;
    }

    @Override
    public List<UserInfo> getUserByName(String userName, int offset, int pageSize) {
        log.info("==getUserByName(userName:" + userName + ")==");
        List<UserInfo> users = usersDao.getAllByUsernameLike(userName, offset, pageSize);
        for (UserInfo ryUserInfo : users) {
            ryUserInfo.setPassword("******");
        }
        return users;
    }

    public int getUserByNameCount(String userName){
        return usersDao.getAllByUsernameLikeCount(userName);
    }

    @Override
    public List<Integer> roleIdsByUserId(Integer userId){
        log.info("userId: " + userId);
        List<Integer> roleIds = userRolesDao.roleIdsByUserId(userId);
        log.info("roleIds: " + roleIds);
        return roleIds;
    }


}
