// java언어의 특징 . . . OOP(OBJECT ORIENTED PROGRAM) 즉, 객체지향언어
class Circle {
	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}
}

class Rectangle2 {
	double width, height;

	void setWidthHeight(double width, double height) {
		this.width = width;
		this.height = height;
	}

	double getArea() {
		return width * height;
	}
}

public class Mainclass {

	public static void main(String[] args) {
		Rectangle2 rec = new Rectangle2();
		rec.setWidthHeight(10, 5);

		System.out.println(rec.getArea());
		System.out.println(rec);
		Circle circle = new Circle(); // 객채(인스턴스)
		circle.setRadius(10);

//		double area = circle.getArea();

//		System.out.println(circle.getArea());
	}

}
