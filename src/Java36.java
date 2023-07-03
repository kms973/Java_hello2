import package2.Person;

class AAA extends Object {
	@Override
	public String toString() {
		return "메렁~~~~~~~~~~~~~~~~~~~";
	}
}

class Circle {
	double r;

	Circle() {
	}

	public String toString() {
		return "원의 넓이는" + r * r * Math.PI + "이고 반지름은 " + r + "인 원";
	}

}

class Rectangle {
	private int width;
	private int height;

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

	@Override
	public String toString() {
		return "가로:" + width + "세로:" + height;
	}

	// int num = (int) 3.14
	@Override
	public boolean equals(Object obj) {

		Rectangle rec = (Rectangle) obj; // 자식 = 부모 되는 케이스트 자식 = (자식)부모 시켜서 부모에 있는 주소에 자식이 미리 메모리에 올라가 있어야함

		if ((this.width == rec.width) && (this.height == rec.height))
			return true;

		return false;
	}

}

class Member {
	private String Color;

	Member() {
	}

	Member(String color) {
		this.Color = color;
	}

	@Override
	public boolean equals(Object obj) {
		Member mem = (Member) obj;
		if (this.Color.equals(mem.Color)) {
			return true;
		}
		return false;
	}

}

class Person {
	private String name;
	private int age;

	Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		Person per = (Person) obj;
		return this.name.equals(per.name) && this.age == per.age ? true : false;
	}
}

public class Java36 {

	public static void main(String[] args) {

		Person kim = new Person("홍길동", 35);
		Person park = new Person("홍길동", 35);
		Person heo = new Person("홍길동", 34);

		if (kim.equals(park))
			System.out.println("같은 사람입니다.");
		else
			System.out.println("다른 사람입니다.");

		if (kim.equals(heo))
			System.out.println("같은 사람입니다.");
		else
			System.out.println("다른 사람입니다.");

		Member obj1 = new Member("Black");
		Member obj2 = new Member("Black");
		Member obj3 = new Member("White");

		System.out.println(obj1.equals(obj2)); // true가 출력
		System.out.println(obj1.equals(obj3)); // false가 출력
//		Circle circle = new Circle(10);
//
//		System.out.println(circle); // 원의 넓이는 314.1592 이고 반지름은 10 인원

	}

}
