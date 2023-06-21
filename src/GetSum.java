
public class GetSum {
	int n, sum;
	

	void setNum(int n) {
		this.n = n;
	}

	int sum() {
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}
