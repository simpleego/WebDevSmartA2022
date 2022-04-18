package com.simple.ex;

public class SafeArray {
	private int a[];
	private int length;
	
	// 생성자 메서드
	public SafeArray(int size) {
		a = new int[size];
		length = size;
	}

	public int get(int index) {
		if(index >= 0 && index < length) {
			return a[index];			
		}
		return -1;
	}

	public void put(int index, int value) {
		if(index >= 0 && index < length) {
			a[index] = value;			
		}else {
			System.out.println("잘못된 배열 범위 초과");
		}
	}
}
