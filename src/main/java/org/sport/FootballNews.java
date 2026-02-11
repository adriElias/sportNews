package org.sport;

import java.util.Objects;

public class FootballNews extends News {
    private String competition;
    private String club;
    private String player;

    public FootballNews(String headline, String text, double scoring, double price, String competition, String club, String player) {
        super(headline, text, scoring, price);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    @Override
    public double calculatePriceNews() {
        double price = 300;
        if (competition.equalsIgnoreCase("Champions League")) {
            price += 100;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            price += 100;
        }
        if (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")) {
            price += 50;
        }
        return price;
    }

    @Override
    public int calculateScoring() {

        int points = 5;

        if (competition.equalsIgnoreCase("Champions League")) {
            points += 3;
        }
        if (competition.equalsIgnoreCase("League")) {
            points += 2;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            points += 1;
        }
        if (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")) {
            points += 1;
        }

        return points;
    }
}
