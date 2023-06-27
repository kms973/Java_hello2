class Cake {
	public void yummy() {
		System.out.println("맛있다");
	}
}

class CheeseCake extends Cake {
	public void yummy() {// Cake yummy 메소드를 오버라이딩.
		System.out.println("맛있다2");
	}
}

class Robot {
	public void work() {

	}
}

class DanceRobot extends Robot {
	public void work() {
		System.out.println("춤추는 로봇입니다.");
	}
}

class DrawRobot extends Robot{
	public void work() {
		System.out.println("그림을 그리는 로봇입니다.");
	}
}

class WashRobot extends Robot{
	public void work() {
		System.out.println("세탁 로봇입니다.");
	}
}

public class Java33 {

	public static void main(String[] args) {
//		Cake c1 = new CheeseCake();
//		CheeseCake c2 = new CheeseCake();
//
//		c1.yummy();
//		c2.yummy();
		
		Robot[] arrRobot = {new DanceRobot(), new DrawRobot(), new WashRobot()};
		
		for(Robot robot : arrRobot) {
			robot.work();
		}
	}

}
