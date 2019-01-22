package com.arc.jpa.repository;

import com.arc.jpa.model.domain.ProjectRequirement;
import com.arc.jpa.model.domain.SysUser;
import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/10 15:04
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long> {

    /**
     * 双in 查询测试
     *
     * @param ids
     * @param avatars
     * @return
     */
    List<SysUser> findAllByIdInAndAndAvatarIn(@Param("id") ArrayList<Long> ids, @Param("avatar") ArrayList<String> avatars);

    /**
     * 测试多条件查询  包含in 和 普条字段
     *
     * @param ids
     * @param avatars
     * @param status
     * @return
     */
    List<SysUser> findAllByIdInAndAndAvatarInAndStatus(@Param("id") ArrayList<Long> ids, @Param("avatar") ArrayList<String> avatars, @Param("status") Integer status);
}
