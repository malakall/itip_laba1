package com.mycompany.app;

public class KidsBike extends Bicycle {
    public KidsBike(String name, int weight, float cost){
        super(name, weight, cost);
        System.out.println(displayInfo());
    }


    public KidsBike(String name, int weight){
        super(name, weight);
        System.out.println(displayInfo());
    }

    void age_of_using(){
        System.out.println("тут онли для детей ");
    }
}
