package com.mycompany.app;


public abstract class Bicycle {
    
    private String name;
    private int weight;
    private float cost;

    // Конструктор
    public Bicycle(String name, int weight, float cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }


    public Bicycle(String name, float cost){
        this.name = name;
        this.cost = cost;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public float getCost() {
        return cost;
    }

    void age_of_using() {
        System.out.println("возраст хз какой");
    } 

    // Метод для информации
    public String displayInfo() {
        String info = "имя : " + name + " " + "вес: " + weight + " " + "цена" + cost;
        return info;
    }
}

