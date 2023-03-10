package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    public final static int VAT = 22;
    private int code;
    private String name;
    private String description;
    private double price;

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

    public double getVatPrice() {
        return (getPrice() + ((getPrice() / 100) * VAT));
    }

    public String getExtendedName() {
        return (getCode() + "-" + getName());
    }
}