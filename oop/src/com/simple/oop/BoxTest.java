package com.simple.oop;

public class BoxTest {

	public static void main(String[] args) {
		
		Box box1 = new Box(5, 10, 10,"boxA");
		Box box2 = new Box(10, 10, 5,"boxB");
		Box largest;
		
		//boolean same = box1.isSameBox(box2, 'V');		
		boolean same = box1.isSameBox(box2);		
		String same_ = same ? "����" : "�����ʴ�";
		System.out.println("box1�� box2�� " + same_);
		
		largest = box1.whosLargest(box1, box2);	
		System.out.println("ū �ڽ� :"+largest);		
		
	}

}
