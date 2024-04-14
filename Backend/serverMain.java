package Backend;

import java.util.Scanner;

public class serverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        String userChoice = "";
        int whoEndedGame = 0;

        for (;;) {

            System.out.println("Хэдэн хүн тоглох вэ? (2-4)");
            int playerNum = scanner.nextInt();

            System.out.println("Замын урт хэд байх вэ? (20, 40, 60)");
            int pathLength = scanner.nextInt();

            System.out.println("Тоглоомыг эхлүүлэх үү? (y/n)");
            userChoice = sc.nextLine();

            if (userChoice.equals("y")) {
                // whoEndedGame = GameEngine.start(pathLength, playerNum);
                GameEngine.start(pathLength, playerNum);
                break;
            } else {
                scanner.close();
                break;
            }
        }

        // if (whoEndedGame == 0) {
        // System.out.println("Тоглолт дууслаа!");
        // } else {
        // System.out.println("Тоглолтыг " + whoEndedGame + "-р тоглогч дуусгалаа.");
        // }

    }
}