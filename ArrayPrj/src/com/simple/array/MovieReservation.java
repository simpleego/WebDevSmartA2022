package com.simple.array;

import java.util.Scanner;

public class MovieReservation {

	public static void main(String[] args) {
		
		// ���� ���� �ý���
		final int SIZE = 10;
		int [] seats = new int[SIZE];
		
		Scanner kbd = new Scanner(System.in);
		
		while(true) {
			
			displaySeat();
			for (int i = 0; i < 10; i++) {
				System.out.print(seats[i]+" ");
			}
			System.out.println("\n---------------------");
			
			System.out.print("���ϴ� �¼���ȣ�� �Է��ϼ���(����� -1) :");
			int s = kbd.nextInt();
			if(s == -1) {
				break;
			}
			
			// ���࿩�� Ȯ��
			if(seats[s-1] == 0) {
				seats[s-1] = 1;
				System.out.println(s+"�� �¼� ����Ǿ����ϴ�.");
			}else {
				System.out.println(s+"�� �¼� �̹� ����Ǿ����ϴ�.");
			}
			
		}
	}
	
	private static void displaySeat() {
		System.out.println("---------------------");
		for (int i = 0; i < 10; i++) {
			System.out.print(i+1+" ");
		}
		System.out.println("\n---------------------");
	}
}
