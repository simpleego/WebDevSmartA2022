package com.simple.ex;

import java.util.Scanner;

public class FormatEx {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = keyboard.nextLine();
		
		System.out.print("���� (��/��) : ");
		String gender = keyboard.nextLine();
		
		System.out.print("���� : ");
		String age_ = keyboard.nextLine();
		
		int age = Integer.parseInt(age_);
		
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age+100);

	}
}
