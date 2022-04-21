package com.simple.ex;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		String gugudan="";
		char input=' ';
	
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("���ϴ� ������ :");		
		gugudan = kbd.next();
		
		if(gugudan.length() == 1) {
			input = gugudan.charAt(0);
			
			if(input < '1' || input > '9') {
				System.out.println("�Է� ����");
			}else {				
				int dan = Integer.parseInt(Character.toString(input));
				gugudanDisplay(dan,'v');
			}
		}else {
			System.out.println("�Է� ���� �ٽ��Է�!!");
		}
		
	}

	private static void gugudanDisplay(int dan, char style ) {
		
		if(style == 'v') {		
			for (int i = 1; i <= 9; i++) {	
				System.out.println(dan+" x "+i+" = "+(dan*i));			
			}
		}else {		
			for (int i = 1; i <= 9; i++) {	
				System.out.print(dan+"x"+i+"="+(dan*i)+"  ");			
			}
		}
		
	}

}
