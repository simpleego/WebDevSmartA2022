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
		setTitle("���� ������ ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout f = new FlowLayout();
		setLayout(f);
		
		// ������Ʈ ����
		lblName = new JLabel("�̸� :");
		lblAge = new JLabel("���� :");
		lblAddress = new JLabel("�ּ� :");
		
		tfName = new JTextField(10);
		tfAge = new JTextField(10);
		tfAddress = new JTextField(10);
		
		taResult = new JTextArea("", 5, 15);
		
		btnReg = new JButton("���");
		
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
