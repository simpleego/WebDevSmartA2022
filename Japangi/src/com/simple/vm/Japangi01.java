package com.simple.vm;

import java.util.Scanner;

public class Japangi01 {

	public static void main(String[] args) {
		// 자판기 프로그램
		
		// 동전입력 처리
		// 입력한 동전을 저장할 변수
		//
		int coin=0;
		String coin_="";
		String menu=""; 
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("밀크커피(300), 프림커피(200), 블랙커피(200)"); 
		System.out.print("동전입력 : ");
		
		coin_ = kbd.nextLine();
		coin = Integer.parseInt(coin_);
				
		System.out.println("입력된 동전은 : "+coin);
		
		// 동전 입력에 따른 커피 선택
		System.out.println("선택 가능한 메뉴 : ");		
		if(coin >= 300) {
			System.out.println("1: 밀크커피(300), 2: 프림커피(200), 3: 블랙커피(200)"); 
		}else if(coin >= 200) {
			System.out.println("2: 프림커피(200), 3: 블랙커피(200)"); 
		}else {
			System.out.println("선택 가능한 메뉴 없습니다. : ");
		}
		
		// 커피선택 처리
		menu = kbd.nextLine();
		switch (menu) {
		case "1":
			//coin = coin - 300;
			coin -= 300;
			System.out.println("밀크커피 나왔어요");
			break;
		case "2":
			coin -= 200;
			System.out.println("프림커피 나왔어요");
			break;
		case "3":
			coin -= 200;
			System.out.println("블랙커피 나왔어요");
			break;

		default:
			System.out.println("메뉴를 잘못 선택했어요");
			break;
		}
		
		System.out.println("남은 동전은 : "+coin);

	}

}
