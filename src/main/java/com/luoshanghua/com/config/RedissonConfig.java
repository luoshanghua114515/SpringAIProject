package com.luoshanghua.com.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    @Bean
    public RedissonClient redissonClient() {
        // 初始化配置
        Config config = new Config();
        // 单机模式，指定本地Redis默认地址
        config.useSingleServer().setAddress("redis://localhost:6379");
        // 创建并返回Redisson客户端实例
        return Redisson.create(config);
    }
}