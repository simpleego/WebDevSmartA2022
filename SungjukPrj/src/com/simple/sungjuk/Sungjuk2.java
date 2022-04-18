package com.simple.sungjuk;

import java.util.Scanner;

public class Sungjuk2 {

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
		String grade = "";

		// ������: Ű����� �Է�
		Scanner kbd = new Scanner(System.in);

		System.out.print("�̸� : ");
		name = kbd.nextLine();

		System.out.print("����(��/��) : ");
		gender_ = kbd.next().charAt(0);
		/*
		 * if(gender_ == '��') { gender = true; }else { gender = false; }
		 */

		gender = (gender_ == '��') ? true : false;

		kbd.nextLine();
		System.out.print("���� : ");
		age = Integer.parseInt(kbd.nextLine());

		System.out.print("���� : ");
		kor = kbd.nextInt();
		if( kor < 0 || kor > 100 ) {
			kor = 0;
		}		
			
		System.out.print("���� : ");
		eng = kbd.nextInt();
		if( eng < 0 || eng > 100 ) {
			eng = 0;
		}
		System.out.print("���� : ");
		mat = kbd.nextInt();
		if( mat < 0 || mat > 100 ) {
			mat = 0;
		}

		// ������ ó��
		// ����, ���
		tot = kor + eng + mat;
		avg = (double) tot / COUNT;

		grade = hakjum(avg);

		// ������ ���
		System.out.println("----------------------------------------------");
		System.out.println("�̸� ���� ���� ���� ���� ���� ����  ���  ���� ");
		System.out.println("-----------------------------------------------");
		System.out.printf("%s %c %4d %4d %4d %4d %4d %6.2f %s", name, gender_, age, kor, eng, mat, tot, avg, grade);

	}

	// ���� ��� : �Է��� ���, ��ȯ���� grade
	private static String hakjum(double avg) {
		//
		String hakjum = "";
		int value;
		value = (int) (avg/10);

		/*
		 * if (avg >= 95) { hakjum = "A+"; } else if (avg >= 90) { hakjum = "A0"; } else
		 * if (avg >= 85) { hakjum = "B+"; } else if (avg >= 80) { hakjum = "B0"; } else
		 * if (avg >= 75) { hakjum = "C+"; } else if (avg >= 70) { hakjum = "C0"; } else
		 * if (avg >= 65) { hakjum = "D+"; } else if (avg >= 60) { hakjum = "D0"; } else
		 * { hakjum = "F"; }
		 */
		switch (value) {
		case 10:
		case 9:
			hakjum = "A";
			break;
		case 8:
			hakjum = "B";
			break;
		case 7:
			hakjum = "C";
			break;
		case 6:
			hakjum = "D";
			break;
		default:
			hakjum = "F";
		}
		
		return hakjum;

	}

}
