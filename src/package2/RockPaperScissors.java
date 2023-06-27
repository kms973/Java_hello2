package package2;

public class RockPaperScissors {
	private String player, computer;
	static int computerI;

	public RockPaperScissors() {
	}

	public String RockPaperScissors(String player) {
		computerI = (int) (Math.random() * 3);
		if (computerI == 0) {
			computer = "가위";
		} else if (computerI == 1) {
			computer = "바위";
		} else {
			computer = "보";
		}
		return this.player = player;
	}

	public void fight() {
		System.out.println(computer);
		if (player.equals(computer)) {
			System.out.println("비겼습니다.");
		} else if (((player.equals("보")) && (computer.equals("바위"))) || (player.equals("바위")) && (computer.equals("가위"))
				|| (player.equals("가위")) && (computer.equals("보"))) {
			System.out.println("이겼습니다.");
		} else {
			System.out.println("졌습니다.");
		}

	}

}
