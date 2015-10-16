package com.tagdish.domain.dto;

import java.io.Serializable;

import com.tagdish.domain.location.Address;
import com.tagdish.domain.location.Location;

public abstract class TagDishInputDTO implements Serializable {

	private static final long serialVersionUID = 9093346764232251604L;

	private String transactionId;
	private Location location;
	private Address Address;
	private String typeOfAddress;
	private long timestamp;

	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}	
	public String getTypeOfAddress() {
		return typeOfAddress;
	}
	public void setTypeOfAddress(String typeOfAddress) {
		this.typeOfAddress = typeOfAddress;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}	
}
