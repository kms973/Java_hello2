
public class Java41 {
	public static void main(String[] args) {

		Integer num1 = new Integer(29);
		Integer iObj = 10; // auto boxing

		int num = iObj; // auto unboxing

//		System.out.println(num1.MIN_VALUE);
//		System.out.println(iObj.intValue());
//		System.out.println(num1.doubleValue());
//		
		Double num2 = new Double(3.14);

//		System.out.println(num2.MAX_VALUE);
//		System.out.println(num2.intValue());
//		System.out.println(num2.doubleValue());
		
		Integer n1 = Integer.valueOf(5);
		Integer n2 = Integer.valueOf("1024");
		
		
		// 대소 비교, 합 계산
		System.out.println(Integer.max(n1, n2));
		System.out.println(Integer.min(n1, n2));
		System.out.println(Integer.sum(n1, n2));

		// 정수에 대한 2, 8, 16진수 표현 결과를 반환
		System.out.println(Integer.toBinaryString(12));
		System.out.println(Integer.toOctalString(12));
		System.out.println(Integer.toHexString(12));
		
		
		
	}
}
