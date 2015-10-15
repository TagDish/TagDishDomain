package com.tagdish.domain.db;

import java.io.Serializable;

import com.tagdish.domain.AbstractAddress;
import com.tagdish.domain.location.Location;

public class GeoTargetDB extends AbstractAddress implements Serializable {

	private static final long serialVersionUID = -7262152113389552385L;
	
	private Long accountId;
	private Location location;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
}
