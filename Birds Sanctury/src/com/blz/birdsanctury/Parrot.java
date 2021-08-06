package com.blz.birdsanctury;

public class Parrot extends Bird implements Flyable{
    public Parrot(){
        colour = Colour.GREEN;
    }

    public void fly(){
        System.out.println("Parrot can Fly");
    }

    public void eat(){
        System.out.println("Parrot eats Chilli");
    }

}
