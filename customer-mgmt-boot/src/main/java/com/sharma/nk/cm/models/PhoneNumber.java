package com.sharma.nk.cm.models;

import java.io.Serializable;

public class PhoneNumber implements Serializable{

	private static final long serialVersionUID = 102L;
	private String type;
	private String number;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public PhoneNumber() {
	}
	
	public PhoneNumber(String type, String number) {
		this.type = type;
		this.number = number;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"type\":\"");
		builder.append(type);
		builder.append("\", \"number\":\"");
		builder.append(number).append("\"}");
		return builder.toString();
	}
	
}
