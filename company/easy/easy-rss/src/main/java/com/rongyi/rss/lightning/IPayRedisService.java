package com.rongyi.rss.lightning;

import java.util.Set;

/**
 * 支付项目redis操作
 */
public interface IPayRedisService {


    /**
     * 设置参数
     * @param key
     * @param strValue
     */
    public void  set(String key, String strValue);


    /**
     * 设置对象
     * @param key
     * @param object
     */
    public void  setObject(String key, Object object)throws Exception;


    /**
     *
     * @param key
     * @param value
     * @return
     */
    public Long setnx(String key, String value)throws Exception ;

    /**
     *
     * @param key
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T getByKey(String key, Class<T> clazz)throws Exception;


    /**
     * 获取keyValue
     * @param key
     * @return
     */
    public String getValueByKey(String key);


    /**
     *
     * @param key
     * @return
     */
    public Long getLenByKey(String key)throws Exception;


    /**
     * 获取第一个value
     * @param key
     * @return
     */
    public String getfirstValue(String key)throws Exception;

    /**
     * 添加参数
     * @param key
     * @param vual
     * @return
     */
    public Long rpush(String key, String vual)throws Exception;

    /**
     * 设置时长
     * @param key
     * @param seconds
     * @return
     */
    public Long expire(String key, int seconds);

    public Boolean del(String key)throws Exception;

    /**
     * 批量删除
     * @param key
     * @return
     * @throws Exception
     */
    //public Boolean batchDel(String key)throws Exception;

    /**
     * 匹配keys
     * @return
     * @throws Exception
     */
    public Set<byte[]> getKeys(String key) throws Exception;

}
