import java.util.Scanner;

import package2.Recatangle;

public class Java25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recatangle[] arrRec = new Recatangle[2];
		Scanner sc = new Scanner(System.in);
//		arrRec[0] = new Recatangle(40, 50);
//		arrRec[1] = new Recatangle(20, 50);
		
		double area = 0;
		
		for(int i = 0 ; i < arrRec.length; i++) {
			arrRec[i] = new Recatangle(sc.nextDouble(), sc.nextDouble());
			area += arrRec[i].RecatangleArea();
		}
		
		System.out.println(area);

	}

}
