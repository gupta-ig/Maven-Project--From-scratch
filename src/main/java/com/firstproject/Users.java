package com.firstproject;

import java.time.LocalDate;

enum Role {
	CUSTOMER, EMPLOYEE, MAINTENANCEMANAGER, ADMIN
}

enum Gender {
	MALE, FEMALE, OTHER
}

public class Users {
	private String userId;
	private String userName;
	private String phoneNumber;
	private String password;
	private String userEmail;
	//private LocalDate creationDate;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
//	public LocalDate getCreationDate() {
//		return creationDate;
//	}
//	public void setCreationDate(LocalDate creationDate) {
//		this.creationDate = creationDate;
//	}
	
	
	public Users(String userId, String userName, String phoneNumber, String password, String userEmail,
			LocalDate creationDate) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.userEmail = userEmail;
		//this.creationDate = creationDate;
	}


	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", phoneNumber=" + phoneNumber + ", password="
				+ password + ", userEmail=" + userEmail + "]";
						// creationDate=" + creationDate + "]";
	}
	
}
