class Sample {

	int A; // non-static 변수

	void g() // non-static 함수
	{
		A = 10;
	}

	static int B; // static 변수

	static void h() // static 함수
	{
		B = 50;
	}

}

public class Example {
	public static void main(String[] args) {

		Sample Asample = new Sample();
		Sample Bsample = new Sample();
//		Bsample.h();
		Asample.B = 100;
//		Bsample.h();
		System.out.println(Bsample.B);
		
		Sample.B=100;
		System.out.println(Sample.B);
	}
}