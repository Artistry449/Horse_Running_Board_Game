package Backend;

public class Player {
    private int id;
    private int position = 0;

    public Player(int id) {
        this.id = id;

        Shagai shagai = new Shagai();
    }

    public int getPosition() {
        return position;
    }

    public void changePosition(int newPosition) {
        this.position += newPosition;
    }
}
