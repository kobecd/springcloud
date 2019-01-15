package com.rongyi.mapper;

import com.rongyi.entity.UserRole;
import com.rongyi.entity.UserRoleQueryCondition;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
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