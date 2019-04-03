package com.arc.client.website.vo;

public class JsonResult {
    private int id;//代码    0--成功  非零---异常
    private String message;//信息
    private boolean success;//成功与否
    private Object resulet;//附加参数

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getResulet() {
        return resulet;
    }

    public void setResulet(Object resulet) {
        this.resulet = resulet;
    }
}
