package com.ModelClass;

public class Hello {
	private String name;
	private String add;
	private int no;
	
	public Message message;

	public Hello(String add,int no) {
		System.out.println("Constructor...");
		this.add=add;
		this.no=no;
	}
	public void setName(String name) {
		this.name=name;
	}

	public void getHello(String abc) {
		// TODO Auto-generated method stub
		System.out.println("Return Hello..." + abc +",..."+name+".... "+add+" ..."+no );

	}
	
	public void setMessage(Message message) {
		this.message=message;
		
	}
	public void getMessage() {
		message.getMessage();
	}
}
