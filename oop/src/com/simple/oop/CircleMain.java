package com.simple.oop;

public class CircleMain {
	
	// ��ü����
	public static void main(String[] args) {
		
		Point p = new Point(25, 50);
		Circle c = new Circle(5, p);
		
		System.out.println(p);
		System.out.println(c);
		
	}
	
}
