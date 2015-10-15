package com.tagdish.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.MultiField;

public class AbstractAccount implements Serializable {
	
	private static final long serialVersionUID = 3693706551655336125L;

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
	
	@Field(type=FieldType.String)
	private String dressCode;
	
	@Field(type=FieldType.String)
	private String genre;
	
	@Field(type=FieldType.String)
	private String timezone;
	
	@Field(type=FieldType.String)
	private String language;
	
	@Field(type=FieldType.String)
	private String currency;
	
	@Field(type=FieldType.String)
	private String market;
	
	@Field(type=FieldType.String)
	private String additionalDetails;

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
	public String getDressCode() {
		return dressCode;
	}
	public void setDressCode(String dressCode) {
		this.dressCode = dressCode;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public String getAdditionalDetails() {
		return additionalDetails;
	}
	public void setAdditionalDetails(String additionalDetails) {
		this.additionalDetails = additionalDetails;
	}
	
	public Float getYelpRating() {
		return yelpRating;
	}
	public void setYelpRating(Float yelpRating) {
		this.yelpRating = yelpRating;
	}
}
