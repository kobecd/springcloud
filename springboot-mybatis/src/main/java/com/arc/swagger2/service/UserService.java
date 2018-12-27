package com.arc.swagger2.service;


import com.arc.swagger2.model.entries.SysUser;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是服务层，目的是处理业务，
 *
 * @author yechao
 * @date 2018/12/21
 */
public interface UserService {

    Long save(SysUser SysUser);

    int delete(Long id);

    int update(SysUser SysUser);

    SysUser get(Long id);

    SysUser getByFilePath(String filePath);

    SysUser getByUrl(String url);

    List<SysUser> list();

    SysUser getByFilename(String filename);

    SysUser getLatest();
}
