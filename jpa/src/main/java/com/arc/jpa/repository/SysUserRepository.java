package com.arc.jpa.repository;

import com.arc.jpa.model.domain.SysUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * Repository层中为了支持这样的查询，
 * sysUserRepository需要继承JpaRepository（基本查询），
 * JpaSpecificationExecutor（分页），这个接口是不需要再去实现的，到了Repository层就行，再对此进行扩充（比Mybatis简单多了）。
 * @author: yechao
 * @date: 2019/1/10 15:04
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long>/*, JpaSpecificationExecutor<SysUser>*/ {

    //public interface sysUserRepository extends JpaRepository<SysCaptchaEntity, String>, JpaSpecificationExecutor<SysCaptchaEntity> {
    //
    //}
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

    Page<SysUser> findAll(Specification<SysUser> example, Pageable pageable);

}
