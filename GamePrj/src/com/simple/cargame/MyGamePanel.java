package com.simple.cargame;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyGamePanel extends JPanel {
	BufferedImage img = null;	// 자동차 이미지
	int img_x = 100;			// 자동차 위치 x
	int img_y = 100;			// 자동차 위치 y
	
	public MyGamePanel() {
		try {
			img = ImageIO.read(new File("car.jpg"));
		} catch (IOException e) {
			System.out.println("no Image");
			System.exit(1);
		}
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {}			
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch(keycode) {
				case KeyEvent.VK_UP:
					img_y -= 10;break;
				case KeyEvent.VK_DOWN:
					img_y += 10;break;
				case KeyEvent.VK_LEFT:
					img_x -= 10;break;
				case KeyEvent.VK_RIGHT:
					img_x += 10;break;
				}
				repaint();
			}
		});
		this.requestFocus();
		setFocusable(true);		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
	

}
