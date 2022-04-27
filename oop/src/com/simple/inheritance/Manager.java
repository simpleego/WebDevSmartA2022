package com.simple.inheritance;

public class Manager extends Employee {
	private int bonus;

	public Manager(String name, String address, int salary, int rrn,
			       int bonus) {
		super(name, address, salary, rrn);
		this.bonus = bonus;
	}
	
	public void test() {
		System.out.println("name :"+name);
		System.out.println("address :"+address);
		System.out.println("salary :"+salary);
		//System.out.println("rrn  :"+ rrn );
	}
	
	public static void main(String[] args) {		
		Manager m = new Manager("홍길동", "대구시", 1200000, 456789, 100000);
		System.out.println(m);
		m.test();
	}

}
