package com.simple.gui;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageLabelTest extends JFrame implements ActionListener {
	
	JPanel panel;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JButton button1;
	JButton button2;
	JButton button3;
	
	public ImageLabelTest() {
		setTitle("이미지 레이블");
		setSize(300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 컴포넌트 생성
		panel = new JPanel();
		label1 = new JLabel("강아지를 보여줘.");
		label2 = new JLabel("고양이를 보여줘.");
		label3 = new JLabel("병아리를 보여줘.");
		button1 = new JButton("강아지");
		button2 = new JButton("고양이");
		button3 = new JButton("병아리");
		
		ImageIcon icon1 = new ImageIcon("icon1.gif");
		ImageIcon icon2 = new ImageIcon("icon2.gif");
		ImageIcon icon3 = new ImageIcon("icon3.gif");
		button1.setIcon(icon1);
		button2.setIcon(icon1);
		button3.setIcon(icon1);
		
		// 이벤트 등록
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
//		new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				ImageIcon dog = new ImageIcon("dog.gif");
//				label.setIcon(dog);	
//				label.setText(null);
//				button.setText(null);
//			}
//		});
		
		
		// 컴포넌트 등록
		panel.add(label1);
		panel.add(button1);
		panel.add(label2);
		panel.add(button2);
		panel.add(label3);
		panel.add(button3);
		add(panel);	
		
		setVisible(true);		
	}

	public static void main(String[] args) {
		//ImageLabelTest t = new ImageLabelTest();
		new ImageLabelTest();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 
		// 클릭한 버튼 캡션을 얻어오기
		String btn = e.getActionCommand();
		System.out.println("btn :"+btn);
		
		// 클릭한 버튼 객체를 얻어오기
		JButton button = (JButton)e.getSource();
		
		if(button.getText().equals("강아지")) {
			ImageIcon dog_ = new ImageIcon("dog.gif");
			
			// 아이콘 이미지 크기를 변경
			Image img = dog_.getImage();
			Image img_ = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			ImageIcon dog = new ImageIcon(img_);
			
			label1.setIcon(dog);	
			label1.setText(null);
			button.setText(null);		
		}else if (e.getSource() == button2) {
			ImageIcon cat_ = new ImageIcon("cat.jpg");
			
			// 아이콘 이미지 크기를 변경
			Image img = cat_.getImage();
			Image img_ = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			ImageIcon cat = new ImageIcon(img_);
			
			label2.setIcon(cat);	
			label2.setText(null);
			button.setText(null);	
		}else if (btn.equals("병아리")){
			ImageIcon chick_ = new ImageIcon("chick.jpg");
			
			// 아이콘 이미지 크기를 변경
			Image img = chick_.getImage();
			Image img_ = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			ImageIcon chick = new ImageIcon(img_);
			
			label3.setIcon(chick);	
			label3.setText(null);
			button.setText(null);	
		}
		
	}

}
