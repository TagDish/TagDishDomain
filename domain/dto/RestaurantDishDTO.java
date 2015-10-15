package com.tagdish.domain.dto;

import java.io.Serializable;

public class RestaurantDishDTO implements Serializable {

	private static final long serialVersionUID = -523009032204969599L;
	
	private DishDTO dishDTO;
	private RestaurantDTO restaurantDTO;
	
	public DishDTO getDishDTO() {
		return dishDTO;
	}
	public void setDishDTO(DishDTO dishDTO) {
		this.dishDTO = dishDTO;
	}
	public RestaurantDTO getRestaurantDTO() {
		return restaurantDTO;
	}
	public void setRestaurantDTO(RestaurantDTO restaurantDTO) {
		this.restaurantDTO = restaurantDTO;
	}
}
