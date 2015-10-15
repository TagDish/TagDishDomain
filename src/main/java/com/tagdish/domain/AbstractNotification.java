package com.tagdish.domain;

import java.io.Serializable;

public abstract class AbstractNotification implements Serializable {

	private static final long serialVersionUID = -7015857647550629883L;
	
	private String trasactionId;
	private String action;
	private Long userId;
	
	private long timestamp;
	private int count;

	public String getTrasactionId() {
		return trasactionId;
	}
	public void setTrasactionId(String trasactionId) {
		this.trasactionId = trasactionId;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}	
}
