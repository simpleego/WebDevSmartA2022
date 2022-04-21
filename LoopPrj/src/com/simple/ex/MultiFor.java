package com.simple.ex;

public class MultiFor {

	public static void main(String[] args) {

		// 시작단과 끝단을 키보드로 입력 받아서
		// 구구단을 출력하시오.
		// 시작단 : 3
		// 끝단 : 5
		// 3~5단까지 출력
		int startDan = 3;
		int endDan = 5;
		
		// 짝수단을 출력하시오.

		for (int i = 2; i <= 9; i++) {
			
			// 짝수단을 출력
			if( i % 2 == 1) continue;
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "x" + j + "=" + (i * j) + " ");
			}
			System.out.println();
		}
	}

}
