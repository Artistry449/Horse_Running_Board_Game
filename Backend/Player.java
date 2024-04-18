package Backend;

public class Player implements Player_Inter {
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

    public String rollShagai() {
        return shagai.rollShagai();
    }
}
