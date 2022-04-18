package com.simple.array;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		int num =0;
		
		if(args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(" "+args[i]);
				num = Integer.parseInt(args[i]);
			}
		}
		
		for (int i = 0; i < num; i++) {
			System.out.print(" ¡Ú");
		}
		

	}

}
