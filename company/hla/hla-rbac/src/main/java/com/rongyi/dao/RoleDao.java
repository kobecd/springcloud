package com.rongyi.dao;

import com.rongyi.entity.Authority;
import com.rongyi.entity.Role;
import com.rongyi.entity.RoleAuthority;
import com.rongyi.mapper.AuthorityMapper;
import com.rongyi.mapper.RoleAuthorityMapper;
import com.rongyi.mapper.RoleMapper;
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
	
	public int saveRoleAuthority(Map map){
		return roleAuthorityMapper.save(map);
	}
	
	public int saveRoleAuth(Map<String,Object> map){
		return roleAuthorityMapper.saveRoleAuth(map);
	}
	
	public int delRoleAuthByRoleId(Integer roleId){
		return roleAuthorityMapper.delRoleAuthByRoleId(roleId);
	}
	
	
	/**
	 * @param roleId
	 * @return
	 */
	public List<RoleAuthority> getRoleAuthListByRoleId(Integer roleId){
		return roleAuthorityMapper.selectByRoleId(roleId);
	}
	
	public int countByExample(Map map){
//		roleQueryCondition condition = new roleQueryCondition();
//		if(map.get("name")!=null&&!"".equals(map.get("name"))){
//			condition.createCriteria().andNameLike("%"+map.get("name").toString()+"%");
//		}
//		if(map.get("status")!=null&&!"".equals(map.get("status"))){
//			System.out.println("-------------"+Byte.parseByte(map.get("status").toString()));
//			condition.createCriteria().andStatusEqualTo(Byte.parseByte(map.get("status").toString()));
//		}
		return roleMapper.getroleListCount(map);
	}
	
	public List<Role> getRoleListByStatus(Integer status){
		return roleMapper.getRoleListByStatus(status);
	}
	
}
