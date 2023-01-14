package com.redissondemo.redissondemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.redissondemo.model.Abc;
import com.redissondemo.model.Def;
import com.redissondemo.redissondemo.service.RedisBucketCheckDisplay;
import com.redissondemo.redissondemo.service.RedisbucketClass;
import com.redissondemo.redissondemo.service.RedissonService;

@RestController
public class RedissonCheckController {
	
	@Autowired
	private RedissonService redissonService;
	
	@GetMapping(value="/home")
	public @ResponseBody ResponseEntity<String> setValue(){
		redissonService.setRSetValue();
//		RedisBucketCheckDisplay.setUpData();
		System.out.println("check");
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
	
	@GetMapping(value="/builderCheck")
	public @ResponseBody ResponseEntity<Def> getValue(){
		Abc abc = Abc.builder().entity("bhjk").isPrimary(true).build();
		Def def = Def.builder().ref("refValue").abc(abc).build();
		return new ResponseEntity<>(def,HttpStatus.OK);
	}
	

}
