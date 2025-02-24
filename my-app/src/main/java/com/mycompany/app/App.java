package com.mycompany.app;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        MountainBike mtb = new MountainBike("велик", 12, 599.99f);
        KidsBike kids_bys = new KidsBike("вело 11", 112);
        mtb.age_of_using();
        mtb.displayInfo();
        kids_bys.displayInfo();

    }
}
