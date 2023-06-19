
public class Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 4; j++) {
				System.out.print(" ");
			}
			for (int j = 6; j > 5-i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("STAR");

	}
}