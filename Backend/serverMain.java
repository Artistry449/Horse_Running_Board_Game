package Backend;

import java.util.Scanner;

public class serverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int playerNum = 0;
        for (; playerNum < 2 || playerNum > 4;) {
            System.out.println("Хэдэн хүн тоглох вэ? (2-4)");
            while (!scanner.hasNextInt()) {
                System.out.println("Та зөвхөн тоо оруулна уу");
                scanner.next();
            }
            playerNum = scanner.nextInt();
            if (playerNum < 2 || playerNum > 4) {
                System.out.println("Та зөвхөн 2-4-оос сонгоно уу");
            }
        }

        int pathLength = 0;
        for (; pathLength != 20 && pathLength != 40 && pathLength != 60;) {
            System.out.println("Замын урт хэд байх вэ? (20, 40, 60)");

            while (!scanner.hasNextInt()) {
                System.out.println("Та зөвхөн тоо оруулна уу");
                scanner.next();
            }
            pathLength = scanner.nextInt();
            scanner.nextLine();
            if (pathLength != 20 && pathLength != 40 && pathLength != 60) {
                System.out.println("Та зөвхөн (20, 40, 60) аль нэгээс нь сонгоно уу");
            }
        }

        String userChoice = "";
        for (; !userChoice.equals("y") && !userChoice.equals("n");) {
            System.out.println("Тоглоомыг эхлүүлэх үү? (y/n)");
            userChoice = scanner.nextLine();

            if (!userChoice.equals("y") && !userChoice.equals("n"))
                System.out.println("Тоглоомыг эхлүүлэх эсвэл гарах эсэхийг сонгоно уу");
        }

        if (userChoice.equals("y")) {
            // whoEndedGame = GameEngine.start(pathLength, playerNum);
            GameEngine.start(pathLength, playerNum);
        } else {
            System.out.println("\n~~Тоглоомоос гарлаа~~");
            scanner.close();
        }
    }
}