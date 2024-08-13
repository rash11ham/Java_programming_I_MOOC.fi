/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Game {
    private String homeTeam, awayTeam;
    private int homeScore, awayScore;

    public Game(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }
    
    public boolean checkWinner(String teamName){
        if(this.getHomeTeam().equals(teamName) && this.homeScore > this.awayScore){
            return true;
        }
        if(this.getAwayTeam().equals(teamName) && this.homeScore < this.awayScore){
            return true;
        }
        return false;
    }
}
