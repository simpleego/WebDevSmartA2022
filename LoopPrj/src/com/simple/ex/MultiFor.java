package com.simple.ex;

public class MultiFor {

	public static void main(String[] args) {

		// ���۴ܰ� ������ Ű����� �Է� �޾Ƽ�
		// �������� ����Ͻÿ�.
		// ���۴� : 3
		// ���� : 5
		// 3~5�ܱ��� ���
		int startDan = 3;
		int endDan = 5;
		
		// ¦������ ����Ͻÿ�.

		for (int i = 2; i <= 9; i++) {
			
			// ¦������ ���
			if( i % 2 == 1) continue;
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "x" + j + "=" + (i * j) + " ");
			}
			System.out.println();
		}
	}

}
