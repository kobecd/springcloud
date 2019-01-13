package com.rongyi.rbac.mapper;

import com.rongyi.rbac.model.entity.UserInfo;

import java.util.Map;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/11 23:20
 */
public interface UserMapper {

    UserInfo getUserByUserAccount(Map<String, Object> paraMap);
}
