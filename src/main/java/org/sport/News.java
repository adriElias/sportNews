package org.sport;

public abstract class News {
    private String headline;
    private String text = "";
    private double scaring;
    private double price;

    public News(String headline, String text, double scaring, double price) {
        this.headline = headline;
        this.text = text;
        this.scaring = scaring;
        this.price = price;

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getScaring() {
        return scaring;
    }

    public void setScaring(double scaring) {
        this.scaring = scaring;
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
}
