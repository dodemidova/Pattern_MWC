package com.company.model;

public class Section {
    private int weight;
    private int height;
    private int cost;

    public Section(int weight, int height, int cost) {
       this.weight=weight;
       this.height=height;
       this.cost=cost;
    }

    public Section(){
        this.weight=0;
        this.height=0;
        this.cost=0;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


}
