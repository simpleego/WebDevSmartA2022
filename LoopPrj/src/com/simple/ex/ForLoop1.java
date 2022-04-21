package com.simple.ex;

import java.util.Scanner;

public class ForLoop1 {
	
	public static void main(String[] args) {
		
		int count = 0;
		int num;
		int tot=0;
		double avg;	
		int i=0;
		
		Scanner kbd = new Scanner(System.in);
		
		for (int j = 0; j < 3; j++) {
			 
			System.out.print("Á¤¼ö¸¦ ÀÔ·Â : ");
			num = kbd.nextInt();		
					
			tot = tot + num; // ÃÑÁ¡ -- > ´©Àû°ø½Ä
			count++;
		}
		
		System.out.println("ÃÑÁ¡ : "+tot);
		System.out.println("count : "+count);
		// Æò±Õ
		avg = (double)tot / count;		
		System.out.printf("Æò±Õ : %.2f",avg);
		
		
		
		
	}

}
