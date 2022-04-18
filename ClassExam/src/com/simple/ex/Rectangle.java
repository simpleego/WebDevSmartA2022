package com.simple.ex;

public class Rectangle {
	int width;
	int height;
	int x, y; // 사각형의 위치좌표
	int fillColor;
	int borderColor;	

	public int getWidth(int a) {
		return width;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}	

	public int getFillColor() {
		return fillColor;
	}

	public void setFillColor(int fillColor) {
		this.fillColor = fillColor;
	}

	public int getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(int borderColor) {
		this.borderColor = borderColor;
	}

	public int getArea() {

		return width * height;
	}
	
	public int getPerimeter() {
		return (width + height) * 2;
	}
	
	public void fillRect(int color) {
		this.fillColor = color;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", x=" + x + ", y=" + y + ", fillColor=" + fillColor
				+ ", borderColor=" + borderColor + "]";
	}

}
