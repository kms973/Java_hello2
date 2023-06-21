
public class JavaExample5 {
	public static double getCircleArea(double i) {
		final double PI = 3.14;
		return (PI * (i * i));

	}

	public static double getRestangleArea(double i, int j) {

		return i * j;
	}

	public static double getTriangleArea(double i, int j) {
		return ((i * j) / 2);
	}

	public static int getAscCode(char i) {
		
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area = getCircleArea(10);
		System.out.println(area);

		area = getRestangleArea(10, 20);
		System.out.println(area);

		area = getTriangleArea(40, 20);
		System.out.println(area);

		int code = getAscCode('a');
		System.out.println(code);

	}

}
