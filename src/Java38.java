import java.util.Scanner;

public class Java38 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try {
			System.out.println("a/b...a?");
			int n1 = kb.nextInt();
			
			System.out.println("a/b...b?");
			int n2 = kb.nextInt();
			
			System.out.println(n1/n2);
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		} finally {
			
		}
		
		System.out.println("good bye.");
	}
}
