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

		System.out.print(" ���� �� �迭 ����Ʈ :");
		for (int num : numbers) {
			System.out.print(" " + num);
		}

		// ���� �޼��� ���
		// Arrays.sort(numbers);
		int num = numbers[0];
		int temp;
		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					// ��ȯ����
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
		
		System.out.print(" \n���� �� �迭 ����Ʈ :");
		for (int i: numbers) {
			System.out.print(" " + i);
		}

	}

}
