package com.simple.inheritance;

public class Student extends Person {
	
	String grade;
	String depatment;
	
	public Student() {
		System.out.println("Student ������ ȣ���.");
	}
	
	public Student(String name) {
		super(name);
	}
	
	public void set() {
		age = 30;
		name = "ȫ�浿";
		height = 175;		
		//weight = 50;
		setWeight(99);
	}
	
	public void show() {
		System.out.println("���� : "+age);
		System.out.println("Ű : "+height);
		System.out.println("������ : "+getWeight());
		System.out.println("�̸� : "+name);
	}
	
	public static void main(String[] args) {
		Person p;
		Student s = new Student("ȫ�浿");
		s.set();
		s.show();
		p = (Person)s;
		System.out.println(p.age);
		p.setWeight(100);
		System.out.println(p.getWeight());		
	}
}
