
public class Java6 {

	public static void main(String[] args) {
		int num;
		boolean search = false;
		
		for(num = 1; num < 101; num++) {
			if((num % 5 == 0) && (num % 7 == 0)) {
				search = true;
				break; // for문탈출
			}
		}
		
		if(search) {
			System.out.println("찾는 정수 : " + num);
		}
		else {
			System.out.println("5의 배수이자 7의 배수인 수를 찾지 못했습니다.");
		}
		
	}

}
