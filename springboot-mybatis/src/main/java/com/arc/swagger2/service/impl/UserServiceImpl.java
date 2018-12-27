package com.arc.swagger2.service.impl;

import com.arc.swagger2.model.entries.SysUser;
import com.arc.swagger2.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: yechao
 * @date: 2018/12/26 11:31
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public Long save(SysUser SysUser) {
        return null;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public int update(SysUser SysUser) {
        return 0;
    }

    @Override
    public SysUser get(Long id) {
        return null;
    }

    @Override
    public SysUser getByFilePath(String filePath) {
        return null;
    }

    @Override
    public SysUser getByUrl(String url) {
        return null;
    }

    @Override
    public List<SysUser> list() {
        return null;
    }

    @Override
    public SysUser getByFilename(String filename) {
        return null;
    }

    @Override
    public SysUser getLatest() {
        return null;
    }
}
