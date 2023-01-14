package com.redissondemo.redissondemo.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {
	
//	@Bean
//	public RedissonClient redissonClient() {
//		System.out.println("check connection");
//		Config config = new Config();
//        config.useSingleServer()
////          .setAddress(String.format("redis://127.0.0.1:%s", 6379));
//        .setAddress(String.format("redis://checkredis.sqsbq6.ng.0001.aps1.cache.amazonaws.com:%s",6379));
//
//        RedissonClient client = Redisson.create(config);
//        return client;
//	}

}
