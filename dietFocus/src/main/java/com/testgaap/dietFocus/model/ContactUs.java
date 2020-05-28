package com.testgaap.dietFocus.model;




public class ContactUs {
	
	private String name;
	private String address;
	private long teleno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getTeleno() {
		return teleno;
	}
	public void setTeleno(long teleno) {
		this.teleno = teleno;
	}
	@Override
	public String toString() {
		return "ContactUs [name=" + name + ", address=" + address + ", teleno=" + teleno + "]";
	}
	
	
	

}
