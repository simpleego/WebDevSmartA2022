package com.simple.array;

public class RollDice {

	public static void main(String[] args) {
		// �ֻ����� ������ �� �Ŀ� 
		// ������ ���� ���� ī��Ʈ �Ѵ�.
		
		int freq[] = new int[6];
		int num;		
		
		for (int i = 0; i < 10000; i++) {
			num = (int) (Math.random()*6);
			System.out.print(" " + (num+1));			
			++freq[num];
		}
		
		System.out.println();
		for (int i = 0; i < freq.length; i++) {
			System.out.print(" "+freq[i]);
		}
		

	}

}
