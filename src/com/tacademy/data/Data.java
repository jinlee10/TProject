package com.tacademy.data;

public class Data {
	// git prac
	
	// wanna control my version? go git
	
	private String name;
	private int age;
	
	private String masterAddress;
	
	private String issue53;
	
	public Data(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMasterAddress() {
		return masterAddress;
	}

	public void setMasterAddress(String masterAddress) {
		this.masterAddress = masterAddress;
	}

	public String getIssue53() {
		return issue53;
	}

	public void setIssue53(String issue53) {
		this.issue53 = issue53;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + ", age=" + age + ", masterAddress=" + masterAddress + ", "
				+ "issue53=" + issue53 + "]";
	}
	
}
