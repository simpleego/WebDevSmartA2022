package com.simple.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutEx extends JFrame {
	
	public FlowLayoutEx() {
		// 
		setTitle("레이아웃 연습");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLayout(new FlowLayout(FlowLayout.RIGHT, 50, 50));
		
		JPanel panel = new JPanel(); 
		
		JButton btn1 = new JButton("나는 버튼1");
		JButton btn2 = new JButton("나는 버튼2");
		JButton btn3 = new JButton("나는 버튼3");
		JButton btn4 = new JButton("나는 버튼4");
		JButton btn5 = new JButton("나는 버튼5");
		JButton btn6 = new JButton("나는 버튼6");
		JButton btn7 = new JButton("나는 버튼7");
		
		// 버튼 등록
		panel.add(btn1);			
		panel.add(btn2);			
		panel.add(btn6);	
		
		add(btn7, BorderLayout.NORTH);			
		add(btn3, BorderLayout.LINE_START);			
		add(btn4, BorderLayout.SOUTH);			
		add(btn5, BorderLayout.LINE_END);
		
		add(panel, BorderLayout.CENTER);
		
		pack();
		setVisible(true);
	}

}
