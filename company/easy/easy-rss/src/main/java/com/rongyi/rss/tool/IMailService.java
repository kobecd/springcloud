package com.rongyi.rss.tool;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.tool.param.MailMessageParam;

/**
 * @author zhengling
 * 邮件发送接口
 */
public interface IMailService {

    /**
     * 发送普通文本邮件信息
     * @param mailMessageParam 邮件内容相关参数
     * @return 返回发送后的状态,成功状态码为0
     */
    public ResponseVO sendMail(MailMessageParam mailMessageParam);

    /**
     * 发送html格式的邮件信息
     * @param mailMessageParam 邮件内容相关参数
     * @return 返回发送后的状态,成功状态码为0
     */
    public ResponseVO sendHtmlMail(MailMessageParam mailMessageParam);

    /**
     * 发送带附件的邮件信息,邮件内容支持html格式
     * @param mailMessageParam 邮件内容相关参数
     * @return 返回发送后的状态,成功状态码为0
     */
    public ResponseVO sendAttachmentMail(MailMessageParam mailMessageParam);

    /**
     * 发送带静态资源的邮件,邮件内容中有图片的场景，例如："<img src=\'cid:" + rscId + "\' >"
     * @param mailMessageParam 邮件内容相关参数
     * @return 返回发送后的状态,成功状态码为0
     */
    public ResponseVO sendInlineResourceMail(MailMessageParam mailMessageParam);
}
