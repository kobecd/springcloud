package com.rongyi.easy.tool.param;

import com.rongyi.core.common.util.StringUtil;

import java.io.Serializable;

/**
 * @author zhengling
 * 图片上传的参数对象
 */
public class ImageUploadParam implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 图片保存的相对路径,例如：commodity/original
     */
    private String picPath;

    /**
     * 文件后缀名，例如：.jpg,.png
     */
    private String suffix;

    /**
     * 图片文件字节流数组,此参数用于rpc接口的传参
     */
    private byte[] picByte;

    /**
     * 图片文件的base64编码,此参数用于http接口的传参
     */
    private String picBase64Code;

    /**
     * 是否压缩图片(0:不压缩,1:压缩)
     */
    private Integer compression;

    /**
     * 压缩后的宽度
     */
    private Integer width;

    /**
     * 压缩后的高度
     */
    private Integer height;

    public Integer getCompression() {
        return compression;
    }

    public void setCompression(Integer compression) {
        this.compression = compression;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public byte[] getPicByte() {
        return picByte;
    }

    public void setPicByte(byte[] picByte) {
        this.picByte = picByte;
    }

    public String getPicBase64Code() {
        return picBase64Code;
    }

    public void setPicBase64Code(String picBase64Code) {
        this.picBase64Code = picBase64Code;
    }

    @Override
    public String toString() {
        StringBuffer buffer=new StringBuffer("");
        if(StringUtil.isNotEmpty(this.getPicPath())){
            buffer.append(",picPath:"+this.getPicPath().toString());
        }
        if(StringUtil.isNotEmpty(this.getSuffix())){
            buffer.append(",suffix:"+this.getSuffix().toString());
        }
        if(this.getHeight()!=null){
            buffer.append(",height:"+this.getHeight());
        }
        if(this.getWidth()!=null){
            buffer.append(",width:"+this.getWidth());
        }
        if(this.getCompression()!=null){
            buffer.append(",compression:"+this.getCompression());
        }
        return buffer.toString();
    }
}
