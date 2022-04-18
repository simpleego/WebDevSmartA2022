package com.simple.array;

import javax.swing.JOptionPane;

public class MinWindow {

	public static void main(String[] args) {
		
		// 사용자로 부터 이름을 입력 받는다
		String age_="";
		int age;
		String result="성년";
		
		// 나이를 입력 받아서 성년/미성년 여부를 출력
		// 성년은 20세 이상으로 한다.		
		
		age_ = JOptionPane.showInputDialog("당신의 나이는? :");
		age = Integer.parseInt(age_);
		
		if(age < 20) {
			result = "미성년";
		}
		
		JOptionPane.showMessageDialog(null,result);

	}

}
