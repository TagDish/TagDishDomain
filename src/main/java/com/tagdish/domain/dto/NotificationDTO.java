package com.tagdish.domain.dto;

import java.io.Serializable;

import com.tagdish.domain.AbstractNotification;
import com.tagdish.domain.dto.search.SearchInputDTO;
import com.tagdish.domain.dto.search.SearchResultDTO;

public class NotificationDTO extends AbstractNotification implements Serializable {

	private static final long serialVersionUID = -3263788673853223155L;
	
	private String entityId;
	private SearchInputDTO searchInputDTO;
	private SearchResultDTO searchResultDTO;
	
	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}	
	public SearchInputDTO getSearchInputDTO() {
		return searchInputDTO;
	}
	public void setSearchInputDTO(SearchInputDTO searchInputDTO) {
		this.searchInputDTO = searchInputDTO;
	}
	public SearchResultDTO getSearchResultDTO() {
		return searchResultDTO;
	}
	public void setSearchResultDTO(SearchResultDTO searchResultDTO) {
		this.searchResultDTO = searchResultDTO;
	}	
}