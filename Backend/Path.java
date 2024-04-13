package Backend;

import java.util.ArrayList;
import java.util.List;

public class Path {
    private int length = 0;
    private int flagPosition = 0;

    List<Player> playerList = new ArrayList<Player>();

    public Path(int length, int playerNum) {
        this.length = length;

        for (int i = 1; i <= playerNum; i++) {
            playerList.add(new Player(i));
        }
    }

    public void changePlayerPosition(int playerID, int ahihNudniiToo) {
        playerList.get(playerID).changePosition(ahihNudniiToo);
    }

    public int getPlayerPosition(int playerID) {
        return this.playerList.get(playerID).getPosition();
    }

    public int getLength() {
        return length;
    }
}