package com.saif;

public class Employee {

	private int id;
	private String name;
	private Address address;
	
	Employee(){}
	Employee(int id, String name)
	{
		this.id =id; this.name = name;
	}
	Employee(int id, String name, Address address)
	{
		this.id = id; this.name = name; this.address = address;
	}
	
	void display()
	{
		System.out.println("Employee id : " + this.id);
		System.out.println("Employee name : " + this.name);
		System.out.println("Employee Address : " + address.toString());
	}
}
