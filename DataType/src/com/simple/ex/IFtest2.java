package com.simple.ex;

import java.util.Scanner;

public class IFtest2 {

	public static void main(String[] args) {
		// ����/�̼��� �����ϱ�
		// 20�� �̻��̸� �������� ����
		
		Scanner kbd = new Scanner(System.in);
		int age;
		String str="";
		
		System.out.print("����� ���̴� : ");
		
		String age_ = kbd.nextLine();
		
		age = Integer.parseInt(age_);
		
		if(age >= 20 && age <= 29) {
			str = "20��";
		}else if(age >= 30 && age <= 39) {
			str = "30��";
		}else {
			str = "20-30�밡 �ƴմϴ�.";
		}
		
		
		System.out.println("����� "+str);

	}

}
