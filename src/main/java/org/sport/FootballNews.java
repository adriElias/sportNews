package org.sport;

public class FootballNews extends News{
    private String competition;
    private String club;
    private String player;

    public FootballNews(String headline, String text, double scaring, double price, String competition, String club, String player){
        super(headline, text, scaring, price);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }
}
