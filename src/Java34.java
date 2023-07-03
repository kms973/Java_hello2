import java.util.Scanner;

//인터페이스 안에 올수 있는 것은 함수구현(X) -> 추상메서드와 상수만 올 수 있음.
//추상메서드 = abstract 붙은거
//인터페이스는 자손이 구현하라.
interface Printable {// MS가 인터페이스를 만들었다(강제)
	abstract public void print(String doc); // 함수 선언 = 함수 정의 = abstract = 추상 메서드
}

//삼성에서만들어주는클래스
class SamsungPrinter implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("삼성 프린트\t" + doc + "\t프린트됨");
		System.out.println(doc);

	}
}

//lg가만들어주는클래스
class LGPrinter implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("LG 프린트\t" + doc + "\t프린트됨");
		System.out.println(doc);

	}
}

interface ICalculator {
	public int add(int num1, int num2);

	public int sub(int num1, int num2);

	public int mul(int num1, int num2);

	public int div(int num1, int num2);
}

class Calculator implements ICalculator {
	
	@Override
	public int add(int num1, int num2) {
		
		return num1 + num2;
	}

	@Override
	public int sub(int num1, int num2) {
		
		return num1 - num2;
	}

	@Override
	public int mul(int num1, int num2) {
		
		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {
		
		if(num2 == 0) {
			return 0;
		}
		return num1 / num2;
	}

}

public class Java34 {

	public static void main(String[] args) {
//		String myDoc = "This is a report about...";
//
//		Printable print = new SamsungPrinter(); // 인터페이스도 다형성이 적용
//		Printable[] pri = { new SamsungPrinter(), new LGPrinter() };
//
//		for (Printable p : pri) {
//			p.print(myDoc);
//			System.out.println();
//		}
//
//		print.print(myDoc);
//
//		print = new LGPrinter();
//
//		print.print(myDoc);
		Scanner sc = new Scanner(System.in);
		ICalculator cal = new Calculator();
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(cal.add(a, b));
		System.out.println(cal.sub(a, b));
		System.out.println(cal.mul(a, b));
		System.out.println(cal.div(a, b));
		
	}
}
