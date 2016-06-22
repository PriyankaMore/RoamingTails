package com.roamingtails.model.response;

public class UserProfileResponse {

	private String statusCode;
	private int userId;
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public UserProfileResponse() {
		userId=1;
		statusCode="SUCCESS";
	}
	
}
