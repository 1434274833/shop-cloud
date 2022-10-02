package com.shop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * redis配置类，解决乱码问题
 */
@Configuration
public class RedisTemplateConfig {
    @Autowired
    RedisTemplate redisTemplate;

    @Bean
    public RedisTemplate redisTemplateInit() {
        redisTemplate.setStringSerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(Object.class));
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }


    /**
     * 读写分离
     * ReadFrom的取值及读取方式的对应关系如下，其中，REPLICA会一直读取的同一个从节点，ANY_REPLICA则会随机选择
     * ReadFrom	读取方式
     * MASTER / UPSTREAM	仅读取主节点
     * MASTER_PREFERRED / UPSTREAM_PREFERRED	优先读取主节点，如果主节点不可用，则读取从节点
     * REPLICA/ SLAVE（已废弃）	仅读取从节点
     * REPLICA_PREFERRED / SLAVE_PREFERRED（已废弃）	优先读取从节点，如果从节点不可用，则读取主节点
     * NEAREST	从最近节点读取
     * ANY	从任何节点读取
     * ANY_REPLICA	从任意一个从节点读取
     * @return
     */
//    @Bean
//    public LettuceClientConfigurationBuilderCustomizer lettuceClientConfigurationBuilderCustomizer() {
//
//        return builder -> builder.readFrom(ReadFrom.REPLICA_PREFERRED);
//    }


}
