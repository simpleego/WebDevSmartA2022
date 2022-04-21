package com.simple.inheritance;

public class Point {
	private int x,y;	
	
	public Point() {
		// TODO Auto-generated constructor stub
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
