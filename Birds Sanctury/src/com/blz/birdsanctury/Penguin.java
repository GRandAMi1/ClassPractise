package com.blz.birdsanctury;

public class Penguin extends Bird implements Swimmable {
    public Penguin(){
        colour = Colour.WHITE;
    }

    public void eat(){
        System.out.println("Penguin eats Fish");
    }

    public void swim(){
        System.out.println("Penguin can Swim");
    }
}
