package com.simple.sungjuk;

import java.util.Scanner;

public class Sungjuk2 {

	public static void main(String[] args) {

		// 데이터 입력(준비)
		// 이름, 성별, 나이, 국어,영어,수학
		// 총점, 평균

		// 입력변수
		String name;
		boolean gender;
		char gender_;
		int age;
		int kor, eng, mat;
		final int COUNT = 3;

		// 출력변수
		int tot;
		double avg;
		String grade = "";

		// 데이터: 키보드로 입력
		Scanner kbd = new Scanner(System.in);

		System.out.print("이름 : ");
		name = kbd.nextLine();

		System.out.print("성별(남/여) : ");
		gender_ = kbd.next().charAt(0);
		/*
		 * if(gender_ == '남') { gender = true; }else { gender = false; }
		 */

		gender = (gender_ == '남') ? true : false;

		kbd.nextLine();
		System.out.print("나이 : ");
		age = Integer.parseInt(kbd.nextLine());

		System.out.print("국어 : ");
		kor = kbd.nextInt();
		if( kor < 0 || kor > 100 ) {
			kor = 0;
		}		
			
		System.out.print("영어 : ");
		eng = kbd.nextInt();
		if( eng < 0 || eng > 100 ) {
			eng = 0;
		}
		System.out.print("수학 : ");
		mat = kbd.nextInt();
		if( mat < 0 || mat > 100 ) {
			mat = 0;
		}

		// 데이터 처리
		// 총점, 평균
		tot = kor + eng + mat;
		avg = (double) tot / COUNT;

		grade = hakjum(avg);

		// 데이터 출력
		System.out.println("----------------------------------------------");
		System.out.println("이름 성별 나이 국어 영어 수학 총점  평균  학점 ");
		System.out.println("-----------------------------------------------");
		System.out.printf("%s %c %4d %4d %4d %4d %4d %6.2f %s", name, gender_, age, kor, eng, mat, tot, avg, grade);

	}

	// 학점 계산 : 입력은 평균, 반환값은 grade
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
