package com.simple.ex;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// ������ �Է�
		int siljuk=0;
		int bonus=0;
		final int TARGET_SILJUK = 1000;
		
		// ������ Ű����� �Է�
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		siljuk = kbd.nextInt();
		
		// ������ ó��
		if(siljuk > TARGET_SILJUK) {
			bonus = (int) ((siljuk - TARGET_SILJUK) * 0.1);
			System.out.println("���� �޼�");
		}else {
			System.out.println("���� �̴�");
		}
		
		// ������ ���
		System.out.println("���ʽ� : "+bonus);
	}

}
