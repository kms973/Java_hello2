
public class JavaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor, eng, math;
		char result = '수';
		kor = 90;
		eng = 70;
		math = 45;
		
		int sum = kor + eng + math;
		double avg = ((kor + eng + math)/3.0);
		
		if(avg >= 90) {
			result = '수';
		}
		else if (avg >= 80 ) {
			result = '우';
		}
		else if (avg >= 70) {
			result = '미';
		}
		else if (avg >= 60) {
			result = '양';
		}
		else {
			result = '가';
		}
		
		System.out.println("총점 : " + sum );
		System.out.println("평균 : " + avg );
		System.out.println("성적 : " + result );
	}

}
