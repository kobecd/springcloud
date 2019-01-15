package com.rongyi.vo;

import com.rongyi.entity.Authority;
import com.rongyi.entity.Role;

import java.io.Serializable;
import java.util.List;

public class RoleAuthDeatilVO implements Serializable {

        /**
         *
         */
        private static final long serialVersionUID = 4031492158951000040L;
        private Integer id;//id
        private String name;//角色名称
        private Byte status;//0启用，1停用
        private String remark;//备注
        private List<Authority> authList;//权限列表

        public RoleAuthDeatilVO(){

        }

        public RoleAuthDeatilVO(Role role){
            this.id = role.getId();//角色id
            this.name = role.getName();//角色名称
            this.status = role.getStatus();//状态 0 启用，1停用
            this.remark = role.getMemo();//备注
        }

        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public Byte getStatus() {
            return status;
        }
        public void setStatus(Byte status) {
            this.status = status;
        }
        public String getRemark() {
            return remark;
        }
        public void setRemark(String remark) {
            this.remark = remark;
        }
        public List<Authority> getAuthList() {
            return authList;
        }
        public void setAuthList(List<Authority> authList) {
            this.authList = authList;
        }
        @Override
        public String toString() {
            return "RoleAuthDeatilVO [id=" + id + ", name=" + name + ", status="
                    + status + ", remark=" + remark + ", authList=" + authList
                    + "]";
        }

    }
