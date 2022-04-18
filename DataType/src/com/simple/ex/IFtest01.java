package com.simple.ex;

import java.util.Scanner;

public class IFtest01 {

	public static void main(String[] args) {
		// 성년/미성년 구분하기
		// 20세 이상이면 성년으로 구분
		
		Scanner kbd = new Scanner(System.in);
		int age;
		String str="미성년";
		
		System.out.print("당신의 나이는 : ");
		
		String age_ = kbd.nextLine();
		
		age = Integer.parseInt(age_);
		
		if(age >= 20) {
			str = "성년";
			//return;
		}
		
		System.out.println("당신은 "+str+"입니다");

	}

}
