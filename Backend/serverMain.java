package Backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class serverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userChoice = "";

        for (;;) {

            System.out.println("Хэдэн хүн тоглох вэ? 1 2 3 4");
            int playerNum = scanner.nextInt();

            System.out.println("Замын урт хэд байх вэ? 20 40 60");
            int pathLength = scanner.nextInt();

            System.out.println("Тоглоомыг эхлүүлэх үү? (y/n)");
            userChoice = scanner.nextLine();

            if (userChoice.equals("y")) {
                GameEngine.start(pathLength, playerNum);
            } else {
                scanner.close();
                break;
            }
        }

    }
}
