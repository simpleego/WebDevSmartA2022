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
		setTitle("라디오 버튼 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 150);
		
		// 컴포넌트 생성
		topPanel = new JPanel();
		JLabel  label = new JLabel("어떤 크기의 커피를 주문하시겠습니까?");
		label.setForeground(Color.WHITE);
		topPanel.setBackground(Color.BLUE);
		topPanel.add(label);
		this.add(topPanel,BorderLayout.NORTH);
		
		sizePanel = new JPanel();
		sizePanel.setBackground(Color.green);
		small = new JRadioButton("small Size");
		medium = new JRadioButton("medium Size");
		large = new JRadioButton("large Size");
		
		// 라디오 버튼 그룹을 생성하고 라디오버튼을 등록(그룹핑)한다.
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		// 라디오 버튼 이벤트 리스너 등록
        small.addActionListener(this);
        medium.addActionListener(this);
        large.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
					text.setText("large 크기가 선택되었습니다.");				
			}
		});
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		this.add(sizePanel,BorderLayout.CENTER);		
		
		resultPanel = new JPanel();
		text = new JLabel("크기가 선택되지 않았습니다.");
		text.setForeground(Color.red);
		resultPanel.add(text);
		this.add(resultPanel,BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("*******");
		
		if(e.getSource() == small) {
			text.setText("small 크기가 선택되었습니다.");
		}
		if(e.getSource() == medium) {
			text.setText("medium 크기가 선택되었습니다.");
		}
				
	}	
	
	public static void main(String[] args) {
		new RadioButtonFrame();
	}
	
}


