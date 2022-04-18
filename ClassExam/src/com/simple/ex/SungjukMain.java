package com.simple.ex;

public class SungjukMain {

	public static void main(String[] args) {
		
		Sungjuk sungjuk01 = new Sungjuk();
		Sungjuk sungjuk02 = new Sungjuk();
		Sungjuk sungjuk03;
		
		sungjuk03 = sungjuk02;
		
		System.out.println("참조값:"+sungjuk02.hashCode());
		System.out.println("참조값:"+sungjuk03.hashCode());
		
		System.out.println("성적1"+sungjuk01);
		System.out.println("성적2"+sungjuk02);
		
		//sungjuk01.name = "홍길동";
		sungjuk02.setName("홍길동");
		sungjuk01.setKor(89);
		sungjuk01.setEng(80);
		sungjuk01.setMat(79);
		System.out.println("성적1"+sungjuk01);
		System.out.println("성적1 이름:"+sungjuk01.getName());
		System.out.println("성적1 총점:"+sungjuk01.getTotal());
		System.out.printf("성적1 평균: %6.2f\n",sungjuk01.getAverage());
		System.out.println("성적1 학점:"+sungjuk01.getGrade());

	}

}
