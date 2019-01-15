package com.rongyi.easy.tool.param;

import java.io.Serializable;

/**
 * @author zhengling
 * 附件参数信息
 */
public class AttachmentParam implements Serializable {

    /**
     * 附件文件的字节流,此参数用于rpc接口的传参
     */
    private byte[] attachmentByte;

    /**
     * 文件的base64编码,此参数用于http接口的传参
     */
    private String attachmentBase64Code;

    /**
     * 附件名称
     */
    private String attachmentName;

    /**
     * 静态资源图片id,发送静态资源图片邮件才需要此字段。普通附件不需要此字段
     */
    private String cid;

    public byte[] getAttachmentByte() {
        return attachmentByte;
    }

    public void setAttachmentByte(byte[] attachmentByte) {
        this.attachmentByte = attachmentByte;
    }

    public String getAttachmentName() {
        return attachmentName;
    }

    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getAttachmentBase64Code() {
        return attachmentBase64Code;
    }

    public void setAttachmentBase64Code(String attachmentBase64Code) {
        this.attachmentBase64Code = attachmentBase64Code;
    }
}
