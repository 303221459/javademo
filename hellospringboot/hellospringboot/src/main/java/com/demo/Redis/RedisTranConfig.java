package com.demo.Redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by toutou on 2019/2/16.
 */
@Configuration
@EnableTransactionManagement
public class RedisTranConfig {
    @Bean
    public StringRedisTemplate customStringRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
        StringRedisTemplate template = new StringRedisTemplate();
        template.setConnectionFactory(redisConnectionFactory);
        template.setEnableTransactionSupport(true);
        return template;
    }
}
