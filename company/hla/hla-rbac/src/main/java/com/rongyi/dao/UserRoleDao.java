package com.rongyi.dao;


import com.rongyi.entity.UserRole;
import com.rongyi.entity.UserRoleQueryCondition;
import com.rongyi.mapper.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Description：
 * Author:  Administrator
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>  
 * Administrator          2018/8/16 18:35          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
 
@Repository
public class UserRoleDao {
	@Autowired
	private UserRoleMapper userRoleMapper;
	
	public List<UserRole> getUserRoleListByUserId(Integer userId){
		UserRoleQueryCondition example = new UserRoleQueryCondition();
		example.createCriteria().andUserIdEqualTo(userId);
		return userRoleMapper.selectByExample(example);
	}
	
	public int save(Map map){
		return userRoleMapper.save(map);
	}
	
	public int deleteByExample(Integer userId){
		UserRoleQueryCondition example = new UserRoleQueryCondition();
		example.createCriteria().andUserIdEqualTo(userId);
		return userRoleMapper.deleteByExample(example);
	}

	public List<Integer> roleIdsByUserId(Integer userId){
		UserRole userRole = new UserRole();
		userRole.setUserId(userId.longValue());
		List<UserRole> userRoles = userRoleMapper.queryRoleList(userRole);
		return extractRoleIds(userRoles);
	}

	private List<Integer> extractRoleIds(List<UserRole> userRoles){
		if(CollectionUtils.isEmpty(userRoles)){
			return new ArrayList<>();
		}
		List<Integer> idList = new ArrayList<>();
		for(UserRole userRole: userRoles){
			if(userRole != null){
				idList.add(userRole.getRoleId());
			}
		}
		return idList;
	}

	public List<UserRole> allRoles(){
		return userRoleMapper.queryRoleList(new UserRole());
	}
}
