package com.simple.inheritance;

public class Student extends Person {
	
	String grade;
	String depatment;
	
	public Student() {
		System.out.println("Student 생성자 호출됨.");
	}
	
	public Student(String name) {
		super(name);
	}
	
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;		
		//weight = 50;
		setWeight(99);
	}
	
	public void show() {
		System.out.println("나이 : "+age);
		System.out.println("키 : "+height);
		System.out.println("몸무게 : "+getWeight());
		System.out.println("이름 : "+name);
	}
	
	public static void main(String[] args) {
		Person p;
		Student s = new Student("홍길동");
		s.set();
		s.show();
		p = (Person)s;
		System.out.println(p.age);
		p.setWeight(100);
		System.out.println(p.getWeight());		
	}
}
