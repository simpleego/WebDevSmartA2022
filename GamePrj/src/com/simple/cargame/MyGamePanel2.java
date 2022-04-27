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
	BufferedImage img1 = null;	// �ڵ��� �̹���
	BufferedImage img2 = null;	// �ڵ��� �̹���
	int img_x1 = 100;			// �ڵ��� ��ġ x
	int img_y1 = 100;			// �ڵ��� ��ġ y
	int img_x2 = 300;			// �ڵ��� ��ġ x
	int img_y2 = 300;			// �ڵ��� ��ġ y
	
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
				case KeyEvent.VK_W:	// ����
					img_y2 -= 10;break;
				case KeyEvent.VK_S:	// �Ʒ���
					img_y2 += 10;break;
				case KeyEvent.VK_A:	// ��������
					img_x2 -= 10;break;
				case KeyEvent.VK_D:	// ����������
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
