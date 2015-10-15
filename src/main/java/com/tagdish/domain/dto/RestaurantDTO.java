package com.tagdish.domain.dto;

import java.io.Serializable;

import com.tagdish.domain.elasticsearch.Restaurant;

public class RestaurantDTO extends Restaurant implements Serializable {

	private static final long serialVersionUID = -1715520652524401836L;
	
	// Auto calculated value
	private double distance;
	
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}	
}
