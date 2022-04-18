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
		System.out.println("채널 :"+channel);
	}
	
	public void channelDown() {
		channel--;
		System.out.println("채널 :"+channel);
	}
	
	public int getVol() {
		return vol;
	}
	
	public void volUp() {
		vol++;
		System.out.println("볼륨 : "+getVol());
	}
	
	public void volDown() {
		vol--;
		System.out.println("볼륨 : "+getVol());
	}
	
	public boolean isPower() {
		return power;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void powerOn() {
		power = true;
		System.out.println("TV가 켜졌습니다." );
	}
	
	public void powerOff() {
		power = false;
		System.out.println("TV가 꺼졌습니다." );
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
