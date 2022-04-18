package com.simple.ex;

public class AccessModi {
	private int a=10;	// 수정가능하게 설정
	private int b=20;	// 읽기만 가능 gettter 제공
	private int c=30;   // 읽기만 가능 gettter 제공
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
}
