package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goalTeamA = 0;
    int goalTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    int yellowCardTeamA = 0;
    int yellowCardTeamB = 0;
    int redCardTeamA = 0;
    int redCardTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetScores(View view) {
        goalTeamA = 0;
        displayGoalForTeamA(0);
        goalTeamB = 0;
        displayGoalForTeamB(0);
        foulTeamA = 0;
        displayFoulsForTeamA(0);
        foulTeamB = 0;
        displayFoulsForTeamB(0);
        yellowCardTeamA = 0;
        displayYellowsForTeamA(0);
        yellowCardTeamB = 0;
        displayYellowsForTeamB(0);
        redCardTeamA = 0;
        displayRedsForTeamA(0);
        redCardTeamB = 0;
        displayRedsForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayGoalForTeamA(int points) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal);
        scoreView.setText(String.valueOf(points));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayGoalForTeamB(int points) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal);
        scoreView.setText(String.valueOf(points));
    }

    /**
     * Displays the given fouls for Team A.
     */
    public void displayFoulsForTeamA(int points) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(points));
    }

    /**
     * Displays the given fouls for Team B.
     */
    public void displayFoulsForTeamB(int points) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(points));
    }

    /**
     * Displays the given yellow cards for Team A.
     */
    public void displayYellowsForTeamA(int points) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(points));
    }

    /**
     * Displays the given yellow cards for Team B.
     */
    public void displayYellowsForTeamB(int points) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(points));
    }

    /**
     * Displays the given red cards for Team A.
     */
    public void displayRedsForTeamA(int points) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(points));
    }

    /**
     * Displays the given red cards for Team B.
     */
    public void displayRedsForTeamB(int points) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(points));
    }

    /**
     * Team A Goal button onClickListener
     * Adds 1 Score to Team A and displays result on screen
     *
     * @param view
     */
    public void addGoalTeamA(View view) {
        goalTeamA++;
        displayGoalForTeamA(goalTeamA);
    }

    /**
     * Team A Foul button onClickListener
     * Adds 1 to foul of Team A and displays result on screen
     *
     * @param view
     */
    public void addFoulTeamA(View view) {
        foulTeamA++;
        displayFoulsForTeamA(foulTeamA);
    }

    /**
     * Team A Yellow button onClickListener
     * Adds 1 to yellow cards of Team A and displays result on screen
     *
     * @param view
     */
    public void addYellowCardTeamA(View view) {
        yellowCardTeamA++;
        displayYellowsForTeamA(yellowCardTeamA);
    }

    /**
     * Team A Red button onClickListener
     * Adds 1 to red cards of Team A and displays result on screen
     *
     * @param view
     */
    public void addRedCardTeamA(View view) {
        redCardTeamA++;
        displayRedsForTeamA(redCardTeamA);
    }

    /**
     * Team B Goal button onClickListener
     * Adds 1 Score to Team B and displays result on screen
     *
     * @param view
     */
    public void addGoalTeamB(View view) {
        goalTeamB++;
        displayGoalForTeamB(goalTeamB);
    }

    /**
     * Team B Foul button onClickListener
     * Adds 1 to foul of Team B and displays result on screen
     *
     * @param view
     */
    public void addFoulTeamB(View view) {
        foulTeamB++;
        displayFoulsForTeamB(foulTeamB);
    }

    /**
     * Team B Yellow button onClickListener
     * Adds 1 to yellow cards of Team B and displays result on screen
     *
     * @param view
     */
    public void addYellowCardTeamB(View view) {
        yellowCardTeamB++;
        displayYellowsForTeamB(yellowCardTeamB);
    }

    /**
     * Team B Red button onClickListener
     * Adds 1 to red cards of Team B and displays result on screen
     *
     * @param view
     */
    public void addRedCardTeamB(View view) {
        redCardTeamB++;
        displayRedsForTeamB(redCardTeamB);
    }
}
