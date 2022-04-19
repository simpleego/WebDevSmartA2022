package com.simple.oop;

public class Box {	
	int width, height, lenght;
	int volume;
	String name;
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getLenght() {
		return lenght;
	}

	public int getVolume() {
		return volume;
	}

	public String getName() {
		return name;
	}

	public Box(int width, int height, int lenght, String name) {
		this.width = width;
		this.height = height;
		this.lenght = lenght;
		this.volume = width*height*lenght;
		this.name = name;
	}
	
	public Box whosLargest(Box box1, Box box2) {
		if(box1.volume > box2.volume) {
			return box1;
		}else {
			return box2;
		}
	}
	
	public boolean isSameBox(Box obj) {
		if ( (obj.width == this.width) && (obj.height == this.height)
		  && (obj.lenght == this.lenght) ) {
			return true;
		}else {
			return false;
		}		
	}
	
	public boolean isSameBox(Box obj, char x) {
		if(x == 'V') {			
		
			if ( obj.getVolume() == this.getVolume() ) {
						return true;
					}else {
						return false;
					}
		}else if(x == 'w') {
			
		}else if(x == 'h') {
			
		}else {
			
		}
		return true;
	}

	@Override
	public String toString() {
		return "Box [width=" + width + ", height=" + height + ", lenght=" + lenght + ", volume=" + volume + ", name="
				+ name + "]";
	}
}
