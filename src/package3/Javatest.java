package package3;

import java.util.InputMismatchException;

class Member {
	private String str;

	Member() {
	}

	Member(String str) {
		this.str = str;
	}

	@Override
	public boolean equals(Object obj) {
		Member mem = (Member) obj;
		return this.str.equals(mem.str) ? true : false;

	}
}

public class Javatest {
	public static void main(String[] args) {
		Member obj1 = new Member("Black");
		Member obj2 = new Member("Black");
		Member obj3 = new Member("White");

		System.out.println(obj1.equals(obj2)); // true가 출력
		System.out.println(obj1.equals(obj3)); // false가 출력
		try {
			int num = 6 / 0;
		}  catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
