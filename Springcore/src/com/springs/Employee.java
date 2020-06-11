package com.springs;

public class Employee {

	int id;
	String name;
	Address adress;
	//constructor injection passed by constructor argument by XML via container
	public Employee(Address adress) {
		super();
		this.adress = adress;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adress=" + adress
				+ "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAdress() {
		return adress;
	}
	//Setter Injection
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	
	
	
	
}
