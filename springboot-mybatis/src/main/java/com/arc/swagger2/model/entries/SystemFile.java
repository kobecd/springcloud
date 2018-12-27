package com.arc.swagger2.model.entries;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 文件信息记录之实体
 *
 * @author yechao
 * @date 2018/12/21
 */
@Getter
@Setter
@AllArgsConstructor
public class SystemFile extends BaseModel {

    private static final long serialVersionUID = 1L;

    private Long id; //主键
    private String url; // 文件地址
    private String path; // 文件本地地址
    private String name; //文件名称
    private String suffix; //文件后缀
    private Date createDate;//创建时间
    private Date updateDate;//更新时间


    public SystemFile() {
    }

    public SystemFile(String url, String path, String name, String suffix) {
        this.url = url;
        this.path = path;
        this.name = name;
        this.suffix = suffix;
    }
}
