package com.simple.vm;

import java.util.Scanner;

public class Japangi01 {

	public static void main(String[] args) {
		// ���Ǳ� ���α׷�
		
		// �����Է� ó��
		// �Է��� ������ ������ ����
		//
		int coin=0;
		String coin_="";
		String menu=""; 
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("��ũĿ��(300), ����Ŀ��(200), ��Ŀ��(200)"); 
		System.out.print("�����Է� : ");
		
		coin_ = kbd.nextLine();
		coin = Integer.parseInt(coin_);
				
		System.out.println("�Էµ� ������ : "+coin);
		
		// ���� �Է¿� ���� Ŀ�� ����
		System.out.println("���� ������ �޴� : ");		
		if(coin >= 300) {
			System.out.println("1: ��ũĿ��(300), 2: ����Ŀ��(200), 3: ��Ŀ��(200)"); 
		}else if(coin >= 200) {
			System.out.println("2: ����Ŀ��(200), 3: ��Ŀ��(200)"); 
		}else {
			System.out.println("���� ������ �޴� �����ϴ�. : ");
		}
		
		// Ŀ�Ǽ��� ó��
		menu = kbd.nextLine();
		switch (menu) {
		case "1":
			//coin = coin - 300;
			coin -= 300;
			System.out.println("��ũĿ�� ���Ծ��");
			break;
		case "2":
			coin -= 200;
			System.out.println("����Ŀ�� ���Ծ��");
			break;
		case "3":
			coin -= 200;
			System.out.println("��Ŀ�� ���Ծ��");
			break;

		default:
			System.out.println("�޴��� �߸� �����߾��");
			break;
		}
		
		System.out.println("���� ������ : "+coin);

	}

}
