package com.simple.ex;

import java.util.Scanner;

public class ForLoop2 {
	
	public static void main(String[] args) {
		
		int tot=0;
		
		// n개의 임의의 수를 총합을 구하시오.
		for (int i = 1; i <= 10; i++) {
			// 누적하기
			// 실제 데이터 --> 난수 
			int num = (int)(Math.random()*5)+1;
			tot += num;
			System.out.println(num);
			System.out.println("num : "+num + "tot : "+tot);		
		}
		
		
		
	}

}
