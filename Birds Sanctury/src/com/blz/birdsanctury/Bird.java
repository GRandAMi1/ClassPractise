package com.blz.birdsanctury;

public abstract class Bird {

    enum Colour {WHITE, GREEN, BROWN, YELLOW, GRAY, BLACK, RED};

    protected String bid;
    protected Colour colour;

    public abstract void eat();

    @Override
    public String toString() {
        return "Bird{" +
                "bid='" + bid + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

}
