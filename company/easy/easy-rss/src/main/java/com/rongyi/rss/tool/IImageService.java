package com.rongyi.rss.tool;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.tool.param.ImageUploadParam;

/**
 * @author zhengling
 * 图片服务
 */
public interface IImageService {

    /**
     * 图片上传,可压缩后上传
     * @param imageUploadParam 图片上传相关参数对象
     * @return 返回上传后的图片地址
     */
    public ResponseVO uploadImage(ImageUploadParam imageUploadParam);
}
