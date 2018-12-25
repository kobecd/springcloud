package com.arc.mybatisplus.service.impl;


import com.arc.mybatisplus.mapper.FileMapper;
import com.arc.mybatisplus.model.entries.SystemFile;
import com.arc.mybatisplus.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private FileMapper mapper;

    @Override
    public Long save(SystemFile systemFile) {
        mapper.save(systemFile);
        return systemFile.getId();
    }

    @Override
    public SystemFile get(Long id) {
        return mapper.get(id);
    }

    @Override
    public SystemFile getByFilePath(String filePath) {
        return mapper.getByFilePath(filePath);
    }

    @Override
    public SystemFile getByUrl(String url) {
        return mapper.getByUrl(url);
    }

    @Override
    public List<SystemFile> list() {
        List<SystemFile> list = mapper.list();
        System.out.println(list.size());
        System.out.println(list.size());
        System.out.println(list.size());
        System.out.println(list.size());
        return list;
    }

    @Override
    public int delete(Long id) {
        return mapper.delete(id);
    }

    @Override
    public int update(SystemFile systemFile) {
        return mapper.update(systemFile);
    }

    @Override
    public SystemFile getByFilename(String filename) {
        return mapper.getByFilename(filename);
    }

    @Override
    public SystemFile getLatest() {
        return mapper.getLatest();
    }
}