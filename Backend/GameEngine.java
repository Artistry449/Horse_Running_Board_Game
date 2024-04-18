package Backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameEngine implements GameEngine_Inter {

    public void displayPlayerScore(int playerID, int playerPosition) {
        // for (int i = 0; i < playerNum; i++) {
        System.out.println(" Тоглогч " + (playerID) + "-ийн байгаа байршил: " +
                playerPosition);
        // }
    }

    public static void start(int pathLength, int playerNum) {

        GameEngine engine = new GameEngine();

        Scanner scanner = new Scanner(System.in);
        Path path = new Path(pathLength, playerNum);
        Shagai shagai = new Shagai();

        List<Player> wonPlayersList = new ArrayList<Player>();

        int ahihNud = 0;

        while (wonPlayersList.size() != path.getPlayers().size()) {
            for (int i = 0; i < path.getPlayers().size(); i++) {

                if (!path.getPlayer(i).isOrohBaria()) {

                    System.out.println("Player " + (i + 1) + " шагай буулгана уу");
                    System.out.println("Шагайгаа буулгах бол (ROLL), тоглоомыг болиулах бол өөр тэмдэгт дарна уу");
                    String userChoice = scanner.nextLine();

                    if (userChoice.equals("roll")) {
                        // shagai.rollShagai();
                        System.out.print("\033[H\033[2J");
                        System.out.print("**Player " + (i + 1) + "-д ");
                        for (int k = 0; k < 4; k++) {
                            String buusanShagai = shagai.rollShagai();
                            ahihNud += buusanShagai.equals("морь") ? 1 : 0;

                            System.out.print(buusanShagai + " ");
                        }
                        System.out.print(" буулаа");
                    } else {
                        System.out.println("\nPlayer " + i + " тоглолтыг дуусгалаа");
                        return;
                    }
                    // System.out.println("Буусан тоо: " + shagai.getShagaiShape());

                    path.changePlayerPosition(i, ahihNud);

                    System.out.println("\n---(Player " + (i + 1) + ") " + ahihNud + " нүд ахилаа.");
                    System.out.println(
                            "---(Player " + (i + 1) + ")-ийн байгаа байрлал: " + path.getPlayerPosition(i) + "\n");

                    if (path.getPlayerPosition(i) >= path.getLength()) {

                        if (!path.getPlayer(i).isShownBariandOrloo()) {
                            System.out.println("Player " + (i + 1) + " барианд орлоо!");
                            path.getPlayer(i).toOrohBaria();
                            wonPlayersList.add(path.getPlayer(i));
                        }

                    }
                    // wonPlayersList.size() == playerNum ||
                    if (wonPlayersList.size() == playerNum - 1) {
                        System.out.println("Тоглоом дууслаа!");

                        System.out.println("\nТоглогчдын байр:");

                        System.out.println();
                        for (int j = 0; j < wonPlayersList.size(); j++) {
                            System.out.println((j + 1) + "-р байр: " + wonPlayersList.get(j).getID() + "-р тоглогч");
                        }
                        System.out.println((wonPlayersList.size() + 1) + "-р байр: " + path.playerList.get(0).getID()
                                + "-р тоглогч");
                        return;
                    }
                }
                ahihNud = 0;
            }

            System.out.println("\n-------------Үзүүлэлт--------------");
            for (int i = 0; i < playerNum; i++) {
                // System.out.println(" Тоглогч " + (i + 1) + "-ийн байгаа байршил: " +
                // path.getPlayerPosition(i));
                engine.displayPlayerScore(i + 1, path.getPlayerPosition(i));
            }
            System.out.println("-----------------------------------\n");
        }
        // return 0;
    }
}