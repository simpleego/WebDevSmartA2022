package com.simple.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonFrame extends JFrame implements ActionListener {

	JRadioButton small, medium, large;
	JLabel text;
	JPanel topPanel, sizePanel, resultPanel;	
	
	public RadioButtonFrame() {
		setTitle("���� ��ư �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 150);
		
		// ������Ʈ ����
		topPanel = new JPanel();
		JLabel  label = new JLabel("� ũ���� Ŀ�Ǹ� �ֹ��Ͻðڽ��ϱ�?");
		label.setForeground(Color.WHITE);
		topPanel.setBackground(Color.BLUE);
		topPanel.add(label);
		this.add(topPanel,BorderLayout.NORTH);
		
		sizePanel = new JPanel();
		sizePanel.setBackground(Color.green);
		small = new JRadioButton("small Size");
		medium = new JRadioButton("medium Size");
		large = new JRadioButton("large Size");
		
		// ���� ��ư �׷��� �����ϰ� ������ư�� ���(�׷���)�Ѵ�.
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		// ���� ��ư �̺�Ʈ ������ ���
        small.addActionListener(this);
        medium.addActionListener(this);
        large.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
					text.setText("large ũ�Ⱑ ���õǾ����ϴ�.");				
			}
		});
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		this.add(sizePanel,BorderLayout.CENTER);		
		
		resultPanel = new JPanel();
		text = new JLabel("ũ�Ⱑ ���õ��� �ʾҽ��ϴ�.");
		text.setForeground(Color.red);
		resultPanel.add(text);
		this.add(resultPanel,BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("*******");
		
		if(e.getSource() == small) {
			text.setText("small ũ�Ⱑ ���õǾ����ϴ�.");
		}
		if(e.getSource() == medium) {
			text.setText("medium ũ�Ⱑ ���õǾ����ϴ�.");
		}
				
	}	
	
	public static void main(String[] args) {
		new RadioButtonFrame();
	}
	
}


