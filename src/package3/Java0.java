package package3;

import java.util.Scanner;

public class Java0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int com, player, count;
		String text;

		com = (int) (Math.random() * 100) + 1;
		count = 1;

		while (true) {
			System.out.println("1~100사이의 숫자를 입력해주세요.");
			try {
				player = sc.nextInt();
				if (com == player) {
					System.out.println("정답입니다." + count + "회 만에 맞췄어요.");
					break;
				}
				text = com > player ? "UP" : "Down";
				System.out.println(text);
				count++;
				
			} catch (Exception e) {
				sc.nextLine();

				System.out.println("재입력");
			}

		}

	}

}
