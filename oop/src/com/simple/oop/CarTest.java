package com.simple.oop;

public class CarTest {

	public static void main(String[] args) {
		Car c1 , c2, c3;
		c1 = new Car("�뱸23��2137",200.0);
		c2 = new Car();
		c3 = new Car("����02-2345", 20.5, 500.0);		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		for (int i = 0; i < 20; i++) {
			c1.accelerate(i+10.0);
//			System.out.println(c1.getLicensePlate()+"���� ���� ���̰�"+
//			           c1.getSpeed()+"km�� �޸��� �ִ�");	
			System.out.println(c1);
		}
		
		
	}

}
