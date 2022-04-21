package com.simple.ex;

public class MultiFor2 {

	public static void main(String[] args) {
		
		int count=0;
		int k=0;
		
		for (int i = 0; i < 5; i++) {
			//k = k+1;
			for (int j = 0; j < i; j++) {
				//
				System.out.printf("%3d",++count);
			}
			System.out.println();
		}
	}

}
