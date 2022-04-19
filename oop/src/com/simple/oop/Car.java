package com.simple.oop;

public class Car {
	private String model;
    private String color;
    private int speed;

     // �ڵ����� �ø��� ��ȣ
    private String serialNumber;
    private static int numbers = 0;
    private static final String MODEL = "KIA5";

    public Car(String m, String c, int s) {
          model = m;
          color = c;
          speed = s;
           // �ڵ����� ������ �����ϰ� id�� �����Ѵ�. 
          serialNumber =  MODEL +"-" + (++numbers) ;          
    }
    
    @Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", speed=" + speed + ", serialNumber=" + serialNumber + "]";
	}



	public static void main(String[] args) {
    	Car c1 = new Car("S600", "white", 80); 	// ù ��° ������ ȣ��
        Car c2 = new Car("E500", "blue", 20); 	// ù ��° ������ ȣ��
        
        System.out.println("������ �ڵ��� : " + c1);
        System.out.println("������ �ڵ��� : " + c2);
        
        int n = Car.numbers;	// ���� ���� 
        System.out.println("���ݱ��� ������ �ڵ��� �� = " + n);

	}


}
