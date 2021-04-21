package com.test;

public class Address {

	String city;
	String state;
	
	public Address(String city,String state ) {
		this.city=city;
		//this.state=state;
           System.out.println("I am in Address para constructor.."+city+state);	

	}
	
	

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
}
