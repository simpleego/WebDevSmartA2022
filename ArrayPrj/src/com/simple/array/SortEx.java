package com.simple.array;

import java.util.Arrays;

public class SortEx {

	public static void main(String[] args) {
		
		final int SIZE = 10;
		
		int [] numbers = new int[SIZE];
		
		for (int i = 0; i < numbers.length; i++) {
			int r = (int)(Math.random()*100);
			numbers[i]=r;			
		}
		
		System.out.print(" 정렬 전 배열 리스트 :");
		for (int num : numbers) {
			System.out.print(" " + num);
		}
		
		// 정렬 메서드 사용
		Arrays.sort(numbers);
		
		System.out.print(" \n정렬 후 배열 리스트 :");
		for (int num : numbers) {
			System.out.print(" " + num);
		}
		

	}

}
