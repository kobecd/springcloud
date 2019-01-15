package com.rongyi.hla.service.product.impl;

import com.rongyi.hla.mapper.product.FileMapper;
import com.rongyi.hla.service.product.FileService;
import com.rongyi.entity.product.File;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private FileMapper fileMapper;

    @Override
    public Integer save(File file) {
        fileMapper.save(file);
        return file.getId();
    }

    @Override
    public File get(int id) {
        return fileMapper.get(id);
    }

    @Override
    public File getByFilePath(String filePath) {
        return fileMapper.getByFilePath(filePath);
    }

    @Override
    public File getByUrl(String url ) {
        return fileMapper.getByUrl(url);

    }
}
