

1向容器中注入缓存管理器
2配置改管理器的key以及过期时间
3使用

注意： 缓存的名称用内部类接口去定义，方便使用
默认的redisCacheManager
@param redisTemplate 通过参数注入，这里没有手动给它做配置。在引入了redis的jar包，并且往
application.yml里添加了spring.redis的配置项，springboot的autoconfig会自动生成一个
redisTemplate的bean
     


    /**
     * cacheManager名字
     */
    public interface CacheManagerNames {
        /**
         * redis
         */
        String REDIS_CACHE_MANAGER = "redisCacheManager";

        /**
         * ehCache
         */
        String EHCACHE_CACHE_MAANGER = "ehCacheCacheManager";
    }
