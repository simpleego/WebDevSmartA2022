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

public class MyGamePanel2 extends JPanel {
	BufferedImage img1 = null;	// 자동차 이미지
	BufferedImage img2 = null;	// 자동차 이미지
	int img_x1 = 100;			// 자동차 위치 x
	int img_y1 = 100;			// 자동차 위치 y
	int img_x2 = 300;			// 자동차 위치 x
	int img_y2 = 300;			// 자동차 위치 y
	
	public MyGamePanel2() {
		try {
			img1 = ImageIO.read(new File("car.png"));
			img2 = ImageIO.read(new File("car2.png"));
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
					img_y1 -= 10;break;
				case KeyEvent.VK_DOWN:
					img_y1 += 10;break;
				case KeyEvent.VK_LEFT:
					img_x1 -= 10;break;
				case KeyEvent.VK_RIGHT:
					img_x1 += 10;break;
				case KeyEvent.VK_W:	// 위로
					img_y2 -= 10;break;
				case KeyEvent.VK_S:	// 아래로
					img_y2 += 10;break;
				case KeyEvent.VK_A:	// 왼쪽으로
					img_x2 -= 10;break;
				case KeyEvent.VK_D:	// 오른쪽으로
					img_x2 += 10;break;
				}
				repaint();
			}
		});
		this.requestFocus();
		setFocusable(true);		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img1, img_x1, img_y1, null);
		g.drawImage(img2, img_x2, img_y2, null);
	}
	

}
