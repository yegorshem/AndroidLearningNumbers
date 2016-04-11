package net.greenrivertech.yegorshem.androidlearningnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author Yegor Shemereko
 * @version 1.1
 *          This is the main activity that displays the buttons, games played, and score
 */
public class MainActivity extends AppCompatActivity {

    LearningNumbersModel model = new LearningNumbersModel();

    // elements of the activity
    Button buttonOne;
    Button buttonTwo;
    TextView score;
    TextView roundsPlayed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning elements to a pointer by ID
        buttonOne = (Button) findViewById(R.id.buttonOne);
        buttonTwo = (Button) findViewById(R.id.buttonTwo);
        score = (TextView) findViewById(R.id.score);
        roundsPlayed = (TextView) findViewById(R.id.roundsPlayed);

        //refresh all the tesxt in the activity
        updateStrings();
    }

    /**
     * This function plays the game according to the choice the user chooses
     *
     * @param view current element this function works on
     */
    public void buttonOne(View view) {
        String toast;

        if (model.play(1)) {
            toast = "Correct!";
        } else {
            toast = "Sorry, Try Again";
        }
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();

        updateStrings();
    }

    /**
     * This function plays the game according to the choice the user chooses
     *
     * @param view current element this function works on
     */
    public void buttonTwo(View view) {
        String toast;

        if (model.play(2)) {
            toast = "Correct!";
        } else {
            toast = "Sorry, Try Again";
        }
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
        updateStrings();

    }

    /**
     * This function updates all the strings on the screen
     */
    private void updateStrings() {

        String scoreText = ("Score: " + String.valueOf(model.getScore()));
        String roundsPlayedText = ("Rounds Played: " + String.valueOf(model.getRoundsPlayed()));

        //updating the strings on screen
        buttonOne.setText(String.valueOf(model.getButtonOne()));
        buttonTwo.setText(String.valueOf(model.getButtonTwo()));
        score.setText(scoreText);
        roundsPlayed.setText(roundsPlayedText);
    }

}
