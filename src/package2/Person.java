package package2;

public class Person {
	private int regiNum;
	private int passNum;

	public Person(int rnum, int pnum) {
		this.regiNum = rnum;
		this.passNum = pnum;
	}

	public Person(int rnum) {
		this(rnum, 0);
//		this.regiNum = rnum;
//		this.passNum = 0;
	}

	public void showPersonalInfo() {
		System.out.println("주민등록 번호: " + regiNum);

		if (passNum != 0)
			System.out.println("여권 번호: " + passNum + '\n');
		else
			System.out.println("여권을 가지고 있지 않습니다. \n");
	}


}
