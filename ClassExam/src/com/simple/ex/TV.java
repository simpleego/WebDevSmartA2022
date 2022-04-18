package com.simple.ex;

public class TV {
	
	int channel;
	int vol=10;
	boolean power;
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void channelUp() {		
		channel++;
		System.out.println("ä�� :"+channel);
	}
	
	public void channelDown() {
		channel--;
		System.out.println("ä�� :"+channel);
	}
	
	public int getVol() {
		return vol;
	}
	
	public void volUp() {
		vol++;
		System.out.println("���� : "+getVol());
	}
	
	public void volDown() {
		vol--;
		System.out.println("���� : "+getVol());
	}
	
	public boolean isPower() {
		return power;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void powerOn() {
		power = true;
		System.out.println("TV�� �������ϴ�." );
	}
	
	public void powerOff() {
		power = false;
		System.out.println("TV�� �������ϴ�." );
	}
	@Override
	public String toString() {
		String powerState="OFF";
		
		if(power) {
			powerState="ON";
		}
		
		return "TV [channel=" + channel + ", vol=" + vol + ", power=" + powerState + "]";
	}	
	
}
