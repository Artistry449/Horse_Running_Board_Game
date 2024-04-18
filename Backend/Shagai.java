package Backend;

import java.util.Hashtable;
import java.util.Random;

public class Shagai {
    private int shape;

    private Random random = new Random();

    public Shagai() {

    }

    public String rollShagai() {
        // int rand = (int) (Math.random() * 4) + 0;

        // this.shape = rand;

        // return rand;

        ///////////////
        // // 0 - honi
        // // 1 - ymaa
        // // 2 - temee
        // // 3 - mori

        int roll = random.nextInt(40) + 1;

        if (roll <= 12) {
            return "хонь";
        } else if (roll <= 24) {
            return "ямаа";
        } else if (roll <= 36) {
            return "тэмээ";
        } else {
            return "морь"; // mori buuh magadlal ni hamgiin baga baihaar hiiv.
        }
    }

    public int getShagaiShape() {
        return shape;
    }
}