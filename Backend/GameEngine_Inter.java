package Backend;

interface GameEngine_Inter {
    public void displayPlayerScore(int playerID, int playerPosition);

    public void start(int pathLength, int playerNum);
}