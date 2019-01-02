package com.rongyi.rbac.service;

import com.rongyi.rbac.model.param.RoleListParam;
import com.rongyi.rbac.model.vo.RoleDetailVO;

import java.util.List;

/**
 * Description：用户角色
 * Author:  caijie
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * Administrator          2018/8/16 19:27          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public interface RoleService {

    /**
     * 根据角色id查询角色详情
     * @param id
     * @return
     */
     RoleDetailVO roleById(Integer id);

    /**
     * 查询角色列表(接口)
     * @param param
     * @return
     */
     List<RoleDetailVO> roleList(RoleListParam param);

    /**
     * 根据条件获取角色总数
     * @param param
     * @return
     */
     Integer getRolesCount(RoleListParam param);
}
