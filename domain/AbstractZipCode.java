package com.tagdish.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.tagdish.domain.location.Location;

public abstract class AbstractZipCode implements Serializable {

	private static final long serialVersionUID = -1519223322734042511L;

	@Id
	private Long zipCode;
	
	@Field(type = FieldType.Nested)
	private Location location;
	
	@Field(type=FieldType.String)
	private String city;
	
	@Field(type=FieldType.String)
	private String state;
	
	@Field(type=FieldType.String)
	private String county;
	

	public Long getZipCode() {
		return zipCode;
	}

	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}
}
