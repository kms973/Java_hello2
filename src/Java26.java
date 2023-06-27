import java.util.Scanner;

import package2.RockPaperScissors;

public class Java26 {
    public static void main(String[] args) {

        String str;
      Scanner sc = new Scanner(System.in);
      RockPaperScissors player = new RockPaperScissors();



        for (int i = 0; i < 1;) {
            System.out.println("가위 바위 보 중 하나를 입력해주세요.");
            str = player.RockPaperScissors(sc.next());
            System.out.println(str);
            player.fight();

            System.out.println("계속Y");
                String choice = sc.next();

                if (choice.compareToIgnoreCase("y") == 0) {
                    continue;
                } else {
                    System.out.println("종료되었습니다.");
                    break;
                }
        

    }
}
}