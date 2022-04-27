package com.simple.interfaceex;

interface Phone {
	final int TIMEOUT = 1000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

