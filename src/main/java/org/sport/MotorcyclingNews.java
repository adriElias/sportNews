package org.sport;

public class MotorcyclingNews extends News {
    private String team;

    public MotorcyclingNews(String headline, String text, double scoring, double price, String team) {
        super(headline, text, scoring, price);
        this.team = team;
    }

    @Override
    public double calculatePriceNews() {
        double price = 100;
        if (team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha")) {
            price += 50;
        }

        return price;
    }

    @Override
    public int calculateScoring() {
        int points = 3;
        if (team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha")) {
            points += 3;
        }

        return points;
    }
}
