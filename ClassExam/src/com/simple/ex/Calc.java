package com.simple.ex;


class CalcTest{
	public int add(int x, int y) {
		return x+y;
	}
	
	public double add(double x, double y) {
		return x+y;
	}
	
	public int add(char x, char y) {
		return x + y;
	}
	
}



public class Calc {

	public static void main(String[] args) {
		
		CalcTest calc = new CalcTest();
		double sum = calc.add(10, 20.5);
		double  tot = calc.add(10.5, 20);
		System.out.println("sum:"+sum);
		System.out.println("tot:"+tot);
		
		int  tot1 = calc.add('A', 'B');
		System.out.println("tot1:"+tot1);

	}

}
