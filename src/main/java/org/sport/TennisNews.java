package org.sport;

public class TennisNews extends News {
    private String competition;
    private String tennisPlayers;

    public TennisNews(String headline, String text, double scoring, double price, String competition, String tennisPlayers) {
        super(headline, text, scoring, price);
        this.competition = competition;
        this.tennisPlayers = tennisPlayers;
    }
}
