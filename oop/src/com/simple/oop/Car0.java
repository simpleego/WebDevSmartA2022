package com.simple.oop;

public class Car0 {	
	private String licensePlate;
	private double speed;
	private double maxSpeed;
	
	public Car0() {
		this.licensePlate="";
		this.speed=0.0;
		this.maxSpeed=200.0;		
	}
	
	public Car0(String licensePlate, double maxSpeed) {
		this.licensePlate = licensePlate;
		if(maxSpeed > 0 ) this.maxSpeed = maxSpeed;
		else this.maxSpeed = 200.0;
		this.speed = 0.0;
	}
	
	public Car0(String licensePlate, double speed, double maxSpeed) {
		this.licensePlate = licensePlate;
		
		if(speed < maxSpeed) this.speed = speed;
		else speed =  0.0;
		
		if(maxSpeed > 0 ) this.maxSpeed = maxSpeed;
		else this.maxSpeed = 200.0;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}	
	
	
	public String getLicensePlate() {
		return licensePlate;
	}


	public double getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(double maxSpeed) {
		if(maxSpeed > 0)
			this.maxSpeed = maxSpeed;
		else 
			this.maxSpeed = 0.0;
	}
	// 엑셀을 최대로 밟기
	public void floorlt() {
		speed = maxSpeed;		
	}
	
	public boolean isSpeeding() {
		double excess;
		excess = this.maxSpeed - this.speed;
		if(excess < 0) return true;
		else return false;
	}
	
	public void accelerate(double deltaV) {
		this.speed = this.speed + deltaV;
		if(this.speed > this.maxSpeed) {
			this.speed = this.maxSpeed;
		}
		
		if(this.speed < 0.0) {
			this.speed  = 0.0;
		}
	}

	@Override
	public String toString() {
		return "Car [번호판 :" + licensePlate + ", 속도 :" + speed + ", 최고속도 :" + maxSpeed + "]";
	}
	
}


