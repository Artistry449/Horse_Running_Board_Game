package Backend;

public class BoxDrawing {
    public static void main(String[] args) {
        int width = 10; // Set the width of the box
        int height = 5; // Set the height of the box

        // Draw the top of the box
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Draw the sides of the box
        for (int i = 0; i < height - 2; i++) {
            System.out.print("*"); // Left side of the box
            for (int j = 0; j < width - 2; j++) {
                System.out.print(" "); // Space inside the box
            }
            System.out.println("*"); // Right side of the box
        }

        // Draw the bottom of the box
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
