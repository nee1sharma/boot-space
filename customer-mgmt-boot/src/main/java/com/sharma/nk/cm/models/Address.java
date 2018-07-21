package com.sharma.nk.cm.models;

import java.io.Serializable;


public class Address implements Serializable{
	
	private static final long serialVersionUID = 101L;
	private String street;
	private String city;
	private String state;
	private int postalCode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public Address() {
	}

	public Address(String street, String city, String state, int postalCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"street\":\"");
		builder.append(street);
		builder.append("\", \"city\":\"");
		builder.append(city);
		builder.append("\", \"state\":\"");
		builder.append(state);
		builder.append("\", \"postalCode\":\"");
		builder.append(postalCode);
		builder.append("\"}");
		return builder.toString();
	}

}
