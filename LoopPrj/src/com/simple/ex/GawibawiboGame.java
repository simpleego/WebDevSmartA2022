package com.simple.ex;

import java.util.Scanner;

public class GawibawiboGame {

	public static void main(String[] args) {
		//String computer_ = "";
		String user_ = "";
		int com, user;
		final double PI = 3.14;
		final String KAWI = "����";
		final String BAWI = "����";
		final String BO = "��";
		
		System.out.print("����(1) ����(2) ��(3) �� �ϳ��� �Է��ϼ��� :");
		
		Scanner kbd = new Scanner(System.in);
		user_ = kbd.nextLine();
		user = Integer.parseInt(user_);
		
		com = (int)(Math.random()*3)+1;	// ��ǻ�Ͱ� ���� ����, ����, ��
		
		System.out.println(" ����� :"+user);
		System.out.println(" ��ǻ�� :"+com);
		
		switch (com-user) {
		case 1:
		case -2:
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			break;
		case -1:
		case 2:
			System.out.println("��ǻ�Ͱ� �����ϴ�.");
			break;			
		case 0:
			System.out.println("�����ϴ�.");
			break;
		default:
			break;
		}

	}

}
