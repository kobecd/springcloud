package com.rongyi.rbac.service.impl;

import com.rongyi.rbac.model.dao.RoleDao;
import com.rongyi.rbac.model.dao.UserDao;
import com.rongyi.rbac.model.dao.UserRoleDao;
import com.rongyi.rbac.model.entity.Authority;
import com.rongyi.rbac.model.entity.RoleAuthority;
import com.rongyi.rbac.model.param.RoleAuthParam;
import com.rongyi.rbac.service.RoleAuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Description：角色权限
 * Author:  Administrator
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * Administrator          2018/8/20 14:54          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
@Service
@Slf4j
public class RoleAuthServiceImpl implements RoleAuthService {

    @Autowired
    private RoleDao roleDao;
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserRoleDao userRoleDao;

    public void resetRoleUser(RoleAuthParam param)throws Exception{

        List<Authority> oldAuthorityList = userDao.getAuthsByUserId(param.getUserId());

        List<Integer> userRoleList =  userRoleDao.roleIdsByUserId(param.getUserId());
        int roleId = userRoleList.get(0);

        Set<String> insertAuthNameList =  new HashSet<>( );
        Set<String>  oldAuthList =  new HashSet<>( );
        Set<String> newAuthList = new HashSet<>(  );
        newAuthList.addAll(param.getAuthName());

        //权限变更，删除权限
        if(!oldAuthorityList.isEmpty()) {
            for (Authority auth : oldAuthorityList) {
                if (!newAuthList.contains( auth.getValue() )) {
                    RoleAuthority record = new RoleAuthority();
                    record.setAuthorityId( auth.getId() );
                    record.setRoleId( new Long( roleId ) );
                    roleDao.delRoleAuthByRoleIdAndAuthId( record );
                }
                oldAuthList.add( auth.getValue() );
            }
        }

        if(!newAuthList.isEmpty()) {
            //权限变更，新增权限
            for (String newAuth: newAuthList) {
                if(!oldAuthList.contains(newAuth)) {
                    insertAuthNameList.add(newAuth);
                }
            }
        }

        if(oldAuthorityList.isEmpty()) {
            for (String authName: newAuthList) {
                Authority authority = roleDao.getAuthorityListByValue(authName);
                if(authority == null) {
                    continue;
                }
                Map<String, Object> map = new HashMap<String, Object>();
                Set<Integer> authorityList = new HashSet<>(  );
                authorityList.add(authority.getId());
                map.put("roleId", roleId);
                map.put("auths", authorityList);
                roleDao.saveRoleAuth(map);
            }

        }else if(!insertAuthNameList.isEmpty()) {
            for (String authName: insertAuthNameList) {
                Authority authority = roleDao.getAuthorityListByValue(authName);
                if(authority == null) {
                    continue;
                }
                Map<String, Object> map = new HashMap<String, Object>();
                Set<Integer> authorityList = new HashSet<>(  );
                authorityList.add(authority.getId());
                map.put("roleId", roleId);
                map.put("auths", authorityList);
                roleDao.saveRoleAuth(map);
            }
        }

    }

}
