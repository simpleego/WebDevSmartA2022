package com.simple.ex;

public class DataType3 {

	public static void main(String[] args) {
		
		// ������ �Է�(�غ�)
		int a = 5;// ����� ���ÿ� �ʱ�ȭ
		int b;
		int sum,sub,mul,div, remainder;
		
		b=3;
		
		// ������ ó��
		sum = a + b;
		sub = a - b;
		mul = a * b;
		div = a / b;
		//remainder = a - (b * div);
		remainder = a % b;
		
		// ������ ���
		System.out.print("a :"+a+"\n");
		System.out.print("b :"+b+"\n");
		System.out.print("�� : "+sum+"\n");
		System.out.print("�� : "+sub+"\n");
		System.out.print("�� : "+mul+"\n");
		System.out.print("�� : "+div+"\n");
		System.out.print("������ : "+remainder+"\n");

	}

}
