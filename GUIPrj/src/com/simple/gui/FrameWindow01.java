package com.simple.gui;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameWindow01 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("Login");
		f.setSize(600, 600);
		f.setLayout(null);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		f.setLocation(screenSize.width/2-150, screenSize.height/2-150);
		
		// 원하는 컴포넌트 추가
		Button b = new Button("확인");
		b.setSize(100, 50);
		b.setLocation(100, 50);
		
		Button b1 = new Button("취소");
		b1.setSize(100, 50);
		b1.setLocation(210, 50);
		
		Button b2 = new Button("가입");
		b2.setSize(100, 50);
		b2.setLocation(310, 50);
		
		Button b3 = new Button("저장");
		b3.setSize(100, 50);
		b3.setLocation(100, 100);
		
		Button b4 = new Button("인쇄");
		b4.setSize(100, 50);
		b4.setLocation(100, 150);
		
		Choice day = new Choice();
		
		day.add("SUN"); // Choice의 목록에 나타날 값들을 추가한다.
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");
		day.setSize(100, 50);
		day.setLocation(100, 200);
		
		
		// 컨테이너에 컴포넌트 추가
		f.add(b);
		f.add(b1);
		f.add(b2);
		f.add(b3);		
		f.add(b4);		
		f.add(day);		
		
		f.setVisible(true);		

	}

}
