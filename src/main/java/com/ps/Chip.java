package com.ps;

public class Chip extends Product{
    private final String[] Chip = {"Lays", "Doritos", "Fritos"};


    @Override
    public double calculatePrice() {
        //returning 1.50 b/c the chops are one price in the directions
        price = 1.50;
        return 1.50;
    }
}
