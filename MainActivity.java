package com.tuayudalatina.soccerstatstracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tuayudalatina.soccerstatstracker.R;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int yellowCard_TeamA = 0;
    int yellowCard_TeamB = 0;
    int redCard_TeamA = 0;
    int redCard_TeamB = 0;
    int foul_TeamA = 0;
    int foul_TeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when team A score.
     */
    public void addGoalTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when yellow card button is click and add a yellow card to team A .
     */
    public void addYellowCardTeamA(View view) {
        yellowCard_TeamA = yellowCard_TeamA + 1;
        displayYellowCardForTeamA(yellowCard_TeamA);
    }

    /**
     * This method is called when red card button is click and add a red card to team A .
     */
    public void addRedCardTeamA(View view) {
        redCard_TeamA = redCard_TeamA + 1;
        displayRedCardForTeamA(redCard_TeamA);
    }

    /**
     * This method is called when foul button is click and add a foul to team A .
     */
    public void addFoulTeamA(View view) {
        foul_TeamA = foul_TeamA + 1;
        displayFoulForTeamA(foul_TeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreTeamA) {
        TextView scoreAView = (TextView) findViewById(R.id.teamAScore);
        scoreAView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * Displays the yellow card count for Team A.
     */
    public void displayYellowCardForTeamA(int yellowCard_TeamA) {
        TextView yellowCardTeamAView = (TextView) findViewById(R.id.YellowCardTeamA);
        yellowCardTeamAView.setText(String.valueOf(yellowCard_TeamA));
    }

    /**
     * Displays the red card count for Team A.
     */
    public void displayRedCardForTeamA(int redCard_TeamA) {
        TextView redCardView = (TextView) findViewById(R.id.RedCardTeamA);
        redCardView.setText(String.valueOf(redCard_TeamA));
    }

    /**
     * Displays the foul count for Team A.
     */
    public void displayFoulForTeamA(int foul_TeamA) {
        TextView foulTeamAView = (TextView) findViewById(R.id.foulTeamA);
        foulTeamAView.setText(String.valueOf(foul_TeamA));
    }

    /**
     * This method is called when team B score.
     */
    public void addGoalTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when yellow card button is click and add a yellow card to team B .
     */
    public void addYellowCardTeamB(View view) {
        yellowCard_TeamB = yellowCard_TeamB + 1;
        displayYellowCardForTeamB(yellowCard_TeamB);
    }

    /**
     * This method is called when red card button is click and add a red card to team B .
     */
    public void addRedCardTeamB(View view) {
        redCard_TeamB = redCard_TeamB + 1;
        displayRedCardForTeamB(redCard_TeamB);
    }

    /**
     * This method is called when foul button is click and add a foul to team B .
     */
    public void addFoulTeamB(View view) {
        foul_TeamB = foul_TeamB + 1;
        displayFoulForTeamB(foul_TeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreTeamB) {
        TextView scoreBView = (TextView) findViewById(R.id.teamBScore);
        scoreBView.setText(String.valueOf(scoreTeamB));
    }

    /**
     * Displays the yellow card count for Team B.
     */
    public void displayYellowCardForTeamB(int yellowCard_TeamB) {
        TextView yellowCardTeamBView = (TextView) findViewById(R.id.YellowCardTeamB);
        yellowCardTeamBView.setText(String.valueOf(yellowCard_TeamB));
    }

    /**
     * Displays the red card count for Team B.
     */
    public void displayRedCardForTeamB(int redCard_TeamB) {
        TextView redCardTeamBView = (TextView) findViewById(R.id.RedCardTeamB);
        redCardTeamBView.setText(String.valueOf(redCard_TeamB));
    }

    /**
     * Displays the foul count for Team B.
     */
    public void displayFoulForTeamB(int foul_TeamB) {
        TextView foulTeamBView = (TextView) findViewById(R.id.foulTeamB);
        foulTeamBView.setText(String.valueOf(foul_TeamB));
    }

    /**
     * reset score, cards, and fouls views to =0
     */
    public void ResetButton(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        yellowCard_TeamA = 0;
        yellowCard_TeamB = 0;
        redCard_TeamA = 0;
        redCard_TeamB = 0;
        foul_TeamA = 0;
        foul_TeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayYellowCardForTeamA(yellowCard_TeamA);
        displayRedCardForTeamA(redCard_TeamA);
        displayYellowCardForTeamB(yellowCard_TeamB);
        displayRedCardForTeamB(redCard_TeamB);
        displayFoulForTeamA(foul_TeamA);
        displayFoulForTeamB(foul_TeamB);
    }
}

