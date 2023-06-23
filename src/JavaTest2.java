
public class JavaTest2 {

	public static void main(String[] args) {
		// 변수선언
		int[] arrLotto = new int[6];

		// 입력
		for (int i = 0; i < arrLotto.length; i++) {
			arrLotto[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				if (arrLotto[i] == arrLotto[j]) {
					i--;
					break;
				}
			}

		}

		// System.out.println();
		// 출력
		for (int i = 0; i < arrLotto.length; i++) {
			System.out.print(arrLotto[i] + "    ");
		}
	}
}
