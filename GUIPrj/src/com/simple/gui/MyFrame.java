package com.simple.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame  extends JFrame {
	
	JLabel lblName;
	JLabel lblAddress;
	JLabel lblAge;
	
	JTextField  tfName;
	JTextField  tfAddress;
	JTextField  tfAge;
	
	JTextArea   taResult;	
	JButton btnReg;	
	
	public MyFrame() {
		setSize(185, 300);
		setTitle("마이 윈도우 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout f = new FlowLayout();
		setLayout(f);
		
		// 컴포넌트 생성
		lblName = new JLabel("이름 :");
		lblAge = new JLabel("나이 :");
		lblAddress = new JLabel("주소 :");
		
		tfName = new JTextField(10);
		tfAge = new JTextField(10);
		tfAddress = new JTextField(10);
		
		taResult = new JTextArea("", 5, 15);
		
		btnReg = new JButton("등록");
		
		// 이벤트 등록
		btnReg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 이벤트 처리
				// 회원정보를 등록한다.
				String name = tfName.getText();
				String age = tfAge.getText();
				String addr = tfAddress.getText();
				
//				String result = "이름 : ";
//				result += name;
//				result += "나이 :";
//				result += age;
//				result += "주소 :";
//				result += addr;
				
				//taResult.setText(result);
				taResult.append("이름 :"+name+"\n");
				taResult.append("나이 :"+age+"\n");
				taResult.append("주소 :"+addr+"\n");
			}
		});
		
		// 컨테이너에 컴포넌트 등록(추가)
		add(lblName);	add(tfName);
		add(lblAge);	add(tfAge);
		add(lblAddress);	add(tfAddress);
		add(btnReg);
		add(taResult);
		
		setResizable(false);
		setVisible(true);
	}

}
