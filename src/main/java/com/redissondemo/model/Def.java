package com.redissondemo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Def {
	
	private String ref;
	private Abc abc;

}
