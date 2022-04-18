package com.simple.oop;

public class CarTest {

	public static void main(String[] args) {
		Car c1 , c2, c3;
		c1 = new Car("대구23더2137",200.0);
		c2 = new Car();
		c3 = new Car("서울02-2345", 20.5, 500.0);		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		for (int i = 0; i < 20; i++) {
			c1.accelerate(i+10.0);
//			System.out.println(c1.getLicensePlate()+"차량 운행 중이고"+
//			           c1.getSpeed()+"km로 달리고 있다");	
			System.out.println(c1);
		}
		
		
	}

}
