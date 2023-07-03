package edu.global.prj;

import edu.global.prj.shape.Circle;
import edu.global.prj.shape.Shape;
import edu.global.prj.shape.Recatangle;

class Price {
	private double price = 0;

	Price(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}

class Computer extends Price {

	Computer(double price) {
		super(price);
	}

}

class Speaker extends Price {

	Speaker(double price) {
		super(price);
	}

}


public class ShapMain {
	
	public static void checkPrice(Price price) {
		System.out.println(price.getPrice());
	}
	public static void main(String[] args) {
		Shape[] shape = { new Circle(10), new Recatangle(10, 20) };

		double area = 0;

		for (Shape s : shape) {
			area += s.getArea();
		}

		System.out.println(area);
		
		Computer computer = new Computer(100);
		Speaker speaker = new Speaker(50);
		
		checkPrice(computer);
		checkPrice(speaker);
	}
}
