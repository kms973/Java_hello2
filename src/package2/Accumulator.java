package package2;

public class Accumulator {
	private int i, sum;
	
	public Accumulator() {}
	
	public int add(int n) {
		for(int i = 1 ; i <= n ; i ++) {
			sum += i;
		}
		return sum;
	}
	
	public void showResult(){
		System.out.println(sum);
	}
}
