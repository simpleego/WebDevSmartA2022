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
		System.out.println("��ȭ�ɱ�");		
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�ޱ�");		
	}
	
	public void penDraw() {
		System.out.println("������ �׸� �׸���");
	}
	
	public static void main(String[] args) {
		SamsungPhone sm1 = new SamsungPhone();
		sm1.penDraw();
		sm1.printLogo();
		int timeout = sm1.TIMEOUT;
		System.out.println("�ð��ʰ� ��: "+timeout);
	}
}


