package com.simple.ex;

public class BoxTest {

	public static void main(String[] args) {
		
		Box box1 = new Box();
		Box box2 = new Box(10, 20, 30);
		Box box3;
		box3 = box2;
		System.out.println(box1.toString());
		System.out.println(box2);
		System.out.println(box3.hashCode());
		//box1. = 80;
		box1.setWidth(0);
		
		
	}

}
