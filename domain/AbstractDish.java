package com.tagdish.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

public abstract class AbstractDish implements Serializable {

	private static final long serialVersionUID = -5137448654032658830L;

	@Id
	private Long dishId;
	
	@Field(type=FieldType.String, index = FieldIndex.analyzed)
	private String dishName;
	
	@Field(type=FieldType.String)
	private String description;
	
	@Field(type=FieldType.Float)
	private Float price;
	
	@Field(type=FieldType.Integer)
	private Integer calories;
	
	@Field(type=FieldType.String)
	private String category; //Appetizer
	
	@Field(type=FieldType.String)
	private String cuisine; //French - Italian - Chinese
	
	@Field(type=FieldType.String)
	private String methodOfPrepration; //Grilled
	
	@Field(type=FieldType.String)
	private String dishType; // Pizza
	
	@Field(type=FieldType.String)
	private String ingredients;
	
	@Field(type=FieldType.Integer)
	private Integer sweetLevel;
	
	@Field(type=FieldType.Integer)
	private Integer savoryLevel;
	
	@Field(type=FieldType.Integer)
	private Integer sourLevel;
	
	@Field(type=FieldType.Integer)
	private Integer spicyLevel;
	
	@Field(type=FieldType.String)
	private String imageDishUrl;
	
	@Field(type=FieldType.Float)
	private Float rating;
	
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public String getMethodOfPrepration() {
		return methodOfPrepration;
	}

	public void setMethodOfPrepration(String methodOfPrepration) {
		this.methodOfPrepration = methodOfPrepration;
	}

	public String getDishType() {
		return dishType;
	}

	public void setDishType(String dishType) {
		this.dishType = dishType;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public Integer getSweetLevel() {
		return sweetLevel;
	}

	public void setSweetLevel(Integer sweetLevel) {
		this.sweetLevel = sweetLevel;
	}

	public Integer getSavoryLevel() {
		return savoryLevel;
	}

	public void setSavoryLevel(Integer savoryLevel) {
		this.savoryLevel = savoryLevel;
	}

	public Integer getSourLevel() {
		return sourLevel;
	}

	public void setSourLevel(Integer sourLevel) {
		this.sourLevel = sourLevel;
	}

	public Integer getSpicyLevel() {
		return spicyLevel;
	}

	public void setSpicyLevel(Integer spicyLevel) {
		this.spicyLevel = spicyLevel;
	}

	public String getImageDishUrl() {
		return imageDishUrl;
	}

	public void setImageDishUrl(String imageDishUrl) {
		this.imageDishUrl = imageDishUrl;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}	
}
