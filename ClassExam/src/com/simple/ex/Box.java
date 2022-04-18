package com.simple.ex;

public class Box {
	private int width;
	private int height;
	private int length;
	private int volume;
	
	public Box() {
		// TODO Auto-generated constructor stub
	}

	public Box(int width, int height, int length) {
		if(width != 0 && height != 0 && length !=0) {
			this.width = width;
			this.height = height;
			this.length = length;
			volume = width*height*length;			
		}else {
			this.width = 1;
			this.height = 1;
			this.length = 1;
			volume = width*height*length;	
		}		
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getLength() {
		return length;
	}

	public int getVolume() {
		return volume;
	}

	public void setWidth(int width) {
		if(width > 0 ) 
			this.width = width;
		else 
			System.out.println("너비 값 에러");
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	

}
