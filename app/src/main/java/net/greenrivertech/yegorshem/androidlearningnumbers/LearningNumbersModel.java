package net.greenrivertech.yegorshem.androidlearningnumbers;


import java.util.Random;

/**
 * Created by Yegor Shemereko on 4/7/2016.
 *
 * @version 1.0
 */
public class LearningNumbersModel {

    //object for generating a random number
    Random ran = new Random();

    //fields
    private int buttonOne;
    private int buttonTwo;
    private int score;
    private int roundsPlayed;


    /**
     * Constructor
     * Generates first two random numbers and sets games played and score to zero
     */
    public LearningNumbersModel() {
        generateRandom();
        score = 0;
        roundsPlayed = 0;
    }

    /**
     * Generates random number, one for each button
     */
    private void generateRandom() {
        //(max - min) +1
        buttonOne = ran.nextInt(10);
        buttonTwo = ran.nextInt(10);
    }

    public boolean play(int choice) {
        //
        roundsPlayed++;

        //
        if (choice == 1) {
            if (buttonOne >= buttonTwo) {
                score += buttonOne;
                generateRandom();
                return true;
            }
            generateRandom();
            return false;
        } else {
            if (buttonOne <= buttonTwo) {
                score += buttonTwo;
                generateRandom();
                return true;
            }
            generateRandom();
            return false;
        }
    }

    //getters
    public int getButtonOne() {
        return buttonOne;
    }

    public int getButtonTwo() {
        return buttonTwo;
    }

    public int getScore() {
        return score;
    }

    public int getRoundsPlayed() {
        return roundsPlayed;
    }
}
