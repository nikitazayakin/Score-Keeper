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

    public void addGoalTeamA(View view) {
        displayGoalForTeamA(++goalTeamA);
    }

    public void addFoulTeamA(View view) {
        displayFoulsForTeamA(++foulTeamA);
    }

    public void addYellowCardTeamA(View view) {
        displayYellowsForTeamA(++yellowCardTeamA);
    }

    public void addRedCardTeamA(View view) {
        displayRedsForTeamA(++redCardTeamA);
    }

    public void addGoalTeamB(View view) {
        displayGoalForTeamB(++goalTeamB);
    }

    public void addFoulTeamB(View view) {
        displayFoulsForTeamB(++foulTeamB);
    }

    public void addYellowCardTeamB(View view) {
        displayYellowsForTeamB(++yellowCardTeamB);
    }

    public void addRedCardTeamB(View view) {
        displayRedsForTeamB(++redCardTeamB);
    }
}
