package com.tagdish.domain.db;

import java.io.Serializable;

import com.tagdish.domain.AbstractDish;

public class DishDB extends AbstractDish implements Serializable {

	private static final long serialVersionUID = 3042356729100540124L;

	private Long menuId;
	
	public Long getMenuId() {
		return menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}


}
