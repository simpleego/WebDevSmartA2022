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
		setTitle("ȸ������ ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ������ ������ ����(RGB) �ֱ�	
		Color color = new Color(255, 235, 204);
		getContentPane().setBackground(color);
		setBackground(Color.red);
		
		// ���̾ƿ� ������ ���Ĺ��, ����, �е��� �����ϱ�
		FlowLayout f = new FlowLayout(FlowLayout.CENTER,10,10);
		setLayout(f);
		
		// ������Ʈ ����
		lblName = new JLabel("�̸� :");
		lblAge = new JLabel("���� :");
		lblAddress = new JLabel("�ּ� :");
		
		// ������Ʈ�� �۲�, ũ��, ȿ�� �����ϱ�
		font = new Font("����", Font.BOLD, 15);
		
		lblName.setFont(font);
		lblAge.setFont(font);
		lblAddress.setFont(font);
		
		tfName = new JTextField(10);
		tfAge = new JTextField(10);
		tfAddress = new JTextField(10);
		
		// �ؽ�Ʈ �ʵ忡 �е��߰��ϱ�(�е� ��ġ : top,left,bottom,right)
		tfName.setMargin(new Insets(10, 5, 5, 10));
		tfAge.setMargin(new Insets(10, 5, 5, 10));
		tfAddress.setMargin(new Insets(10, 5, 5, 10));
		
		// �ؽ�Ʈ �ʵ忡 ���� �ֱ�
		tfName.setBackground(Color.ORANGE);
		
		taResult = new JTextArea("", 5, 17);
		
		btnReg = new JButton("���");
		btnReg.setFont(font);
		btnReg.setMargin(new Insets(10, 80, 10, 80));
		
		// �̺�Ʈ ���
		btnReg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// �̺�Ʈ ó��
				// ȸ�������� ����Ѵ�.
				String name = tfName.getText();
				String age = tfAge.getText();
				String addr = tfAddress.getText();
				
//				String result = "�̸� : ";
//				result += name;
//				result += "���� :";
//				result += age;
//				result += "�ּ� :";
//				result += addr;
				
				//taResult.setText(result);
				taResult.append("�̸� :"+name+"\n");
				taResult.append("���� :"+age+"\n");
				taResult.append("�ּ� :"+addr+"\n");
			}
		});
		
		// �����̳ʿ� ������Ʈ ���(�߰�)
		add(lblName);	add(tfName);
		add(lblAge);	add(tfAge);
		add(lblAddress);	add(tfAddress);
		add(btnReg);
		add(taResult);
		
		setResizable(false);
		setVisible(true);
	}

}
