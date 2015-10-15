package com.tagdish.domain.dto.detail;

import java.io.Serializable;

import com.tagdish.domain.dto.TagDishInputDTO;

public class DetailInputDTO extends TagDishInputDTO implements Serializable {

	private static final long serialVersionUID = 1010306004232251604L;
	
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}