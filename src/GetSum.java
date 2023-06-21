
public class GetSum {
	int num;
	int n;


	public void setNum(int n) {
		this.n = n;
	}

	public int sum() {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}
