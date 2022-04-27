package com.simple.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMultiple implements ActionListener {
	Calculator cal;
	
	public MyMultiple(Calculator cal) {
		this.cal = cal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 
		int num1 = Integer.parseInt(cal.tfNum1.getText());
		int num2 = Integer.parseInt(cal.tfNum2.getText());
		int sum = num1 * num2;
		cal.tfResult.setText(String.valueOf(sum));
	}
}
