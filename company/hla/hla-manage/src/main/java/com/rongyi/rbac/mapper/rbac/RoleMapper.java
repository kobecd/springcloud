package com.rongyi.rbac.mapper.rbac;

import com.rongyi.rbac.model.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RoleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Role record);

    int updateByExample(@Param("record") Role record);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    
    Integer getRoleCountByName(String name);
    
    int updateRoleById(Role role);
    
    List<Role> getroleListByCondition(Map map);
    
    int turnonRoleById(Map map);
    
    int updateStatusById(Map<String, Object> map);

    int getroleListCount(Map<String, Object> map);
    
    List<Role> getRoleListByStatus(Integer status);
}