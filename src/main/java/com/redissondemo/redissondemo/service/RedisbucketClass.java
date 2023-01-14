package com.redissondemo.redissondemo.service;


import org.redisson.Redisson;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.redisson.codec.SerializationCodec;
import org.redisson.config.Config;

public class RedisbucketClass {
	
	public static void setUpData() {
		Config config = new Config();
        config.useSingleServer()
          .setAddress(String.format("redis://127.0.0.1:%s", 6379));
        config.setCodec(new SerializationCodec());
        RedissonClient client = Redisson.create(config);
		RBucket<RelationShipData> bucket = client.getBucket("medical:RelationshipDataGlobal");
		RelationShipData relationshipData = new RelationShipData();
		relationshipData.setHouse("myHouseGlobal");
		bucket.set(relationshipData);
//		RelationshipData relationshipData = bucket.get();
//		System.out.println(relationshipData.getHouse());
		client.shutdown();
	}
	
}
