package com.simple.inheritance;

public class Person {
	private int weight;  // 절대 비공개
	int age;			 // 같은 패키지의 클래스에게 공개(같은 그룹)
	protected int height;  // 상속하는 클래스 모두에게 공개
	public String name;
	String id;
	
	public Person() {
		System.out.println(" Person 생성자 호출됨.");
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}
	
}
