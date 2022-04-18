package com.simple.array;

public class MaxMinEx {

	public static void main(String[] args) {

		int s[] = { 12, 3, 19, 26, 18, 12, 4, 1, 19 };
		int s2[] = { 12, 3, 19, 26, 18, 12, 4, 1, 19 };
		int temp;
		int max = s[0];

		for (int i = 1; i < s.length; i++) {

			if (max < s[i]) {
				max = s[i];
			}
		}

		System.out.println("가장 큰값 : " + max);

		// 최대값의 위치를 찾기
		int maxPostion = -1;
		int num = 30;
		for (int i = 0; i < s2.length; i++) {
			if (num == s2[i]) {
				maxPostion = i + 1;
				break;
			}
			System.out.print(" "+s2[i]);
		}
		if (maxPostion != -1) {
			System.out.println("최대값의 위치는 :" + maxPostion);
		} else {
			System.out.println("\n찾고자 하는 값"+num+"이 없습니다.");
		}
	}

}
