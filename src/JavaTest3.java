import java.util.Scanner;

class input {
	Scanner sc = new Scanner(System.in);
	double kor, eng, math;
	double avg;
	char grade;
	String name, ok, ok2;
	public input() {}
	
	public void put() {
		System.out.print("이름 : ");
		this.name = sc.next();
		System.out.print("국어 : ");
		this.kor = sc.nextInt();
		System.out.print("영어 : ");
		this.eng = sc.nextInt();
		System.out.print("수학 : ");
		this.math = sc.nextInt();
		avg = (double) ((eng + math + kor) / 3);
	}
	public void grade() {
		if (avg >= 90) {
			grade = '수';
		} else if (avg >= 80) {
			grade = '우';
		} else if (avg >= 70) {
			grade = '미';
		} else if (avg >= 60) {
			grade = '양';
		} else if (avg >= 50) {
			grade = '가';
		}
	}
	
	public void show() {
		System.out.println(name + "님의 평균은" + avg + "이고 성적은" + grade + "입니다.");
	}
}

public class JavaTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		input input = new input();

		
		String ok, ok2;
		ok2 = "o";

		while (true) {
			input.put();
			input.grade();
			input.show();

			System.out.println("계속하시겠습니까?");
			ok = sc.next();
			if (ok.equals(ok2)) {
				continue;
			} else {
				System.out.println("종료됨");
				break;
			}
		}
	}

}
