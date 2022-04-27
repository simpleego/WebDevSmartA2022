package com.simple.gui;

import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Calculator extends JFrame implements ActionListener {
	
	JLabel lbl1;
	JLabel lbl2;
	JLabel lbl3;

	TextField tfNum1;
	TextField tfNum2;
	TextField tfResult;

	JButton btnAdd;
	JButton btnSub;
	JButton btnMul;
	JButton btnDiv;

	public Calculator() {
		setSize(230, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("간단한 계산기");
		setLayout(new FlowLayout());

		lbl1 = new JLabel("숫자1 :");
		tfNum1 = new TextField(15);

		lbl2 = new JLabel("숫자2 :");
		tfNum2 = new TextField(15);

		lbl3 = new JLabel("결과값 :");
		tfResult = new TextField(15);
		tfResult.setEditable(false);

		btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(tfNum1.getText());
				int num2 = Integer.parseInt(tfNum2.getText());
				int sum = num1 + num2;
				// tfResult.setText(sum+"");
				tfResult.setText(String.valueOf(sum));
			}
		});

		btnSub = new JButton("-");
		btnSub.addActionListener(this);
		btnMul = new JButton("x");
		btnMul.addActionListener(new MyMultiple(this));
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new MyDiv());

		// 컴포넌트 등록
		this.add(lbl1);
		this.add(tfNum1);

		this.add(lbl2);
		this.add(tfNum2);

		this.add(lbl3);
		this.add(tfResult);

		this.add(btnAdd);
		this.add(btnSub);
		this.add(btnMul);
		this.add(btnDiv);

		setResizable(false);
		setVisible(true);
	}

	private class MyDiv implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int num1 = Integer.parseInt(tfNum1.getText());
			int num2 = Integer.parseInt(tfNum2.getText());
			double result=0;
			
			if(num2 != 0 ) {
				result = (double)num1 / num2;				
			}else {
				tfResult.setText("0으로 나눌 수 없습니다.");
			}
			
			tfResult.setText(String.format("%.2f", result));
			//tfResult.setText(String.valueOf(result));
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//
		int num1;
		int num2;
		int result = 0;
		num1 = Integer.parseInt(tfNum1.getText());
		num2 = Integer.parseInt(tfNum2.getText());

		if (e.getSource() == btnSub) {
			result = num1 - num2;
		} else if (e.getSource() == btnMul) {
			result = num1 * num2;
		}

		tfResult.setText(result + "");
	}

}
