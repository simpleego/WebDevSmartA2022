package com.simple.vm;

import java.util.Scanner;

public class Japangi {

	public static void main(String[] args) {
		// 자판기 프로그램
		
		// 동전입력 처리
		// 입력한 동전을 저장할 변수
		//
		int coin=0;
		String coin_="";
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("밀크커피(300), 프림커피(200), 블랙커피(200)"); 
		System.out.print("동전입력 : ");
		
		coin_ = kbd.nextLine();
		coin = Integer.parseInt(coin_);
		
		System.out.println("입력된 동전은 : "+coin);
		
		if(coin < 200) {
			System.out.println("돈이 모자랍니다.");
			System.out.println("밀크커피(300), 프림커피(200), 블랙커피(200)"); 
			System.out.print("동전입력 : ");
			
			coin_ = kbd.nextLine();
			coin = Integer.parseInt(coin_);
		}		
		System.out.println("입력된 동전은 : "+coin);

	}

}
