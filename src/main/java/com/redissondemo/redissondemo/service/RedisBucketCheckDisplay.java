package com.redissondemo.redissondemo.service;

import java.io.Serializable;

import org.redisson.Redisson;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.redisson.codec.SerializationCodec;
import org.redisson.config.Config;

public class RedisBucketCheckDisplay {
	
	public static void setUpData() {
		Config config = new Config();
        config.useSingleServer()
          .setAddress(String.format("redis://127.0.0.1:%s", 6379));
        config.setCodec(new SerializationCodec());
        RedissonClient client = Redisson.create(config);
		RBucket<RelationShipData> bucket = client.getBucket("medical:RelationshipDataGlobal");
//		RelationshipData relationshipData = new RelationshipData();
//		relationshipData.setHouse("myHouse");
//		bucket.set(relationshipData);
		RelationShipData relationshipData = bucket.get();
		System.out.println(relationshipData.getHouse());
		client.shutdown();
	}
	

}
