package com.rongyi.easy.mcmc.entity;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by WUH on 2017/5/26.
 *
 */
public class BaseDO implements Serializable {
    @Id
    private ObjectId _id;

    private Date create_at;

    private String create_by;

    private Date update_at;

    private String update_by;

    private Integer valid;   //0:正常, 1:删除

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "BaseDO{" +
                "_id=" + _id +
                '}';
    }
}
