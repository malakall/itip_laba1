package com.mycompany.app;

public class BMX extends Bicycle {
    public BMX(String name, int weight, float cost) {
        super(name, weight, cost);
    }

    void age_of_using() {
        System.out.println("только для трюков");
    }
}
