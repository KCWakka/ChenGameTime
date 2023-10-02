public class Game {
    String gameName;
    int players;
    int score;

    public Game(String game, int playersNum) {
        gameName = game;
        players = playersNum;
        score = 0;
    }
    public String getGameName() {
        return gameName;
    }
    public int getPlayers() {
        return players;
    }
    public int getScore() {
        return score;
    }
    public void addPlayer() {
        players++;
    }
    public void losePlayer() {
        players--;
    }
    public void decreaseScore(int decrease) {
        score -= decrease;
    }
    public void increaseScore(int increase) {
        score += increase;
    }
    public double averageScorePerPlayer() {
        return ( (double) score / players);
    }
    public boolean isGameOver() {
        if (score > 9) {
            return true;
        } else {
            return false;
        }
    }

}
