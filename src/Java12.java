
public class Java12 {
//함수 밖에 있는 변수는 인스턴스 변수이고, 함수 안에 있는 변수는 지역 변수이다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divide(4, 2);
		divide(6, 2);
		divide(9, 0);
	}

	public static void divide(int num1, int num2) {
		if ((num2 == 0) || (num1 == 0)) {
			System.out.println("0으로 나눌 수 없습니다.");
			return; // 값의 반환 없이 메소드만 종료.
		}
		System.out.println("나눗셈 결과 : " + (num1 / num2));
	}

}
