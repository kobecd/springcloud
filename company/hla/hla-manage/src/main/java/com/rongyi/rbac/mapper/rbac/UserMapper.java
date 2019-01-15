package com.rongyi.rbac.mapper.rbac;


import com.rongyi.rbac.model.entity.UserInfo;
import com.rongyi.rbac.model.entity.UserQueryCondition;
import com.rongyi.rbac.model.param.UserParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") UserInfo record);

    int updateByExample(@Param("record") UserInfo record);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    
    List<UserInfo> findPageList(Map<String, Object> map);

    Integer findUsersCount(Map<String, Object> paraMap);

    UserInfo getUserByUserAccount(Map<String, Object> map);

   int countByExample(UserQueryCondition usersQueryCondition);

   List<UserInfo> queryUserList(UserParam param);

   int queryUserListCount(UserParam param);
    
}