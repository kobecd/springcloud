package com.arc.cache3.config;

/**
 * @author 叶超
 * @since 2019/3/19 13:49
 */

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.interceptor.CacheErrorHandler;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleCacheErrorHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.lang.reflect.Method;
import java.time.Duration;


/**
 * 配置CacheManager
 *
 * @author 叶超
 * @since 2019/03/19
 */
@Configuration
//@EnableCaching //在启动类上配置的
public class CacheManagerConfig extends CachingConfigurerSupport {

    @Value("${spring.application.name}")
    String application;

    public static final String KEY_GENERATOR_NAME = "keyGenerator";

    //todo CacheManager 1.X到2.X 构造函数变化了
//    @Bean
//    public CacheManager cacheManager(RedisTemplate<String, String> redisTemplate) {
//        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
//        cacheManager.setDefaultExpiration(60);
//        Map<String, Long> expiresMap = new HashMap<>();
//        expiresMap.put("Product", 5L);
//        cacheManager.setExpires(expiresMap);
//        return cacheManager;
//    }
//

    @Bean
    public CacheManager cacheManager(RedisConnectionFactory redisConnectionFactory) {
        // 设置缓存有效期
        RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofSeconds(10));
        return RedisCacheManager
                .builder(RedisCacheWriter.nonLockingRedisCacheWriter(redisConnectionFactory))
                .cacheDefaults(redisCacheConfiguration).build();
    }


    @Bean
    public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<Object, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);
        //使用 Jackson2JsonRedisSerializer 来序列化和反序列化redis的value值
        Jackson2JsonRedisSerializer serializer = new Jackson2JsonRedisSerializer(Object.class);

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        serializer.setObjectMapper(mapper);

        //使用 StringRedisSerializer 来序列化和反序列化redis的key值
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(serializer);
        template.afterPropertiesSet();
        return template;
    }


    @Value("${spring.application.name}")
    String applicationName;

    private final String COLON = ":";

    private final String AT = "@";

    /**
     * 无参数的方法缓存时候用到的key的一部分
     */
    private final static int NO_PARAM_KEY = 0;

    @Bean
    @Override
    public KeyGenerator keyGenerator() {
        return new KeyGenerator() {
            @Override
            public Object generate(Object target, Method method, Object... params) {
                StringBuilder sb = new StringBuilder(32);
                //注入的项目名称做为key的一部分【项目名称：全限定类名：方法名称：全部参数】
                sb.append(applicationName).append(COLON).append(target.getClass().getSimpleName()).append(COLON).append(method.getName());

                if (params != null && params.length > 0) {
                    // 参数值
                    for (Object p : params) {
                        sb.append(AT).append(p);
                        //todo 该进，是基本数据类型的则直接拼接，否则序列化为json后拼接
                        //                if (BeanHelper.isSimpleValueType(p.getClass())) {
                        //                    sb.append(object);
                        //                } else {
                        //                    sb.append(JsonHelper.toJson(p).hashCode());
                        //                }
                    }
                } else {
                    sb.append(NO_PARAM_KEY);
                }
                return sb.toString();
            }
        };
    }


    public interface CacheNames {

        String CACHE_SYSTEM = "SYSTEM";

        String CACHE_BUSINESS = "BUSINESS";

        String CACHE_CUSTOM = "CUSTOM";

        String CACHE_ORDER = "ORDER";

    }


    //---------------------

    /**
     * 如果cache出错，使框架调用我们定义的CacheErrorHandler ， 逻辑我们自己控制，我们会记录在日志里，方便排查，比如反序列化异常
     */
    @Override
    public CacheErrorHandler errorHandler() {
        return new LoggingCacheErrorHandler();
    }

    /**
     * 错误处理器LoggingCacheErrorHandler
     */

    /* non-public */ static class LoggingCacheErrorHandler extends SimpleCacheErrorHandler {
        private final Logger logger = LoggerFactory.getLogger(this.getClass());

        @Override
        public void handleCacheGetError(RuntimeException exception, Cache cache, Object key) {
            logger.error(String.format("cacheName:%s,cacheKey:%s", cache == null ? "unknown" : cache.getName(), key), exception);
            super.handleCacheGetError(exception, cache, key);
        }

        @Override
        public void handleCachePutError(RuntimeException exception, Cache cache, Object key, Object value) {
            logger.error(String.format("cacheName:%s,cacheKey:%s", cache == null ? "unknown" : cache.getName(), key), exception);
            super.handleCachePutError(exception, cache, key, value);
        }

        @Override
        public void handleCacheEvictError(RuntimeException exception, Cache cache, Object key) {
            logger.error(String.format("cacheName:%s,cacheKey:%s", cache == null ? "unknown" : cache.getName(), key), exception);
            super.handleCacheEvictError(exception, cache, key);
        }

        @Override
        public void handleCacheClearError(RuntimeException exception, Cache cache) {
            logger.error(String.format("cacheName:%s", cache == null ? "unknown" : cache.getName()), exception);
            super.handleCacheClearError(exception, cache);
        }
    }


}
