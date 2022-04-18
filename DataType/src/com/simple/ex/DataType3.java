package com.simple.ex;

public class DataType3 {

	public static void main(String[] args) {
		
		// 데이터 입력(준비)
		int a = 5;// 선언과 동시에 초기화
		int b;
		int sum,sub,mul,div, remainder;
		
		b=3;
		
		// 데이터 처리
		sum = a + b;
		sub = a - b;
		mul = a * b;
		div = a / b;
		//remainder = a - (b * div);
		remainder = a % b;
		
		// 데이터 출력
		System.out.print("a :"+a+"\n");
		System.out.print("b :"+b+"\n");
		System.out.print("합 : "+sum+"\n");
		System.out.print("차 : "+sub+"\n");
		System.out.print("곱 : "+mul+"\n");
		System.out.print("몫 : "+div+"\n");
		System.out.print("나머지 : "+remainder+"\n");

	}

}
