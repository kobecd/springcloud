package com.rongyi.rbac.mapper.rbac;

import com.rongyi.rbac.model.entity.Authority;
import com.rongyi.rbac.model.entity.AuthorityQueryCondition;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface AuthorityMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(Authority record);

    int insertSelective(Authority record);

    Authority selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Authority record);

    int updateByExample(@Param("record") Authority record);

    int updateByPrimaryKeySelective(Authority record);

    int updateByPrimaryKey(Authority record);
    
    List<Authority> getAuthorityListByParentId(Map map);

    Authority getAuthorityListByValue(Map map);
    
    List<Authority> getAuthsByUserId(Integer userId);

    List<Authority> selectByExample(AuthorityQueryCondition example);
}