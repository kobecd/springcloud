package com.rongyi.service;

import com.rongyi.param.RoleListParam;
import com.rongyi.vo.RoleDetailVO;

import java.util.List;

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
