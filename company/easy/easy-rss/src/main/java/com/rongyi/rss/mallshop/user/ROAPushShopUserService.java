package com.rongyi.rss.mallshop.user;

import com.rongyi.easy.rmmm.entity.RmmmUserInfoEntity;

import java.util.List;
import java.util.Map;

/**
 * Description:推送摩店查询接口
 * Author: yb
 * DATE: 2016/1/25 20:20
 * Package:com.rongyi.service.user
 * Project:easy-common
 */
public interface ROAPushShopUserService {
     List<RmmmUserInfoEntity> findByShopMid(String shopMid, List<Integer> identities);

     List<RmmmUserInfoEntity> findAllUsers(Integer type);
    
     List<RmmmUserInfoEntity> findByUserBuyerParam(Map<String, Object> param);
     int findByUserBuyerTotal(Map<String, Object> param);
    /**
     *
     * @param phone
     * @param type 1:买手 0：其他身份
     * @return
     */
     List<RmmmUserInfoEntity> findUserByPhone(String phone,Integer type);

}
