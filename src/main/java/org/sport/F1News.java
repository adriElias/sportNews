package org.sport;

public class F1News extends News {
    private String motorRacingTeam;

    public F1News(String headline, String text, double scoring, double price, String motorRacingTeam) {
        super(headline, text, scoring, price);
        this.motorRacingTeam = motorRacingTeam;
    }

    @Override
    public double calculatePriceNews() {
        double price = 100;
        if (motorRacingTeam.equalsIgnoreCase("Ferrari") ||
                motorRacingTeam.equalsIgnoreCase("Mercedes")) {
            price += 50;
        }

        return price;

    }
}
