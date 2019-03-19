//package com.arc.cache2.service;
//
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.stereotype.Service;
//
///**
// * @author 叶超
// * @since 2019/3/19 13:51
// */
//@Service
//public class CacheDemoService {
//
//    @Cacheable(key = "key",
//            cacheManager = CacheManagerConfig.CacheManagerNames.EHCACHE_CACHE_MAANGER,
//            cacheNames = CacheManagerConfig.EhCacheNames.CACHE_10MINS)
//    public String demo(String key) {
//        return "abc" + key;
//    }
//
////    @Cacheable(value = "users", key = "'user_'.concat(#p0)")
//    @Cacheable(key = "#p0.id",
//            cacheNames = CacheManagerConfig.CacheNames.CACHE_15MINS)
//    public String demo2(String key) {
//        return "abc" + key;
//    }
//}
