package Backend;

public class Player {
    private int id;
    private int position = 0;
    private boolean isOrohBaria = false;
    private boolean isBariandOrohShown = false;
    Shagai shagai = new Shagai();

    public Player(int id) {
        this.id = id;

    }

    public int getID() {
        return id;
    }

    public int getPosition() {
        return position;
    }

    public void changePosition(int newPosition) {
        this.position += newPosition;
    }

    public void toOrohBaria() {
        this.isOrohBaria = true;
    }

    public boolean isOrohBaria() {
        return isOrohBaria;
    }

    public boolean isShownBariandOrloo() {
        return isBariandOrohShown;
    }

    public int rollShagai() {
        return shagai.rollShagai();
    }
}
