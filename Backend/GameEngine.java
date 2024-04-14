package Backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameEngine {
    public static void start(int pathLength, int playerNum) {

        Scanner scanner = new Scanner(System.in);
        Path path = new Path(pathLength, playerNum);
        Shagai shagai = new Shagai();

        List<Player> wonPlayersList = new ArrayList<Player>();

        int wonPlayersNum = 0;
        for (; wonPlayersNum < playerNum;) {

            for (int i = 0; i < playerNum; i++) {
                System.out.println("Player " + (i + 1) + " шагай буулгана уу");
                System.out.println("Шагайгаа буулгах бол (ROLL), тоглоомыг болиулах бол өөр тэмдэгт дарна уу");
                String userChoice = scanner.nextLine();

                if (userChoice.equals("ROLL")) {
                    shagai.rollShagai();
                } else {
                    System.out.println("Тоглогч " + i + " тоглолтыг дуусгалаа");

                    return;
                }
                System.out.println("Буусан тоо: " + shagai.getShagaiShape());

                path.changePlayerPosition(i, shagai.getShagaiShape());
                System.out.println("Player " + (i + 1) + "-ийн байгаа байрлал: " + path.getPlayerPosition(i));

                if (path.getPlayerPosition(i) >= path.getLength()) {
                    System.out.println("Player " + i + " түрүүллээ!");
                    break;
                }
                if (wonPlayersList.size() >= playerNum) {
                    System.out.println("Тоглоом дууслаа!");

                    System.out.println("Тоглогчдын байр:");

                    for (int j = 0; j < wonPlayersList.size(); j++) {
                        System.out.println(j + "-р байр: " + wonPlayersList.get(j));
                    }
                }
            }

            for (int i = 0; i < playerNum; i++) {
                System.out.println("Тоглогч " + (i + 1) + "-ийн байгаа байршил: " + path.getPlayerPosition(i));
            }

        }
        // return 0;
    }
}
