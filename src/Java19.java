
public class Java19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 = "Coffee";
		String st2 = "Bread";

		String st3 = st1.concat(st2);
		System.out.println(st3);

		String st4 = "Fresh".concat(st3);
		System.out.println(st4);

		String str2 = "abcdefg";
		System.out.println(str2.substring(2));
		String str = "abcdefg";
		System.out.println(str.substring(2, 4));

		double e = 2.76953;
		String se = String.valueOf(e);
		System.out.println(se);

		StringBuilder stbuf = new StringBuilder("123");

		stbuf.append(45678);
		System.out.println(stbuf.toString());
		stbuf.delete(0, 2);
		System.out.println(stbuf.toString());
		stbuf.replace(0, 3, "AB");
		System.out.println(stbuf.toString());
		stbuf.reverse();
		System.out.println(stbuf.toString());

		String sub = stbuf.substring(2, 4);
		System.out.println(sub);
	}

}
