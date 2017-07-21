package com.tacademy.data;

public class Yolo {
	
	private int yolo;
	private String hotfixString;
	
	public Yolo(){
		
	}

	public int getYolo() {
		return yolo;
	}

	public void setYolo(int yolo) {
		this.yolo = yolo;
	}
	
	public String getHotfixString() {
		return hotfixString;
	}

	public void setHotfixString(String hotfixString) {
		this.hotfixString = hotfixString;
	}

	@Override
	public String toString() {
		return "Yolo [yolo=" + yolo + ", hotfixString=" + hotfixString + "]";
	}
	
}
