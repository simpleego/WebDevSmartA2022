package com.simple.vm;

import java.util.Scanner;

public class Japangi {

	public static void main(String[] args) {
		// ���Ǳ� ���α׷�
		
		// �����Է� ó��
		// �Է��� ������ ������ ����
		//
		int coin=0;
		String coin_="";
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("��ũĿ��(300), ����Ŀ��(200), ��Ŀ��(200)"); 
		System.out.print("�����Է� : ");
		
		coin_ = kbd.nextLine();
		coin = Integer.parseInt(coin_);
		
		System.out.println("�Էµ� ������ : "+coin);
		
		if(coin < 200) {
			System.out.println("���� ���ڶ��ϴ�.");
			System.out.println("��ũĿ��(300), ����Ŀ��(200), ��Ŀ��(200)"); 
			System.out.print("�����Է� : ");
			
			coin_ = kbd.nextLine();
			coin = Integer.parseInt(coin_);
		}		
		System.out.println("�Էµ� ������ : "+coin);

	}

}
