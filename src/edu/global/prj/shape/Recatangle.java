package edu.global.prj.shape;

public class Recatangle extends Shape {

	private double width, height;

	public Recatangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {

		return width * height;
	}
}
