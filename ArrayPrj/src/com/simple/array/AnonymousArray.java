package com.simple.array;

import java.util.Arrays;

public class AnonymousArray {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };	
		int[] list = new int[5];
		
		//list = Arrays.copyOf(num, 5);
		for (int i = 0; i < list.length; i++) {
			list[i] = num[i]+10;
		}
		list[4]=100;
		
		System.out.println("숫자들의 합 :" + sum(num));		
		
	}

	private static String sum(int[] number) {
		int total = 0;
		for (int i : number) {
			total += i;
		}

		return total + "";
	}

}
