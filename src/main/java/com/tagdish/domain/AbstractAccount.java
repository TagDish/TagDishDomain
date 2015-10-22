package com.tagdish.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.MultiField;

public class AbstractAccount implements Serializable {
	
	private static final long serialVersionUID = 3693706551655336125L;

	@Field(type=FieldType.String)
	private String hourOfOperation;
	
	@Field(type=FieldType.String)
	private String phoneNumber;
	
	@Field(type=FieldType.Float)
	private Float avgCostPerPerson;
	
	@Field(type=FieldType.Float)
	private Float parkingFee;
	
	@Field(type=FieldType.String)
	private String parkingDesc;
	
	@Field(type=FieldType.String)
	private String paymentOptions;
	
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
	
	@Field(type=FieldType.String)
	private String status;
	
	@Field(type=FieldType.Date)
	private Timestamp createdDate;

	@Field(type=FieldType.Date)
	private Timestamp updatedDate;
	
	@Field(type=FieldType.Integer)
	private int deleted;
	
	@Field(type=FieldType.Float)
	private Float yelpRating;

	public String getHourOfOperation() {
		return hourOfOperation;
	}
	public void setHourOfOperation(String hourOfOperation) {
		this.hourOfOperation = hourOfOperation;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	public String getPaymentOptions() {
		return paymentOptions;
	}
	public void setPaymentOptions(String paymentOptions) {
		this.paymentOptions = paymentOptions;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public Timestamp getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}	
	public int getDeleted() {
		return deleted;
	}
	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}		
	
	public Float getYelpRating() {
		return yelpRating;
	}
	public void setYelpRating(Float yelpRating) {
		this.yelpRating = yelpRating;
	}
}
