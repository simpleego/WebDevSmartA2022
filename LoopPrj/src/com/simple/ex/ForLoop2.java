package com.simple.ex;

import java.util.Scanner;

public class ForLoop2 {
	
	public static void main(String[] args) {
		
		int tot=0;
		
		// n���� ������ ���� ������ ���Ͻÿ�.
		for (int i = 1; i <= 10; i++) {
			// �����ϱ�
			// ���� ������ --> ���� 
			int num = (int)(Math.random()*5)+1;
			tot += num;
			System.out.println(num);
			System.out.println("num : "+num + "tot : "+tot);		
		}
		
		
		
	}

}
