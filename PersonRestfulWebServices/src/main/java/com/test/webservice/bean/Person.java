package com.test.webservice.bean;
import javax.validation.constraints.Size; 



public class Person {

	
	private int id;
	@Size(min=3,message="name should be more than 3 chars")  
	private String firstname;
	@Size(min=3,message="name should be more than 3 chars")  
	private String lastname;
	
	private String address;

	public Person() {
		super();
	}
	

	public Person(int id, String firstname, String lastname, String address) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	
	
	
}
