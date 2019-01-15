package com.rongyi.easy.malllife.param;

/**
 * Created by yandong on 2017/12/6.
 */
public class UpParam {

    private String method;
    private String uri;
    private String date;
    private String contentMd5;
    private String saveKey;
    private Long expiration;
    private Long contentLength;

    public Long getContentLength() {
        return contentLength;
    }

    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContentMd5() {
        return contentMd5;
    }

    public void setContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
    }

    public String getSaveKey() {
        return saveKey;
    }

    public void setSaveKey(String saveKey) {
        this.saveKey = saveKey;
    }

    public Long getExpiration() {
        return expiration;
    }

    public void setExpiration(Long expiration) {
        this.expiration = expiration;
    }

}
