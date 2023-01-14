package com.redissondemo.redissondemo.service;

import java.io.Serializable;

public class RelationShipData implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		private String house;

		public String getHouse() {
			return house;
		}

		public void setHouse(String house) {
			this.house = house;
		}
			
}
