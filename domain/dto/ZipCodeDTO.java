package com.tagdish.domain.dto;

import java.io.Serializable;

import com.tagdish.domain.AbstractZipCode;

public class ZipCodeDTO extends AbstractZipCode implements Serializable {

	private static final long serialVersionUID = 6413043631261004592L;
	
	private String displayName;

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
}
