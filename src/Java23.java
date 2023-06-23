
public class Java23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// equals
		String STR = "abcedfgh";
		String STR1 = "abcedfgh";
		System.out.println(STR.equals(STR1)); // ture

		// indexOf
		String STR2 = "abcedfgh";
		String STR3 = "abcedfgh";
		System.out.println(STR2.indexOf("bced"));// 1
		System.out.println(STR2.indexOf("f")); //5
		// length
		String STR4 = "abcedfgh";
		System.out.println(STR4.length());// 8

		// substring
		String STR5 = "abcedfgh";
		System.out.println(STR5.substring(5));// fgh
		System.out.println(STR5.substring(0, 2));// ab

		// toUpperCase toLowerCase
		String str = "abcdef";
		String str0 = "ABCDEF";
		System.out.println(str.toUpperCase());// ABCDEF
		System.out.println(str.toLowerCase());// abcdef

		// concat
		String str1 = "gdgd";
		String str2 = "asas";
		System.out.println(str1.concat(str2)); // gdgdasas

		// replace
		String str3 = "coo0oo0oo0";
		System.out.println(str3.replace("0", "o"));// cooooooooo

		// trim()
		String str4 = "      h e    llo    ";
		System.out.println(str4.trim());// h e llo

		// contains
		String str5 = "abcd";
		String str6 = "c";

		System.out.println(str5.contains(str6));// true
	}

}
