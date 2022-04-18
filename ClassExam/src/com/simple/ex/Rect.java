package com.simple.ex;

public class Rect {
	private int x,y;
	private int width, height;
	
	Rect() {
		this(0,0,1,1);
	}

	Rect(int width, int height) {
		this(0,0,width,height);
	}

	Rect(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rect [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}

	public static void main(String[] args) {
		
		Rect r1 = new Rect();
		Rect r2 = new Rect(100, 200);
		Rect r3 = new Rect(10, 10, 200, 300);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);	
		
	}
	
	
	
	
	

}
