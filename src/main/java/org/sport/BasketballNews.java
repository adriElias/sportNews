package org.sport;

public class BasketballNews extends News{
    private String competition;
    private String club;

    public BasketballNews(String headline, String text, double scaring, double price, String competition, String club){
        super(headline, text, scaring, price);
        this.competition = competition;
        this.club = club;
    }
}
