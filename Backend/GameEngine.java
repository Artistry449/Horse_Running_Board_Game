package Backend;

import java.util.ArrayList;
import java.util.List;

public class GameEngine {
    public static void start(int pathLength, int playerNum) {
        Path path = new Path(pathLength, playerNum);
        Shagai shagai = new Shagai();

        List<Player> wonPlayersList = new ArrayList<Player>();

        int wonPlayersNum = 0;
        for (; wonPlayersNum < playerNum;) {
            System.out.println("Player 1 шагай буулгана уу");
            shagai.rollShagai();
            System.out.println("Буусан тоо: " + shagai.getShagaiShape());

            path.changePlayerPosition(1, shagai.getShagaiShape());
            System.out.println("Player 1-ийн байгаа байрлал: " + path.getPlayerPosition(1));

            if (path.getPlayerPosition(1) >= path.getLength()) {

            }
            if (wonPlayersList.size() >= playerNum) {
                System.out.println("Тоглоом дууслаа!");

                for (int i = 0; i < wonPlayersList.size(); i++) {
                    // System.out.println(i + "-р байр: " + wonPlayersList.);
                }
            }
        }
    }
}
