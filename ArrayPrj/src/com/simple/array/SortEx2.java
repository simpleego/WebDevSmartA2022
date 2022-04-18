package com.simple.array;

import java.util.Arrays;

public class SortEx2 {

	public static void main(String[] args) {

		final int SIZE = 10;

		int[] numbers = new int[SIZE];

		for (int i = 0; i < numbers.length; i++) {
			int r = (int) (Math.random() * 100);
			numbers[i] = r;
		}

		System.out.print(" 정렬 전 배열 리스트 :");
		for (int num : numbers) {
			System.out.print(" " + num);
		}

		// 정렬 메서드 사용
		// Arrays.sort(numbers);
		int num = numbers[0];
		int temp;
		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					// 교환수행
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
			System.out.println();
			for (int k: numbers) {
				System.out.print(" " + k);
			}
		}
		
		System.out.print(" \n정렬 후 배열 리스트 :");
		for (int i: numbers) {
			System.out.print(" " + i);
		}

	}

}
