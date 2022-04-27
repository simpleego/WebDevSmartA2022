/**
 * 
 */
package com.simple.interfaceex;

/**
 * @author USER
 *
 */
public class SamsungPhone implements Phone {

	@Override
	public void sendCall() {
		System.out.println("전화걸기");		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화받기");		
	}
	
	public void penDraw() {
		System.out.println("펜으로 그림 그리기");
	}
	
	public static void main(String[] args) {
		SamsungPhone sm1 = new SamsungPhone();
		sm1.penDraw();
		sm1.printLogo();
		int timeout = sm1.TIMEOUT;
		System.out.println("시간초과 값: "+timeout);
	}
}


