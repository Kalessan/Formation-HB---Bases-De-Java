package com.cgi.training.java.bookmarks;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class OldBookmark {
	private int id;
	private String description;
	private LocalDateTime timeStamp;
	
	private User user;
	private Site site;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getSiteId() {
		return siteId;
	}
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getTimeStamp() {
		return created_at;
	}
	public void setTimeStamp(LocalDateTime localDateTime) {
		this.created_at = localDateTime;
	}
	@Override
	public String toString() {
		return "Bookmark [id=" + id + ", userId=" + userId + ", siteId=" + siteId + ", description=" + description
				+ ", created_at=" + created_at + "]";
	}
	


		
}


