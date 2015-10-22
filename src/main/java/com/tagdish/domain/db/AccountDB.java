package com.tagdish.domain.db;

import java.io.Serializable;

import com.tagdish.domain.AbstractAccount;

public class AccountDB extends AbstractAccount implements Serializable {

	private static final long serialVersionUID = -7148416201857667875L;

	private Long accountId;
	private String accountName;
	private String accountType;
	private GeoTargetDB geoTargetDB;
		
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public GeoTargetDB getGeoTargetDB() {
		return geoTargetDB;
	}
	public void setGeoTargetDB(GeoTargetDB geoTargetDB) {
		this.geoTargetDB = geoTargetDB;
	}

}
