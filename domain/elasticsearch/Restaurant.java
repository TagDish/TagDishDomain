package com.tagdish.domain.elasticsearch;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.MultiField;

import com.tagdish.domain.location.Address;
import com.tagdish.domain.location.Location;

@Document(indexName = "tag_dish", type = "restuarant")
public class Restaurant implements Serializable {

	private static final long serialVersionUID = 1301238195046800268L;
	
	@Id
	private Long restaurantId;
	
	@Field(type=FieldType.String)
	private String restaurantName;
	
	@Field(type=FieldType.String)
	private String hourOfOperation;
	
	@Field(type=FieldType.Long)
	private Long phoneNumber;
	
	@Field(type = FieldType.String)
	private String restaurantType;
	
	@Field(type = FieldType.Nested)
	private Address address;
	
	@Field(type = FieldType.Nested)
	private Location location;		
	
	@Field(type=FieldType.Float)
	private Float avgCostPerPerson;
	
	@Field(type=FieldType.Float)
	private Float parkingFee;
	
	@Field(type=FieldType.String)
	private String parkingDesc;
	
	@MultiField(
	            mainField = @Field(type = FieldType.String)
	            )	
	private List<String> paymentList = new ArrayList<String>();
	
	@Field(type=FieldType.String)
	private String detail;
	
	@Field(type=FieldType.String)
	private String imageUrl;
	
	@Field(type=FieldType.Float)
	private Float yelpRating;

	public Long getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getHourOfOperation() {
		return hourOfOperation;
	}
	public void setHourOfOperation(String hourOfOperation) {
		this.hourOfOperation = hourOfOperation;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	public Float getAvgCostPerPerson() {
		return avgCostPerPerson;
	}
	public void setAvgCostPerPerson(Float avgCostPerPerson) {
		this.avgCostPerPerson = avgCostPerPerson;
	}
	public Float getParkingFee() {
		return parkingFee;
	}
	public void setParkingFee(Float parkingFee) {
		this.parkingFee = parkingFee;
	}
	public String getParkingDesc() {
		return parkingDesc;
	}
	public void setParkingDesc(String parkingDesc) {
		this.parkingDesc = parkingDesc;
	}
	public List<String> getPaymentList() {
		return paymentList;
	}
	public void setPaymentList(List<String> paymentList) {
		this.paymentList = paymentList;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Float getYelpRating() {
		return yelpRating;
	}
	public void setYelpRating(Float yelpRating) {
		this.yelpRating = yelpRating;
	}
}
