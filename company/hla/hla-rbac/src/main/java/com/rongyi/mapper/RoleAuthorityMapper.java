package com.rongyi.mapper;

import com.rongyi.entity.RoleAuthority;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RoleAuthorityMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(RoleAuthority record);

    int insertSelective(RoleAuthority record);


    RoleAuthority selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleAuthority record);

    int updateByExample(@Param("record") RoleAuthority record);

    int updateByPrimaryKeySelective(RoleAuthority record);

    int updateByPrimaryKey(RoleAuthority record);
    
    int save(Map map);
    
	int delRoleAuthByRoleId(Integer roleId);
	
	int saveRoleAuth(Map<String, Object> map);
	
	List<RoleAuthority> selectByRoleId(Integer roleId);
}