package com.rongyi.easy.tool.param;

import com.rongyi.core.common.util.StringUtil;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhengling
 * 发送邮件相关的参数
 */
public class MailMessageParam implements Serializable {

    /**
     * 邮件主题
     */
    private String subject;

    /**
     * 邮件内容
     */
    private String content;

    /**
     * 接受者地址列表
     */
    private List<String> toAddress;

    /**
     * 抄送人地址列表
     */
    private List<String> ccAddress;

    /**
     * 密送人地址
     */
    private List<String> bccAddress;

    /**
     * 附件列表,支持同时发送多个附件
     */
    private List<AttachmentParam> attachmentList;



    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getToAddress() {
        return toAddress;
    }

    public void setToAddress(List<String> toAddress) {
        this.toAddress = toAddress;
    }

    public List<String> getCcAddress() {
        return ccAddress;
    }

    public void setCcAddress(List<String> ccAddress) {
        this.ccAddress = ccAddress;
    }

    public List<String> getBccAddress() {
        return bccAddress;
    }

    public void setBccAddress(List<String> bccAddress) {
        this.bccAddress = bccAddress;
    }

    public List<AttachmentParam> getAttachmentList() {
        return attachmentList;
    }

    public void setAttachmentList(List<AttachmentParam> attachmentList) {
        this.attachmentList = attachmentList;
    }

    @Override
    public String toString() {
        StringBuffer buffer=new StringBuffer("");
        if(StringUtil.isNotEmpty(this.getSubject())){
            buffer.append(",subject:"+this.getSubject().toString());
        }
        if(StringUtil.isNotEmpty(this.getContent())){
            buffer.append(",content:"+this.getContent().toString());
        }
        if(this.getToAddress()!=null&&this.getToAddress().size()>0){
            buffer.append(",toAddress:"+this.getToAddress().toString());
        }
        if(this.getCcAddress()!=null&&this.getCcAddress().size()>0){
            buffer.append(",ccAddress:"+this.getCcAddress().toString());
        }
        if(this.getBccAddress()!=null&&this.getBccAddress().size()>0){
            buffer.append(",bccAddress:"+this.getBccAddress().toString());
        }
        if(this.getAttachmentList()!=null){
            buffer.append(",attachmentSize:"+this.getAttachmentList().size());
        }
        return buffer.toString();
    }
}
