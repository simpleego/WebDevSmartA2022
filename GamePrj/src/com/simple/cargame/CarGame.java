package com.simple.cargame;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class CarGame  extends JFrame {
	
	public CarGame() {
		// 
		this.setTitle("�ڵ��� ��������");
		this.setSize(1024, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ������ ������Ʈ ���
		add(new MyGamePanel2());
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CarGame();		
	}

}
