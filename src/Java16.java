class InstCnt {
	
	static int instNum = 0;

	InstCnt() {
		instNum++;
		System.out.println("인스턴스 생성 : " + instNum);
	}
	
}

public class Java16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
		
		System.out.println(Math.PI);
	}

}
