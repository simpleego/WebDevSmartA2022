package com.simple.override;

public class MethodOverrideEx {
	
	static void paint(Shape p) {
		p.draw();
	}

	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Rect());
		paint(new Circle());

	}	
}
