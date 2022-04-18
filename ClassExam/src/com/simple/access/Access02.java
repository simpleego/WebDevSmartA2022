package com.simple.access;

import com.simple.ex.AccessModi;

public class Access02 {

	public static void main(String[] args) {
		
		AccessModi obj = new AccessModi();		
		System.out.println(obj.getA());
		obj.setA(30);
		System.out.println(obj.getA());
	}

}
