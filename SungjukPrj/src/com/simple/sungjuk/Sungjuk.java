package com.simple.sungjuk;

import java.util.Scanner;

public class Sungjuk {

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

		// 데이터: 키보드로 입력
		Scanner  kbd = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = kbd.nextLine();
		
		System.out.print("성별(남/여) : ");
		gender_ =  kbd.next().charAt(0);
		/*
		 * if(gender_ == '남') { gender = true; }else { gender = false; }
		 */
		
		gender = (gender_ == '남') ? true : false;
		
		kbd.nextLine();
		System.out.print("나이 : ");
		age = Integer.parseInt(kbd.nextLine());
		
		System.out.print("국어 : ");
		kor = kbd.nextInt();
		System.out.print("영어 : ");
		eng = kbd.nextInt();
		System.out.print("수학 : ");
		mat = kbd.nextInt();
		

		// 데이터 처리
		// 총점, 평균
		tot = kor + eng + mat;
		avg = (double) tot / COUNT;

		// 데이터 출력
		System.out.println("----------------------------------------");
		System.out.println("이름 성별 나이 국어 영어 수학 총점  평균");
		System.out.println("----------------------------------------");
		System.out.printf("%s %c %4d %4d %4d %4d %4d %6.2f", name, gender_, age, kor, eng, mat, tot, avg);

	}

}
