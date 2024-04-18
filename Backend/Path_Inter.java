package Backend;

import java.util.List;

interface Path_Inter {
    public void changePlayerPosition(int playerID, int ahihNudniiToo);

    public int getPlayerPosition(int playerID);

    public int getLength();

    public Player getPlayer(int playerID);

    public List<Player> getPlayers();
}
