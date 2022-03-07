package com.saif;

public class Address {
	private String village, union, upozilla, district;
	Address(){}
	Address(String village, String union, String upozilla, String district)
	{
		this.village = village; this.union = union; this.upozilla  = upozilla; this.district = district;
	}
	
	public String toString()
	{
		return "Village- " + village + ", Union- " + union + ", Upozilla- " + upozilla + ", District- " + district;
	}
}
