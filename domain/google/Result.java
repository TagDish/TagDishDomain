package com.tagdish.domain.google;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Result implements Serializable {

	private static final long serialVersionUID = -2683834266355953285L;

	@SerializedName("formatted_address")
	private String formattedAddress;

	@SerializedName("partial_match")
	private boolean partialMatch;

	private Geometry geometry;

	@SerializedName("address_components")
	private List<AddressComponent> addressComponentList;

	private List<String> types;

	public String getFormattedAddress() {
		return formattedAddress;
	}

	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}

	public boolean isPartialMatch() {
		return partialMatch;
	}

	public void setPartialMatch(boolean partialMatch) {
		this.partialMatch = partialMatch;
	}

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	public List<AddressComponent> getAddressComponentList() {
		return addressComponentList;
	}

	public void setAddressComponentList(List<AddressComponent> addressComponentList) {
		this.addressComponentList = addressComponentList;
	}

	public List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}
}
