package com.example.android.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalsTeamA, goalsTeamB, foulsTeamA, foulsTeamB, yellowCardTeamA, yellowCardTeamB, redCardTeamA, redCardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displaygoalTeamA(0);
        displaygoalTeamB(0);
    }

    /**
     * Saves scores if screen rewritten
     *
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
        outState.putInt("GOALS_TEAM_A", goalsTeamA);
        outState.putInt("GOALS_TEAM_B", goalsTeamB);
        outState.putInt("FOULS_TEAM_A", foulsTeamA);
        outState.putInt("FOULS_TEAM_B", foulsTeamB);
        outState.putInt("YELLOW_CARD_TEAM_A", yellowCardTeamA);
        outState.putInt("YELLOW_CARD_TEAM_B", yellowCardTeamB);
        outState.putInt("RED_CARD_TEAM_A", redCardTeamA);
        outState.putInt("RED_CARD_TEAM_B", redCardTeamB);
    }

    /**
     * call saved scores in onSaveInstanceState
     * @param savedInstanceState
     */
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);

        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.

        goalsTeamA = savedInstanceState.getInt("GOALS_TEAM_A");
        goalsTeamB = savedInstanceState.getInt ("GOALS_TEAM_B");
        foulsTeamA = savedInstanceState.getInt("FOULS_TEAM_A");
        foulsTeamB = savedInstanceState.getInt("FOULS_TEAM_B");
        yellowCardTeamA = savedInstanceState.getInt("YELLOW_CARD_TEAM_A");
        yellowCardTeamB = savedInstanceState.getInt("YELLOW_CARD_TEAM_B");
        redCardTeamA = savedInstanceState.getInt("RED_CARD_TEAM_A");
        redCardTeamB = savedInstanceState.getInt("RED_CARD_TEAM_B");
        displaygoalTeamA(goalsTeamA);
        displaygoalTeamB(goalsTeamB);
        displayfoulsTeamA(foulsTeamA);
        displayfoulsTeamB(foulsTeamB);
        displayYellowCardA(yellowCardTeamA);
        displayYellowCardB(yellowCardTeamB);
        displayRedCardA(redCardTeamA);
        displayRedCardB(redCardTeamB);

    }


    /**
     * display info for Team A.
     */
    public void displaygoalTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayfoulsTeamA(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_a_fouls);
        foulsView.setText("Fouls: " + String.valueOf(fouls));
    }

    public void displayYellowCardA(int yellowCards) {
        TextView yellowCardView = (TextView) findViewById(R.id.team_a_yellow_cards);
        yellowCardView.setText(String.valueOf(yellowCards));
    }

    public void displayRedCardA(int redCards) {
        TextView redCardView = (TextView) findViewById(R.id.team_a_red_cards);
        redCardView.setText(String.valueOf(redCards));
    }

    /**
     * Add goal for team A
     */

    public void addOneForTeamA(View v) {
        goalsTeamA = goalsTeamA + 1;
        displaygoalTeamA(goalsTeamA);
    }

    /**
     * Add foul for team A
     */

    public void addOneFoulTeamA(View v) {
        foulsTeamA = foulsTeamA + 1;
        displayfoulsTeamA(foulsTeamA);
    }
    /**
     * Add yellow card for team A
     */

    public void addYellowForTeamA(View v) {
        yellowCardTeamA = yellowCardTeamA + 1;
        displayYellowCardA(yellowCardTeamA);
    }

    /**
     * Add red card for team A
     */

    public void addRedForTeamA(View v){
        redCardTeamA = redCardTeamA + 1;
        displayRedCardA(redCardTeamA);
    }

    /**
     * display info for Team B.
     */
    public void displaygoalTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayfoulsTeamB(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText("Fouls: " + String.valueOf(fouls));
    }

    public void displayYellowCardB(int yellowCards) {
        TextView yellowCardView = (TextView) findViewById(R.id.team_b_yellow_cards);
        yellowCardView.setText(String.valueOf(yellowCards));
    }

    public void displayRedCardB(int redCards) {
        TextView redCardView = (TextView) findViewById(R.id.team_b_red_cards);
        redCardView.setText(String.valueOf(redCards));
    }

    /**
     * Add goal for team B
     */

    public void addOneForTeamB(View v) {
        goalsTeamB = goalsTeamB + 1;
        displaygoalTeamB(goalsTeamB);
    }

    /**
     * Add foul for team B
     */

    public void addOneFoulTeamB(View v) {
        foulsTeamB = foulsTeamB + 1;
        displayfoulsTeamB(foulsTeamB);
    }
    /**
     * Add yellow card for team B
     */

    public void addYellowForTeamB(View v) {
        yellowCardTeamB = yellowCardTeamB + 1;
        displayYellowCardB(yellowCardTeamB);
    }

    /**
     * Add red card for team B
     */

    public void addRedForTeamB(View v){
        redCardTeamB = redCardTeamB + 1;
        displayRedCardB(redCardTeamB);
    }


    /**
     * reset to 0 when the button new game is clicked.
     */
    public void resetbutton(View v) {
        goalsTeamA = goalsTeamB = foulsTeamA = foulsTeamB = yellowCardTeamA = yellowCardTeamB = redCardTeamA = redCardTeamB = 0;

        displaygoalTeamA(goalsTeamA);
        displaygoalTeamB(goalsTeamB);
        displayfoulsTeamA(foulsTeamA);
        displayfoulsTeamB(foulsTeamB);
        displayYellowCardA(yellowCardTeamA);
        displayYellowCardB(yellowCardTeamB);
        displayRedCardA(redCardTeamA);
        displayRedCardB(redCardTeamB);

    }


}
