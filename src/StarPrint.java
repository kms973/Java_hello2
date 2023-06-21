
public class StarPrint {
	public void printTriangle(int n) {
		for(int i = 0 ; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void printReverseTriangle(int n) {
		for(int i = 0 ; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
