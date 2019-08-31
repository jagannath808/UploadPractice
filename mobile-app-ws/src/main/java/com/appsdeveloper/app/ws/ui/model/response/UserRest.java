package com.appsdeveloper.app.ws.ui.model.response;

public class UserRest {
	
	String name;
	int phone;
	String address;
	String userId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserRest [name=" + name + ", phone=" + phone + ", address=" + address + ", userId=" + userId + "]";
	}
}
