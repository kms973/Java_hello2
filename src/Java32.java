//polymorphysm 다형성

class AA {

	public void aa() {
		System.out.println("aa 함수 입니다.");
	}

	public void cc() {
		System.out.println("cc 함수 입니다.");
	}
}

class BB extends AA {
	public void bb() {
		System.out.println("bb 함수 입니다.");

	}
	public void aa() {
		System.out.println("aaa 함수 입니다.");
	}
}

public class Java32 {

	public static void main(String[] args) {
		AA aa = new AA();
		System.out.println(aa);

		BB bb = new BB();
		System.out.println(bb);
		bb.aa();
		aa.aa();

		// 클래스명과 생성자명이 다른경우
		AA aaa = new BB(); // 에러없음
		aaa.aa();
		// aaa.bb(); //에러발생
		// BB bbb = new AA(); //에러발생

	}

}