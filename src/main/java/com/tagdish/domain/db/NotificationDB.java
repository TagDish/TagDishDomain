package com.tagdish.domain.db;

import java.io.Serializable;

import com.tagdish.domain.AbstractNotification;

public class NotificationDB extends AbstractNotification implements Serializable{

	private static final long serialVersionUID = 862826370504118591L;

	private Long notificationId;
	private String data;

	public Long getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(Long notificationId) {
		this.notificationId = notificationId;
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
