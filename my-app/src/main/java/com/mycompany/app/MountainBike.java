package com.mycompany.app;

public class MountainBike extends Bicycle {
    public MountainBike(String name, int weight, float cost) {
        super(name, weight, cost);
        System.out.println(displayInfo());
    }

    public MountainBike(String name, float cost ) {
        super(name, cost);
        System.out.println(displayInfo());
    }

    @Override
    void age_of_using() {
        System.out.println("тут только взрослым");
    }

}
