package com.simple.ex;

public class CardMain {

	public static void main(String[] args) {
		
		System.out.println(Card.HEIGHT);		
		Card c1 = new Card();
		c1.kind="Heart";
		c1.number=1;
		Card c4;
		
		c4 = c1;		
		
		Card c2 = new Card();
		c2.kind="Spade";
		c2.number=1;
		
		c4 = c2;
		
		Card c3 = new Card();
		c3.kind="Diamond";
		c3.number=1;
		System.out.println(c3.WIDTH);
		System.out.println(Card.WIDTH);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
