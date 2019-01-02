package com.rongyi.rbac.model.dao;

import com.rongyi.rbac.model.entity.Authority;
import com.rongyi.rbac.model.entity.Role;
import com.rongyi.rbac.model.entity.RoleAuthority;
import com.rongyi.hla.mapper.rbac.AuthorityMapper;
import com.rongyi.hla.mapper.rbac.RoleAuthorityMapper;
import com.rongyi.hla.mapper.rbac.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description：
 * Author:  Administrator
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>  
 * Administrator          2018/8/16 18:30          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
 
@Repository
public class RoleDao {

	@Autowired
	private RoleMapper roleMapper;
	
	@Autowired
	private AuthorityMapper authorityMapper;
	
	@Autowired
	private RoleAuthorityMapper roleAuthorityMapper;

	public Integer saveRole(Role role){
		roleMapper.insert(role);
		return role.getId();
	}
	
	public Integer getRoleCountByName(String name){
		return roleMapper.getRoleCountByName(name);
	}
	
	public Integer updateRoleById(Role role){
		roleMapper.updateRoleById(role);
		return role.getId();
	}
	
	public Role getRoleById(Integer id){
		return roleMapper.selectByPrimaryKey(id);
	}
	
	/**
	 * 查询内部员工角色列表
	 * @param map
	 * @return
	 */
	public List<Role> getRoleListByCondition(Map map){
		return roleMapper.getroleListByCondition(map);
	}
	/**
	 * 内部员工角色列表总数量
	 * @param map
	 * @return
	 */
	public Integer getRolesCount(Map<String,Object> map){
		return roleMapper.getroleListCount(map);
	}
	
	public int turnonRoleById(Map map){
		return roleMapper.turnonRoleById(map);
	}
	
	public int updateStatusById(Map<String,Object> map){
		return roleMapper.updateStatusById(map);
	}
	
	public List<Authority> getAuthorityListByParentId(int parentId, Integer roleId){
		Map map = new HashMap();
		map.put("parentId", parentId);
		map.put("roleId", roleId);
		return authorityMapper.getAuthorityListByParentId(map);
	}

	public Authority getAuthorityListByValue(String authName){
		Map map = new HashMap();
		map.put("authName", authName);
		return authorityMapper.getAuthorityListByValue(map);
	}



	public int saveRoleAuthority(Map map){
		return roleAuthorityMapper.save(map);
	}
	
	public int saveRoleAuth(Map<String,Object> map){
		return roleAuthorityMapper.saveRoleAuth(map);
	}
	
	public int delRoleAuthByRoleId(Integer roleId){
		return roleAuthorityMapper.delRoleAuthByRoleId(roleId);
	}

	public int delRoleAuthByRoleIdAndAuthId(RoleAuthority record){
		return roleAuthorityMapper.delRoleAuthByRoleIdAndAuthId(record);
	}
	
	
	/**
	 * @param roleId
	 * @return
	 */
	public List<RoleAuthority> getRoleAuthListByRoleId(Integer roleId){
		return roleAuthorityMapper.selectByRoleId(roleId);
	}
	

	
}
