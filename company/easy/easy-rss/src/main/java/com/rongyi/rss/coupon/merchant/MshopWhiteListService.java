package com.rongyi.rss.coupon.merchant;

import com.rongyi.easy.coupon.entity.MshopWhiteList;

import java.util.List;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/2/2 13:00
 * Package:com.rongyi.rss.coupon.merchant
 * Project:easy-common
 */
public interface MshopWhiteListService {
     MshopWhiteList selectByPrimaryKey(Integer id);

     int deleteByPrimaryKey(Integer id);

     int insertSelective(MshopWhiteList mshopWhiteList);

     int updateByPrimaryKeySelective(MshopWhiteList mshopWhiteList);

     int deleteByMerchantId(String merchantId);

     List<MshopWhiteList> findAllShopWhiteList();

     List<MshopWhiteList> findAllMallWhiteList();

     List<MshopWhiteList> findAllGroupWhiteList();

     boolean isExistMerchant(String merchantId);
}
