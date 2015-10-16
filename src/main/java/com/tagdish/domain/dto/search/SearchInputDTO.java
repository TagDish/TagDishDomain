package com.tagdish.domain.dto.search;

import java.io.Serializable;

import com.tagdish.domain.dto.TagDishInputDTO;

public class SearchInputDTO extends TagDishInputDTO implements Serializable {

	private static final long serialVersionUID = 1013346764232251604L;

	private String searchKeyWord;
	private int startIndex;
	
	
	public String getSearchKeyWord() {
		return searchKeyWord;
	}
	public void setSearchKeyWord(String searchKeyWord) {
		this.searchKeyWord = searchKeyWord;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}	
}