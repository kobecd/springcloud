package com.arc.security.db.mapper;

import com.arc.security.db.model.domain.sys.User;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * User 表数据库控制层接口
 */
public interface UserMapper extends SuperMapper<User> {

    /**
     * 自定义注入方法
     */
    int deleteAll();

    @Select("select test_id as id, name, age, test_type from user")
    List<User> selectListBySQL();

    List<User> selectListByWrapper(@Param("ew") Wrapper wrapper);


    int save(User user);

    int delete(Long id);

    int update(User user);

    User get(Long id);

    User getByUsername(@Param("username") String username);

//    List<User> list();
}
