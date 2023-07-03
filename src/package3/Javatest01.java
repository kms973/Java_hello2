package package3;

import java.util.Scanner;

public class Javatest01 {

	public static void main(String[] args) {
		Scanner sc;
		int com, num, count;
		String str;
		com = (int) ((Math.random() * 100) + 1);
		count = 1;
		
		while(true) {
			
			try {
				System.out.println("1~100사이 숫자 맞추기!");
				sc = new Scanner(System.in);
				num = sc.nextInt();
			} catch (Exception e) {
				System.out.println("다시 입력하기!");
				continue;
				
			} 
			
			
			if ( com == num) {
				System.out.println("정답입니다. " + count + "번 만에 맞췄어요");
				break;
			}
			str = com > num ? "up" : "down";
			System.out.println(str);
			count++;
			
		}

	}

}
