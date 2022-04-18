package com.simple.ex;

public class Student {
	private int number;
	private int age;
	private int level;
	private String name;
	private String school;	
	
	public Student() {
		number=100;
		age=20;
		level=1;
		name="";
		school="한국대";
	}

	public Student(int number, int age, int level, String name) {
		this.number = number;
		this.age = age;
		this.level = level;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [number=" + number + ", age=" + age + ", level=" + level + ", name=" + name + ", school="
				+ school + ", hashCode()=" + hashCode() + "]";
	}

	public static void main(String[] args) {
		// 
		
		Student std1 = new Student();
		Student std2 = new Student(10, 22, 2, "이순신");
		
		System.out.println(std1);
		System.out.println(std2);
		
	}

}
