package com.tagdish.domain.google;

import java.io.Serializable;

public class GoogleResponse implements Serializable {

	private static final long serialVersionUID = -5389602725995631540L;
	private Result[] results;
	private String status;

	public Result[] getResults() {
		return results;
	}

	public void setResults(Result[] results) {
		this.results = results;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
