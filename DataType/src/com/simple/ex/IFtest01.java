package com.simple.ex;

import java.util.Scanner;

public class IFtest01 {

	public static void main(String[] args) {
		// ����/�̼��� �����ϱ�
		// 20�� �̻��̸� �������� ����
		
		Scanner kbd = new Scanner(System.in);
		int age;
		String str="�̼���";
		
		System.out.print("����� ���̴� : ");
		
		String age_ = kbd.nextLine();
		
		age = Integer.parseInt(age_);
		
		if(age >= 20) {
			str = "����";
			//return;
		}
		
		System.out.println("����� "+str+"�Դϴ�");

	}

}
