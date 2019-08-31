package com.appsdeveloper.app.ws.myExecption;

public class ErrorMessage {
	
	private String timeStamp;
	public ErrorMessage(String timeStamp, String message) {
		
		this.timeStamp = timeStamp;
		this.message = message;
	}
	private String message;
	
	public ErrorMessage() {
		
	}
	
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
