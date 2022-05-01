package com.simple.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutEx extends JFrame {
	
	public FlowLayoutEx() {
		// 
		setTitle("���̾ƿ� ����");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLayout(new FlowLayout(FlowLayout.RIGHT, 50, 50));
		
		JPanel panel = new JPanel(); 
		
		JButton btn1 = new JButton("���� ��ư1");
		JButton btn2 = new JButton("���� ��ư2");
		JButton btn3 = new JButton("���� ��ư3");
		JButton btn4 = new JButton("���� ��ư4");
		JButton btn5 = new JButton("���� ��ư5");
		JButton btn6 = new JButton("���� ��ư6");
		JButton btn7 = new JButton("���� ��ư7");
		
		// ��ư ���
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
