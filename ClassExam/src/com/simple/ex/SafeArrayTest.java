package com.simple.ex;

public class SafeArrayTest {

	public static void main(String[] args) {
		
		SafeArray number = new SafeArray(10);
		number.put(0, 10);
		System.out.println(number.get(0));
		number.put(11, 11);
		System.out.println(number.get(11));
		
	}

}
