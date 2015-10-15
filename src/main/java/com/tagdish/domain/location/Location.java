package com.tagdish.domain.location;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Location implements Serializable {

	private static final long serialVersionUID = 2164258160225792052L;
	
	@SerializedName("lat") 	
	private String latitude;
	@SerializedName("lng") 	
	private String longitude;
	
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


}
