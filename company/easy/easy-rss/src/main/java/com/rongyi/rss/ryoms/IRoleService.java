package com.rongyi.rss.ryoms;

import com.rongyi.easy.ryoms.entity.RoleDetailVO;
import com.rongyi.easy.ryoms.user.param.RoleListParam;

import java.util.List;

public interface IRoleService {

    /**
     * 根据角色id查询角色详情
     * @param id
     * @return
     */
    public RoleDetailVO roleById(Integer id);

    /**
     * 查询角色列表(接口)
     * @param param
     * @return
     */
    public List<RoleDetailVO> roleList(RoleListParam param);

    /**
     * 根据条件获取角色总数
     * @param param
     * @return
     */
    public Integer getRolesCount(RoleListParam param);
}
