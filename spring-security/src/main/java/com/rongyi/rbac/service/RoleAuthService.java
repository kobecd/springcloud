package com.rongyi.rbac.service;

import com.rongyi.rbac.model.param.RoleAuthParam;

public interface RoleAuthService {

    void resetRoleUser(RoleAuthParam param)throws Exception;

}
