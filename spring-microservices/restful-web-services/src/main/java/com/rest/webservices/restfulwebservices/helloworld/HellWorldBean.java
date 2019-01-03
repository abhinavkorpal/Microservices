package com.rest.webservices.restfulwebservices.helloworld;

public class HellWorldBean {

	private String message;

	public HellWorldBean(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return String.format("HellWorldBean [message=%s]", message);
	}	

}
