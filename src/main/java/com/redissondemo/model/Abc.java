package com.redissondemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Abc {
	
	private String entity;
	@JsonProperty(value="isPrimary")
	private boolean isPrimary;

}
