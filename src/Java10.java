
public class Java10 {

	public static void showAge(int age, int height) {
		System.out.println("제나이는" + age + ", 키는" + height + "입니다.");
	}

	// 리턴타입 함수명(파라미터-10가지){}
	// void = 리턴없음
	// 리턴타입 = return 리턴값 입력
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int sub(int num1, int num2) {
		return num1 + (-1 * num2);
	}

	public static int mul(int num1, int num2) {

		return num1 * num2;
	}

	public static double gradChar(double num1) {
		if (num1 >= 90) {
			System.out.println("수");
		} else if (num1 >= 80) {
			System.out.println("우");
		} else if (num1 >= 50) {
			System.out.println("가");
		}
		return num1;
	}

//	public static char gradChar(double avg) {
//		char ch = '가';
//
//		if (avg >= 90) {
//			ch = '수';
//		} else if (avg >= 80) {
//			ch = '우';
//		} else if (avg >= 70) {
//			ch = '미';
//		} else if (avg >= 60) {
//			ch = '양';
//		} else {
//			ch = '가';
//		}
//
//		return ch;
//	}
	public static void showStar(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
//		showAge(19, 175);
//		showAge(11, 150);
//
//		int height = 190;
//
//		showAge(26, height);
//		System.out.println(add(3, 5));
//		System.out.println(sub(3, 5));
//		System.out.println(mul(3, 5));
//		System.out.println(gradChar(90.8));
//		System.out.println(gradChar(80.0));
//		System.out.println(gradChar(50.0));
//		gradChar(90.8);
//		gradChar(80.0);
//		gradChar(50.0);
		showStar(1);
		showStar(2);
		showStar(3);
		showStar(4);
		showStar(5);
//		for(int i = 0; i <= 6; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}
