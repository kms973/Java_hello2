
public class Java24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arrStr = new String[2];
		arrStr[0] = "String 1";
		arrStr[1] = "String 2";
		int sum = 0;
		for (int i = 0; i < arrStr.length; i++) {
			sum += arrStr[i].length();
		}
		System.out.println(sum);
//		arrStr[2] = "String 3"; 
	}

}
