package com.tacademy.data;

public class Data {
	// git prac
	
	// wanna control my version? go git
	
	private String name;
	private int age;
	
	private String masterAddress;
	private String hotfix;
	private String iss53;
	
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
	
	public String getHotfix() {
		return hotfix;
	}

	public void setHotfix(String hotfix) {
		this.hotfix = hotfix;
	}

	public String getIss53() {
		return iss53;
	}

	public void setIss53(String iss53) {
		this.iss53 = iss53;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + ", age=" + age + ", masterAddress=" + masterAddress + ", hotfix=" + hotfix
				+ ", iss53=" + iss53 + "]";
	}
	
}
