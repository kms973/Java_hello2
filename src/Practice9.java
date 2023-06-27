import java.util.Scanner;

public class Practice9 {
	public static void main(String[] args) {
		String[][] arr = new String[6][6];
		int row, col;

		Scanner sc = new Scanner(System.in);

		System.out.println("행 인덱스 입력");
		row = sc.nextInt();
		System.out.println("열 인덱스 입력");
		col = sc.nextInt();

		arr[row][col] = "X";

		System.out.println("  0 1 2 3 4");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < arr[i].length - 1; j++) {
				if (arr[row][col] == arr[i][j]) {
					arr[i][j] = "X";
				} else {
					arr[i][j] = " ";
				}
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}
}
