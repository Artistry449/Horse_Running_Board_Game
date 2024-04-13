package Backend;

public class Shagai {
    private int shape;

    public Shagai() {

    }

    public void rollShagai() {
        int rand = (int) (Math.random() * 4) + 1;

        this.shape = rand;
    }

    public int getShagaiShape() {
        return shape;
    }
}