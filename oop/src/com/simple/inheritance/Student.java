package com.simple.inheritance;

public class Student extends Person {
	
	String grade;
	String depatment;
	
	public Student() {
		System.out.println("Student »ý¼ºÀÚ È£ÃâµÊ.");
	}
	
	public Student(String name) {
		super(name);
	}
	
	public void set() {
		age = 30;
		name = "È«±æµ¿";
		height = 175;		
		//weight = 50;
		setWeight(99);
	}
	
	public void show() {
		System.out.println("³ªÀÌ : "+age);
		System.out.println("Å° : "+height);
		System.out.println("¸ö¹«°Ô : "+getWeight());
		System.out.println("ÀÌ¸§ : "+name);
	}
	
	public static void main(String[] args) {
		//Person p;
		//Student s = new Student("È«±æµ¿");
		Person p = new Student("È«±æµ¿");
		Student s = (Student)p;
		s.set();
		s.show();
		//p = (Person)s;
		System.out.println(p.age);
		p.setWeight(100);
		System.out.println(p.getWeight());		
	}
}
