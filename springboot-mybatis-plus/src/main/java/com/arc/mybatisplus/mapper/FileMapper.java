package com.arc.mybatisplus.mapper;

import com.arc.mybatisplus.model.entries.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是持久层，目的是与数据库交互，
 */
public interface FileMapper {

    int save(User user);

    int delete(Long id);

    int update(User user);

    List<User> list();

    User getLatest();

    User get(Long id);

    User getByFilename(@Param("name") String filename);

    User getByFilePath(@Param("filePath") String filePath);

    User getByUrl(@Param("url") String url);
}
