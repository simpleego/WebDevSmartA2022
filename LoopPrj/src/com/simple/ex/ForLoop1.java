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
			 
			System.out.print("������ �Է� : ");
			num = kbd.nextInt();		
					
			tot = tot + num; // ���� -- > ��������
			count++;
		}
		
		System.out.println("���� : "+tot);
		System.out.println("count : "+count);
		// ���
		avg = (double)tot / count;		
		System.out.printf("��� : %.2f",avg);
		
		
		
		
	}

}
