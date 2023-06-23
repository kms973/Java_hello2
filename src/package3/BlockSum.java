package package3;

public class BlockSum {
	private final int n;
	private int sum;

	public BlockSum(int n) {
		this.n = n;
	}

	public void sum() {
		for(int j = n; j > 0; j--) {
			for (int i = 1; i <= j; i++) {
				sum += i;
			}
			
		}
	
		System.out.println(sum);
	}
}
