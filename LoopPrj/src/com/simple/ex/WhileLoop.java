package com.simple.ex;

import java.util.Scanner;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		int i = 1;
		int num;
		int tot=0;
		double avg;		
		
		Scanner kbd = new Scanner(System.in);
		
		while(i <= 3) {
			
			System.out.print("Á¤¼ö¸¦ ÀÔ·Â : ");
			num = kbd.nextInt();
			// ÃÑÁ¡ -- > ´©Àû°ø½Ä
			tot = tot + num;
			i++;
		}
		
		System.out.println("ÃÑÁ¡ : "+tot);
		
		// Æò±Õ
		avg = (double)tot / (i-1);		
		System.out.printf("Æò±Õ : %.2f",avg);
		
		
		
		
	}

}
