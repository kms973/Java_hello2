
public class Java18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Simple";
		String str2 = "Hard";

		str1 = str1 + str2;
		System.out.println(str1);

		String str3 = new String("Simple String");
		String str4 = new String("Simple String");

		if (str1 == str2)
			System.out.println("1과 2는 동일 인스턴스 참조");
		else
			System.out.println("1과 2는 다른 인스턴스 참조");

		if (str1.equals(str3))
			System.out.println("dd");
		else
			System.out.println("ss");

		if (str3 == str4)
			System.out.println("3과 4는 동일 인스턴스 참조");
		else
			System.out.println("3과 4는 다른 인스턴스 참조");

	}

}
