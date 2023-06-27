import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row, col;

		row = 0;
		col = 0;

		for (int i = 0; i < 1;) {
			System.out.print("행 크기 : ");
			row = sc.nextInt();
			if ((row < 1) || (row > 10)) {
				System.out.println("1에서 10 사이의 숫자를 입력하여야 합니다.");
				continue;
			} else {
				break;
			}
		}

		for (int i = 0; i < 1;) {
			System.out.print("열 크기 : ");
			col = sc.nextInt();
			if ((col < 1) || (col > 10)) {
				System.out.println("1에서 10 사이의 숫자를 입력하여야 합니다.");
				continue;
			} else {
				break;
			}
		}

		int[][] arr = new int[row][col];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = (int) (Math.random() * 26 + 65);

				System.out.print((char) arr[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
