package com.simple.ex;

public class Card {
	String kind;  // ī���� ����
	int number;
	static final int WIDTH = 100;
	static final int HEIGHT = 250;
	
	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + ", width=" + WIDTH + ", height=" + HEIGHT + "]";
	}
}


