package com.arc.excel.service.sys;

import com.arc.excel.model.entries.sys.SysUser;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是服务层，目的是处理业务，
 *
 * @author yechao
 * @date 2018/12/21
 */
public interface SysUserService {

    Long save(SysUser SysUser);

    int delete(Long id);

    int update(SysUser SysUser);

    SysUser get(Long id);

    SysUser getByFilePath(String filePath);

    List<SysUser> list();

}
