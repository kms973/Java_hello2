
public class Grade {
	int kor, eng, math;
	double avg;
	
	Grade(){
		
	}
	
	Grade(int kor, int eng, int math){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	double getAvg() {
		avg = (kor + eng + math) / 3;
		return avg;
	}
	
	void getGrade() {
		if(avg >=90) {
			System.out.println('수');
		}
		else if(avg >= 80) {
			System.out.println('우');
		}
		else if(avg>=70) {
			System.out.println('미');
		}
		else if(avg>=60) {
			System.out.println('양');
		}
		else if(avg>=50) {
			System.out.println('가');
		}
	}
}
