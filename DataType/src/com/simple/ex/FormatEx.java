package com.simple.ex;

import java.util.Scanner;

public class FormatEx {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = keyboard.nextLine();
		
		System.out.print("성별 (남/여) : ");
		String gender = keyboard.nextLine();
		
		System.out.print("나이 : ");
		String age_ = keyboard.nextLine();
		
		int age = Integer.parseInt(age_);
		
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age+100);

	}
}
