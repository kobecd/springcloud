package com.rongyi.mapper;

import com.rongyi.entity.Authority;
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
    
    List<Authority> getAuthsByUserId(Integer userId);
}