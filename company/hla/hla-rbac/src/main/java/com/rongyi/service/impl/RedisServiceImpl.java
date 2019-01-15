//package com.rongyi.service.impl;
//
//import com.rongyi.redis.RedisClientTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class RedisServiceImpl implements RedisService {
//
//        @Autowired
//        private RedisClientTemplate template;
//
//        @Override
//        public void set(String key, String strValue)throws Exception {
//            template.set(key,strValue);
//        }
//
//        @Override
//        public void setObject(String key, Object object) throws Exception {
//            template.setObject(key, object);
//        }
//
//
//        @Override
//        public <T> T getByKey(String key, Class<T> clazz)throws Exception {
//            return template.get(key,clazz);
//        }
//
//        @Override
//        public String getValueByKey(String key)throws Exception {
//            return template.get(key);
//        }
//
//        @Override
//        public Long getLenByKey(String key) {
//            return template.llen(key);
//        }
//
//        @Override
//        public String getfirstValue(String key) {
//            return template.lpop(key);
//        }
//
//        @Override
//        public Long rpush(String key, String vual) {
//            return template.rpush(key,vual);
//        }
//
//        @Override
//        public Long expire(String key, int seconds) {
//            return template.expire(key,seconds);
//        }
//
//        @Override
//        public Boolean del(String key) throws Exception {
//            return template.del(key);
//        }
//}
