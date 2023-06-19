
public class JavaExample {
	
	public static void main(String[] args) {
		int num1, num2, num3;
		
		num1 = 6;
		num2 = 10;
		num3 = 1;
		
		if((num1 > num2) && (num1 > num3)) {
			System.out.println("쵀대값 : " + num1);
		}
		else if(num2 > num3) {
			System.out.println("쵀대값 : " + num2);
		}
		else {
			System.out.println("쵀대값 : " + num3);
		}
	}
}
