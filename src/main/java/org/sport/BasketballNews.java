package org.sport;

public class BasketballNews extends News {
    private String competition;
    private String club;

    public BasketballNews(String headline, String text, double scoring, double price, String competition, String club) {
        super(headline, text, scoring, price);
        this.competition = competition;
        this.club = club;
    }

    @Override
    public double calculatePriceNews() {
        double price = 250;
        if (competition.equalsIgnoreCase("Euro League")) {
            price += 75;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            price += 75;
        }
        return price;

    }
}
