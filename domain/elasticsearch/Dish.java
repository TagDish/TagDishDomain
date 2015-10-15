package com.tagdish.domain.elasticsearch;

import java.io.Serializable;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.tagdish.domain.AbstractDish;
import com.tagdish.domain.location.Address;
import com.tagdish.domain.location.Location;

@Document(indexName = "tag_dish", type = "dish")
public class Dish extends AbstractDish implements Serializable {

	private static final long serialVersionUID = -8061627823712794231L;
	
	//Restaurant Detail
	@Field(type=FieldType.Long)
	private Long restaurantId;		
	
	@Field(type = FieldType.String)
	private String restaurantType;	
	
	@Field(type = FieldType.Nested)
	private Address address;
	
	@Field(type = FieldType.Nested)
	private Location location;		
	
	@Field(type = FieldType.Long)
	private Long zipCode;

	public Long getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}	
	public String getRestaurantType() {
		return restaurantType;
	}
	public void setRestaurantType(String restaurantType) {
		this.restaurantType = restaurantType;
	}		
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Long getZipCode() {
		return zipCode;
	}
	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}	
}
