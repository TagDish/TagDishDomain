package com.tagdish.domain.db;

import java.io.Serializable;

import com.tagdish.domain.AbstractAddress;

public class AddressDB extends AbstractAddress implements Serializable {

	private static final long serialVersionUID = -7262152113389552385L;
	
	private Long id;
	private Long accountId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}	
}
