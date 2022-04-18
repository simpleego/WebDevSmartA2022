package com.simple.ex;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// 데이터 입력
		int siljuk=0;
		int bonus=0;
		final int TARGET_SILJUK = 1000;
		
		// 실적을 키보드로 입력
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("실적을 입력하세요 : ");
		siljuk = kbd.nextInt();
		
		// 데이터 처리
		if(siljuk > TARGET_SILJUK) {
			bonus = (int) ((siljuk - TARGET_SILJUK) * 0.1);
			System.out.println("실적 달성");
		}else {
			System.out.println("실적 미달");
		}
		
		// 데이터 출력
		System.out.println("보너스 : "+bonus);
	}

}
