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
			System.out.print("������ �Է� : ");
			System.out.print("** ����� -99 �Է� ");
			num = kbd.nextInt();
			
			// �ݺ��� ������ ���� ó��
			if(num == -99) {
				break;
			}
			
			count++;   // ���ڰ� ����� ī��Ʈ			
			tot = tot + num; // ���� -- > ��������
			
		}
		
		System.out.println("���� : "+tot);
		System.out.println("count : "+count);
		// ���
		avg = (double)tot / count;		
		System.out.printf("��� : %.2f",avg);
		
		
		
		
	}

}
