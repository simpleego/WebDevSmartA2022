package com.simple.ex;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		char input=' ';
		
		Scanner kbd = new Scanner(System.in);
		
		do {			
			System.out.println("���ϴ� ������(1~9) : ");
			input = kbd.next().charAt(0);	
			System.out.println("���� �Է� : " + input);
		} while (input < '1' || input > '9' );

		System.out.println("�ܺ� �Է°� : " + input);
	}

}
