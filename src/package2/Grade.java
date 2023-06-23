package package2;

public class Grade {
	int kor, eng, math;
	double avg;

	public Grade() {

	}

	public Grade(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public double getAvg(int kor2, int eng2, int math2) {
		this.kor = kor2;
		this.eng = eng2;
		this.math = math2;
		avg = (kor + eng + math) / 3;
		return avg;
	}

	public char getGrade() {
		char ch = '가';

		if (avg >= 90) {
			ch = '수';
		} else if (avg >= 80) {
			ch = '우';
		} else if (avg >= 70) {
			ch = '미';
		} else if (avg >= 60) {
			ch = '양';
		}

		return ch;
	}

}
