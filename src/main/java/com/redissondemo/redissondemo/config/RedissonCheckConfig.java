package com.redissondemo.redissondemo.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.codec.SerializationCodec;
import org.redisson.config.Config;
import org.springframework.stereotype.Component;

@Component
public class RedissonCheckConfig {
	
	private RedissonClient client;
	
	private RedissonCheckConfig() {}
	
	public RedissonClient  getClient(String value) {
		// If amazonObj is null then create a new one
				if (client == null) {
					//making singleton threadsafe
					synchronized (RedissonCheckConfig.class) {
						if(client == null) {
							System.out.println("check inside");
							Config config = new Config();
					        config.useSingleServer()
					          .setAddress(String.format("redis://127.0.0.1:%s", 6379));
					        config.setCodec(new SerializationCodec());
					        client = Redisson.create(config);
						}
					}
				}
				return client;
	}

}
