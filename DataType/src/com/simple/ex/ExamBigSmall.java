package com.simple.ex;

import java.util.Scanner;

public class ExamBigSmall {

	public static void main(String[] args) {
		
		// �Է� ������
		// �Էº��� �غ�
		int number1;
		int number2;
		int bigNumber=0;
		
		String number1_="";
		String number2_="";
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� :");
		number1_ = kbd.nextLine();
		number1 = Integer.parseInt(number1_);
		
		System.out.print("������ �Է��ϼ��� :");
		number2_ = kbd.nextLine();
		number2 = Integer.parseInt(number2_);
		
		// ������ ó��
		/*if(number1 > number2) {
			System.out.println("ū���� : "+number1);
		}else {
			if(number1 == number2) {
				System.out.println("�� ���� �����ϴ�.");
			}else {
				System.out.println("ū���� : "+number2);
			}			
		}		
		
		if(number1 > number2) {
			bigNumber = number1;
		}else {
			if(number1 == number2) {
				//System.out.println("�� ���� �����ϴ�.");
			}else {
				bigNumber = number2;
			}			
		}
		*/
		
		if(number1 > number2) {
			bigNumber = number1;
		}else if(number1 == number2) {
				//System.out.println("�� ���� �����ϴ�.");
		}else {
				bigNumber = number2;
		}
		
		// ������ ���
		System.out.println("ū ���� :"+bigNumber);
	}

}
