package com.simple.ex;

public class SungjukMain {

	public static void main(String[] args) {
		
		Sungjuk sungjuk01 = new Sungjuk();
		Sungjuk sungjuk02 = new Sungjuk();
		Sungjuk sungjuk03;
		
		sungjuk03 = sungjuk02;
		
		System.out.println("������:"+sungjuk02.hashCode());
		System.out.println("������:"+sungjuk03.hashCode());
		
		System.out.println("����1"+sungjuk01);
		System.out.println("����2"+sungjuk02);
		
		//sungjuk01.name = "ȫ�浿";
		sungjuk02.setName("ȫ�浿");
		sungjuk01.setKor(89);
		sungjuk01.setEng(80);
		sungjuk01.setMat(79);
		System.out.println("����1"+sungjuk01);
		System.out.println("����1 �̸�:"+sungjuk01.getName());
		System.out.println("����1 ����:"+sungjuk01.getTotal());
		System.out.printf("����1 ���: %6.2f\n",sungjuk01.getAverage());
		System.out.println("����1 ����:"+sungjuk01.getGrade());

	}

}
