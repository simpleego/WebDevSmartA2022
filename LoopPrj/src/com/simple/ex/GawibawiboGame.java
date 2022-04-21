package com.simple.ex;

import java.util.Scanner;

public class GawibawiboGame {

	public static void main(String[] args) {
		//String computer_ = "";
		String user_ = "";
		int com, user;
		final double PI = 3.14;
		final String KAWI = "가위";
		final String BAWI = "바위";
		final String BO = "보";
		
		System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력하세요 :");
		
		Scanner kbd = new Scanner(System.in);
		user_ = kbd.nextLine();
		user = Integer.parseInt(user_);
		
		com = (int)(Math.random()*3)+1;	// 컴퓨터가 내는 가위, 바위, 보
		
		System.out.println(" 사용자 :"+user);
		System.out.println(" 컴퓨터 :"+com);
		
		switch (com-user) {
		case 1:
		case -2:
			System.out.println("컴퓨터가 이겼습니다.");
			break;
		case -1:
		case 2:
			System.out.println("컴퓨터가 졌습니다.");
			break;			
		case 0:
			System.out.println("비겼습니다.");
			break;
		default:
			break;
		}

	}

}
