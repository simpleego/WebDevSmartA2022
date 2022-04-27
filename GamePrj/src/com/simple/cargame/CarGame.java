package com.simple.cargame;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class CarGame  extends JFrame {
	
	public CarGame() {
		// 
		this.setTitle("자동차 운전게임");
		this.setSize(1024, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 생성된 컴포넌트 등록
		add(new MyGamePanel2());
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CarGame();		
	}

}
