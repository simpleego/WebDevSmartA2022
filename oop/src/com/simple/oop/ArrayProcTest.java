package com.simple.oop;

public class ArrayProcTest {
	
	final static int STUDENTS = 3;

	public static void main(String[] args) {
		
		int[] scores = new int[STUDENTS];
		ArrayProc obj = new ArrayProc();
		
		obj.getValues(scores);
		double avg = obj.getAverage(scores);
		System.out.printf("ЦђБе : %6.2f",avg);
	}

}
