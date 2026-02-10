package org.sport;

public class BasketballNews extends News{
    private String competition;
    private String club;

    public BasketballNews(String headline, String text, double scoring, double price, String competition, String club){
        super(headline, text, scoring, price);
        this.competition = competition;
        this.club = club;
    }
}
