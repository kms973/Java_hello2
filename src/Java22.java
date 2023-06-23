import java.util.Scanner;

import package2.ConsonantsVowels;

public class Java22 {

	public static void main(String[] args) {

		String str;
		Scanner sc = new Scanner(System.in);
		ConsonantsVowels str1 = new ConsonantsVowels();

		System.out.println("영어 단어를 입력하세요.");
		str = str1.Count(sc.next());
		System.out.println("총 글자 수는 : " + str.length() + "개 입니다.");
		str1.Consonants();
		str1.show();

	}

}
