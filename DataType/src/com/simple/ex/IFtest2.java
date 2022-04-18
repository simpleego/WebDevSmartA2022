package com.simple.ex;

import java.util.Scanner;

public class IFtest2 {

	public static void main(String[] args) {
		// 성년/미성년 구분하기
		// 20세 이상이면 성년으로 구분
		
		Scanner kbd = new Scanner(System.in);
		int age;
		String str="";
		
		System.out.print("당신의 나이는 : ");
		
		String age_ = kbd.nextLine();
		
		age = Integer.parseInt(age_);
		
		if(age >= 20 && age <= 29) {
			str = "20대";
		}else if(age >= 30 && age <= 39) {
			str = "30대";
		}else {
			str = "20-30대가 아닙니다.";
		}
		
		
		System.out.println("당신은 "+str);

	}

}
