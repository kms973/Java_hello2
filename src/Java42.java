import java.math.BigInteger;

public class Java42 {
	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println();
		
		BigInteger big1 = new BigInteger("10000000000000000000000000000000000000000");
		BigInteger big2 = new BigInteger("-9999999999999999999999999999999999999999");
		
		BigInteger r1 = big1.add(big2);
		System.out.println(r1);
		
		BigInteger r2 = big2.multiply(big2);
		System.out.println(r2);
		
		int num = r1.intValueExact();
		System.out.println("From BigInteger: " + num);
	}
}
