
public class Java11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<5; i++) {
			for(int j = i; j <= 3; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
