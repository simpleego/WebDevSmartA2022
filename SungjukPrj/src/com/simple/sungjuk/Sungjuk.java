package com.simple.sungjuk;

import java.util.Scanner;

public class Sungjuk {

	public static void main(String[] args) {

		// ������ �Է�(�غ�)
		// �̸�, ����, ����, ����,����,����
		// ����, ���
		
		// �Էº���
		String name;
		boolean gender;
		char gender_;
		int age;
		int kor, eng, mat;
		final int COUNT = 3;
		
		// ��º���
		int tot;
		double avg;

		// ������: Ű����� �Է�
		Scanner  kbd = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		name = kbd.nextLine();
		
		System.out.print("����(��/��) : ");
		gender_ =  kbd.next().charAt(0);
		/*
		 * if(gender_ == '��') { gender = true; }else { gender = false; }
		 */
		
		gender = (gender_ == '��') ? true : false;
		
		kbd.nextLine();
		System.out.print("���� : ");
		age = Integer.parseInt(kbd.nextLine());
		
		System.out.print("���� : ");
		kor = kbd.nextInt();
		System.out.print("���� : ");
		eng = kbd.nextInt();
		System.out.print("���� : ");
		mat = kbd.nextInt();
		

		// ������ ó��
		// ����, ���
		tot = kor + eng + mat;
		avg = (double) tot / COUNT;

		// ������ ���
		System.out.println("----------------------------------------");
		System.out.println("�̸� ���� ���� ���� ���� ���� ����  ���");
		System.out.println("----------------------------------------");
		System.out.printf("%s %c %4d %4d %4d %4d %4d %6.2f", name, gender_, age, kor, eng, mat, tot, avg);

	}

}
