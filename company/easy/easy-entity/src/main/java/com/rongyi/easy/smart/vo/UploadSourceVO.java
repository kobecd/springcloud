package com.rongyi.easy.smart.vo;

import com.rongyi.easy.smart.entity.Source;

/**
 * Created by yandong on 2017/12/8.
 */
public class UploadSourceVO extends Source {

    private Integer originalSize;

    public Integer getOriginalSize() {
        return originalSize;
    }

    public void setOriginalSize(Integer originalSize) {
        this.originalSize = originalSize;
    }

    @Override
    public String toString() {
        return "UploadSourceVO{" +
                "originalSize=" + originalSize +
                "} " + super.toString();
    }
}
