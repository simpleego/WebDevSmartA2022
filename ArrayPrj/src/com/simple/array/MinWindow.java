package com.simple.array;

import javax.swing.JOptionPane;

public class MinWindow {

	public static void main(String[] args) {
		
		// ����ڷ� ���� �̸��� �Է� �޴´�
		String age_="";
		int age;
		String result="����";
		
		// ���̸� �Է� �޾Ƽ� ����/�̼��� ���θ� ���
		// ������ 20�� �̻����� �Ѵ�.		
		
		age_ = JOptionPane.showInputDialog("����� ���̴�? :");
		age = Integer.parseInt(age_);
		
		if(age < 20) {
			result = "�̼���";
		}
		
		JOptionPane.showMessageDialog(null,result);

	}

}
