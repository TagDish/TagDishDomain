package com.tagdish.domain.dto.search;

import java.io.Serializable;
import java.util.LinkedList;

import com.tagdish.domain.dto.RestaurantDishDTO;

public class SearchResultDTO implements Serializable {

	private static final long serialVersionUID = -523009032204969599L;
	
	private String transactionId;
	private int resultToDisplay;
	private int resultSize;

	private LinkedList<RestaurantDishDTO> dishRestaurantList;
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}	
	public int getResultToDisplay() {
		return resultToDisplay;
	}
	public void setResultToDisplay(int resultToDisplay) {
		this.resultToDisplay = resultToDisplay;
	}	
	public int getResultSize() {
		return resultSize;
	}
	public void setResultSize(int resultSize) {
		this.resultSize = resultSize;
	}	
	public LinkedList<RestaurantDishDTO> getDishRestaurantList() {
		return dishRestaurantList;
	}
	public void setDishRestaurantList(LinkedList<RestaurantDishDTO> dishRestaurantList) {
		this.dishRestaurantList = dishRestaurantList;
	}
}
