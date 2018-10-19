//package main.java.springboot.config;
////
////import com.fasterxml.jackson.annotation.JsonAutoDetect;
////import com.fasterxml.jackson.annotation.PropertyAccessor;
////import com.fasterxml.jackson.databind.ObjectMapper;
////import org.springframework.beans.factory.annotation.Value;
////import org.springframework.cache.CacheManager;
////import org.springframework.cache.annotation.CachingConfigurerSupport;
////import org.springframework.cache.annotation.EnableCaching;
////import org.springframework.cache.interceptor.KeyGenerator;
////import org.springframework.context.annotation.Bean;
////import org.springframework.context.annotation.Configuration;
////import org.springframework.data.redis.cache.RedisCacheManager;
////import org.springframework.data.redis.connection.RedisConnectionFactory;
////import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
////import org.springframework.data.redis.core.RedisTemplate;
////import java.lang.reflect.Method;
////import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
////import org.springframework.data.redis.serializer.StringRedisSerializer;
////
//
//
//import com.fasterxml.jackson.annotation.JsonAutoDetect;
//import com.fasterxml.jackson.annotation.PropertyAccessor;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.cache.CacheManager;
//import org.springframework.cache.annotation.CachingConfigurerSupport;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.cache.interceptor.KeyGenerator;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.cache.RedisCacheManager;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.GenericToStringSerializer;
//import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//
//import java.lang.reflect.Method;
//
///**
// * Created by kangbin on 2017/9/5.
// */
//@Configuration
//@EnableCaching
//public class CacheConfig extends CachingConfigurerSupport {
//
////    @Bean
////    @Override
////    public KeyGenerator keyGenerator() {
////        return new KeyGenerator() {
////            @Override
////            public Object generate(Object target, Method method, Object... params) {
////                StringBuilder sb = new StringBuilder();
////                sb.append(target.getClass().getName());
////                sb.append(method.getName());
////                for (Object obj : params) {
////                    sb.append(obj.toString());
////                }
////                return sb.toString();
////            }
////        };
////    }
////
////    @Bean
////    public CacheManager cacheManager(RedisTemplate redisTemplate) {
////        RedisCacheManager rcm = new RedisCacheManager(redisTemplate);
////        return rcm;
////    }
//
////    @Bean
////    public RedisTemplate redisTemplate(RedisConnectionFactory factory) {
////        RedisTemplate template = new RedisTemplate();
////        template.setConnectionFactory(factory);
////        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
////        ObjectMapper om = new ObjectMapper();
////        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
////        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
////        jackson2JsonRedisSerializer.setObjectMapper(om);
////        template.setValueSerializer(jackson2JsonRedisSerializer);
////        template.afterPropertiesSet();
////        return template;
////    }
//
//    @Bean
//    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
//        RedisTemplate<String, String> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(redisConnectionFactory);
//        return redisTemplate;
//    }
//
//    @Bean
//    public CacheManager cacheManager(RedisTemplate<?, ?> redisTemplate) {
//        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
//        cacheManager.setDefaultExpiration(3600);//设置缓存时间，单位s
//        return cacheManager;
//    }
//
//
//}
