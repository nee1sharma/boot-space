package com.sharma.nk.cm.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Customer implements Serializable {
	private static final long serialVersionUID = 100L;
	@Id
	private String cid;
	private String firstName;
	private String lastName;
	private int points;
	private int age;
	private Address address;

	@Column
    @ElementCollection
	private List<PhoneNumber> phoneNumber;

	public Customer() {
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<PhoneNumber> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<PhoneNumber> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Customer(String cid, String firstName, String lastName, int points, int age, Address address,
			List<PhoneNumber> phoneNumber) {
		super();
		this.cid = cid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.points = points;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public Customer(String cid, String firstName, int points) {
		super();
		this.cid = cid;
		this.firstName = firstName;
		this.points = points;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"cid\":\"");
		builder.append(cid);
		builder.append("\", \"firstName\":\"");
		builder.append(firstName);
		builder.append("\", \"lastName\":\"");
		builder.append(lastName);
		builder.append("\", \"points\":\"");
		builder.append(points);
		builder.append("\", \"age\":\"");
		builder.append(age);
		builder.append("\", \"address\":");
		builder.append(address);
		builder.append("\", \"phoneNumber\":");
		builder.append(phoneNumber).append("}");
		return builder.toString();
	}
}
