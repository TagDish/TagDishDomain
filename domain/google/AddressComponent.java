package com.tagdish.domain.google;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class AddressComponent implements Serializable {

	private static final long serialVersionUID = 14975764397497355L;

	@SerializedName("long_name")
	private String longName;
	@SerializedName("short_name")
	private String shortName;
	@SerializedName("types")
	private String[] types;
	
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String[] getTypes() {
		return types;
	}
	public void setTypes(String[] types) {
		this.types = types;
	}
}
