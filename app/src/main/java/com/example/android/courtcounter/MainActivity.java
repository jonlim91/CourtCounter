package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int POINTS_FOR_FREE_THROW = 1;
    final int POINTS_FOR_TWO_POINTER = 2;
    final int POINTS_FOR_THREE_POINTER = 3;

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by three points
     */
    public void addThreeForTeamA(View view) {
        scoreTeamA += POINTS_FOR_THREE_POINTER;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by two points
     */
    public void addTwoForTeamA(View view) {
        scoreTeamA += POINTS_FOR_TWO_POINTER;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by one point
     */
    public void addOneForTeamA(View view) {
        scoreTeamA += POINTS_FOR_FREE_THROW;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by three points
     */
    public void addThreeForTeamB(View view) {
        scoreTeamB += POINTS_FOR_THREE_POINTER;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by two points
     */
    public void addTwoForTeamB(View view) {
        scoreTeamB += POINTS_FOR_TWO_POINTER;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by one point
     */
    public void addOneForTeamB(View view) {
        scoreTeamB += POINTS_FOR_FREE_THROW;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset the score for both teams
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
