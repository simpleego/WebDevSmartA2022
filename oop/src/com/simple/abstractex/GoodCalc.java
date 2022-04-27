package com.simple.abstractex;

public class GoodCalc extends Calculator{
	@Override
	public int add(int a, int b) {		
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}		
		return sum/a.length;
	}
	
	public int multipleX(int x) {
		return x*x;
	}

	public static void main(String[] args) {
		int[] a = {2,3,4,5,6,7};
		
		GoodCalc c = new GoodCalc();
		int sum = c.add(10, 20);
		System.out.println("ÇÕ°è : "+sum);	
		
		double avg = c.average(a);
		System.out.println("Æò±Õ : "+avg);	
		
		System.out.println("Á¦°ö :"+c.multipleX(5));
		
	}
}
