package net.greenrivertech.yegorshem.androidlearningnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LearningNumbersModel model = new LearningNumbersModel();

    Button buttonOne;
    Button buttonTwo;
    TextView score;
    TextView roundsPlayed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOne = (Button) findViewById(R.id.buttonOne);
        buttonTwo = (Button) findViewById(R.id.buttonTwo);
        score = (TextView) findViewById(R.id.score);
        roundsPlayed = (TextView) findViewById(R.id.roundsPlayed);

        updateStrings();
    }

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
