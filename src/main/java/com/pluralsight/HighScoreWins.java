package com.pluralsight;

import java.util.*;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args){

        System.out.println("""
                Enter Teams and Current Scores:
                Format: Home:Visitor|HomeScore:VisitorScore
                """);

        Scanner myScanner = new Scanner (System.in);

        String currentScore = myScanner.nextLine();

        String[] matchDetails = currentScore.split(Pattern.quote("|"));
        String[] teams = matchDetails[0].split(Pattern.quote(":"));
        String[] score = matchDetails[1].split(Pattern.quote(":"));

        String team1 = teams[0];
        String team2 = teams[1];
        int score1 = Integer.parseInt(score[0]);
        int score2 = Integer.parseInt(score[1]);

        if (score1 > score2){
            System.out.println("Winner: " + team1);
        } else if (score1 == score2){
            System.out.println("Winner: Tie!");
        } else {
            System.out.println("Winner: " + team2);
        }
    }
}