package com.blz.birdsanctury;

public class Dove extends Bird implements Flyable, Swimmable{
    public Dove(){
        colour = Colour.WHITE;
    }

    public void fly(){
        System.out.println("Dove can Fly");
    }

    public void eat(){
        System.out.println("Dove eats Fish");
    }

    public void swim(){
        System.out.println("Dove can Swim");
    }
}
