package com.simple.ex;

import java.time.LocalDate;

public class StringEx {

	public static void main(String[] args) {

		String proverb = "A Barking dog";
		//String prover= "01234567890123";
		String str = new String("020625-4403619");
		int[] num = new int[10];
		String gender = "����";
		char gen = ' ';
		int birthYear=2000;
		
		
		String s1,s2,s3,s4;
		System.out.println("���ڿ��� ���� :"+proverb.length());
		System.out.println("���ڿ��� ���� :"+str.length());
		
		s1 = proverb.concat(" never Bite");
		s2 = proverb+" never Bite";
		s3 = proverb.replace('B', 'b');
		s3 = proverb.substring(10);
		String strYear = str.substring(0, 2);
		
		System.out.println(strYear);
		
		
		gen = str.charAt(7);
		if(gen == '1' || str.charAt(7) == '3') {
			gender = "����";
		}
		System.out.println("���� :"+gender);
		
		// ���� ���ϱ�
		// ����⵵ - �¾ �⵵
		//  2022 - 2002  ==> 20
		
		if(gen == '1' || str.charAt(7) == '2') {
			birthYear = 1900;
		}
		
		// ���� �츮������ ��¥ 
		LocalDate now = LocalDate.now();
		System.out.println(birthYear);
		System.out.println("���̴� : " + 
		(now.getYear() - (birthYear+Integer.parseInt(strYear))));

	}

}
