package com.rongyi.dao;

import com.rongyi.constants.Constant;
import com.rongyi.entity.Authority;
import com.rongyi.entity.UserInfo;
import com.rongyi.entity.UserQueryCondition;
import com.rongyi.mapper.AuthorityMapper;
import com.rongyi.mapper.UserMapper;
import com.rongyi.param.AccountListParam;
import com.rongyi.param.AccountParam;
import com.rongyi.utils.MD5Encryption;
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
    public List<UserInfo> findPageList(AccountListParam param){
    	Map<String,Object> paraMap = new HashMap<String, Object>();
    	paraMap.put("offset", (param.getCurrentPage() - 1) * param.getPageSize());
    	paraMap.put("account", param.getAccount());
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
    public Integer findUsersCount(AccountListParam param){
    	Map<String,Object> paraMap = new HashMap<String, Object>();
    	paraMap.put("account", param.getAccount());
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

    public List<UserInfo> getUserList(int offset, int pageSize, byte status, String username)
    {
        UserQueryCondition usersQueryCondition = new UserQueryCondition();
        usersQueryCondition.setOffset(offset)
                .setPagesize(pageSize)
                .createCriteria()
                .andUsernameEqualTo(username)
        		.andStatusEqualTo(status);
        usersQueryCondition.setOrderByClause("create_at desc");
        return usersMapper.selectByExample(usersQueryCondition);
    }

    public UserInfo getUserById(Integer userId) {
        UserInfo users = new UserInfo();
        UserQueryCondition usersQueryCondition = new UserQueryCondition();
        usersQueryCondition.createCriteria().andIdEqualTo(userId);
        List<UserInfo> usersList = usersMapper.selectByExample(usersQueryCondition);
        if (usersList.size() > 0)
        {
            users = usersList.get(0);
        }
        return users;
    }

    public UserInfo getUserByUsername(String username) {
        UserInfo users = new UserInfo();
        UserQueryCondition usersQueryCondition = new UserQueryCondition();
        usersQueryCondition.createCriteria().andUsernameEqualTo(username)
        									.andStatusEqualTo((byte)1);
        List<UserInfo> usersList = usersMapper.selectByExample(usersQueryCondition);
        if (usersList.size() > 0) {
            users = usersList.get(0);
        }
        return users;
    }
    
    public List<UserInfo> getAllByUsername(String username) {
        UserInfo users = new UserInfo();
        UserQueryCondition usersQueryCondition = new UserQueryCondition();
        usersQueryCondition.createCriteria().andUsernameEqualTo(username);
        List<UserInfo> usersList = usersMapper.selectByExample(usersQueryCondition);
        return usersList;
    }
    
	public List<UserInfo> getAllByUsernameLike(String username, int offset, int pageSize) {
		UserQueryCondition usersQueryCondition = new UserQueryCondition();
		username = "%" + username + "%";
		if (pageSize != 0) {
			int startIndex = offset == 0 ? 0 : (offset - 1) * pageSize;
			usersQueryCondition.setOffset(startIndex).setPagesize(pageSize);
		}
		usersQueryCondition.createCriteria().andUsernameLike(username);
		usersQueryCondition.setOrderByClause("create_at desc");
		List<UserInfo> usersList = usersMapper.selectByExample(usersQueryCondition);
		return usersList;
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
	 * 新建/修改用户账号信息
	 * @param param
	 * @return
	 */
	public int editUser(AccountParam param){
		UserInfo user = new UserInfo();
		if(param.getId() == null){
			//新建用户账号
			user.setUsername(param.getAccount());//用户账号
	        user.setStatus(Constant.Status.STATUS_NORMAL);//默认状态
	        user.setName(param.getName());//姓名
	        user.setNickname(param.getNickName());//昵称
	        user.setPhone(param.getPhone());//手机号
	        user.setMemo(param.getRemark());//备注
	        //TODO password md5 初始密码
	        user.setPassword( MD5Encryption.encrypt("123456"));//初始化密码
	        user.setCreateAt(new Date());
	        user.setCreateBy(param.getCreateBy());
	        user.setUpdateBy(param.getCreateBy());
	        user.setUpdateAt(new Date());
	        return usersMapper.insertSelective(user);
		}else{
			//修改用户账号
			user.setId(param.getId());
			user.setName(param.getName());
			user.setNickname(param.getNickName());
			user.setPhone(param.getPhone());
			user.setMemo(param.getRemark());
			user.setUpdateAt(new Date());
			user.setUpdateBy(param.getCreateBy());
	        return usersMapper.updateByPrimaryKeySelective(user);
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
        user.setPassword(MD5Encryption.encrypt("123456"));
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
    
    public List<UserInfo> getUsersByName(String userName, byte status){
    	 UserInfo users = new UserInfo();
         UserQueryCondition usersQueryCondition = new UserQueryCondition();
         usersQueryCondition.createCriteria().andUsernameLike("%"+userName+"%")
         	.andStatusEqualTo(status);
         List<UserInfo> usersList = usersMapper.selectByExample(usersQueryCondition);
         return usersList;
    }
    
    public int resetPwd(Integer id,String password){
    	 UserInfo users = new UserInfo();
    	 users.setId(id);
    	 users.setPassword(password);
    	 return usersMapper.updateByPrimaryKeySelective(users);
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
    	users.setId(param.getId());
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
