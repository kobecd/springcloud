package com.rongyi.rbac.model.dao;

import com.rongyi.rbac.model.constants.Constant;
import com.rongyi.rbac.model.entity.Authority;
import com.rongyi.rbac.model.entity.UserInfo;
import com.rongyi.rbac.model.entity.UserQueryCondition;
import com.rongyi.rbac.model.param.AccountParam;
import com.rongyi.rbac.model.param.UserParam;
import com.rongyi.utils.MD5Encryption;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description：
 * Author:  Administrator
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * Administrator          2018/8/16 18:34          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
@Slf4j
@Repository
public class UserDao {

    @Autowired
    private UserMapper usersMapper;

    @Autowired
    private AuthorityMapper authorityMapper;
    /**
     * 根据条件查询内部员工帐号列表
     * @param param
     * @return
     */
    public List<UserInfo> findPageList(UserParam param){
    	Map<String,Object> paraMap = new HashMap<String, Object>();
    	paraMap.put("offset", (param.getCurrentPage() - 1) * param.getPageSize());
    	paraMap.put("account", param.getName());
        paraMap.put("name", param.getName());
    	paraMap.put("status", param.getStatus());
    	paraMap.put("pageSize", param.getPageSize());
    	return usersMapper.findPageList(paraMap);
    }
    /**
     * 获取内部员工账号数量
     * @param param
     * @return
     */
    public Integer findUsersCount(UserParam param){
    	Map<String,Object> paraMap = new HashMap<String, Object>();
    	paraMap.put("account", param.getName());
    	paraMap.put("status", param.getStatus());
    	paraMap.put("name", param.getName());
    	return usersMapper.findUsersCount(paraMap);
    }
    /**
     * 根据账号查询是否存在已启用的账号
     * @param userAccount
     * @return
     */
    public UserInfo getUserByUserAccount(String userAccount){
    	Map<String,Object> paraMap = new HashMap<String, Object>();
    	paraMap.put("userAccount", userAccount);
    	return usersMapper.getUserByUserAccount(paraMap);
    }

    public UserInfo getUserById(Long userId) {
        UserInfo usersInfo = usersMapper.selectByPrimaryKey(userId);
        return usersInfo;
    }

	public int getAllByUsernameLikeCount(String username) {
		UserQueryCondition usersQueryCondition = new UserQueryCondition();
		username = "%" + username + "%";
		int count=0;
		usersQueryCondition.createCriteria().andUsernameLike(username);
		count = usersMapper.countByExample(usersQueryCondition);
		return count;
	}
    /**
     * 查询用户列表
     */

    public List<UserInfo> queryUserList(UserParam param){
        return  usersMapper.queryUserList(param);
    }
	/**
	 * 查询用户总数
	 */
	public int queryUserListCount(UserParam param){
		return usersMapper.queryUserListCount(param);
	}

	/**
	 * 新建/修改用户账号信息
	 * @param param
	 * @return
	 */
	public int editUser(AccountParam param){
		UserInfo user = new UserInfo();
		if(param.getUserId() == null){
			//新建用户账号
			user.setUsername(param.getUsername());//用户账号
	        user.setStatus(Constant.Status.STATUS_NORMAL);//默认状态
	        user.setName(param.getName());//姓名
	        user.setNickname(param.getNickname());//昵称
	        user.setPhone(param.getPhone());//手机号
	        user.setMemo(param.getMemo());//备注
	        //TODO password md5 密码
            user.setPassword(MD5Utils.encrypt16(MD5Encryption.encrypt((String) param.getPassword())));
	        user.setCreateAt(new Date());
	        user.setCreateBy(param.getCreateBy());
	        user.setUpdateBy(param.getCreateBy());
	        user.setUpdateAt(new Date());
			log.info( "addUser | param" + user );
	        usersMapper.insertSelective(user);
			return user.getId();
		}else{
			//修改用户账号
			user.setId(param.getUserId());
			user.setName(param.getName());
			user.setNickname(param.getNickname());
			user.setPhone(param.getPhone());
			user.setMemo(param.getMemo());
			user.setUpdateAt(new Date());
			user.setUpdateBy(param.getCreateBy());
			log.info( "editUser | param" + user );
			usersMapper.updateByPrimaryKeySelective(user);
			return param.getUserId();
		}
	}

    public int addNewUser(String username, String name, String nickname, String phone, String memo,String createBy)
    {
        UserInfo user = new UserInfo();
        user.setUsername(username);
        user.setStatus(Constant.Status.STATUS_NORMAL);
        user.setName(name);
        user.setNickname(nickname);
        user.setPhone(phone);
        user.setMemo(memo);
        //TODO password md5
        user.setPassword(MD5Utils.encrypt16(MD5Encryption.encrypt("123456")));
        user.setCreateAt(new Date());
        user.setCreateBy(createBy);
        user.setUpdateBy(createBy);
        user.setUpdateAt(new Date());
        return usersMapper.insertSelective(user);
    }

    public int updateUser(Integer id, String name, String nickname, String phone, String memo, String updateBy)
    {
        UserInfo users = new UserInfo();
        users.setId(id);
        users.setName(name);
        users.setNickname(nickname);
        users.setPhone(phone);
        users.setMemo(memo);
        users.setUpdateAt(new Date());
        users.setUpdateBy(updateBy);
        return usersMapper.updateByPrimaryKeySelective(users);
    }

    /**
     * @Author： caijie
     * @Description： 修改用户密码
     * @Date： 2018/8/22 13:49
     * @Param： [id, newPassword]
     * @Return： int
     */
    public int resetPwd(Integer userId,String newPassword){
    	 UserInfo users = new UserInfo();
    	 users.setId(userId);
    	 users.setPassword(MD5Utils.encrypt16(MD5Encryption.encrypt((String)newPassword)));
    	 return usersMapper.updateByPrimaryKeySelective(users);
    }
	/**
	 * @Author： 校验密码是否正确
	 * @Description：
	 * @Date： 2018/8/22 13:58
	 * @Param： [userId, oldPassword]
	 * @Return： java.lang.Boolean
	 */
    public Boolean checkPwd(Integer userId,String oldPassword){
		UserInfo usersInfo = usersMapper.selectByPrimaryKey(userId.longValue());
		log.info( "checkPwd | " + usersInfo );
		return usersInfo.getPassword().equals(MD5Utils.encrypt16(MD5Encryption.encrypt((String)oldPassword)));
	}

    public int updateStatus(Integer id,byte status,String reason){
    	UserInfo users = new UserInfo();
    	users.setId(id);
    	users.setStatus(status);
    	users.setReason(reason);
    	users.setDisableAt(new Date());
    	return usersMapper.updateByPrimaryKeySelective(users);
    }
    /**
     * 停用/启用用户账号
     * @param param
     * @return
     */
    public int updateUserStatus(AccountParam param){
    	UserInfo users = new UserInfo();
    	users.setId(param.getUserId());
    	users.setStatus(param.getStatus());
    	users.setReason(param.getReason());
    	if(param.getStatus() == 2){
        	users.setDisableAt(new Date());
    	}
    	return usersMapper.updateByPrimaryKeySelective(users);
    }

    public List<Authority> getAuthsByUserId(Integer userId){
    	return authorityMapper.getAuthsByUserId(userId);
    }


}
