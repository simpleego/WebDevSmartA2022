package com.simple.ex;

import java.util.Scanner;

public class WhileLoop2 {
	
	public static void main(String[] args) {
		
		int count = 0;
		int num;
		int tot=0;
		double avg;		
		
		Scanner kbd = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수를 입력 : ");
			System.out.print("** 종료는 -99 입력 ");
			num = kbd.nextInt();
			
			// 반복을 종료할 조건 처리
			if(num == -99) {
				break;
			}
			
			count++;   // 숫자가 몇개인지 카운트			
			tot = tot + num; // 총점 -- > 누적공식
			
		}
		
		System.out.println("총점 : "+tot);
		System.out.println("count : "+count);
		// 평균
		avg = (double)tot / count;		
		System.out.printf("평균 : %.2f",avg);
		
		
		
		
	}

}
