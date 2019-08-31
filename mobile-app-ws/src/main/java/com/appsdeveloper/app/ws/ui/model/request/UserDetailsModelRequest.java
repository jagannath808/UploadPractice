package com.appsdeveloper.app.ws.ui.model.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
//import javax.validation.constraints.Size;

public class UserDetailsModelRequest {
	//@NotNull(message="name can't be null")	
	private String name;
	//@Size(min=3,max=5,message="enter right format")	
	private int phone;
	//@NotNull(message="email can't be null")	
	private String email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
