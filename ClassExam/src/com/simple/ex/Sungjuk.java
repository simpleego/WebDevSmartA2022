package com.simple.ex;

public class Sungjuk {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	// 총점 
	public int getTotal() {		
		return kor+eng+mat;
	}
	
	// 평균
	public double getAverage() {		
		return (double)getTotal()/3;
	}
	
	// 등급(학점)
	public String getGrade() {
		String grade="";
		double avg = getAverage();
		switch ((int)avg/10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:	
			grade = "D";
			break;
		default:
			grade = "F";
		}		
		
		return grade;
	}
	
	@Override
	public String toString() {
		return "Sungjuk [이름=" + name + ", 국어=" + kor + ", 영어=" + eng + ", 수학=" + mat + "]";
	}
}
