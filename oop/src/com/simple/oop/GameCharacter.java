package com.simple.oop;

import java.util.ArrayList;
import java.util.Iterator;

public class GameCharacter {
	
	ArrayList<GameItem> list = new ArrayList<GameItem>();
	
	private class GameItem {
		String name;
		int type;
		int price;
		
		int getPrice() {
			return price;
		}

		@Override
		public String toString() {
			return "GameItem [name=" + name + ", type=" + type + ", price=" + price + "]";
		}
	}
	
	public void add(String name, int type, int price) {
		GameItem item = new GameItem();		
		item.name = name;
		item.type = type;
		item.price = price;
		
		list.add(item);
	}
	
	public void print() {
		
		int total = 0;
		
		for(GameItem item : list) {
			System.out.println(item);			
			total += item.price;
		}
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		 GameCharacter character = new GameCharacter();
		 character.add("sword", 1, 100);
		 character.add("gun", 2, 300);
		 character.add("nife", 3, 400);
		 character.add("bomb", 4, 500);		
		 character.print();
	}

}
