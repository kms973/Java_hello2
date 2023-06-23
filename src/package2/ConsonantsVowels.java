package package2;

//영어에서 글자수와 자음, 모음이 몇 개인지 계산하는 클래스
public class ConsonantsVowels {
	static String str;
	static int Con, Vo;

	public ConsonantsVowels() {
	}

	public String Count(String str) { // 글자수
		return this.str = str;
	}

	public void Consonants() { // 자음, 모음 개수
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o')
					|| (str.charAt(i) == 'u')) {
				Con += 1;
			} else {
				Vo += 1;
			}
		}
	}

	public void show() { // 개수 알려주기
		System.out.println("자음은 : " + Con + "개 입니다.");
		System.out.println("모음은 : " + Vo + "개 입니다.");
	}
}
