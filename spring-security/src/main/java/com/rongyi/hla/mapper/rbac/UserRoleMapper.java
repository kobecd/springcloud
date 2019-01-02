package com.rongyi.hla.mapper.rbac;

import com.rongyi.rbac.model.entity.UserRole;
import com.rongyi.rbac.model.entity.UserRoleQueryCondition;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserRoleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserRole record);

    int updateByExample(@Param("record") UserRole record);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
    
    int save(Map map);

    List<UserRole> queryRoleList(UserRole record);

    List<UserRole> selectByExample(UserRoleQueryCondition userRoleQueryCondition);

    int deleteByExample(UserRoleQueryCondition userRoleQueryCondition);

}