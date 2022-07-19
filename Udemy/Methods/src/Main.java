public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver,score,levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver,score,levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        //Create a method called displayHighScorePosition
        //it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        //You should display the players name along with a message like "manage to get into position" and the
        //position they got and a further message "on the high score table"
        //
        //Create a 2nd method called calculateHighScorePosition
        //it should be sent one argument only, the player score
        //it should return an int
        //it return data should be
        //1 if the score is >= 1000
        //2 if the score is >=500 and < 1000
        //3 if the score is >= 100 and < 500
        //4 in all other cases
        // call both method and display the results of the following
        //a score of 1500, 900, 400, and 50


        //below is taken off to clean the code
        //int playerScore = 1;
        int position =  calculateHighScorePosition(1);

        //String playerName = "John";
        //position = 1;
        displayHighScorePosition("John ", position);

        position =  calculateHighScorePosition(1500);
        displayHighScorePosition("Bob ", position);

        position =  calculateHighScorePosition(900);
        displayHighScorePosition("Max ", position);

        position =  calculateHighScorePosition(400);
        displayHighScorePosition("Tim ", position);

        position =  calculateHighScorePosition(50);
        displayHighScorePosition("Kyle ", position);

        position =  calculateHighScorePosition(1000);
        displayHighScorePosition("Madison ", position);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

// if (gameOver) the same as if (gameOver == true)
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

                    return finalScore;
        } else {
            return -1;
        }

    }
    public static void displayHighScorePosition (String playerName, int position ){
        //below is taken off to clean code
       // String playerName = "john";
        //int position = 1;
        System.out.println(playerName + "manage to get into position " + position + " on the high score table");
    }
    public static int calculateHighScorePosition (int playerScore) {
        //below is taken off to clean code
       // int playerScore = 1;
        if (playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

}