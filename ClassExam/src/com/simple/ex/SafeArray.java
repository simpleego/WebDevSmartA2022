package com.simple.ex;

public class SafeArray {
	private int a[];
	private int length;
	
	// ������ �޼���
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
			System.out.println("�߸��� �迭 ���� �ʰ�");
		}
	}
}
