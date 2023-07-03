import java.util.Scanner;

public class Java37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int num = sc.nextInt();
			System.out.println(num);
		} catch (Exception e) {
			
			System.out.println("케취 안 입니다.");
		} finally {
			System.out.println("파이널리입니다.");
		}
		System.out.println("프로그램종료");
	}
}
