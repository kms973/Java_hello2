
public class Java2 {

	public static void main(String[] args) {
		int a = 90;
		int b = 70;
		int c = 45;
		
		double d = (double)((a+b+c)/3);
		
		System.out.println("총점 : " + (a+b+c));
		System.out.println("평균 : " + d);
		
		if (d >= 90) {
			System.out.println("성적 : 수");
		}
		else if (d >= 80) {
			System.out.println("성적 : 우");
		}
		else if (d >= 70) {
			System.out.println("성적 : 미");
		}
		else if (d >= 60) {
			System.out.println("성적 : 양");
		}
		else {
			System.out.println("성적 : 가");
		}
	}

}
