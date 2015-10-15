package com.tagdish.domain.elasticsearch;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.tagdish.domain.location.Address;
import com.tagdish.domain.location.Location;

@Document(indexName = "tag_dish", type = "dishsearch")
public class DishSearch implements Serializable {

	private static final long serialVersionUID = 1101238191046800268L;
	
	//Dish Detail
	@Id
	private Long dishId;
	
	@Field(type=FieldType.String)
	private String dishName;
	
	@Field(type=FieldType.Float)
	private Float price;
	
	@Field(type=FieldType.String)
	private String imageUrl;	
	
	//Restaurant Detail
	@Field(type=FieldType.Long)
	private Long restaurantId;		
	
	@Field(type = FieldType.String)
	private String restaurantType;
	
	@Field(type = FieldType.Nested)
	private Address address;
	
	@Field(type = FieldType.Nested)
	private Location location;	
	
	// Auto calculated value
	private Float distance;
	
	public Long getDishId() {
		return dishId;
	}
	public void setDishId(Long dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}	
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}	
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
	public Float getDistance() {
		return distance;
	}
	public void setDistance(Float distance) {
		this.distance = distance;
	}
}