package com.tacademy.data;

public class Yolo {
	
	private int yolo;
	private String yolo1;
	private String hotfixString;
	
	public Yolo(){
		
	}

	public int getYolo() {
		return yolo;
	}

	public void setYolo(int yolo) {
		this.yolo = yolo;
	}
	
	public String getYolo1() {
		return yolo1;
	}

	public void setYolo1(String yolo1) {
		this.yolo1 = yolo1;
	}
	
	public String getHotfixString() {
		return hotfixString;
	}

	public void setHotfixString(String hotfixString) {
		this.hotfixString = hotfixString;
	}

	@Override
	public String toString() {
		return "Yolo [yolo=" + yolo + ", yolo1=" + yolo1 + ", hotfixString=" + hotfixString + "]";
	}

}
