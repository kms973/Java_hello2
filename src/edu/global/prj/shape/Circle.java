package edu.global.prj.shape;

public class Circle extends Shape {

	private double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return r * r * Math.PI;
	}
}
