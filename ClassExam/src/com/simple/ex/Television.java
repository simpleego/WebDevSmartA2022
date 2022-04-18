package com.simple.ex;

public class Television {

	private int channel;
	private int volume;
	private boolean power;
	
	static int serialNumber = 1000;
	static String model = "SamsungQV";

	public Television() {
		// TODO Auto-generated constructor stub
		serialNumber++;
	}

	public Television(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = false;
		serialNumber++;
	}

	public Television(int channel) {
		this.channel = channel;
		serialNumber++;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Television [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}

	public static void main(String[] args) {
		
		System.out.println(Television.serialNumber);
		
		double pi = Math.PI;
		System.out.println(pi);		
		
		Television tv1 = new Television();
		System.out.println(tv1.serialNumber);

		Television tv2 = new Television(10);
		System.out.println(tv2.serialNumber);
		
		Television tv21 = new Television(10);
		System.out.println(tv21.serialNumber);
		
		Television tv22 = new Television(10);
		System.out.println(tv22.serialNumber);

		Television tv3 = new Television(2, 10, false);
		System.out.println(tv3.model);

	}

}
