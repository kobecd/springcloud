package com.rongyi.easy.malllife.entity;

/**
 * Created by yandong on 2017/12/6.
 */
public class UpAuthorization {

    private String authorization;

    private String policy;

    private Integer id;

    private String url;

    private String sourcePrefix = "http://rongyi.b0.upaiyun.com/";

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSourcePrefix() {
        return sourcePrefix;
    }

    public void setSourcePrefix(String sourcePrefix) {
        this.sourcePrefix = sourcePrefix;
    }

    @Override
    public String toString() {
        return "UpAuthorization{" +
                "authorization='" + authorization + '\'' +
                ", policy='" + policy + '\'' +
                ", id=" + id +
                ", url='" + url + '\'' +
                ", sourcePrefix='" + sourcePrefix + '\'' +
                '}';
    }
}
