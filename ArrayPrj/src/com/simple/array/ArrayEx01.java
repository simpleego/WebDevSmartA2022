package com.simple.array;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		int[] num = {10,4,5,78,90,89,67};
		int sum=0;
		
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			System.out.println("�迭 "+i+"��ġ :"+num[i]);			
		}
		
		System.out.println("�迭 �� :"+sum);
		System.out.println(num.length);

	}

}
