package org.sport;

public class F1News extends News {
    private String motorRacingTeam;

    public F1News(String headline, String text, double scoring, double price, String motorRacingTeam) {
        super(headline, text, scoring, price);
        this.motorRacingTeam = motorRacingTeam;
    }
}
