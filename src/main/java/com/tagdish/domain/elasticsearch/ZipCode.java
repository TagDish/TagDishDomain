package com.tagdish.domain.elasticsearch;

import java.io.Serializable;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.tagdish.constant.TagDishDomainConstant;
import com.tagdish.domain.AbstractZipCode;

@Document(indexName = TagDishDomainConstant.TAGDISH_INDEX_NAME, type = TagDishDomainConstant.ZIPCODE_TYPE)
public class ZipCode extends AbstractZipCode implements Serializable {

	private static final long serialVersionUID = 8052937737832454606L;

	@Field(type=FieldType.String)
	private String zipClass;

	public String getZipClass() {
		return zipClass;
	}

	public void setZipClass(String zipClass) {
		this.zipClass = zipClass;
	}
}
