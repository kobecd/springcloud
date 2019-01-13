package com.arc.excel.service.sys.impl;

import com.arc.excel.mapper.SysFileMapper;
import com.arc.excel.model.entries.sys.SysFile;
import com.arc.excel.service.sys.SysFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/13 19:41
 */
@Service
public class SysFileServiceImpl implements SysFileService {

    @Autowired
    private SysFileMapper sysFileMapper;


    @Override
    public Long save(SysFile sysFile) {
        return sysFileMapper.save(sysFile)==0? null: sysFile.getId();
    }

    @Override
    public int delete(Long id) {
        return sysFileMapper.delete(id);
    }

    @Override
    public int update(SysFile sysFile) {
        return sysFileMapper.update(sysFile);
    }

    @Override
    public SysFile get(Long id) {
        return sysFileMapper.get(id);
    }

    @Override
    public List<SysFile> list() {
        return sysFileMapper.list();
    }
}
