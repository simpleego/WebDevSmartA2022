package com.simple.array;

import java.util.Scanner;

public class MovieReservation {

	public static void main(String[] args) {
		
		// 극장 예약 시스템
		final int SIZE = 10;
		int [] seats = new int[SIZE];
		
		Scanner kbd = new Scanner(System.in);
		
		while(true) {
			
			displaySeat();
			for (int i = 0; i < 10; i++) {
				System.out.print(seats[i]+" ");
			}
			System.out.println("\n---------------------");
			
			System.out.print("원하는 좌석번호를 입력하세요(종료는 -1) :");
			int s = kbd.nextInt();
			if(s == -1) {
				break;
			}
			
			// 예약여부 확인
			if(seats[s-1] == 0) {
				seats[s-1] = 1;
				System.out.println(s+"번 좌석 예약되었습니다.");
			}else {
				System.out.println(s+"번 좌석 이미 예약되었습니다.");
			}
			
		}
	}
	
	private static void displaySeat() {
		System.out.println("---------------------");
		for (int i = 0; i < 10; i++) {
			System.out.print(i+1+" ");
		}
		System.out.println("\n---------------------");
	}
}
