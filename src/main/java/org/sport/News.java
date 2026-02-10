package org.sport;

public abstract class News {
    private String headline;
    private String text = "";
    private double scoring;
    private double price;

    public News(String headline, String text, double scoring, double price) {
        this.headline = headline;
        this.text = text;
        this.scoring = scoring;
        this.price = price;

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getScoring() {
        return scoring;
    }

    public void setScoring(double scoring) {
        this.scoring = scoring;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public abstract double calculatePriceNews();
}
