
public class Java5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int sum = 0;
		System.out.println(num + "+" + ++num +"+"+  num++ + "+"+ num);
		
		while(num < 10) {
		num++;
		sum += num;
		//System.out.println(num);
		}
		System.out.println(sum);
	}

}
