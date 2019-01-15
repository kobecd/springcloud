package com.rongyi.vo;

import com.rongyi.entity.Authority;
import com.rongyi.entity.Role;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class RoleDetailVO implements Serializable {
	
	private Integer id;//id
	private String name;//角色名称
	private Byte status;//状态
	private String remark;//备注
	private Date createAt;//创建时间
    private Date updateAt;
    private Integer createBy;
    private Integer updateBy;
    private String reason;
    private String createName;
    private String updateName;
    private Date disableAt;
    private List<Authority> authList;//角色权限列表

    public RoleDetailVO(){

    }

    public RoleDetailVO(Role role){
        this.id = role.getId();
        this.name = role.getName();
        this.remark = role.getMemo();//备注
        this.status = role.getStatus();
        this.createAt = role.getCreateAt();//创建时间
        this.updateAt = role.getUpdateAt();//修改时间
        this.createName = role.getCreateName();//创建人名称
        this.updateName = role.getUpdateName();//修改人名称
        this.disableAt = role.getDisableAt();//停用时间
        this.reason = role.getReason();//停用理由
    }
}
