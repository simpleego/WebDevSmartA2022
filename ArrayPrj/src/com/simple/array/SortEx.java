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
		
		System.out.print(" ���� �� �迭 ����Ʈ :");
		for (int num : numbers) {
			System.out.print(" " + num);
		}
		
		// ���� �޼��� ���
		Arrays.sort(numbers);
		
		System.out.print(" \n���� �� �迭 ����Ʈ :");
		for (int num : numbers) {
			System.out.print(" " + num);
		}
		

	}

}
