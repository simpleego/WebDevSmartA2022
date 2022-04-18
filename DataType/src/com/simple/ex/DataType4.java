package com.simple.ex;

public class DataType4 {

	public static void main(String[] args) {
		// 데이터 입력(준비)
		// 이름, 성별, 나이, 국어,영어,수학
		// 총점, 평균
		String name;
		char gender;
		int age;
		int kor,eng,mat;
		int tot;
		double avg;
		
		// 데이터 할당
		name="홍길동";
		gender='남';
		age=20;
		kor=78;eng=90;mat=89;
		
		// 데이터 처리
		// 총점, 평균
		tot = kor+eng+mat;
		avg = (double)tot/3;		
		
		// 데이터 출력
		System.out.println("----------------------------------------");
		System.out.println("이름 성별 나이 국어 영어 수학 총점  평균");
		System.out.println("----------------------------------------");
		System.out.printf("%s %c %4d %4d %4d %4d %4d %6.2f",
				           name,gender,age,kor,eng,mat,tot,avg);
		
	}
}
