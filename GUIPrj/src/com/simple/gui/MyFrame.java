package com.simple.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
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
	
	Font font;
	
	public MyFrame() {
		setSize(250, 350);
		setTitle("회원정보 등록");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 윈도우 프레임 배경색(RGB) 넣기	
		Color color = new Color(255, 235, 204);
		getContentPane().setBackground(color);
		setBackground(Color.red);
		
		// 레이아웃 설정시 정렬방식, 마진, 패딩을 설정하기
		FlowLayout f = new FlowLayout(FlowLayout.CENTER,10,10);
		setLayout(f);
		
		// 컴포넌트 생성
		lblName = new JLabel("이름 :");
		lblAge = new JLabel("나이 :");
		lblAddress = new JLabel("주소 :");
		
		// 컴포넌트에 글꼴, 크기, 효과 설정하기
		font = new Font("굴림", Font.BOLD, 15);
		
		lblName.setFont(font);
		lblAge.setFont(font);
		lblAddress.setFont(font);
		
		tfName = new JTextField(10);
		tfAge = new JTextField(10);
		tfAddress = new JTextField(10);
		
		// 텍스트 필드에 패딩추가하기(패딩 위치 : top,left,bottom,right)
		tfName.setMargin(new Insets(10, 5, 5, 10));
		tfAge.setMargin(new Insets(10, 5, 5, 10));
		tfAddress.setMargin(new Insets(10, 5, 5, 10));
		
		// 텍스트 필드에 배경색 넣기
		tfName.setBackground(Color.ORANGE);
		
		taResult = new JTextArea("", 5, 17);
		
		btnReg = new JButton("등록");
		btnReg.setFont(font);
		btnReg.setMargin(new Insets(10, 80, 10, 80));
		
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
