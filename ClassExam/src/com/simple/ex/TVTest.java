package com.simple.ex;

public class TVTest {

	public static void main(String[] args) {
		
		// ��ü ����
		TV tv = new TV();		
		
		System.out.println("tv :"+tv.toString());
		tv.setPower(true);
		System.out.println("TV :"+tv.isPower());
		
		tv.setChannel(11);
		System.out.println("���� ä�� :"+tv.getChannel());		
		tv.volUp();
		tv.volUp();
		tv.volUp();
		tv.volUp();
		System.out.println("tv :"+tv.toString());
		tv.volUp();
		tv.volDown();
		tv.volDown();
		tv.volDown();
		tv.volDown();
		tv.volDown();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		

	}

}
