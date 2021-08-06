package com.blz.birdsanctury;

public class BirdSanctury {
    public static void main(String[] args) {

        Penguin penguin = new Penguin();
        penguin.bid = "pen001";

        Parrot parrot = new Parrot();
        parrot.bid = "par001";

        Ostrich ostrich = new Ostrich();
        ostrich.bid = "ost001";

        Dove dove = new Dove();
        dove.bid = "dov001";

        BirdSancturyManager birdSancturyManager = new BirdSancturyManager();

        birdSancturyManager.add(penguin);
        birdSancturyManager.add(parrot);
        birdSancturyManager.add(ostrich);
        birdSancturyManager.add(dove);

        birdSancturyManager.print();
        birdSancturyManager.printFlyable();
        birdSancturyManager.printSwimmable();
        birdSancturyManager.printEats();
    }

}