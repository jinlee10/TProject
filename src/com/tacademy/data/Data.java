package com.tacademy.data;

public class Data {
	// git prac
	
	// wanna control my version? go git
	
	private String name;
	
	public Data(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}
	
}
