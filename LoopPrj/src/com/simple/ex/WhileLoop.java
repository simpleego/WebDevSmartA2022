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
			
			System.out.print("������ �Է� : ");
			num = kbd.nextInt();
			// ���� -- > ��������
			tot = tot + num;
			i++;
		}
		
		System.out.println("���� : "+tot);
		
		// ���
		avg = (double)tot / (i-1);		
		System.out.printf("��� : %.2f",avg);
		
		
		
		
	}

}
