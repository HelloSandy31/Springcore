package com.springs;

public class Address {
	String city;
	int pincode;
	String  state;
	

	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + ", state="
				+ state + "]";
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public Address(String city, int pincode, String state) {
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}
	public Address() {
		super();
	}

}
