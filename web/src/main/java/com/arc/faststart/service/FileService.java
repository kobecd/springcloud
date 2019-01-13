package com.arc.faststart.service;

import com.arc.faststart.model.domain.File;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是服务层，目的是处理业务，
 */
public interface FileService {

    /**
     * 条件查询：   根据ID获取一条数据
     *
     * @param id 参数id为long类型，是数据的主键
     * @return
     */
    File get(Long id);

    /**
     * 保存文件
     * 注意保存成功的数据id自增并返回设置在该对象中
     *
     * @param file 参数file是一个对象
     * @return
     */
    Long save(File file);

    /**
     * 条件查询： 根据filePath获取一条数据
     *
     * @param filePath
     * @return
     */
    File getByFilePath(String filePath);

    /**
     * 条件查询： 根据url获取一条数据
     *
     * @param url
     * @return
     */
    File getByUrl(String url);

    /**
     * 查询全部数据
     * 注意数据量小的时候可以一次查出， 当数据数量非常大之后应作分页查询
     *
     * @return
     */
    //@TODO  去掉改该接口并给出新的分页查询接口
    List<File> list();

}
