package org.sport;

public class MotorcyclingNews extends News{
    private String team;

    public MotorcyclingNews(String headline, String text, double scoring, double price, String team) {
        super(headline, text, scoring, price);
        this.team = team;
    }
}
