import java.util.Scanner;


import package2.Grade;

public class Java21 {

	public static void main(String[] args) {
		int kor, eng, math;
		double avg;
		char gra;
		String name;
		Grade grade = new Grade();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 1;) {
			System.out.print("이름 : ");
			name = sc.next();

			System.out.print("국어 : ");
			kor = sc.nextInt();

			System.out.print("영어 : ");
			eng = sc.nextInt();

			System.out.print("수학 : ");
			math = sc.nextInt();

			avg = grade.getAvg(kor, eng, math);
			gra = grade.getGrade();

			System.out.println(name + "님의 평균은" + avg + "이고 성적은 " + gra + "입니다.");
			
			System.out.println("계속Y");
			String choice = sc.next();

			if (choice.compareToIgnoreCase("y") == 0) {
				continue;
			} else {
				System.out.println("종료되었습니다.");
				break;
			}
		}

	}

}
