package com.simple.ex;

public class DataType4 {

	public static void main(String[] args) {
		// ������ �Է�(�غ�)
		// �̸�, ����, ����, ����,����,����
		// ����, ���
		String name;
		char gender;
		int age;
		int kor,eng,mat;
		int tot;
		double avg;
		
		// ������ �Ҵ�
		name="ȫ�浿";
		gender='��';
		age=20;
		kor=78;eng=90;mat=89;
		
		// ������ ó��
		// ����, ���
		tot = kor+eng+mat;
		avg = (double)tot/3;		
		
		// ������ ���
		System.out.println("----------------------------------------");
		System.out.println("�̸� ���� ���� ���� ���� ���� ����  ���");
		System.out.println("----------------------------------------");
		System.out.printf("%s %c %4d %4d %4d %4d %4d %6.2f",
				           name,gender,age,kor,eng,mat,tot,avg);
		
	}
}
