package com.redissondemo.redissondemo.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import org.redisson.api.RMap;
import org.redisson.api.RSet;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.redissondemo.model.Student;
import com.redissondemo.redissondemo.config.RedissonCheckConfig;

@Service
public class RedissonServiceImpl implements RedissonService, Serializable {
	
//	@Autowired
//	private RedissonConfig redissonConfig;
	
//	@Autowired
//	private RedissonClient client;
	
	@Autowired
	private RedissonCheckConfig redissonCheckConfig;
	private int j;

	@Override
	public void setRSetValue() {
//		RSet rSet =  redissonConfig.redissonClient().getSet("vipSet");
//		redissonConfig.redissonClient().getS
//		int a=redissonConfig.redissonClient().getSet("VRSet");
//		String s = "abc";
//		rSet.add(s);
//		System.out.println(rSet.size());
//		RMap<String, String> map = client.getMap("prMap");
//        map.put("mapKey"+new Date(), "This is map value");
//        
//        RSet<String> setK = client.getSet("prSet");
//        setK.add("check");
//		RSet<String> setK = client.getSet("dSet");
		RedissonClient client = redissonCheckConfig.getClient("");
//		RBucket<String> bucket = client.getBucket("kkBucket");
//		bucket.set("value"+new Date());
		
		  
//		Set<String> set = new HashSet<>(); 
//		set.add("DRUG");
//		  
//		RMap<String, Set<String>> map = client.getMap("medical:map"); 
//		map.put("abc",set);
//		  
//		for(int i=0;i<10;i++) { 
//			RBucket<String> bucket = client.getBucket("medical:bucket"+i); 
//			bucket.set("disease"+i); 
//		}
//		
//		RBucket<String> bucket = client.getBucket("man"); 
//		bucket.set("disease"); 
//
//		RFuture<Boolean> deleteFuture = rSetAsync.deleteAsync();
//		
//		System.out.println(deleteFuture);
		
//		RMapAsync<String, String> map = batch.getMap("REDIS_INVENTORY_MAP");
//		keys.getKeysByPattern("medical:b*").forEach(k -> keys.delete(k));
		
//		map.deleteAsync();
//		batch.execute();
		
//		client.getKeys().deleteByPattern("!(medical*)");
//		client.getKeys().deleteByPattern("^((?!medical).)*$");
//		client.getKeys().deleteByPattern("[^m]*");
//		client.getKeys().deleteByPattern("[![medical]]*");
		 
		
		/*
		 * RBucket<RelationshipData> bucket =
		 * client.getBucket("medical:RelationshipData"); RelationshipData
		 * relationshipData = new RelationshipData();
		 * relationshipData.setHouse("myHouse"); bucket.set(relationshipData);
		 */
//		setK.add("e");
//		String s = bucket.get();
		
//		client.shutdown();
		
//		Set<String> set = setK.readAll();
//		System.out.println(s);
//		System.out.println(a);
		
//		Stream<String> stream = client.getKeys().getKeysStreamByPattern("medical:*");
//		List<String> list = new ArrayList<>();
		
		
//		RBatch batch = client.createBatch(BatchOptions.defaults());
//		batch.getKeys().deleteByPatternAsync("medical:*");
//	    BatchResult<?> r = batch.execute();
//		Object a = r.getResponses().get(0);
//		System.out.println(a);
		
//		Student s1 = new Student();
//		s1.setStudentId("s1id");
//		s1.setCity("Bengaluru");
//		s1.setName("Amar");
//		Set<String> set = new HashSet<>();
//		set.add("History");
//		set.add("Hindi");
//		s1.setSubjects(set);
		
//		Student s2 = new Student();
//		s2.setStudentId("s2id");
//		s2.setCity("Bengaluru");
//		s2.setName("Amar");
//		Set<String> set2 = new HashSet<>();
//		set2.add("History");
//		set2.add("Hindi");
//		s2.setSubjects(set2);
		
//		Student s3 = new Student();
//		s3.setStudentId("s13id3");
//		s3.setCity("Mumbai");
//		s3.setName("Amar");
//		Set<String> set = new HashSet<>();
//		set.add("History");
//		set.add("Maths");
//		s3.setSubjects(set);
//		
//		Student s32 = new Student();
//		s32.setStudentId("s13id2");
//		s32.setCity("Bengaluru");
//		s32.setName("Amar");
//		Set<String> set2 = new HashSet<>();
//		set2.add("History");
//		set2.add("Hindi");
//		s32.setSubjects(set2);
		
		
		
//		for(int i=100000;i<2000000;i++) {
//			RSet<Student> rSet1 = client.getSet("STUDENT:set"+i);
//			Student s3 = new Student();
//			s3.setStudentId("s13id3");
//			s3.setCity("Mumbai");
//			s3.setName("Amar");
//			Set<String> set = new HashSet<>();
//			set.add("History");
//			set.add("Maths");
//			s3.setSubjects(set);
//			rSet1.add(s3);
//		}
		LocalDateTime time = LocalDateTime.now();
		Iterable<String> keys = client.getKeys().getKeysByPattern("STUDENT:*", 1000);
		int i=0;
		for(String t:keys) {
			i++;
		}
		System.out.println(i);
		long lt =ChronoUnit.SECONDS.between(time, LocalDateTime.now());
		System.out.println("Time calculation in Itreable "+lt);
		
		time=LocalDateTime.now();
		Stream<String> sKey = client.getKeys().getKeysStreamByPattern("STUDENT:*", 1000);
		int j=1;
		long k = sKey.parallel().count();
		System.out.println(k);
		long gt = ChronoUnit.SECONDS.between(time, LocalDateTime.now());
		System.out.println("Time calculation in stream "+gt);
		
		
		
//		rSet1.put("s13id3",s3);
//		rSet1.put("s13id2",s32);
//		
//		System.out.println("id1->"+s3.hashCode());
//		System.out.println("id2->"+s32.hashCode());
		
//		for(String key : rSet1.keySet()) {
//			if("s13id3".equals(key)){
//				rSet1.remove(key);
//			}
//		}
		
//		List<Student> list = new ArrayList<>();
//		
//		
//		if(rSet1.isExists()) {
//			rSet1.forEach(s-> {
//				System.out.println(s.getStudentId() +"->"+s.hashCode());
//				if("s10id2".equals(s.getStudentId())){
//					System.out.println(rSet1.contains(s));
//					System.out.println(rSet1.remove(s));
//				}
//			});
//		}
//		
//		System.out.println(list.size());
//		
//		for(Student l : list) {
//			System.out.println(rSet1.remove(l));
//		}
		
//		Iterator<Student> it = rSet1.iterator();   
//		while(it.hasNext()){
//		    Student entity = it.next();
//		    if("s13id2".equals(entity.getStudentId())){
//		    	System.out.println(rSet1.remove(it.next()));
//		    }
//		    System.out.println(rSet1.contains(entity));
//		}
//		
//		RSet<Student> vSet = client.getSet("vSet");
//		System.out.println(vSet.isExists());
		
		
//		rSet = client.getSet("s2id");
//		rSet.add(s2);
		
//		rSet1.re
		
//		RMap<String, Student>  rMap = client.getMap("cdc");
//		rMap.values();
//		
//		Map<String,Student> map = new HashMap<>();
//		map.values();
		
		
		
	}

	@Override
	public void readCsvData() {
		String file = "/resources/abcdef.csv";
		
		try {
			FileReader filereader = new FileReader(file);
			
			// create csvReader object and skip first Line
	        CSVReader csvReader = new CSVReaderBuilder(filereader)
	                                  .withSkipLines(1)
	                                  .build();
	        
			List<String[]> allData = csvReader.readAll();
			
			System.out.println(allData.size());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
        
	}
	
	public static void readCsvData1() {
		String file = "src/main/resources/abcdef.csv";
		
		try {
			FileReader filereader = new FileReader(file);
			
			// create csvReader object and skip first Line
	        CSVReader csvReader = new CSVReaderBuilder(filereader)
	                                  .withSkipLines(1)
	                                  .build();
	        
			List<String[]> allData = csvReader.readAll();
			
			System.out.println(allData.size());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
        
	}
	
	public static void main(String args[]) {
		readCsvData1();
	}
	

}
