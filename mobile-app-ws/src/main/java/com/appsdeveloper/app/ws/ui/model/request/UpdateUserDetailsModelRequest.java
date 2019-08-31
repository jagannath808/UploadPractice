package com.appsdeveloper.app.ws.ui.model.request;

public class UpdateUserDetailsModelRequest {
	private String name;
	//@Size(min=3,max=5,message="enter right format")	
	private int phone;
	//@NotNull(message="email can't be null")	
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
}
