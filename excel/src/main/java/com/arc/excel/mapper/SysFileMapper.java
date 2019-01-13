package com.arc.excel.mapper;

import com.arc.excel.model.entries.sys.SysFile;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是持久层，目的是与数据库交互，
 */
public interface SysFileMapper {

    int save(SysFile sysFile);

    int delete(Long id);

    int update(SysFile sysFile);

    SysFile get(Long id);

    List<SysFile> list();

}
