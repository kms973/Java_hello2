
public class Grade {
	int kor, eng, math;
	double avg;

	public void setGrade(int a, int b, int c) {
		this.kor = a;
		this.eng = b;
		this.math = c;
	}

	public void getAvg() {
		avg = ((kor + eng + math) / 3);
		System.out.println(avg);
	}

	public void getGrade() {

		if (avg >= 90) {
			System.out.println('수');
		} else if (avg >= 80) {
			System.out.println('우');
		} else if (avg >= 70) {
			System.out.println('미');
		} else if (avg >= 60) {
			System.out.println('양');
		} else if (avg >= 50) {
			System.out.println('가');
		}
	}
}
