package com.simple.inheritance;

public class Person {
	private int weight;  // ���� �����
	int age;			 // ���� ��Ű���� Ŭ�������� ����(���� �׷�)
	protected int height;  // ����ϴ� Ŭ���� ��ο��� ����
	public String name;
	String id;
	
	public Person() {
		System.out.println(" Person ������ ȣ���.");
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
