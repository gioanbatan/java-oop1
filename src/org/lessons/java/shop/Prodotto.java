package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    private int code;
    private String name;
    private String description;
    private double price;
    private double vat;

    public Prodotto() {
        Random code = new Random();

        this.code = code.nextInt(1000000);
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public void showBasePrice() {
        System.out.println("Il prezzo del prodotto " + getCode() + " è di " + getPrice() + "€");
    }

    public void showVatPrice() {
        System.out.println("Il prezzo con IVA del prodotto " + getCode() + " è di " + (getPrice() + ((getPrice() / 100) * getVat()) + "€"));
    }
}