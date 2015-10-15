package com.tagdish.domain.elasticsearch;

import java.io.Serializable;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.tagdish.constant.TagDishDomainConstant;
import com.tagdish.domain.AbstractAccount;
import com.tagdish.domain.location.Address;
import com.tagdish.domain.location.Location;

@Document(indexName = TagDishDomainConstant.TAGDISH_INDEX_NAME, type = TagDishDomainConstant.RESTAURANT_TYPE)
public class Restaurant extends AbstractAccount implements Serializable {

	private static final long serialVersionUID = 1301238195046800268L;
	
	@Field(type = FieldType.Nested)
	private Address address;
	
	@Field(type = FieldType.Nested)
	private Location location;		
	
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
}
