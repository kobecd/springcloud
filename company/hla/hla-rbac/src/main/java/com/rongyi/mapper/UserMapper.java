package com.rongyi.mapper;


import com.rongyi.entity.UserInfo;
import com.rongyi.entity.UserQueryCondition;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserInfo record);

    int updateByExample(@Param("record") UserInfo record);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    
    List<UserInfo> findPageList(Map<String, Object> map);

    public Integer findUsersCount(Map<String, Object> paraMap);

    UserInfo getUserByUserAccount(Map<String, Object> map);

    List<UserInfo> selectByExample(UserQueryCondition userQueryCondition);

   int countByExample(UserQueryCondition usersQueryCondition);
    
}