package com.simple.ex;

import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int sum;		
		
		Scanner kbd = new Scanner(System.in);
		System.out.print("숫자 1 : ");
		num1 = kbd.nextInt();
		
		System.out.print("숫자 2 : ");
		num2 = kbd.nextInt();
		
		sum = num1+num2;
		
		System.out.println("합 :"+sum);
	}

}
