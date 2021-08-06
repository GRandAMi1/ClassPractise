package com.blz.birdsanctury;

import java.util.ArrayList;
import java.util.List;

public class BirdSancturyManager {

    List<Bird> birdList= new ArrayList();

    public void add(Bird bird){
        birdList.add(bird);
    }

    public void printFlyable(){
        for (int i = 0; i < birdList.size(); i++) {
            if (birdList.get(i) instanceof Flyable){
                Flyable flyable = (Flyable) birdList.get(i);
                flyable.fly();
//                ((Flyable) birdList.get(i)).fly();
            }
        }
    }

    public void printSwimmable(){
        for (int i = 0; i < birdList.size(); i++) {
            if (birdList.get(i) instanceof Swimmable){
                Swimmable swimmable = (Swimmable) birdList.get(i);
                swimmable.swim();
            }
        }
    }

    public void printEats(){
        for (int i = 0; i < birdList.size(); i++) {
            birdList.get(i).eat();
        }
    }

    public void print(){
        for (int i = 0; i < birdList.size(); i++) {
            System.out.println(birdList.get(i));
        }
    }

}
