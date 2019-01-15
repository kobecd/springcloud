package com.rongyi.easy.smart.param;

/**
 * Created by yandong on 2018/4/4.
 */
public class FileUploadparam {

    private String mallId;

    private String suffix;

    private Integer length;

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }


    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public String toString() {
        return "FileUploadparam{" +
                "mallId='" + mallId + '\'' +
                ", suffix='" + suffix + '\'' +
                ", length=" + length +
                '}';
    }
}
