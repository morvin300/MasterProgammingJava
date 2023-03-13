public class Challenge {
    public static void main(String[] args) {
        int highScore = caculateHighScorePosition(1500);
        displayHighScorePosition("Steve", highScore);
        highScore = caculateHighScorePosition(1000);
        displayHighScorePosition("jackson  ", highScore);
        highScore = caculateHighScorePosition(999);
        displayHighScorePosition("Rajesh", highScore);
        highScore = caculateHighScorePosition(99);
        displayHighScorePosition("Salomi", highScore);
        highScore = caculateHighScorePosition(-1000);
        displayHighScorePosition("Nishant", highScore);
    }

    public static void displayHighScorePosition(String Playername, int highscore) {
        System.out.println(Playername + " managed to get into " + highscore + " position in high score list");
    }

    public static int caculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if ((playerScore >= 500)) {
            return 2;
        } else if ((playerScore >= 100)) {
            return 3;
        } else {
            return 4;
        }
    }
}
