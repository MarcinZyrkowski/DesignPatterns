package org.example.structural.composite;

public class Equipment {

    private final String name;
    private final int price;

    public Equipment(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
