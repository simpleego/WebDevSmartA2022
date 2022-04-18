package com.simple.ex;

import java.util.Scanner;

public class ExamBigSmall {

	public static void main(String[] args) {
		
		// 입력 데이터
		// 입력변수 준비
		int number1;
		int number2;
		int bigNumber=0;
		
		String number1_="";
		String number2_="";
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 :");
		number1_ = kbd.nextLine();
		number1 = Integer.parseInt(number1_);
		
		System.out.print("정수를 입력하세요 :");
		number2_ = kbd.nextLine();
		number2 = Integer.parseInt(number2_);
		
		// 데이터 처리
		/*if(number1 > number2) {
			System.out.println("큰수는 : "+number1);
		}else {
			if(number1 == number2) {
				System.out.println("두 수는 같습니다.");
			}else {
				System.out.println("큰수는 : "+number2);
			}			
		}		
		
		if(number1 > number2) {
			bigNumber = number1;
		}else {
			if(number1 == number2) {
				//System.out.println("두 수는 같습니다.");
			}else {
				bigNumber = number2;
			}			
		}
		*/
		
		if(number1 > number2) {
			bigNumber = number1;
		}else if(number1 == number2) {
				//System.out.println("두 수는 같습니다.");
		}else {
				bigNumber = number2;
		}
		
		// 데이터 출력
		System.out.println("큰 수는 :"+bigNumber);
	}

}
