
public class Practice2 {

	public static void main(String[] args) {

		int[][] arr = new int[4][4];
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print((num += 1) + " ");
			}
			System.out.println();
		}

	}

}
