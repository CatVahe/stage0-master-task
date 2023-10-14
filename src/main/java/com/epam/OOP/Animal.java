package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String paw = numberOfPaws == 1 ? numberOfPaws + " paw" : numberOfPaws + " paws";
        String fur = hasFur? "a" : "no";

        return  "This animal is mostly " + color + "." + " It has " + paw + " and " + fur + " fur.";

    }
}
